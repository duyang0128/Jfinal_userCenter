package com.hudongwx.userCenter.controller;

/**
 * Created by wuhongxu on 2016/11/29 0029.
 */
public class PasswordController extends BaseController {
    public void index(){
        fillHeaderAndFooter();
        render("index.ftl");
    }
}
