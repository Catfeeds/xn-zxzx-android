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
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhLoginBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * 人行登录
 * Created by cdkj on 2017/12/28.
 */

public class RhLoginActivity extends AbsBaseLoadActivity {

    private Document loginDoc; //登录获取到的Document
    private boolean isMe;//研发测试使用

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

        isMe = true;
        mbinding.tvTop.setOnClickListener(v -> {
            if (isMe) {
                mbinding.editLoginName.setText("lixianjun_1995");
                mbinding.editLoginPassword.setText("lxjzx123456");
            } else {
                mbinding.editLoginName.setText("chenshan2819");
                mbinding.editLoginPassword.setText("q1i1a1n1");
            }
            isMe = !isMe;
        });

        initListener();
        getLoginCode();

    }

    private void initListener() {
        mbinding.tvChangeCode.setOnClickListener(v -> getLoginCode());
        mbinding.imgCode.setOnClickListener(v -> getLoginCode());
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
                try {
                    checkLoginState(responseBody.string());
                } catch (Exception e) {
                    e.printStackTrace();
                    LogUtil.E("登录解析失败" + e);
                }

                LogUtil.E("登录请求成功");
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


    /**
     * 检测登录状态
     *
     * @param rb
     */
    private void checkLoginState(String rb) {

        mSubscription.add(Observable.just("")
                .observeOn(Schedulers.io())
                .map(s -> {
                    loginDoc = Jsoup.parse(rb);
                    return loginDoc;
                })
                .observeOn(AndroidSchedulers.mainThread())
                .map(doc -> {
                    Elements element = doc.getElementsByClass("erro_div3"); //获取登录错误提醒 如果有 说明登录没成功
                    if (element != null && !TextUtils.isEmpty(element.text())) {
                        mbinding.errorInfo.setText(element.text());
                        showToast(element.text());
                        return false;
                    } else {
                        return true;
                    }
                })
                .subscribe(elements -> {
                    if (elements) {
                        getLeftMenuReportInfo();
//                        checkIsHasReport();
                    } else {
                        getLoginCode();   //登录失败重新获取验证码
                    }

                }, throwable -> {
                    LogUtil.E("登录解析失败2" + throwable);
                }));

    }


    /**
     * 检测登录用户是否有报告
     */
    public void checkIsHasReport() {
        mSubscription.add(Observable.just("")
                .observeOn(Schedulers.io())
                .map(s -> {
                    //待验证 方式
                    Elements element = loginDoc.getElementsByClass("popupbox"); //登录成功，但是有引导提醒（安全等级低）说明没有报告单

                    if (element != null && element.text() != null && element.text().contains("新手导航")) {
                        return false;
                    }
                    Elements element2 = loginDoc.getElementsByClass("guide_notice"); //登录成功，但是有引导提醒（安全等级低）说明没有报告单

                    if (element2 != null && !TextUtils.isEmpty(element2.text())) {
                        return false;
                    }

                    // 备用方案
                    //
                    // 1.获取用户信息菜单下 三个选项不可为没有报告
                    // 2. erro_div1 出现错误提醒暂无消息为没有报告
                    // 3.身份验证码不可输入
                    //4.获取按钮不可点击
                    return true;
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(isHas -> {
                    if (isHas) {                                                         //有报告单，直接进入到查看界面
                        getLeftMenuReportInfo();
                    } else {
                        RhNoReportActivity.open(RhLoginActivity.this);          //没有报告单
                    }
                }, throwable -> {
                    LogUtil.E("登录报告单验证" + throwable.toString());
                }));
    }

    /**
     * 获取登录成功后左菜单
     */
    public void getLeftMenuReportInfo() {

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).getLeftMenuReportInfo();

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {
                try {
                    String str = responseBody.string();
                    LogUtil.BIGLOG("获取左边菜单" + str);
                    checkCanLookReport(str);

                } catch (IOException e) {
                    LogUtil.E("左菜单解析" + e);
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * 检测是否有可查看报告
     *
     * @param str
     */
    private void checkCanLookReport(String str) {

        mSubscription.add(Observable.just("")
                .observeOn(Schedulers.io())
                .map(s -> {
                    Document menuDoc = Jsoup.parse(str);
                    return menuDoc;

                }).subscribe(menuDoc -> {

                    Elements radio = menuDoc.select("[disabled]");// 获取带有disabled属性的元素 三个资信报告类型选择框

                    if (radio == null) return;

                    if (checkRadioButtonDisabled(radio)) {
                        RhNoReportActivity.open(RhLoginActivity.this);          //没有报告单
                    } else {
                        RhReportLookCheckActivity.open(this);
                    }
                    finish();

                }, throwable -> {
                    LogUtil.E("报告可选" + throwable);
                }));
    }

    /**
     * 检测 disabled 元素禁用情况
     *
     * @param radio
     * @return
     */
    private boolean checkRadioButtonDisabled(Elements radio) {

        for (Element element : radio) {
            if (element == null) continue;

            if (TextUtils.equals(RhReportLookCheckActivity.reportType , element.attr("value"))) {  // 如果获取的元素里 有 value=21 说明个人信用报告被禁用
                return true;
            }
        }
        return false;
    }


}
