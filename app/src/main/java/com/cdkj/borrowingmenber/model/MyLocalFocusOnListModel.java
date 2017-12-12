package com.cdkj.borrowingmenber.model;

import java.util.List;

/**
 * Created by 李先俊 on 2017/12/12.
 */

public class MyLocalFocusOnListModel {


    /**
     * bizCode : AA
     * bizName : 金融信贷类
     * type : {"name":"风险类型编码","typeCodeInfo":[{"code":"AA001","value":"逾期未还款","codeList":{"name":"历史最大逾期天数","codeList":[{"code":"AA001001","value":"逾期1-30天"},{"code":"AA001002","value":"逾期31-60天"},{"code":"AA001003","value":"逾期61-90天"},{"code":"AA001004","value":"逾期91-120天"},{"code":"AA001005","value":"逾期121-150天"},{"code":"AA001006","value":"逾期151-180天"},{"code":"AA001007","value":"逾期180天以上"},{"code":"AA001010","value":"逾期1-30天"},{"code":"AA001011","value":"逾期31-60天"},{"code":"AA001012","value":"逾期61-90天"},{"code":"AA001013","value":"逾期91-120天"},{"code":"AA001014","value":"逾期121-150天"},{"code":"AA001015","value":"逾期151-180天"},{"code":"AA001016","value":"逾期180天以上"}]}},{"code":"AA002","value":"套现","codeList":{"name":"严重逾期且套现","codeList":[{"code":"AA002001","value":"通过交易类平台套现且长期未还款"}]}}]}
     */

    private String bizCode;
    private String bizName;
    private TypeBean type;

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public TypeBean getType() {
        return type;
    }

    public void setType(TypeBean type) {
        this.type = type;
    }

    public static class TypeBean {
        /**
         * name : 风险类型编码
         * typeCodeInfo : [{"code":"AA001","value":"逾期未还款","codeList":{"name":"历史最大逾期天数","codeList":[{"code":"AA001001","value":"逾期1-30天"},{"code":"AA001002","value":"逾期31-60天"},{"code":"AA001003","value":"逾期61-90天"},{"code":"AA001004","value":"逾期91-120天"},{"code":"AA001005","value":"逾期121-150天"},{"code":"AA001006","value":"逾期151-180天"},{"code":"AA001007","value":"逾期180天以上"},{"code":"AA001010","value":"逾期1-30天"},{"code":"AA001011","value":"逾期31-60天"},{"code":"AA001012","value":"逾期61-90天"},{"code":"AA001013","value":"逾期91-120天"},{"code":"AA001014","value":"逾期121-150天"},{"code":"AA001015","value":"逾期151-180天"},{"code":"AA001016","value":"逾期180天以上"}]}},{"code":"AA002","value":"套现","codeList":{"name":"严重逾期且套现","codeList":[{"code":"AA002001","value":"通过交易类平台套现且长期未还款"}]}}]
         */

        private String name;
        private List<TypeCodeInfoBean> typeCodeInfo;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<TypeCodeInfoBean> getTypeCodeInfo() {
            return typeCodeInfo;
        }

        public void setTypeCodeInfo(List<TypeCodeInfoBean> typeCodeInfo) {
            this.typeCodeInfo = typeCodeInfo;
        }

        public static class TypeCodeInfoBean {
            /**
             * code : AA001
             * value : 逾期未还款
             * codeList : {"name":"历史最大逾期天数","codeList":[{"code":"AA001001","value":"逾期1-30天"},{"code":"AA001002","value":"逾期31-60天"},{"code":"AA001003","value":"逾期61-90天"},{"code":"AA001004","value":"逾期91-120天"},{"code":"AA001005","value":"逾期121-150天"},{"code":"AA001006","value":"逾期151-180天"},{"code":"AA001007","value":"逾期180天以上"},{"code":"AA001010","value":"逾期1-30天"},{"code":"AA001011","value":"逾期31-60天"},{"code":"AA001012","value":"逾期61-90天"},{"code":"AA001013","value":"逾期91-120天"},{"code":"AA001014","value":"逾期121-150天"},{"code":"AA001015","value":"逾期151-180天"},{"code":"AA001016","value":"逾期180天以上"}]}
             */

            private String code;
            private String value;
            private CodeListBeanX codeList;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public CodeListBeanX getCodeList() {
                return codeList;
            }

            public void setCodeList(CodeListBeanX codeList) {
                this.codeList = codeList;
            }

            public static class CodeListBeanX {
                /**
                 * name : 历史最大逾期天数
                 * codeList : [{"code":"AA001001","value":"逾期1-30天"},{"code":"AA001002","value":"逾期31-60天"},{"code":"AA001003","value":"逾期61-90天"},{"code":"AA001004","value":"逾期91-120天"},{"code":"AA001005","value":"逾期121-150天"},{"code":"AA001006","value":"逾期151-180天"},{"code":"AA001007","value":"逾期180天以上"},{"code":"AA001010","value":"逾期1-30天"},{"code":"AA001011","value":"逾期31-60天"},{"code":"AA001012","value":"逾期61-90天"},{"code":"AA001013","value":"逾期91-120天"},{"code":"AA001014","value":"逾期121-150天"},{"code":"AA001015","value":"逾期151-180天"},{"code":"AA001016","value":"逾期180天以上"}]
                 */

                private String name;
                private List<CodeListBean> codeList;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<CodeListBean> getCodeList() {
                    return codeList;
                }

                public void setCodeList(List<CodeListBean> codeList) {
                    this.codeList = codeList;
                }

                public static class CodeListBean {
                    /**
                     * code : AA001001
                     * value : 逾期1-30天
                     */

                    private String code;
                    private String value;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
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
    }
}
