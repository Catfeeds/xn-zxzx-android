package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;

import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 列表认证
 * Created by cdkj on 2017/12/10.
 */

public class CertListAdapter extends BaseQuickAdapter<CertListModel, BaseViewHolder> {


    public CertListAdapter(@Nullable List<CertListModel> data) {
        super(R.layout.item_cert_list, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CertListModel item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_cert_name, item.getSalesUserMobile() + mContext.getString(R.string.start_certification));
    }


}
