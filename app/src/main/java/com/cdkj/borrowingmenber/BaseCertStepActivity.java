package com.cdkj.borrowingmenber;

import android.os.Bundle;
import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cdkj.baselibrary.api.BaseResponseModel;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;

import static com.cdkj.borrowingmenber.weiget.CertificationHelper.INTENTCERTCODE;

/**
 * 检测步骤
 * Created by cdkj on 2017/12/10.
 */

public abstract class BaseCertStepActivity extends AbsBaseLoadActivity {

    protected CertListModel mCertListModel;//调查单
    protected ReportModel mReportModel;//报告单
    protected String mCertCode;//调查单编号

    protected static final int NEXTSTEP = -1;

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        if (getIntent() != null) {
            mCertCode = getIntent().getStringExtra(INTENTCERTCODE);
        }
    }

    /**
     * 判断调查单编号是否为空
     *
     * @return
     */
    protected boolean isCertCodeEmpty() {
        return TextUtils.isEmpty(mCertCode);
    }

    /**
     * 获取报告单和调查单 用于判断下一步
     *
     * @param requestCode
     */
    protected void getCheckData(int requestCode) {
        showLoadingDialog();
        mSubscription.add(Observable.just("")
                .observeOn(Schedulers.io())
                .map(s -> getCheckRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> disMissLoading())
                .subscribe(isAll -> {
                    if (isAll) {
                        checkStateTrue(requestCode);
                    } else {
                        checkStateFalse(requestCode);
                    }
                }, throwable -> {
                    checkStateFalse(requestCode);
                }));
    }

    //是否获取到了所有数据 检测并跳向下一步
    protected void checkStateTrue(int requestCode) {
        if (NEXTSTEP == requestCode) {
            CertificationHelper.checkStartStep(this, mCertListModel, mReportModel);
            finish();
        }
    }

    //是否获取到了所有数据
    protected void checkStateFalse(int requestCode) {
        showToast("数据获取失败,请重试");
        finish();
    }

    private boolean getCheckRequest() {

        if (TextUtils.isEmpty(mCertCode)) return false;

        Map map = RetrofitUtils.getRequestMap();
        map.put("code", mCertCode);

        Call call = RetrofitUtils.createApi(MyApiServer.class).getCertDetails("805281", StringUtils.getJsonToString(map));//获取调查单
        try {
            BaseResponseModel<CertListModel> certCall = (BaseResponseModel<CertListModel>) call.execute().body();
            mCertListModel = certCall.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }

        getReportRequest();

        return mCertListModel != null && mReportModel != null;
    }

    /**
     * 获取报告单
     */
    protected ReportModel getReportRequest() {
        if (mCertListModel == null || TextUtils.isEmpty(mCertListModel.getReportCode())) {
            return null;
        }
        try {
            Map map2 = RetrofitUtils.getRequestMap();
            map2.put("reportCode", mCertListModel.getReportCode());
            Call call2 = RetrofitUtils.createApi(MyApiServer.class).getReportData("805334", StringUtils.getJsonToString(map2));//获取报告单
            BaseResponseModel<ReportModel> reCall = (BaseResponseModel<ReportModel>) call2.execute().body();
            mReportModel = reCall.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mReportModel;
    }


    /**
     * 获取用户姓名身份证号
     *
     * @return
     */
    public IdAndNameModel getIdAndName() {
        if (mReportModel == null || TextUtils.isEmpty(mReportModel.getF2())) {
            return null;
        }
        IdAndNameModel idAndNameModel = JSON.parseObject(mReportModel.getF2(), IdAndNameModel.class);
        return idAndNameModel;
    }

    /**
     * 获取用户手机号码
     */
    public String getUserPhoneNum() {
        if (mReportModel == null || TextUtils.isEmpty(mReportModel.getF1())) {
            return "";
        }

        JSONObject jsonObject = JSON.parseObject(mReportModel.getF1());

        if (jsonObject == null) {
            return "";
        }

        return jsonObject.getString("mobile");
    }


}
