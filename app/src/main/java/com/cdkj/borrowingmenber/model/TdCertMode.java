package com.cdkj.borrowingmenber.model;

/**同盾认证model
 * Created by cdkj on 2017/12/15.
 */

public class TdCertMode {


    /**
     * tdData : {"address_detect":{"mobile_address":"浙江省杭州市","id_card_address":"浙江省温州市苍南县"},"application_id":"171213125520932D8E3B939586283CC4","apply_time":1513140920000,"final_decision":"Review","final_score":20,"report_id":"ER20171213125520B4DBF414","report_time":1513140921000,"risk_items":[{"risk_level":"medium","item_detail":{"frequency_detail_list":[{"detail":"1小时内身份证申请次数：3"}],"type":"frequency_detail"},"item_id":2195555,"item_name":"1小时内身份证或手机号申请次数大于等于3","group":"客户行为检测"},{"risk_level":"low","item_detail":{"type":"custom_list","high_risk_areas":["浙江省温州市苍南县"]},"item_id":2195443,"item_name":"身份证归属地位于高风险较为集中地区","group":"个人基本信息核查"},{"risk_level":"low","item_detail":{"frequency_detail_list":[{"detail":"7天内手机号申请次数：3"}],"type":"frequency_detail"},"item_id":2195613,"item_name":"7天内设备或身份证或手机号申请次数过多","group":"客户行为检测"}],"success":true}
     * personInfo : {"qq":"33333","concatc1_name":"23323","id_number":"330327199302237251","career":"","contact1_mobile":"17777777777","mobile":"18868824532","work_phone":"3322332","contact2_relation":"","is_id_checked":"true","contact2_name":"谢延径","apply_province":"浙江省","company_address":"浙江省 舟山市 岱山县is 发 i 地方","apply_city":"杭州市","contact1_relation":"coworker","home_address":"浙江省 舟山市 岱山县is 发 i 地方","marriage":"SPINSTERHOOD","company_name":"23232323","name":"吴联请","contact2_mobile":"18767101909","diploma":"UNDER_GRADUATE","email":"23232@irr.com","annual_income":"10000以下"}
     */

    private String tdData;
    private String personInfo;

    public String getTdData() {
        return tdData;
    }

    public void setTdData(String tdData) {
        this.tdData = tdData;
    }

    public String getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }
}
