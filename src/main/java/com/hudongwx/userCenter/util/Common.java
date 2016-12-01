package com.hudongwx.userCenter.util;

import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;

/**
 * Created by wuhongxu on 2016/8/29 0029.
 * <p>
 * 用于存储各种常用的常量
 * 一般是各种get("",)/set("",) 中用到的常量值
 */
public class Common {
    public final static String LABEL_STATIC_SERVE_PATH = "staticServePath";
    public final static String LABEL_SERVE_PATH = "servePath";
    public final static String LABEL_HOLD_PATH = "holdPath";
    public final static String LABEL_STATIC_RESOURCE_VERSION = "staticResourceVersion";
    public final static String LABEL_LOGIN_ROLE = "loginRole";
    public final static String LABEL_IS_LOGIN = "isLogin";
    public final static String LABEL_LOGIN_NAME_ERROR = "loginNameErrorLabel";
    public final static String LABEL_INVALID_PASSWORD = "invalidPasswordLabel";
    public final static String LABEL_ACTION_KEY = "actionKey";
    public final static String LABEL_CONTROLLER_KEY = "controllerKey";
    public final static String LABEL_SIDES = "sides";
    public static final String LABEL_VIEWS = "views";
    public final static String LABEL_CATALOG = "Catalog";
    public static final int MAX_SIDE_CNT = 8;
    public static final int MAX_PAGE_SIZE = 8;
    public static final int START_PAGE = 1;
    public static final String LABEL_ROLE_TREE = "roleTree";
    public static final String LABEL_NOW_VISIT = "now";
    public static final int MAX_DEGREE = 100;
    public static final String LABEL_SIDES_CHILD = "childSides";
    public static final String LABEL_SIDES_SIZE = "menuSize";
    public static final String LABEL_ID = "id";
    public static final String SEPARATOR = "&";
    public static final String LABEL_USER = "user";
    public static final String COMMON_SELECT = "select *";
    public static final Page EMPTY_PAGE = new Page<Model>(new ArrayList<Model>(), 1, 1, 1, 1);
    public static final Integer VALUE_VISIBLE = 1;
    public static final Integer VALUE_IN_VISIBLE = 0;
    public static final String ORDER_BY_ID_DESC = " order by id desc";
    public static final String IGNORE_WORD = "ignoreWord";
    public static final String LABEL_DEV_MODE = "devMode";
    //缓存Label
    public static final String CACHE_FOREVER_LABEL = "forever";
    public static final String CACHE_LONG_TIME_LABEL = "longTime";
    public static final String CACHE_60TIME_LABEL = "60time";
    public static final String LABEL_ROOT_MAPPING = "root";
    public static final String SQL_WHERE = " where ";
    public static final Integer MAX_AGE = 604800;


    //此处得到主配置
    public static Prop getMainProp() {
        return PropKit.use("config.properties");
    }
}
