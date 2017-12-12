package com.cdkj.borrowingmenber.module.certification;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.databinding.ActivityModifyPhoneBinding;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.interfaces.SendCodeInterface;
import com.cdkj.baselibrary.interfaces.SendPhoneCoodePresenter;
import com.cdkj.baselibrary.model.EventBusModel;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityCertPhoneBinding;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * 验证手机号码 (暂时未用)
 * Created by cdkj on 2017/6/16.
 */

public class CertPhoneActivity extends AbsBaseLoadActivity implements SendCodeInterface {

    private ActivityCertPhoneBinding mBinding;

    private SendPhoneCoodePresenter mSendCodePresenter;

    /**
     * 打开当前页面
     *
     * @param context
     */
    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, CertPhoneActivity.class);

        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_cert_phone, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        mBaseBinding.titleView.setMidTitle("手机认证");

        mSendCodePresenter = new SendPhoneCoodePresenter(this);

        initListener();
    }

    private void initListener() {
        //发送验证码
        mBinding.btnSendNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSendCodePresenter.sendCodeRequest(mBinding.edtPhoneNew.getText().toString(), "805250", MyCdConfig.USERTYPE, CertPhoneActivity.this);
            }
        });

        mBinding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mBinding.edtPhoneNew.getText().toString())) {
                    UITipDialog.showFall(CertPhoneActivity.this, "请输入手机号");
                    return;
                }

                if (TextUtils.isEmpty(mBinding.edtCodeNew.getText().toString())) {
                    UITipDialog.showFall(CertPhoneActivity.this, "请输入验证码");
                    return;
                }

                certPhone();

            }
        });

    }


    /**
     * 验证手机号
     */
    private void certPhone() {

        Map<String, String> map = new HashMap<>();
        map.put("userId", SPUtilHelpr.getUserId());
        map.put("mobile", mBinding.edtPhoneNew.getText().toString());
        map.put("captcha", mBinding.edtCodeNew.getText().toString());
        map.put("token", SPUtilHelpr.getUserToken());
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);

        Call call = RetrofitUtils.getBaseAPiService().successRequest("805061", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();
        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {

                    showToast("修改成功");

                    EventBusModel eventBusModel = new EventBusModel();      //刷新上一页数据
                    eventBusModel.setTag(EventTags.CHANGEPHONENUMBER_REFRESH);
                    eventBusModel.setEvInfo(mBinding.edtPhoneNew.getText().toString());
                    EventBus.getDefault().post(eventBusModel);

                    SPUtilHelpr.saveUserPhoneNum(mBinding.edtPhoneNew.getText().toString());
                    finish();
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                UITipDialog.showFall(CertPhoneActivity.this, errorMessage);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }

    @Override
    public void CodeSuccess(String msg) {
        mSubscription.add(AppUtils.startCodeDown(60, mBinding.btnSendNew));
    }

    @Override
    public void CodeFailed(String code, String msg) {
        UITipDialog.showFall(CertPhoneActivity.this, msg);
    }

    @Override
    public void StartSend() {
        showLoadingDialog();
    }

    @Override
    public void EndSend() {
        disMissLoading();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mSendCodePresenter != null) {
            mSendCodePresenter.clear();
            mSendCodePresenter = null;
        }
    }
}
