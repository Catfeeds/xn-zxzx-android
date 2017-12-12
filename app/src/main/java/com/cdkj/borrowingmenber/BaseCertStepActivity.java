package com.cdkj.borrowingmenber;

import android.os.Bundle;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.ReportModel;

import static com.cdkj.borrowingmenber.weiget.CertificationStepHelper.INTENTGETCERTMODEL;
import static com.cdkj.borrowingmenber.weiget.CertificationStepHelper.INTENTGETREPORTMODEL;

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
}
