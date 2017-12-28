package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.bumptech.glide.Glide;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhLoginBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 人行登录
 * Created by cdkj on 2017/12/28.
 */

public class RhLoginActivity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhLoginActivity.class);
        context.startActivity(intent);
    }

    private ActivityRhLoginBinding mbinding;

    @Override
    public View addMainView() {
        mbinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_login, null, false);
        return mbinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("登录");

        initListener();
        getLoginCode();

    }

    private void initListener() {
        mbinding.tvChangeCode.setOnClickListener(v -> getLoginCode());
        mbinding.btnLogin.setOnClickListener(v -> {
            if (TextUtils.isEmpty(mbinding.editCode.getText().toString())) {
                showToast("请输入验证码");
                return;
            }

            if (TextUtils.isEmpty(mbinding.editLoginName.getText().toString())) {
                showToast("请输入登录名");
                return;
            }

            if (TextUtils.isEmpty(mbinding.editCode.getText().toString())) {
                showToast("请输入密码");
                return;
            }

            login();
        });
    }

    /**
     * 获取登录验证码
     */
    private void getLoginCode() {

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).rhLoginCode(new Date().getTime() + "");

        showLoadingDialog();
        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {

                try {
                    Glide.with(RhLoginActivity.this).load(responseBody.bytes()).error(com.cdkj.baselibrary.R.drawable.default_pic).into(mbinding.imgCode);
                } catch (Exception e) {
                    LogUtil.E("加载" + e);
                }

                LogUtil.E("请求验证码成功");
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


    private void login() {
    /*
       _@IMGRC@_: 123456

       date: 1514339223797


       loginname: 123456789


       method: login


       org.apache.struts.taglib.html.TOKEN: ee6b7fa23c51f216a446198fd1b96dea


       password: 123456789
    */

        Map<String, String> map = new HashMap<>();
        map.put("_@IMGRC@_", mbinding.editCode.getText().toString());
        map.put("date", new Date().getTime() + "");

        map.put("loginname", mbinding.editLoginName.getText().toString());
        map.put("password", mbinding.editLoginPassword.getText().toString());

        map.put("method", "login");
//            map.put("org.apache.struts.taglib.html.TOKEN", "083f89e3c71eedf1ac40a7fc771c95a583d2fd765cbd92fa5a4316f4");

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).rhLogin(map);
        showLoadingDialog();
        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {
                disMissLoading();
                RhReportLookCheckActivity.open(RhLoginActivity.this);
                finish();
                LogUtil.E("登录请求成功");
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


}
