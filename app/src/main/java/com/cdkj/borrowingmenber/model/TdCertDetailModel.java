package com.cdkj.borrowingmenber.model;

import java.util.List;

/**同盾认证详情
 * Created by cdkj on 2017/12/15.
 */

public class TdCertDetailModel {

    /**
     * address_detect : {"mobile_address":"浙江省杭州市","id_card_address":"浙江省温州市苍南县"}
     * application_id : 171213125520932D8E3B939586283CC4
     * apply_time : 1513140920000
     * final_decision : Review
     * final_score : 20
     * report_id : ER20171213125520B4DBF414
     * report_time : 1513140921000
     * risk_items : [{"risk_level":"medium","item_detail":{"frequency_detail_list":[{"detail":"1小时内身份证申请次数：3"}],"type":"frequency_detail"},"item_id":2195555,"item_name":"1小时内身份证或手机号申请次数大于等于3","group":"客户行为检测"},{"risk_level":"low","item_detail":{"type":"custom_list","high_risk_areas":["浙江省温州市苍南县"]},"item_id":2195443,"item_name":"身份证归属地位于高风险较为集中地区","group":"个人基本信息核查"},{"risk_level":"low","item_detail":{"frequency_detail_list":[{"detail":"7天内手机号申请次数：3"}],"type":"frequency_detail"},"item_id":2195613,"item_name":"7天内设备或身份证或手机号申请次数过多","group":"客户行为检测"}]
     * success : true
     */

    private AddressDetectBean address_detect;
    private String application_id;
    private long apply_time;
    private String final_decision;
    private String final_score;
    private String report_id;
    private long report_time;
    private boolean success;
    private List<RiskItemsBean> risk_items;

    public AddressDetectBean getAddress_detect() {
        return address_detect;
    }

    public void setAddress_detect(AddressDetectBean address_detect) {
        this.address_detect = address_detect;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }

    public long getApply_time() {
        return apply_time;
    }

    public void setApply_time(long apply_time) {
        this.apply_time = apply_time;
    }

    public String getFinal_decision() {
        return final_decision;
    }

    public void setFinal_decision(String final_decision) {
        this.final_decision = final_decision;
    }

    public String getFinal_score() {
        return final_score;
    }

    public void setFinal_score(String final_score) {
        this.final_score = final_score;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public long getReport_time() {
        return report_time;
    }

    public void setReport_time(long report_time) {
        this.report_time = report_time;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<RiskItemsBean> getRisk_items() {
        return risk_items;
    }

    public void setRisk_items(List<RiskItemsBean> risk_items) {
        this.risk_items = risk_items;
    }

    public static class AddressDetectBean {
        /**
         * mobile_address : 浙江省杭州市
         * id_card_address : 浙江省温州市苍南县
         */

        private String mobile_address;
        private String id_card_address;

        public String getMobile_address() {
            return mobile_address;
        }

        public void setMobile_address(String mobile_address) {
            this.mobile_address = mobile_address;
        }

        public String getId_card_address() {
            return id_card_address;
        }

        public void setId_card_address(String id_card_address) {
            this.id_card_address = id_card_address;
        }
    }

    public static class RiskItemsBean {
        /**
         * risk_level : medium
         * item_detail : {"frequency_detail_list":[{"detail":"1小时内身份证申请次数：3"}],"type":"frequency_detail"}
         * item_id : 2195555
         * item_name : 1小时内身份证或手机号申请次数大于等于3
         * group : 客户行为检测
         */

        private String risk_level;
        private ItemDetailBean item_detail;
        private int item_id;
        private String item_name;
        private String group;

        public String getRisk_level() {
            return risk_level;
        }

        public void setRisk_level(String risk_level) {
            this.risk_level = risk_level;
        }

        public ItemDetailBean getItem_detail() {
            return item_detail;
        }

        public void setItem_detail(ItemDetailBean item_detail) {
            this.item_detail = item_detail;
        }

        public int getItem_id() {
            return item_id;
        }

        public void setItem_id(int item_id) {
            this.item_id = item_id;
        }

        public String getItem_name() {
            return item_name;
        }

        public void setItem_name(String item_name) {
            this.item_name = item_name;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public static class ItemDetailBean {
            /**
             * frequency_detail_list : [{"detail":"1小时内身份证申请次数：3"}]
             * type : frequency_detail
             */

            private String type;
            private List<FrequencyDetailListBean> frequency_detail_list;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<FrequencyDetailListBean> getFrequency_detail_list() {
                return frequency_detail_list;
            }

            public void setFrequency_detail_list(List<FrequencyDetailListBean> frequency_detail_list) {
                this.frequency_detail_list = frequency_detail_list;
            }

            public static class FrequencyDetailListBean {
                /**
                 * detail : 1小时内身份证申请次数：3
                 */

                private String detail;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }
            }
        }
    }
}
