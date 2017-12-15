package com.cdkj.borrowingmenber.model;

/**欺诈认证
 * Created by 李先俊 on 2017/12/15.
 */

public class FraudCertModel {


    /**
     * authorized : true
     * isMatched : false
     */

    private boolean authorized;
    private boolean isMatched;

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public boolean isIsMatched() {
        return isMatched;
    }

    public void setIsMatched(boolean isMatched) {
        this.isMatched = isMatched;
    }
}
