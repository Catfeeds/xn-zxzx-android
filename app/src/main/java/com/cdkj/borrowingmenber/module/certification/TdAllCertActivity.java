package com.cdkj.borrowingmenber.module.certification;

import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import java.util.Map;

import retrofit2.Call;

/**
 * 同盾认证
 * Created by 李先俊 on 2017/12/13.
 */

public class TdAllCertActivity extends BaseCertStepActivity {


    private UITipDialog tipDialog;

    @Override
    public View addMainView() {
        return null;
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setVisibility(View.GONE);
        mBaseBinding.viewV.setVisibility(View.GONE);
        showDoubleWarnListen("是否进行同盾认证", view -> {
            finish();
        }, view -> {
            tdCertRequest();
        });
    }

    @Override
    protected void onDestroy() {
        if (tipDialog != null) {
            tipDialog.dismiss();
            tipDialog = null;
        }
        super.onDestroy();
    }

    /**
     * 调用同盾认证
     */
    private void tdCertRequest() {
        if (isCertCodeEmpty()) {
            showToast("同盾认证失败，请退出重试。");
            return;
        }
        Map map = RetrofitUtils.getRequestMap();

        map.put("searchCode", mCertCode);
        showWaiteDialog();
        Call call = RetrofitUtils.getBaseAPiService().successRequest("805261", StringUtils.getJsonToString(map));

        addCall(call);
        showWaiteDialog();
        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    getCheckData(NEXTSTEP);
                } else {
                    UITipDialog.showFall(TdAllCertActivity.this, "认证失败，请重试");
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                showToast("认证失败，请重试");
                finish();
            }

            @Override
            protected void onFinish() {
                dismissWaiteDialog();
            }
        });
    }

    public void showWaiteDialog() {
        if (tipDialog == null) {
            tipDialog = new UITipDialog.Builder(this)
                    .setIconType(UITipDialog.Builder.ICON_TYPE_LOADING)
                    .setTipWord("数据上传中...")
                    .create();
        }
        if (!tipDialog.isShowing()) {
            tipDialog.show();
        }
    }

    public void dismissWaiteDialog() {
        if (tipDialog != null && tipDialog.isShowing()) {
            tipDialog.dismiss();
        }
    }

}
