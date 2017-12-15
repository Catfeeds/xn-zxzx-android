package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;

import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 欺诈报告
 * Created by cdkj on 2017/12/10.
 */

public class FraudReportListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


    public FraudReportListAdapter(@Nullable List<String> data) {
        super(R.layout.item_fraud_report, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_fraud_name, item);
    }


}
