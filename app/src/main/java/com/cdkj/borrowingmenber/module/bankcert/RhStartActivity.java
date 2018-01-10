package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhStartBinding;

/**
 * 人行开始页面
 * Created by cdkj on 2018/1/4.
 */

public class RhStartActivity extends AbsBaseLoadActivity {


    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhStartActivity.class);
        context.startActivity(intent);
    }

    private ActivityRhStartBinding mBinding;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_start, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("中国人民银行征信中心");
        mBinding.btnRhLogin.setOnClickListener(v -> RhLoginActivity.open(this));
        mBinding.btnRhRegister.setOnClickListener(v -> RhRegisterActivity.open(this));
    }
}
