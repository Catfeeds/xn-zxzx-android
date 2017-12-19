package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.FocusOnParseShowModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnListModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * 行业关注
 * Created by cdkj on 2017/12/10.
 */

public class FocusonListAdapter extends BaseQuickAdapter<FocusOnParseShowModel, BaseViewHolder> {


    public FocusonListAdapter(@Nullable List<FocusOnParseShowModel> data) {
        super(R.layout.item_focuson, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FocusOnParseShowModel item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_type, item.getBizName() + item.getTypeDescribe());

        helper.setText(R.id.tv_day, item.getTypeDescribeTitle() + ":" + item.getTypeDescribeDetail());

        if (!TextUtils.isEmpty(item.getEvenTEndTimeDesc())) {
            helper.setText(R.id.tv_date, item.getEvenTEndTimeDescName() + ":" + item.getEvenTEndTimeDesc());
            helper.setGone(R.id.tv_date, true);
        } else {
            helper.setGone(R.id.tv_date, false);
        }

        if (!TextUtils.isEmpty(item.getMaxMoney())) {
            helper.setText(R.id.tv_money, item.getMaxMoneyName() + ":" + item.getMaxMoney());
            helper.setGone(R.id.tv_money, true);
        } else {
            helper.setGone(R.id.tv_money, false);
        }

        if (!TextUtils.isEmpty(item.getExtend())) {
            helper.setText(R.id.tv_extend, item.getExtend());
            helper.setGone(R.id.tv_extend, true);
        } else {
            helper.setGone(R.id.tv_extend, false);
        }
    }


}
