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

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
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

    private UITipDialog tipDialog;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), com.cdkj.baselibrary.R.layout.activity_webview, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setMidTitle("运营商认证");
        initLayout();
        getCheckData(1);
    }

    /**
     * 显示等待弹框并开启定时器
     */
    private void startTimer() {
        showWaiteDialog();
        mSubscription.add(Observable.timer(8, TimeUnit.SECONDS, AndroidSchedulers.mainThread())    // 定时器 8秒后重新请求认证结果
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(aLong -> {
                    getReportCheckData();
                }, throwable -> {
                    dismissWaiteDialog(); // 轮询错误 停止等待弹框
                }));
    }

    @Override
    protected void checkStateTrue(int requestCode) {
        if (requestCode != NEXTSTEP) {
            webView.loadUrl(getLoadUrl());
        } else {
            dismissWaiteDialog();                  //停止等待弹框
            super.checkStateTrue(requestCode);
        }
    }

    @Override
    protected void checkStateFalse(int requestCode) {
        dismissWaiteDialog();                  //请求错误时停止等待弹框
        super.checkStateFalse(requestCode);
    }

    /**
     * 获取要加载的url
     *
     * @return
     */
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

        webView = new WebView(getApplicationContext());

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
            webView.getSettings().setDefaultTextEncodingName("UTF-8");
        }

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        webView.setLayoutParams(params);
        mBinding.llAboutUs.addView(webView, 1);

    }

    /**
     * 检测同盾TadkId
     *
     * @param url
     */
    private void taskIdCheck(String url) {

        if (isCertCodeEmpty()) {
            showToast("运营商认证失败，请退出重试。");
            return;

        }
        String taskId = getTaskIdByUrl(url);

        if (TextUtils.isEmpty(taskId)) {
            UITipDialog.showFall(TdOperatorCertActivity.this, "认证失败，请退出重试");
            return;
        }

        Map map = RetrofitUtils.getRequestMap();

        map.put("searchCode", mCertCode);
        map.put("taskId", taskId);

        showLoadingDialog();
        Call call = RetrofitUtils.getBaseAPiService().successRequest("805256", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    getReportCheckData();
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
     * //获取运营商认证结果 //：0：未认证，1：结果拉取中，2：认证成功，3：认证失败
     */
    public void getReportCheckData() {
        if (tipDialog != null && !tipDialog.isShowing()) { //如果没有显示认证中弹框  就显示加载框
            showLoadingDialog();
        }
        mSubscription.add(Observable.just("")
                .observeOn(Schedulers.io())
                .map(s -> getReportRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> disMissLoading())
                .map(reportModel -> reportModel.getPYYS4Status())
                .subscribe(state -> {
                    switch (state) {
                        case "1":
                            startTimer();              //显示等待弹框 继续轮询
                            break;
                        case "2":
                            getCheckData(NEXTSTEP);                  //认证成功检测下一步 在回调 checkStateTrue checkStateFalse 方法里取消等待弹框 并检测下一步跳转
                            break;
                        case "3":
                            dismissWaiteDialog();                  //停止等待弹框
                            LogUtil.E("认证失败，请重新认证");
                            showSureDialog("认证失败，请重新认证", view -> {
                                finish();
                            });
                            break;
                        default:
                            dismissWaiteDialog();                  //停止加载弹框
                    }
                }, throwable -> {
                    dismissWaiteDialog();                   //请求错误 停止等待弹框
                }));
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

        if (tipDialog != null) {
            tipDialog.dismiss();
            tipDialog = null;
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

    public void showWaiteDialog() {
        if (tipDialog == null) {
            tipDialog = new UITipDialog.Builder(this)
                    .setIconType(UITipDialog.Builder.ICON_TYPE_LOADING)
                    .setTipWord("认证中...")
                    .create();
        }

        if (!tipDialog.isShowing()) {
            tipDialog.show();
        }
    }

    public void dismissWaiteDialog() {
        if (tipDialog != null && tipDialog.isShowing()) {
            tipDialog.dismiss();
        }
    }

}
