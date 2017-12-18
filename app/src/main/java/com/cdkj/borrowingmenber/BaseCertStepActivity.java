package com.cdkj.borrowingmenber;

import android.os.Bundle;
import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.ReportModel;

import static com.cdkj.borrowingmenber.weiget.CertificationHelper.INTENTGETCERTMODEL;
import static com.cdkj.borrowingmenber.weiget.CertificationHelper.INTENTGETREPORTMODEL;

/**
 * Created by 李先俊 on 2017/12/10.
 */

public abstract class BaseCertStepActivity extends AbsBaseLoadActivity {

    protected CertListModel mCertListModel;
    protected ReportModel mReportModel;

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        if (getIntent() != null) {
            mCertListModel = getIntent().getParcelableExtra(INTENTGETCERTMODEL);
            mReportModel = getIntent().getParcelableExtra(INTENTGETREPORTMODEL);
        }
    }


    /**
     * 获取用户姓名身份证号
     *
     * @return
     */
        /*"{"isSuccess":false,"idNo":"522321199509111655","realName":"李先俊"}"*/
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
        if (mReportModel == null || TextUtils.isEmpty(mReportModel.getF2())) {
            return "";
        }

        JSONObject jsonObject = JSON.parseObject(mReportModel.getF1());

        if (jsonObject == null) {
            return "";
        }

        return jsonObject.getString("mobile");
    }


}
