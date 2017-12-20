package com.cdkj.borrowingmenber.module.certification;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.PermissionHelper;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.baselibrary.utils.SystemUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.model.FraudCertModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

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

        showDoubleWarnListen("是否进行欺诈信息认证？", view -> {
            finish();
        }, view -> {
            mHelper.requestPermissions(new PermissionHelper.PermissionListener() {
                @Override
                public void doAfterGrand(String... permission) {
                    mCanGetIemi = true;
                    certRequest();
                }

                @Override
                public void doAfterDenied(String... permission) {
                    mCanGetIemi = false;
                    certRequest();
                }
            }, Manifest.permission.READ_PHONE_STATE);
        });

    }


    //权限处理
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        mHelper.handleRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void certRequest() {

        if (isCertCodeEmpty()) {
            showToast("欺诈认证失败，请重试。");
            finish();
            return;
        }

        Map map = RetrofitUtils.getRequestMap();

        map.put("isH5", "0");
        map.put("searchCode", mCertCode);

        if (mCanGetIemi) {
            map.put("imei", SystemUtils.getIMEI(this));
        }
        map.put("ip", SystemUtils.getIPAddress(true));
        map.put("mac", SystemUtils.getMacAddress(this));
        map.put("wifimac", SystemUtils.getMacAddress(this));


        Call call = RetrofitUtils.createApi(MyApiServer.class).fraudCertRequest("805260", StringUtils.getJsonToString(map));

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<FraudCertModel>(this) {
            @Override
            protected void onSuccess(FraudCertModel data, String SucMessage) {
                if (data.isAuthorized()) { //是否授权
                    getCheckData(NEXTSTEP);
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
                EventBus.getDefault().post(THREECERTSUCC);//定位成功结束上一个界面
                disMissLoading();
            }
        });

    }


}
