package com.cdkj.borrowingmenber.model;

import java.util.List;

/**通讯录
 * Created by cdkj on 2017/12/13.
 */

public class AddressBookReportModel {


    /**
     * addressBookList : [{"mobile":"454-5","name":"4545"}]
     * searchCode : DC2017123470209563019
     */

    private String searchCode;
    private List<AddressBookListBean> addressBookList;

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public List<AddressBookListBean> getAddressBookList() {
        return addressBookList;
    }

    public void setAddressBookList(List<AddressBookListBean> addressBookList) {
        this.addressBookList = addressBookList;
    }

    public static class AddressBookListBean {
        /**
         * mobile : 454-5
         * name : 4545
         */

        private String mobile;
        private String name;

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
