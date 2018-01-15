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
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhFindLoginnameBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * 找回登录密码
 * Created by cdkj on 2018/1/15.
 */

public class RhFindLoginNameActivity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhFindLoginNameActivity.class);
        context.startActivity(intent);
    }

    private ActivityRhFindLoginnameBinding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_find_loginname, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("找回登录名");

        initListener();

        getCode();
    }

    private void initListener() {

        mBinding.tvChangeCode.setOnClickListener(v -> getCode());

        mBinding.btnNext.setOnClickListener(v -> findName());

    }

    private void findName() {

        mBinding.errorInfo.setVisibility(View.GONE);

        if (TextUtils.isEmpty(mBinding.editLoginName.getText().toString())) {
            showToast("请输入姓名");
            return;
        }
        if (TextUtils.isEmpty(mBinding.editIdNum.getText().toString())) {
            showToast("请输入身份证号码");
            return;
        }
        if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
            showToast("请输入验证码");
            return;
        }

        Map<String, String> map = new HashMap<>();

//        map.put("org.apache.struts.taglib.html.TOKEN",token);//
        map.put("method", "findLoginName");
        map.put("name", mBinding.editLoginName.getText().toString());
        map.put("certType", "0");//固定值 代表身份证号码
        map.put("certNo", mBinding.editIdNum.getText().toString());
        map.put("_@IMGRC@_", mBinding.editCode.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindNameRequest(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {
                Elements error = doc.getElementsByClass("erro_div1");

                if (error != null && !TextUtils.isEmpty(error.text())) {
                    showToast(error.text());
                    mBinding.errorInfo.setVisibility(View.VISIBLE);
                    mBinding.errorInfo.setText(error.text());
                    getCode();
                    return;
                }
                if (StringUtils.contains(doc.text(), "姓名")) {
                    showToast("找回密码失败，请重试");
                    getCode();
                    return;
                }

                showSureDialog("您的登录名已短信发送至平台预留的手机号码，请查收。", view -> {
                    finish();
                });

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

    public void getCode() {

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindNameCode(new Date().getTime() + "");

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.RESPONSETYPE) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {
                try {
                    Glide.with(RhFindLoginNameActivity.this).load(responseBody.bytes()).error(com.cdkj.baselibrary.R.drawable.default_pic).into(mBinding.imgCode);
                } catch (Exception e) {
                    LogUtil.E("加载" + e);
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

}
