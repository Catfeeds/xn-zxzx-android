package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;

import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.AddressBookReportModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 通讯录报告列表
 * Created by cdkj on 2017/12/13.
 */

public class AddressBookReportAdapter extends BaseQuickAdapter<AddressBookReportModel.AddressBookListBean, BaseViewHolder> {

    public AddressBookReportAdapter(@Nullable List<AddressBookReportModel.AddressBookListBean> data) {
        super(R.layout.item_address_book, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddressBookReportModel.AddressBookListBean item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_abook_name, item.getName());
        helper.setText(R.id.tv_abook_phone, item.getMobile());
    }


}