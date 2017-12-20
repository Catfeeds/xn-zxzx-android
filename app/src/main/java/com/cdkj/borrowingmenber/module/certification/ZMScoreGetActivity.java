package com.cdkj.borrowingmenber.module.certification;

import android.os.Bundle;

import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseZmPermissionsCheckActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.ZmScoreGetModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * 芝麻分数获取
 * Created by 李先俊 on 2017/7/26.
 */

public class ZMScoreGetActivity extends BaseZmPermissionsCheckActivity {


    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setMidTitle("芝麻信用评分");
        mBinding.editCardNumber.setEnabled(false);
        mBinding.editName.setEnabled(false);

       getCheckData(1);

        mBinding.butSure.setText(getString(R.string.next_step));
    }

    @Override
    protected void getAllCheckDataState(int requestCode, boolean isGetALl) {

        if (requestCode == 1) {
            setShowData();
        } else {
            super.getAllCheckDataState(requestCode, isGetALl);
        }
    }


    /*"{"isSuccess":false,"idNo":"522321199509111655","realName":"李先俊"}"*/
    private void setShowData() {
        IdAndNameModel idAndNameModel = getIdAndName();
        if (idAndNameModel == null) return;
        mBinding.editCardNumber.setText(idAndNameModel.getIdNo());
        mBinding.editName.setText(idAndNameModel.getRealName());

    }

    /**
     * 检查是否授权过 如果已授权直接展示芝麻分 如果没授权则申请授权
     */

    @Override
    protected void checkRequest() {

        if (isCertCodeEmpty()) {
            showToast("芝麻分认证失败，请退出重试。");
            return;
        }

        Map<String, String> map = new HashMap<>();
        map.put("searchCode", mCertCode);
        map.put("isH5", "0");

        Call call = RetrofitUtils.createApi(MyApiServer.class).getZmScore("805258", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<ZmScoreGetModel>(this) {

            @Override
            protected void onSuccess(ZmScoreGetModel data, String SucMessage) {
                if (data.isAuthorized()) {
                    getCheckData(NEXTSTEP);
                } else {
                    creditApp.authenticate(ZMScoreGetActivity.this, data.getAppId(), null, data.getParam(), data.getSignature(), null, ZMScoreGetActivity.this);
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }


}
