package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.ReportContactModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import static com.cdkj.borrowingmenber.weiget.TdDataParseHelper.getContactRelationString;

/**
 * 报告 联系人手机号码适配器
 * Created by cdkj on 2017/12/14.
 */

public class ReportContactPhoneNumAdapter extends BaseQuickAdapter<ReportContactModel, BaseViewHolder> {


    public ReportContactPhoneNumAdapter(@Nullable List<ReportContactModel> data) {
        super(R.layout.item_report_contact_phone, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ReportContactModel item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_contact_num, item.getContact_number());
        helper.setText(R.id.tv_relation, getContactRelationString(item.getContact_relation()));
        helper.setText(R.id.tv_contact_area, TextUtils.isEmpty(item.getContact_area()) ? "无" : item.getContact_area());
    }


}
