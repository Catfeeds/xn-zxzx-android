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
import com.cdkj.borrowingmenber.databinding.ActivityRhFindPwdBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;

import org.jsoup.nodes.Document;
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

public class RhFindPwdStep1Activity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhFindPwdStep1Activity.class);
        context.startActivity(intent);
    }

    private ActivityRhFindPwdBinding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_find_pwd, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle(getString(R.string.rh_find_pwd_title));

        initListener();

        getCode();
    }

    private void initListener() {

        mBinding.tvChangeCode.setOnClickListener(v -> getCode());

        mBinding.btnNext.setOnClickListener(v -> findPwdRequest());

    }

    /**
     * 找回密码请求
     */
    private void findPwdRequest() {

        mBinding.errorInfo.setVisibility(View.GONE);

        if (checkInputState()) return;

        Map<String, String> map = new HashMap<>();

//        map.put("org.apache.struts.taglib.html.TOKEN",token);//
        map.put("method", "checkLoginName");
        map.put("loginname", mBinding.editLoginName.getText().toString());
        map.put("name", mBinding.editName.getText().toString());
        map.put("certType", "0");//固定值 代表身份证号码
        map.put("certNo", mBinding.editIdNum.getText().toString());
        map.put("_@IMGRC@_", mBinding.editCode.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindPWD1(map);

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
                if (StringUtils.contains(doc.text(), getString(R.string.name)) && StringUtils.contains(doc.text(), getString(R.string.pass_code))) {
                    showToast(getString(R.string.rh_find_pwd_error));
                    getCode();
                    return;
                }

                RhFindPwdStep2Activity.open(RhFindPwdStep1Activity.this);
                finish();

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

    /**
     * 检查输入状态
     *
     * @return
     */
    private boolean checkInputState() {
        if (TextUtils.isEmpty(mBinding.editLoginName.getText().toString())) {
            showToast(getString(R.string.please_input_login_name));
            return true;
        }
        if (TextUtils.isEmpty(mBinding.editName.getText().toString())) {
            showToast(getString(R.string.please_input_name));
            return true;
        }
        if (TextUtils.isEmpty(mBinding.editIdNum.getText().toString())) {
            showToast(getString(R.string.please_input_idcard_num));
            return true;
        }
        if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
            showToast(getString(R.string.please_input_phone_code));
            return true;
        }
        return false;
    }

    public void getCode() {

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindPwdCode(new Date().getTime() + "");

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.RESPONSETYPE) {
            @Override
            protected void onSuccess(ResponseBody responseBody) {

                try {
                    Glide.with(RhFindPwdStep1Activity.this).load(responseBody.bytes()).error(com.cdkj.baselibrary.R.drawable.default_pic).into(mBinding.imgCode);
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
