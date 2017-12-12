package com.cdkj.borrowingmenber;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.cdkj.baselibrary.CdApplication;


/**
 * 基础Application
 * Created by Administrator on 2016/8/29.
 */

//TODO 项目目前需配置参数第三方 支付宝 高德 微信
public class MyApplication extends Application {

    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        CdApplication.initialize(this, BuildConfig.LOG_DEBUG, "");
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public static MyApplication getInstance() {
        return application;
    }
}

