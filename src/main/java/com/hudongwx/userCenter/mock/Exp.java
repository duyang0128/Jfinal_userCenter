package com.hudongwx.userCenter.mock;

/**
 * Created by wuhongxu on 2016/12/1 0001.
 */
public class Exp {
    public final static String STATE_SUCCESS = "success";
    public final static String STATE_ERROR = "error";
    public final static String STATE_WARNING = "warning";

    public Exp(String name, String state, String msg) {
        this.name = name;
        this.state = state;
        this.msg = msg;
    }

    public Exp() {
    }

    private String name;
    private String state;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
