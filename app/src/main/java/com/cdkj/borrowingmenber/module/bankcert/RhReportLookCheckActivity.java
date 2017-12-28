package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhReportCheckBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 人行报告查看验证
 * Created by cdkj on 2017/12/28.
 */

public class RhReportLookCheckActivity extends AbsBaseLoadActivity {

    private ActivityRhReportCheckBinding mBinding;


    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhReportLookCheckActivity.class);
        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_report_check, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("查看报告");

        initListener();
    }

    private void initListener() {
        mBinding.btnGetIdCode.setOnClickListener(v -> getIdCode());

        mBinding.btnLook.setOnClickListener(v -> {
            if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
                showToast("请输入身份验证码");
                return;
            }

            checkLookReport();

        });
    }

    private void getIdCode() {


        Map<String, String> map = new HashMap<>();

        map.put("method", "sendAgain");
        map.put("reportformat", "21"); //21 个人信用报告  24 个人信用概要 25 个人信息提

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).idCodeRequest(map, new Date().getTime() + "");

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                try {
                    LogUtil.E("id code" + response.body().string());
                    if (TextUtils.equals("success", response.body().string())) {  //获取成功
                        mSubscription.add(AppUtils.startCodeDown(60, mBinding.btnGetIdCode));
                        showToast("身份验证码已经发送，请注意查收");
                    } else if (TextUtils.equals("noTradeCode", response.body().string())) { //系统异常
                        showToast("系统异常，请重试");
                    } else { //获取错误
                        showToast("身份验证码已经失败，请重试");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                LogUtil.E("code失败" + t);
            }
        });

    }


    private void checkLookReport() {

        /*method	checkTradeCode
code	tb4k7f
reportformat	21*/

        Map<String, String> map = new HashMap<>();

        map.put("method", "checkTradeCode");
        map.put("code", mBinding.editCode.getText().toString());
        map.put("reportformat", "21"); //21 个人信用报告  24 个人信用概要 25 个人信息提示

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).checklookRepory(map);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                LogUtil.E("查看检测" + response.body().toString());

                try {
                    if (TextUtils.equals(response.body().string(), "0")) //成功
                    {
                        look();

                    } else { //失败
                        showToast("报告查看失败，请重试");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                LogUtil.E("查看检测失败" + t);
            }
        });

    }


    private void look() {
/*counttime	1
reportformat	21
tradeCode	tb4k7f*/

        Map<String, String> map = new HashMap<>();

        map.put("counttime", "1");
        map.put("tradeCode", mBinding.editCode.getText().toString());
        map.put("reportformat", "21"); //21 个人信用报告  24 个人信用概要 25 个人信息提示

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).look(map);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                LogUtil.E("查看成功" + response.body().toString());
                try {
                    WebSettings webSettings = mBinding.web.getSettings();
                    if (webSettings != null) {
                        webSettings.setJavaScriptEnabled(true);//js
                        webSettings.setDefaultTextEncodingName("UTF-8");
                        webSettings.setSupportZoom(true);   //// 支持缩放
                        webSettings.setBuiltInZoomControls(true);//// 支持缩放
                        webSettings.setDomStorageEnabled(true);//开启DOM
                        webSettings.setLoadWithOverviewMode(true);//// 缩放至屏幕的大小
                        webSettings.setUseWideViewPort(true);//将图片调整到适合webview的大小
                        webSettings.setLoadsImagesAutomatically(true);//支持自动加载图片
                    }

                    mBinding.web.loadData(response.body().string(), "text/html;charset=UTF-8", "UTF-8");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                LogUtil.E("查看失败" + t);
            }
        });

    }

}
