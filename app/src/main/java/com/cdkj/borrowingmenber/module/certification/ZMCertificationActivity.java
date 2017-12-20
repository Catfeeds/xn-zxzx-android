package com.cdkj.borrowingmenber.module.certification;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.cdkj.baselibrary.api.BaseApiServer;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityCardandnameCheckBinding;
import com.cdkj.borrowingmenber.model.ZMCertFirstStepModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;


/**
 * 芝麻认证 （支付宝方式）
 * Created by 李先俊 on 2017/7/26.
 */

public class ZMCertificationActivity extends BaseCertStepActivity {

    private ActivityCardandnameCheckBinding mBinding;

    private String mBizNum;//用于唤起支付宝

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_cardandname_check, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setMidTitle("芝麻认证");
        initListener();
    }


    private void initListener() {
        //
        mBinding.butSure.setOnClickListener(v -> {
            if (TextUtils.isEmpty(mBinding.editName.getText().toString())) {
                UITipDialog.showInfo(ZMCertificationActivity.this, "请输入姓名");
                return;
            }
            if (TextUtils.isEmpty(mBinding.editCardNumber.getText().toString())) {
                UITipDialog.showInfo(ZMCertificationActivity.this, "请输入身份证号码");
                return;
            }

            certRequest();

        });

        mBinding.imgCalcelCert.setOnClickListener(v -> {
            mBinding.layoutTips.setVisibility(View.GONE);
        });
    }

    /**
     * 认证信息请求
     */
    private void certRequest() {
        if (isCertCodeEmpty()) {
            return;
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("idNo", mBinding.editCardNumber.getText().toString());
        map.put("realName", mBinding.editName.getText().toString());
        map.put("userId", SPUtilHelpr.getUserId());
        map.put("returnUrl", "borrowing://certi.back");
        map.put("searchCode", mCertCode);//调查单编号

        Call call = RetrofitUtils.createApi(MyApiServer.class).ZmCertFirstStep("805251", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();
        call.enqueue(new BaseResponseModelCallBack<ZMCertFirstStepModel>(this) {
            @Override
            protected void onSuccess(ZMCertFirstStepModel data, String SucMessage) {
                mBizNum = data.getBizNo();
                doVerify(data.getUrl());
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }


    /**
     * 启动支付宝进行认证
     *
     * @param url 开放平台返回的URL
     */
    private void doVerify(String url) {
        if (hasApplication()) {
            Intent action = new Intent(Intent.ACTION_VIEW);
            StringBuilder builder = new StringBuilder();
            // 这里使用固定appid 20000067
            builder.append("alipays://platformapi/startapp?appId=20000067&url=");
            builder.append(URLEncoder.encode(url));
            action.setData(Uri.parse(builder.toString()));
            LogUtil.E("url" + builder.toString());
            startActivity(action);
        } else {
            // 处理没有安装支付宝的情况
            new AlertDialog.Builder(this)
                    .setMessage("是否下载并安装支付宝完成认证?")
                    .setPositiveButton("好的", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent action = new Intent(Intent.ACTION_VIEW);
                            action.setData(Uri.parse("https://m.alipay.com"));
                            startActivity(action);
                        }
                    }).setNegativeButton("算了", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).show();
        }
    }

    /**
     * 判断是否安装了支付宝
     *
     * @return true 为已经安装
     */
    private boolean hasApplication() {
        PackageManager manager = getPackageManager();
        Intent action = new Intent(Intent.ACTION_VIEW);
        action.setData(Uri.parse("alipays://"));
        List list = manager.queryIntentActivities(action, PackageManager.GET_RESOLVED_FILTER);
        return list != null && list.size() > 0;
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e("LQ", "scheme:" + intent.getScheme());
        Uri uri = intent.getData();
        if (uri != null) {
            Log.e("LQ", "scheme: " + uri.getScheme());
            Log.e("LQ", "host: " + uri.getHost());
            Log.e("LQ", "port: " + uri.getPort());
            Log.e("LQ", "path: " + uri.getPath());
            Log.e("LQ", "queryString: " + uri.getQuery());
            Log.e("LQ", "queryParameter: " + uri.getQueryParameterNames());



/*            if (null != uri.getQueryParameter("biz_content")) {
                try {
                    JSONObject object = new JSONObject(uri.getQueryParameter("biz_content"));
                    check(object.getString("biz_no"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }*/

            check(mBizNum);

        }
    }

    private void check(String mBizNum) {

        if (isCertCodeEmpty()) {
            return;
        }

        Map<String, String> map = new HashMap<>();
        map.put("bizNo", mBizNum);
        map.put("searchCode", mCertCode);

        Call call = RetrofitUtils.createApi(BaseApiServer.class).booleanRequest("805252", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();
        call.enqueue(new BaseResponseModelCallBack<Boolean>(this) {
            @Override
            protected void onSuccess(Boolean data, String SucMessage) {
                if (data) {
                    getCheckData(NEXTSTEP);
                } else {
                    UITipDialog.showInfo(ZMCertificationActivity.this, "芝麻认证失败，请重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

}
