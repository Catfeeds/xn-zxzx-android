package com.cdkj.baselibrary.appmanager;

/**
 * Created by 李先俊 on 2017/8/8.
 */

public class MyCdConfig {

    public final static String COMPANYCODE = "CD-ZXZX000018";
    public final static String SYSTEMCODE = "CD-ZXZX000018";

    public final static String USERTYPE = "C";//用户类型
    public final static String MONEYTYPE = "CNY";//币种类型

    public final static String QINIUURL = "http://ormcdjjs0.bkt.clouddn.com/";

    public final static String PROJECTNAME = "zxzxborrowing";


    public final static String GENDERMAN = "1";
    public final static String GENDERWOMAN = "0";

    /**
     * 保存的SharedPreferences工具类文件名
     */
    public static final String FILE_NAME = "share_" + PROJECTNAME;

    /**
     * 相片保存文件名
     */
    public static final String CACHDIR = "piccach" + PROJECTNAME;


    public final static String getBaseUrl() {
        return FILE_NAME;
    }

}
