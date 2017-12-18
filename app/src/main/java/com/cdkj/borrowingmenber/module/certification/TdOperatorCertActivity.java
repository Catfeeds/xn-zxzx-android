package com.cdkj.borrowingmenber.module.certification;

import android.databinding.DataBindingUtil;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import com.cdkj.baselibrary.databinding.ActivityWebviewBinding;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import java.util.Map;

import retrofit2.Call;

/**
 * 同盾运营商认证
 * Created by cdkj on 2017/12/12.
 */

public class TdOperatorCertActivity extends BaseCertStepActivity {

    private WebView webView;

    private ActivityWebviewBinding mBinding;

    private static final String tdUrl = "https://open.shujumohe.com/box/yys?";
    //TODO  同盾boxToken 替换
    private static final String boxToken = "5613A6F334DC4E12944AF748EE11FDEA";

    private static final String nextUrl = "https://me/do/next";//用户验证完成后的要打开的url


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), com.cdkj.baselibrary.R.layout.activity_webview, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        initLayout();
        mBaseBinding.titleView.setMidTitle("运营商认证");

        webView.loadUrl(getLoadUrl());

//        TdParseProgressDialog dialog = new TdParseProgressDialog(this, "数据认证中", false);
//
//        dialog.show();
//        Observable.interval(1, TimeUnit.SECONDS, AndroidSchedulers.mainThread())    // 创建一个按照给定的时间间隔发射从0开始的整数序列
//                .observeOn(AndroidSchedulers.mainThread())
//                .take(maxNum)//只发射开始的N项数据或者一定时间内的数据
//                .subscribe(aLong -> {
//                    LogUtil.E("lxj"+aLong);
//                    dialog.setProgress(aLong);
//                });
    }

    /*https://open.shujumohe.com/box/yys?box_token=yys?box_token=5613A6F334DC4E12944AF748EE11FDEA&real_name=%E6%9D%8E%E5%85%88%E4%BF%8A&identity_code=dfdfdfddfdd&user_mobile=55656565&real_name=%E6%9D%8E%E5%85%88%E4%BF%8A*/
    @NonNull
    private String getLoadUrl() {
        StringBuffer stringBuffer = new StringBuffer(tdUrl);
        stringBuffer.append("box_token=" + boxToken);

        stringBuffer.append("&cb=" + nextUrl); //完成后的url

        IdAndNameModel idAndNameModel = getIdAndName();
        if (idAndNameModel != null) {
            if (!TextUtils.isEmpty(idAndNameModel.getRealName())) {
                stringBuffer.append("&real_name=" + idAndNameModel.getRealName()); //姓名
            }
            if (!TextUtils.isEmpty(idAndNameModel.getIdNo())) {
                stringBuffer.append("&identity_code=" + idAndNameModel.getIdNo());//身份证号
            }
        }

        String mobile = getUserPhoneNum();

        if (!TextUtils.isEmpty(mobile)) {
            stringBuffer.append("&user_mobile=" + getUserPhoneNum());//手机号
        }

        LogUtil.E("同盾" + stringBuffer.toString());

        return stringBuffer.toString();
    }

    private void initLayout() {
        //输入法
        if (getWindow() != null) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE | WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        }
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        webView = new WebView(getApplicationContext());
        webView.setLayoutParams(params);
        mBinding.llAboutUs.addView(webView, 1);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);//软件解码
        }
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);//硬件解码

        webView.setWebChromeClient(new MyWebViewClient1());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        WebViewClient webViewClient = new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                Log.e("lxj", error.toString() + "");
                handler.proceed(); // 接受网站证书
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //url拦截 nextUrl?all_submit=1&task_id=TASKYYS00000xxxxxxxxxxxxxxxxxx
                LogUtil.E("同盾" + url);
                if (url.startsWith(nextUrl)) {             //获取taks_id  用于查询认证结果
                    taskIdCheck(url);
                    return true;
                }

                return false;
            }
        };
        webView.setWebViewClient(webViewClient);

        if (webView.getSettings() != null) {
            webView.getSettings().setJavaScriptEnabled(true);//js
            webView.getSettings().setDefaultTextEncodingName("utf-8");
        }

    }

    /**
     * 检测同盾TadkId
     *
     * @param url
     */
    private void taskIdCheck(String url) {

        if (mCertListModel == null) return;

        String taskId = getTaskIdByUrl(url);

        if (TextUtils.isEmpty(taskId)) {
            UITipDialog.showFall(TdOperatorCertActivity.this, "认证失败，请退出重试");
            return;
        }

        Map map = RetrofitUtils.getRequestMap();

        map.put("searchCode", mCertListModel.getCode());
        map.put("taskId", taskId);

        showLoadingDialog();
        Call call = RetrofitUtils.getBaseAPiService().successRequest("805256", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    mCertListModel.setPYYS4("N");
                    CertificationHelper.checkRequest(TdOperatorCertActivity.this, mCertListModel);
                    finish();
                } else {
                    UITipDialog.showFall(TdOperatorCertActivity.this, "认证失败，请重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * 获取url里的TaskId
     *
     * @param url
     * @return
     */
    private String getTaskIdByUrl(String url) {

        if (TextUtils.isEmpty(url)) {
            return "";
        }

        int index = url.indexOf("task_id=") + "task_id=".length();

        return StringUtils.subStringEnd(url, index);

    }

    private class MyWebViewClient1 extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            mBinding.pb.setProgress(newProgress);
            if (newProgress > 90) {
                mBinding.pb.setVisibility(View.GONE);
            }
            super.onProgressChanged(view, newProgress);
        }
    }

    @Override
    public void onBackPressed() {
        goBack();
    }


    @Override
    protected boolean canFinish() {
        return false;
    }

    @Override
    public void topTitleViewleftClick() {
        goBack();
    }

    @Override
    protected void onDestroy() {
        if (webView != null) {
            webView.clearHistory();
            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.loadUrl("about:blank");
            webView.stopLoading();
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            webView.destroy();
            webView = null;
        }

        super.onDestroy();
    }

    private void goBack() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            finish();
        }
    }


}
