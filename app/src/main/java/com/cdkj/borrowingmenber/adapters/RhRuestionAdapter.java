package com.cdkj.borrowingmenber.adapters;

import android.support.annotation.Nullable;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.model.AddressBookReportModel;
import com.cdkj.borrowingmenber.model.RhRuestionModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * 人行问题
 * Created by cdkj on 2017/12/13.
 */

public class RhRuestionAdapter extends BaseQuickAdapter<RhRuestionModel, BaseViewHolder> {

    public RhRuestionAdapter(@Nullable List<RhRuestionModel> data) {
        super(R.layout.item_rh_question, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, RhRuestionModel item) {
        LogUtil.E(""+helper.getLayoutPosition());
        if (item == null) {
            return;
        }

        helper.setText(R.id.tv_question, item.getQuestion());

        RadioGroup radioGroup = helper.getView(R.id.radio_group);


        //根据答案动态添加选项
        int i = 0;
        for (String s : item.getOptions()) {
            RadioButton radioButton = new RadioButton(mContext);
            radioButton.setText(s);
            radioButton.setTextSize(14);
            radioButton.setId(i);
            radioGroup.addView(radioButton);
            i++;
        }

        //选择问题后将问题对应key记录下来
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            LogUtil.E("ch" + checkedId);
            int j = 0;
            for (String s : item.getOptionsKey()) {
                if (j == checkedId) {
                    item.setAnswerresult(s);        //设置用户回答的问题key
                    LogUtil.E("ch" + s);
                    break;
                }
                j++;
            }
        });

    }


}