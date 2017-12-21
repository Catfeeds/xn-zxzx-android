package com.cdkj.borrowingmenber;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.IntDef;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.adapters.ViewPagerAdapter;
import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.databinding.ActivityMainBinding;
import com.cdkj.borrowingmenber.module.certification.CertificationListFragment;
import com.cdkj.borrowingmenber.module.user.MyFragment;

import org.greenrobot.eventbus.EventBus;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AbsBaseLoadActivity {

    private ActivityMainBinding mainBinding;

    public static final int SHOWCERT = 0;//显示认证界面
    public static final int SHOWMY = 1;//显示我的界面


    @IntDef({SHOWCERT, SHOWMY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface showType {
    }

    private List<Fragment> mFragments;

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        mainBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_main, null, false);
        return mainBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        setShowTitle(false);
        initViewPager();
        initRadioButtonListener();
    }

    /**
     * 初始化变量
     */
    private void initViewPager() {
        mFragments = new ArrayList<>();

        mFragments.add(CertificationListFragment.getInstance());
        mFragments.add(MyFragment.getInstance());

        mainBinding.pagerMain.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), mFragments));
        mainBinding.pagerMain.setOffscreenPageLimit(mFragments.size());
    }

    /**
     * 底部切换监听
     */
    private void initRadioButtonListener() {

        mainBinding.radiogroupMain.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.radio_main_tab_1:                   //显示认证界面
                    mainBinding.pagerMain.setCurrentItem(0, false);
                    break;
                case R.id.radio_main_tab_2:                   //显示我的界面
                    mainBinding.pagerMain.setCurrentItem(1, false);
                    break;
            }
        });
    }


    @Override
    public void onBackPressed() {
        showDoubleWarnListen("确认退出？", view -> {
            EventBus.getDefault().post(EventTags.AllFINISH);
            finish();
        });
    }


}
