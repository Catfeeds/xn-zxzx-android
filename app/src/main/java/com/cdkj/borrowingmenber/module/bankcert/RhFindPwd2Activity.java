package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.bumptech.glide.Glide;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.interfaces.RefreshHelper;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhFindPwd2Binding;
import com.cdkj.borrowingmenber.databinding.ActivityRhFindPwdBinding;
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
 * 找回登录密码 第二步
 * Created by cdkj on 2018/1/15.
 */

public class RhFindPwd2Activity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhFindPwd2Activity.class);
        context.startActivity(intent);
    }

    private ActivityRhFindPwd2Binding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_find_pwd2, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("设置新密码");
        initListener();
    }

    private void initListener() {

        mBinding.btnGetCode.setOnClickListener(v -> getCode());

        mBinding.btnNext.setOnClickListener(v -> findPwd());

    }

    private void findPwd() {

        mBinding.errorInfo.setVisibility(View.GONE);
        if (TextUtils.isEmpty(mBinding.editNewPwd.getText().toString())) {
            showToast("请输入新");
            return;
        }
        if (TextUtils.isEmpty(mBinding.editConfirmPwd.getText().toString())) {
            showToast("请确认新姓名");
            return;
        }
        if (!TextUtils.equals(mBinding.editConfirmPwd.getText().toString(), mBinding.editNewPwd.getText().toString())) {
            showToast("两次密码输入不一致");
            return;
        }
        if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
            showToast("请输入动态码");
            return;
        }

        Map<String, String> map = new HashMap<>();

//        map.put("org.apache.struts.taglib.html.TOKEN",token);//
        map.put("method", "resetPassword");
        map.put("counttime", "1");
        map.put("password", mBinding.editNewPwd.getText().toString());
        map.put("confirmpassword", mBinding.editConfirmPwd.getText().toString());
        map.put("verifyCode", mBinding.editCode.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindPWD1(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {
                Elements error = doc.getElementsByClass("erro_div3");

                if (error != null && !TextUtils.isEmpty(error.text())) {
                    showToast(error.text());
                    mBinding.errorInfo.setVisibility(View.VISIBLE);
                    mBinding.errorInfo.setText(error.text());
                    return;
                }
                if (StringUtils.contains(doc.text(), "新密码") && StringUtils.contains(doc.text(), "手机动态码")) {
                    showToast("找回密码失败，请重试");
                    return;
                }

                if (checkUserLevel(doc)) {
                    RhFindPwdQuestionCheckActivity.open(RhFindPwd2Activity.this, RhHelper.checkGetToken(doc));
                    finish();
                } else {
                    showSureDialog("您安全等级过高，无法使用此功能。请自行前往官网修改。\n 官网地址：https://ipcrs.pbccrc.org.cn/", view -> {
                        finish();
                    });
                }

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * 判断用户等级 等级低的才有问题验证
     * <p>
     * 通过 有没有问题验证相关元素出现来判断
     */
    public boolean checkUserLevel(Document document) {

        Element radiobutton3 = document.getElementById("radiobutton3");

        if (radiobutton3 == null || !TextUtils.equals(radiobutton3.attr("value"), "2")) {
            return false;
        }

        Element radiobutton3_label = document.getElementById("radiobutton3_label");

        if (radiobutton3_label == null || !TextUtils.equals(radiobutton3_label.text(), "问题验证")) {
            return false;
        }

        return true;

    }

    /**
     * 获取动态码
     */
    public void getCode() {

        Map<String, String> map = new HashMap<>();

        map.put("method", "getAcvitaveCode");
        map.put("counttime", "119");

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindPWDGetPhoneCode(map, Math.random() + "");

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.STRINGTYPE) {
            @Override
            protected void onSuccess(String str) {

                if (TextUtils.equals("success", str)) {  //获取成功
                    mSubscription.add(AppUtils.startCodeDown(120, mBinding.btnGetCode));
                    showToast("身份动态码已经发送，请注意查收");
                } else if (TextUtils.equals("noTradeCode", str)) { //系统异常
                    showToast("系统异常，请重试");
                } else { //获取错误
                    showToast("手机动态码发送失败，请重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

}
