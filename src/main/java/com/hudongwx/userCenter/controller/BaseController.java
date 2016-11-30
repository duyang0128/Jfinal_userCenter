package com.hudongwx.userCenter.controller;

import com.hudongwx.userCenter.util.Common;
import com.hudongwx.userCenter.util.StrPlusKit;
import com.jfinal.core.Controller;

import java.util.Date;

/**
 * Created by wuhongxu on 2016/11/28 0028.
 */
public class BaseController extends Controller {
    protected void fillHeader() {
        //三个地址：servePath用于得到去掉参数的网址、holdPath为带参数网址
        String uri = getRequest().getRequestURI();
        String url = String.valueOf(getRequest().getRequestURL());
        String staticPath = getAttr(Common.LABEL_STATIC_SERVE_PATH);

        //将不需要的参数忽略掉
        String para = StrPlusKit.ignoreQueryString(getRequest().getQueryString(), "_pjax", "list_p", "chart_p", "p");
        if (!StrPlusKit.isEmpty(para))
            para = "?" + para;
        String actionKey = getAttr(Common.LABEL_ACTION_KEY);
        String servePath = staticPath + actionKey;
        if (para != null)
            url += para;
        setAttr(Common.LABEL_SERVE_PATH, servePath);
        setAttr(Common.LABEL_HOLD_PATH, url);
        setAttr(Common.LABEL_STATIC_RESOURCE_VERSION, new Date().getTime());
    }

    protected void fillFooter() {

    }

    protected void fillHeaderAndFooter(){
        fillHeader();
        fillFooter();
    }
}
