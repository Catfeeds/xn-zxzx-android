package com.cdkj.borrowingmenber.weiget;

import android.text.TextUtils;

import com.cdkj.borrowingmenber.model.FocusOnParseShowModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnListModel;
import com.cdkj.borrowingmenber.model.MyLocalFocusOnListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 本地行业关注名单数据解析类
 * Created by cdkcj on 2017/12/12.
 */
//TODO 行业关注数据解析 方法修改

//方案1 ： 获取本地json 遍历对比解析 （目前使用方案）

//方案2： 将所有数据写在switch判断语句里 根据switch判断来选择

public class LocalFocusOnDataParseHelper {

    private List<MyLocalFocusOnListModel> myLocalFocusOnList;

    private LocalFocusOnDataParseHelper() {

    }

    public LocalFocusOnDataParseHelper(List<MyLocalFocusOnListModel> myLocalFocusOnList) {
        this.myLocalFocusOnList = myLocalFocusOnList;
    }

    /**
     * 根据获取的关注数据code 对比本地数据解析要显示的数据
     * <p>
     * 解析过程中数据量较多，最好进行线程处理
     */
    public List<FocusOnParseShowModel> parseShowData(List<IndustryFocusOnListModel.DetailBean> detailBeans) {

        List<FocusOnParseShowModel> list = new ArrayList<>();

        if (detailBeans == null || myLocalFocusOnList == null || detailBeans.isEmpty() || myLocalFocusOnList.isEmpty()) {
            return list;
        }


        for (IndustryFocusOnListModel.DetailBean detailBean : detailBeans) {

            if (detailBean == null) {
                continue;
            }

            MyLocalFocusOnListModel localFocusOnList = getBizDataByBizCode(detailBean.getBizCode(), myLocalFocusOnList); //获取行业类型数据

            if (localFocusOnList == null) {
                continue;
            }

            FocusOnParseShowModel parseShowModel = new FocusOnParseShowModel();

            for (IndustryFocusOnListModel.DetailBean.ExtendInfoBean extendInfoBean : detailBean.getExtendInfo()) { //扩展字段处理
                if (extendInfoBean == null) {
                    continue;
                }
                //TODO 公检法扩展字段需要处理
                if (TextUtils.equals("AB", localFocusOnList.getBizCode())) {
                    parseShowModel.addExtend(extendInfoBean.getValue());
                } else {
                    if (TextUtils.equals(extendInfoBean.getKey(), "event_max_amt_code")) {
                        parseShowModel.setMaxMoney(getMaxMoney(extendInfoBean.getValue()));
                        parseShowModel.setMaxMoneyName(getMaxCodeName());

                    } else if (TextUtils.equals(extendInfoBean.getKey(), "event_end_time_desc")) {
                        parseShowModel.setEvenTEndTimeDesc(getMaxMoney(extendInfoBean.getValue()));
                        parseShowModel.setEvenTEndTimeDescName(extendInfoBean.getDescription());
                    }
                }

            }

            if (localFocusOnList.getType() != null) {

                for (MyLocalFocusOnListModel.TypeBean.TypeCodeInfoBean typeCodeListBean : localFocusOnList.getType().getTypeCodeInfo()) {//对比风险类型code
                    if (typeCodeListBean == null) {
                        continue;
                    }
                    if (TextUtils.equals(typeCodeListBean.getCode(), detailBean.getType())) {

                        parseShowModel.setBizName(localFocusOnList.getBizName());
                        parseShowModel.setTypeDescribe(typeCodeListBean.getValue());

                        if (typeCodeListBean.getCodeList() != null) {

                            for (MyLocalFocusOnListModel.TypeBean.TypeCodeInfoBean.CodeListBeanX.CodeListBean codeListBean : typeCodeListBean.getCodeList().getCodeList()) {

                                if (codeListBean == null) {
                                    continue;
                                }

                                if (TextUtils.equals(codeListBean.getCode(), detailBean.getCode())) {
                                    parseShowModel.setTypeDescribeTitle(typeCodeListBean.getCodeList().getName());
                                    parseShowModel.setTypeDescribeDetail(codeListBean.getValue());
                                    break;
                                }

                            }
                        }

                        break;

                    }
                }

            }

            list.add(parseShowModel);
        }

        return list;

    }


    /**
     * 根据bizCode 获取对象的数据
     *
     * @param bizCode
     */
    private MyLocalFocusOnListModel getBizDataByBizCode(String bizCode, List<MyLocalFocusOnListModel> localFocusOnList) {

        for (MyLocalFocusOnListModel listModel : localFocusOnList) {

            if (localFocusOnList == null) {
                continue;
            }

            if (TextUtils.equals(listModel.getBizCode(), bizCode)) { //判断bizCode 取得相应的行业数据
                return listModel;
            }

        }
        return null;
    }

    public String getStates(String state) {
        switch (state) {
            case "0":
                return "原始状态";
            case "1":
                return "用户有异议，信息核查中";
            case "2":
                return "核查完毕，信息无误";
            case "3":
                return "核查完毕，信息已修改";
            case "5":
                return "用户对此记录有异议，但异议主张经核查未获支持";
        }
        return "";
    }

    public String getStatusName() {
        return "异议状态";
    }

    public String getStatement(String state) {
        switch (state) {
            case "T":
                return "当前不逾期";
            case "F":
                return "当前逾期";
        }
        return "";

    }

    public String getSettlementName(String state) {
        return "当前状态";
    }

    public String getStatementName(String state) {
        return "异议声明";
    }


    public String getLevel(String state) {

        switch (state) {
            case "1":
                return "低风险";
            case "2":
                return "中风险";
            case "3":
                return "高风险";
        }
        return "";

    }

    public String getLevelName(String state) {
        return "风险等级";
    }

    //event_max_amt_code
    public String getMaxMoney(String type) {

        switch (type) {
            case "M01":
                return "0~500";
            case "M02":
                return "500~1000";
            case "M03":
                return "1000~2000";
            case "M04":
                return "2000~3000";
            case "M05":
                return "3000~4000";
            case "M06":
                return "4000~6000";
            case "M07":
                return "6000~8000";
            case "M08":
                return "8000~10000";
            case "M09":
                return "10000~15000";
            case "M010":
                return "15000~20000";
            case "M011":
                return "20000~25000";
            case "M012":
                return "25000~30000";
            case "M013":
                return "30000~40000";
            case "M014":
                return "大于40000";

            default:
        }

        return "";
    }

    public String getMaxCodeName() {
        return "历史最大逾期金额（元）";
    }

    public String getBizCode(String code) {
        switch (code) {
            case "AA":
                return "金融信贷类";
            case "AB":
                return "公检法";
            case "AC":
                return "支付行业";
            case "AD":
                return "出行行业";
            case "AE":
                return "酒店行业";
            case "AF":
                return "电商行业";
            case "AG":
                return "租房行业";
            case "AH":
                return "运营商";
            case "AI":
                return "保险行业";
            case "AK":
                return "租赁行业";
        }
        return "";
    }

}
