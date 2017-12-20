package com.cdkj.borrowingmenber;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.android.moblie.zmxy.antgroup.creditsdk.app.CreditApp;
import com.android.moblie.zmxy.antgroup.creditsdk.app.ICreditListener;
import com.cdkj.borrowingmenber.databinding.ActivityCardandnameCheckBinding;


/**
 * 检测芝麻信用是否授权检测
 * Created by cdkj on 2017/7/27.
 */

public abstract class BaseZmPermissionsCheckActivity extends BaseCertStepActivity implements ICreditListener {

    protected CreditApp creditApp;
    protected ActivityCardandnameCheckBinding mBinding;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_cardandname_check, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBinding.layoutTips.setVisibility(View.GONE);
        mBinding.editCardNumber.setEnabled(false);
        mBinding.editName.setEnabled(false);

        creditApp = CreditApp.getOrCreateInstance(this.getApplicationContext());

        mBinding.butSure.setOnClickListener(v -> {
            checkRequest();
        });

    }

    protected abstract void checkRequest();


    @Override
    public void onComplete(Bundle bundle) {
        checkRequest();
    }

    @Override
    public void onError(Bundle bundle) {
        showToast("芝麻信用授权失败");
    }

    @Override
    public void onCancel() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        creditApp.destroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // 回调事件相应
        creditApp.onActivityResult(requestCode, resultCode, data);
    }


}
