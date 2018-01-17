package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhQuestionCodeCheckBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.greenrobot.eventbus.EventBus;
import org.jsoup.nodes.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * 人行动态码验证
 * Created by cdkj on 2018/1/15.
 */

public class RhQuestionCodeCheckActivity extends AbsBaseLoadActivity {

    private String checkQuestionToekn;//用于请求申请报告
    private String authtype;//用于请求申请报告

    /**
     * @param context
     * @param token   用于请求的token
     */
    public static void open(Context context, String token, String authtype) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhQuestionCodeCheckActivity.class);
        intent.putExtra("token", token);
        intent.putExtra("authtype", token);
        context.startActivity(intent);
    }


    private ActivityRhQuestionCodeCheckBinding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_question_code_check, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        mBaseBinding.titleView.setMidTitle("验证身份");

        if (getIntent() != null) {
            checkQuestionToekn = getIntent().getStringExtra("token");
            authtype = getIntent().getStringExtra("authtype");
        }

        mBinding.btnGetcode.setOnClickListener(v -> getCode());

        mBinding.btnNext.setOnClickListener(v -> {
            if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
                showToast("请输入动态码");
            }

            if (TextUtils.isEmpty(checkQuestionToekn)) {
                showToast("系统繁忙,请稍后再试");
                finish();
                return;
            }
            checkCode();
        });

    }

    public void getReport() {
        Map<String, String> map = new HashMap<>();

        map.put("org.apache.struts.taglib.html.TOKEN", checkQuestionToekn);
        map.put("authtype", authtype);
        map.put("method", "verify");
        map.put("ApplicationOption", RhHelper.reportType);
        Call call = RetrofitUtils.createApi(MyApiServer.class).reGetReport(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {

            @Override
            protected void onSuccess(Document doc) {
                if (StringUtils.contains(doc.text(), "您的信用信息查询请求已提交")) {
                    EventBus.getDefault().post(EventTags.RhQUESTIONFINISH); //结束上一页
                    RhQuestionDoneActivity.open(RhQuestionCodeCheckActivity.this);
                    finish();
                } else {
                    showToast("申请报告失败，请重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }

    /**
     *
     */
    private void checkCode() {
        Map<String, String> map = new HashMap<>();
        map.put("org.apache.struts.taglib.html.TOKEN", checkQuestionToekn);
        map.put("counttime", "1");
        map.put("authtype", authtype);
        map.put("method", "submitQS");
        map.put("ApplicationOption", RhHelper.reportType);
        map.put("verifyCode", mBinding.editCode.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).questionCodeCheck(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {

            @Override
            protected void onSuccess(Document doc) {
                getReport();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

    private void getCode() {

        Map<String, String> map = new HashMap<>();

        map.put("method", "send");
        map.put("verifyCode", ""); //TODO 问题动态码参数

        Call<ResponseBody> call = RetrofitUtils.createApi(MyApiServer.class).questionCode(map, new Date().getTime() + "");

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack<ResponseBody>(this, BaseRhCertCallBack.STRINGTYPE) {
            @Override
            protected void onSuccess(String str) {
                if (TextUtils.equals("success", str)) {  //获取成功
                    mSubscription.add(AppUtils.startCodeDown(120, mBinding.btnGetcode));
                    showToast("动态码已经发送，请注意查收");
                } else if (TextUtils.equals("noTradeCode", str)) { //系统异常
                    showToast("系统异常，请重试");
                } else { //获取错误
                    showToast("动态码发送失败，请重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }


}
