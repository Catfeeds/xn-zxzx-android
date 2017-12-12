package com.cdkj.borrowingmenber.model;

import java.util.List;

/**
 * Created by 李先俊 on 2017/12/11.
 */

public class IndustryFocusOnListModel {


    /**
     * isMathed : true
     * detail : [{"bizCode":"AA","code":"AA001003","extendInfo":[{"description":"逾期金额（元）","key":"event_max_amt_code","value":"M03"},{"description":"编号","key":"id","value":"edcc7bf163b194a4e627eb160489a055"},{"description":"违约时间","key":"event_end_time_desc","value":"2017-09"}],"level":2,"refreshTime":"Dec 7, 2017 12:00:00 AM","settlement":false,"type":"AA001"}]
     */

    private boolean isMathed;
    private List<DetailBean> detail;

    public boolean isIsMathed() {
        return isMathed;
    }

    public void setIsMathed(boolean isMathed) {
        this.isMathed = isMathed;
    }

    public List<DetailBean> getDetail() {
        return detail;
    }

    public void setDetail(List<DetailBean> detail) {
        this.detail = detail;
    }

    public static class DetailBean {
        /**
         * bizCode : AA
         * code : AA001003
         * extendInfo : [{"description":"逾期金额（元）","key":"event_max_amt_code","value":"M03"},{"description":"编号","key":"id","value":"edcc7bf163b194a4e627eb160489a055"},{"description":"违约时间","key":"event_end_time_desc","value":"2017-09"}]
         * level : 2
         * refreshTime : Dec 7, 2017 12:00:00 AM
         * settlement : false
         * type : AA001
         */

        private String bizCode;
        private String code;
        private int level;
        private String refreshTime;
        private boolean settlement;
        private String type;
        private List<ExtendInfoBean> extendInfo;

        public String getBizCode() {
            return bizCode;
        }

        public void setBizCode(String bizCode) {
            this.bizCode = bizCode;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(String refreshTime) {
            this.refreshTime = refreshTime;
        }

        public boolean isSettlement() {
            return settlement;
        }

        public void setSettlement(boolean settlement) {
            this.settlement = settlement;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<ExtendInfoBean> getExtendInfo() {
            return extendInfo;
        }

        public void setExtendInfo(List<ExtendInfoBean> extendInfo) {
            this.extendInfo = extendInfo;
        }

        public static class ExtendInfoBean {
            /**
             * description : 逾期金额（元）
             * key : event_max_amt_code
             * value : M03
             */

            private String description;
            private String key;
            private String value;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}
