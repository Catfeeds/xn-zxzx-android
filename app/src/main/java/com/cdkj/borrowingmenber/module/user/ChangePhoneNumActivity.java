package com.cdkj.borrowingmenber.module.user;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.activitys.UpdatePhoneActivity;
import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.interfaces.SendCodeInterface;
import com.cdkj.baselibrary.interfaces.SendPhoneCoodePresenter;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityChangePhoneBinding;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * 更改手机号码
 * Created by cdkj on 2017/12/20.
 */

public class ChangePhoneNumActivity extends AbsBaseLoadActivity implements SendCodeInterface {

    private ActivityChangePhoneBinding mBinding;
    private SendPhoneCoodePresenter mSendCodePresenter;

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, ChangePhoneNumActivity.class);
        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_change_phone, null, false);
        return mBinding.getRoot();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mSendCodePresenter!=null){
            mSendCodePresenter.clear();
        }
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("修改手机号");
        mSendCodePresenter = new SendPhoneCoodePresenter(this);
        mBinding.edtPhoneNew.setText(SPUtilHelpr.getUserPhoneNum());
        initListener();
    }

    private void initListener() {
        //发送验证码
        mBinding.btnSendNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSendCodePresenter.sendCodeRequest(mBinding.edtPhoneNew.getText().toString(), "804082", MyCdConfig.USERTYPE, ChangePhoneNumActivity.this);
            }
        });

        mBinding.btnSureChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mBinding.edtPhoneNew.getText().toString())) {
                    UITipDialog.showFall(ChangePhoneNumActivity.this, "请输入旧手机号");
                    return;
                }

                if (TextUtils.isEmpty(mBinding.edtCodeNew.getText().toString())) {
                    UITipDialog.showFall(ChangePhoneNumActivity.this, "请输入验证码");
                    return;
                }

                checkOldPhone();

            }
        });

    }

    /**
     * 验证旧手机号码
     */
    private void checkOldPhone() {

        Map<String, String> map = new HashMap<>();
        map.put("userId", SPUtilHelpr.getUserId());
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("mobile", mBinding.edtPhoneNew.getText().toString());
        map.put("captcha", mBinding.edtCodeNew.getText().toString());
        map.put("bizType", "804082");

        Call call = RetrofitUtils.getBaseAPiService().successRequest("804082", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();
        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    UpdatePhoneActivity.open(ChangePhoneNumActivity.this);
                    finish();
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                UITipDialog.showFall(ChangePhoneNumActivity.this, errorMessage);
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
        UITipDialog.showFall(ChangePhoneNumActivity.this, msg);
    }

    @Override
    public void StartSend() {
        showLoadingDialog();
    }

    @Override
    public void EndSend() {
        disMissLoading();
    }
}
