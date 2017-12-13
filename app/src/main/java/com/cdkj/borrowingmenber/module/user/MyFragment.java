package com.cdkj.borrowingmenber.module.user;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.BaseLazyFragment;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.FragmentMyBinding;
import com.cdkj.borrowingmenber.module.report.MyReportActivity;

/**
 * 认证列表界面
 * Created by cdkj on 2017/12/9.
 */

public class MyFragment extends BaseLazyFragment {


    private FragmentMyBinding mBinding;


    public static MyFragment getInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, null, false);

        initListener();

        return mBinding.getRoot();

    }


    @Override
    public void onResume() {
        super.onResume();
        mBinding.tvUserName.setText(SPUtilHelpr.getUserPhoneNum());
    }

    private void initListener() {
        mBinding.rowSetting.setOnClickListener(v -> {
            SettingActivity.open(mActivity);
        });
        mBinding.rowReport.setOnClickListener(v -> {
            MyReportActivity.open(mActivity);
        });
    }

    @Override
    protected void lazyLoad() {

    }

    @Override
    protected void onInvisible() {

    }
}
