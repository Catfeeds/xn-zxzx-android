package com.cdkj.borrowingmenber.module.certification;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.model.IntroductionInfoModel;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivitySurveyStatementBinding;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * 调查申明
 * Created by cdkj on 2017/12/18.
 */

public class SurveyStatementActivity extends BaseCertStepActivity {

    private ActivitySurveyStatementBinding mBinding;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_survey_statement, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        initLayout();
        initData();

    }

    private void initLayout() {
        //输入法
        if (getWindow() != null) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE | WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        }
        mBinding.webView.getSettings().setJavaScriptEnabled(true);//js
        mBinding.webView.getSettings().setDefaultTextEncodingName("UTF-8");
        mBinding.webView.setWebChromeClient(new MyWebViewClient1());
        mBinding.webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        mBinding.btnStart.setOnClickListener(v -> {
            //打开芝麻认证
            CertificationHelper.openStepPage(this, ZMCertificationActivity.class, mCertListModel, mReportModel);
            finish();
        });


    }

    private void initData() {
        mBaseBinding.titleView.setMidTitle("调查申明");
        getKeyUrl("searchText");
    }


    public void getKeyUrl(String key) {

        if (TextUtils.isEmpty(key)) {
            return;
        }

        Map<String, String> map = new HashMap<>();
        map.put("ckey", key);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("companyCode", MyCdConfig.COMPANYCODE);

        Call call = RetrofitUtils.getBaseAPiService().getKeySystemInfo("805917", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<IntroductionInfoModel>(this) {
            @Override
            protected void onSuccess(IntroductionInfoModel data, String SucMessage) {
                if (TextUtils.isEmpty(data.getCvalue())) {
                    return;
                }
                mBinding.webView.loadData(data.getCvalue(), "text/html;charset=UTF-8", "UTF-8");
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

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
    protected void onDestroy() {
        mBinding.webView.destroy();
        mBinding.linWebRoot.removeAllViews();
        super.onDestroy();
    }

    private void goBack() {
        if (mBinding.webView == null) {
            return;
        }
        if (mBinding.webView.canGoBack()) {
            mBinding.webView.goBack();
        } else {
            finish();
        }
    }

}
