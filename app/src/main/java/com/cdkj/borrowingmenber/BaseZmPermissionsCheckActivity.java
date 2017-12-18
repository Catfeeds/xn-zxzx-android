package com.cdkj.borrowingmenber;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.android.moblie.zmxy.antgroup.creditsdk.app.CreditApp;
import com.android.moblie.zmxy.antgroup.creditsdk.app.ICreditListener;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.databinding.ActivityCardandnameCheckBinding;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.ReportModel;

import static com.cdkj.borrowingmenber.weiget.CertificationHelper.INTENTGETCERTMODEL;
import static com.cdkj.borrowingmenber.weiget.CertificationHelper.INTENTGETREPORTMODEL;


/**
 * 检测芝麻信用是否授权检测
 * Created by 李先俊 on 2017/7/27.
 */

public abstract class BaseZmPermissionsCheckActivity extends AbsBaseLoadActivity implements ICreditListener {

    protected CreditApp creditApp;
    protected ActivityCardandnameCheckBinding mBinding;
    protected ReportModel mReportModel;
    protected CertListModel mCertListModel;
    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_cardandname_check, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        if (getIntent() != null) {
            mCertListModel = getIntent().getParcelableExtra(INTENTGETCERTMODEL);
            mReportModel = getIntent().getParcelableExtra(INTENTGETREPORTMODEL);
        }
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
        showToast("授权失败");
    }

    @Override
    public void onCancel() {

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // 回调事件相应
        creditApp.onActivityResult(requestCode, resultCode, data);
    }

    public IdAndNameModel getIdAndName() {
        if (mReportModel == null || TextUtils.isEmpty(mReportModel.getF2())) {
            return null;
        }
        IdAndNameModel idAndNameModel = JSON.parseObject(mReportModel.getF2(), IdAndNameModel.class);
        return idAndNameModel;
    }


}
