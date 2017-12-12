package com.cdkj.borrowingmenber.module.certification;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.PermissionHelper;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.baselibrary.utils.SystemUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.weiget.CertificationStepHelper;

import org.greenrobot.eventbus.EventBus;

import java.util.Map;

import retrofit2.Call;

import static com.cdkj.baselibrary.appmanager.EventTags.THREECERTSUCC;

/**
 * 3元素认证
 * Created by cdkj on 2017/12/12.
 */

public class ThreeDataCertActivity extends BaseCertStepActivity {
    private boolean mCanGetIemi;//
    private PermissionHelper mHelper;

    @Override
    public View addMainView() {
        return null;
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setVisibility(View.GONE);
        mHelper = new PermissionHelper(this);

        mHelper.requestPermissions(new PermissionHelper.PermissionListener() {
            @Override
            public void doAfterGrand(String... permission) {
                mCanGetIemi = true;
            }

            @Override
            public void doAfterDenied(String... permission) {
                mCanGetIemi = false;
            }
        }, Manifest.permission.READ_PHONE_STATE);
        certRequest();
    }


    //权限处理
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        mHelper.handleRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void certRequest() {

        Map map = RetrofitUtils.getRequestMap();

        map.put("isH5", "0");
        map.put("searchCode", mCertListModel.getCode());

        if (mCanGetIemi) {
            map.put("imei", SystemUtils.getIMEI(this));
        }
        map.put("ip", SystemUtils.getIPAddress(true));
        map.put("mac", SystemUtils.getMacAddress(this));
        map.put("wifimac", SystemUtils.getMacAddress(this));


        Call call = RetrofitUtils.getBaseAPiService().successRequest("805260", StringUtils.getJsonToString(map));

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    mCertListModel.setPZM7("N");
                    CertificationStepHelper.checkRequest(ThreeDataCertActivity.this, mCertListModel);
                    EventBus.getDefault().post(THREECERTSUCC);//定位成功结束上一个界面
                    finish();

                } else {
                    showToast("认证失败，请重试");
                    finish();
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                super.onReqFailure(errorCode, errorMessage);
                finish();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


}
