package com.cdkj.borrowingmenber.module.certification;

import android.os.Bundle;

import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseZmPermissionsCheckActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;

import java.util.Map;

import retrofit2.Call;

import static com.alibaba.fastjson.JSON.parseObject;

/**
 * 行业关注名单
 * Created by cdkj on 2017/7/26.
 */

public class IndustryFocusOnActivity extends BaseZmPermissionsCheckActivity {


    @Override
    public void afterCreate(Bundle savedInstanceState) {

        super.afterCreate(savedInstanceState);

        mBaseBinding.titleView.setMidTitle("行业关注名单");

        mBinding.editCardNumber.setEnabled(false);
        mBinding.editName.setEnabled(false);

        mBinding.butSure.setText(getString(R.string.next_step));

        getCheckData(1);
    }

    @Override
    protected void checkStateTrue(int requestCode) {

        if (requestCode == 1) {
            setShowData();
        } else {
            super.checkStateTrue(requestCode);
        }
    }

    @Override
    protected void checkRequest() {
        checkIndustryFocusOn();
    }

    private void checkIndustryFocusOn() {

        if (isCertCodeEmpty()) {
            showToast("行业关注清单认证失败，请退出重试。");
            return;
        }
        Map map = RetrofitUtils.getRequestMap();

        map.put("isH5", "0");
        map.put("searchCode", mCertCode);

        Call call = RetrofitUtils.createApi(MyApiServer.class).IndustryFocusOnInfoQuery("805259", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<IndustryFocusOnModel>(this) {
            @Override
            protected void onSuccess(IndustryFocusOnModel data, String SucMessage) {
                if (data.isAuthorized()) {
                    UITipDialog.showSuccess(IndustryFocusOnActivity.this, "成功", dialog -> {
                        getCheckData(NEXTSTEP);
                    });
                } else {
                    creditApp.authenticate(IndustryFocusOnActivity.this, data.getAppId(), null, data.getParam(), data.getSignature(), null, IndustryFocusOnActivity.this);
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    private void setShowData() {
        IdAndNameModel idAndNameModel = getIdAndName();
        if (idAndNameModel == null) return;
        mBinding.editCardNumber.setText(idAndNameModel.getIdNo());
        mBinding.editName.setText(idAndNameModel.getRealName());

    }


}
