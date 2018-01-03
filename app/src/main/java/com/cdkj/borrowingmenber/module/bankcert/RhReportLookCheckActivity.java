package com.cdkj.borrowingmenber.module.bankcert;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;

import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhReportCheckBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * 人行报告查看验证
 * Created by cdkj on 2017/12/28.
 */

public class RhReportLookCheckActivity extends BaseCertStepActivity {

    private ActivityRhReportCheckBinding mBinding;

    public static final int reportType = 21;  //21 个人信用报告  24 个人信用概要 25 个人信息提示


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
        map.put("reportformat", reportType + ""); //21 个人信用报告  24 个人信用概要 25 个人信息提

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).idCodeRequest(map, new Date().getTime() + "");

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {
                try {
                    String succ = responseBody.string();
                    LogUtil.E("id code" + succ);
                    if (TextUtils.equals("success", succ)) {  //获取成功
                        mSubscription.add(AppUtils.startCodeDown(60, mBinding.btnGetIdCode));
                        showToast("身份验证码已经发送，请注意查收");
                    } else if (TextUtils.equals("noTradeCode", succ)) { //系统异常
                        showToast("系统异常，请重试");
                    } else { //获取错误
                        showToast("身份验证码已经失败，请重试");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
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
        map.put("reportformat", reportType + ""); //21 个人信用报告  24 个人信用概要 25 个人信息提示

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).checklookRepory(map);
        showLoadingDialog();
        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {

                try {
                    LogUtil.E("查看检测" + responseBody.string());

                    if (TextUtils.equals(responseBody.string(), "0")) //成功
                    {
                        lookReport();

                    } else { //失败

                        showToast("报告查看失败，请重试");

                    }
                } catch (Exception e) {

                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


    /**
     * 查看报告
     */
    private void lookReport() {
/*counttime	1
reportformat	21
tradeCode	tb4k7f*/

        Map<String, String> map = new HashMap<>();

        map.put("counttime", "1");
        map.put("tradeCode", mBinding.editCode.getText().toString());
        map.put("reportformat", reportType + ""); //21 个人信用报告  24 个人信用概要 25 个人信息提示

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).look(map);

        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {
                LogUtil.E("查看成功");
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
                    String reportHtmlString = responseBody.string();

                    uploadRhReportHtmlString(reportHtmlString);//上传人行报告

                    mBinding.web.loadData(reportHtmlString, "text/html;charset=UTF-8", "UTF-8");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }

    /**
     * 上传人行报告
     */
    private void uploadRhReportHtmlString(String rhHtmlStr) {

        if (isCertCodeEmpty() || TextUtils.isEmpty(rhHtmlStr)) {  //请求参数不能为空
            finish();
            return;
        }

        Call call = RetrofitUtils.createApi(MyApiServer.class).uploadRhReport(rhHtmlStr, mCertCode);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    getCheckData(NEXTSTEP);
                } else {
                    showToast("认证失败,请重试");
                    finish();
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

}
