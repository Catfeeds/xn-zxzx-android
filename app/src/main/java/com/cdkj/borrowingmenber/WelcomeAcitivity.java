package com.cdkj.borrowingmenber;

import android.content.Intent;
import android.os.Bundle;

import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.BaseActivity;
import com.cdkj.borrowingmenber.module.bankcert.RhLoginActivity;
import com.cdkj.borrowingmenber.module.bankcert.RhQuestionCheckActivity;
import com.cdkj.borrowingmenber.module.bankcert.RhRegister2Activity;
import com.cdkj.borrowingmenber.module.bankcert.RhRegisterActivity;
import com.cdkj.borrowingmenber.module.bankcert.RhReportLookCheckActivity;
import com.cdkj.borrowingmenber.module.user.LoginActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * 启动页
 * Created by cdkj on 2017/6/8.
 */

public class WelcomeAcitivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 用于第一次安装APP，进入到除这个启动activity的其他activity，点击home键，再点击桌面启动图标时，
        // 系统会重启此activty，而不是直接打开之前已经打开过的activity，因此需要关闭此activity

        try {
            if (getIntent() != null && (getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
                finish();
                return;
            }
        } catch (Exception e) {
        }
        setContentView(R.layout.activity_welcom);

//        Intent intent = new Intent(WelcomeAcitivity.this, AddressBookCertActivity2.class);
//
//        startActivity(intent);

        mSubscription.add(Observable.timer(2, TimeUnit.SECONDS)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(aLong -> {//延迟两秒进行跳转
                    RhQuestionCheckActivity.open(WelcomeAcitivity.this, "");
//                    startNext();
                }, Throwable::printStackTrace));
    }

    /**
     * 启动页下一步
     */
    private void startNext() {
        if (!SPUtilHelpr.isLoginNoStart()) {
            LoginActivity.open(this, true);
            finish();
            return;
        }
        MainActivity.open(this);
        finish();
    }

}
