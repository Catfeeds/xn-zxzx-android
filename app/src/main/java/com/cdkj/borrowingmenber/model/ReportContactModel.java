package com.cdkj.borrowingmenber.model;

/**
 * 报告联系人
 * Created by 李先俊 on 2017/12/14.
 */

public class ReportContactModel {

    String contact_number;
    String contact_relation;//关系
    String contact_area;//号码归属地

    public String getContact_number() {
        return contact_number;
    }

    public String getContact_relation() {
        return contact_relation;
    }

    public void setContact_relation(String contact_relation) {
        this.contact_relation = contact_relation;
    }

    public String getContact_area() {
        return contact_area;
    }

    public void setContact_area(String contact_area) {
        this.contact_area = contact_area;
    }

    public void setContact_number(String contact_number) {

        this.contact_number = contact_number;
    }
}
