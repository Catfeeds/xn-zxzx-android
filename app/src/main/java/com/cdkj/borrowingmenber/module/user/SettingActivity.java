package com.cdkj.borrowingmenber.module.user;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.activitys.FindPwdActivity;
import com.cdkj.baselibrary.activitys.UpdatePhoneActivity;
import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivitySettingBinding;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by 李先俊 on 2017/12/9.
 */

public class SettingActivity extends AbsBaseLoadActivity {

    private ActivitySettingBinding mBinding;

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, SettingActivity.class);
        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_setting, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        mBaseBinding.titleView.setMidTitle(getString(R.string.setting));

        mBinding.updatePhone.setOnClickListener(v -> {
            UpdatePhoneActivity.open(this);
        });
        mBinding.updatePassword.setOnClickListener(v -> {
            FindPwdActivity.open(this, "");
        });

        mBinding.tvLogout.setOnClickListener(v -> {
            SPUtilHelpr.logOutClear();
            EventBus.getDefault().post(EventTags.AllFINISH);
            EventBus.getDefault().post(EventTags.MAINFINISH);
            LoginActivity.open(this,true);
        });

    }
}
