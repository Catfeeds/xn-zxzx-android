package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;

import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.TdCertDetailModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 同盾异常列表
 * Created by cdkj on 2017/12/10.
 */

public class TdReportCertRiskListAdapter extends BaseQuickAdapter<TdCertDetailModel.RiskItemsBean, BaseViewHolder> {


    public TdReportCertRiskListAdapter(@Nullable List<TdCertDetailModel.RiskItemsBean> data) {
        super(R.layout.item_td_cert_risk, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TdCertDetailModel.RiskItemsBean item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_risk_name,(helper.getLayoutPosition()+1)+"、" +item.getItem_name());
    }


}
