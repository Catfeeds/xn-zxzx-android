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

////TODO 数据字典数据获取方法
//        JSONObject jsonObject1 = null;  //类型
//        try {
//            jsonObject1 = dataString.getJSONObject(item.getBizCode() + "");
//            JSONObject jsonObject2 = jsonObject1.getJSONObject("type");
//            JSONObject jsonObject3 = jsonObject2.getJSONObject(item.getType());//逾期类型 未还款
//            helper.setText(R.id.tv_type, jsonObject1.getString("name") + jsonObject3.getString("name"));
//
//            JSONObject jsonObject4 = jsonObject3.getJSONObject("code");//逾期天数
//
//            helper.setText(R.id.tv_day, "历史最大逾期天数:" + jsonObject4.getString(item.getCode()));
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        if (item.getExtendInfo() != null && item.getExtendInfo().get(2) != null) {
//            helper.setText(R.id.tv_date, "违约时间:" + item.getExtendInfo().get(2).getValue());
//        }
//        if (item.getExtendInfo() != null && item.getExtendInfo().get(0) != null) {
//            helper.setText(R.id.tv_money, "历史最大逾期金额（元）:" + getMaxMoney(item.getExtendInfo().get(0).getValue()));
//        }

    }


}
