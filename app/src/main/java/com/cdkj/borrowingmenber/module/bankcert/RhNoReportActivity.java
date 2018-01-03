package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhReportNoBinding;

/**
 * 没有人行报告
 * Created by 李先俊 on 2017/12/28.
 */

public class RhNoReportActivity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhNoReportActivity.class);
        context.startActivity(intent);
    }

    private ActivityRhReportNoBinding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_report_no, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("资信报告");
        mBinding.btnIKnow.setOnClickListener(v -> finish());
    }
}
