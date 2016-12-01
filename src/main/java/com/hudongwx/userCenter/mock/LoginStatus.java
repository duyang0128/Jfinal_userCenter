package com.hudongwx.userCenter.mock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhongxu on 2016/12/1 0001.
 */
public class LoginStatus {
    private boolean isLogin;
    private List<Exp> expList;


    public LoginStatus(boolean isLogin, List<Exp> expList) {
        this.isLogin = isLogin;
        this.expList = expList;
    }
    public LoginStatus() {
        this(false,new ArrayList<>());
    }


    public List<Exp> getExpList() {
        return expList;
    }

    public void setExpList(List<Exp> expList) {
        this.expList = expList;
    }


    public boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }


}

