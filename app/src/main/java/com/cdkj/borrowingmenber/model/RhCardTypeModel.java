package com.cdkj.borrowingmenber.model;

import com.bigkoo.pickerview.model.IPickerViewData;

/**
 * Created by 李先俊 on 2018/1/4.
 */

public class RhCardTypeModel implements IPickerViewData {

    private String typeString;
    private String typeCode;

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Override
    public String getPickerViewText() {
        return typeString;
    }
}
