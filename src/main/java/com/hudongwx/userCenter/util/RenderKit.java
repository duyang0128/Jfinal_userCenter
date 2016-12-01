package com.hudongwx.userCenter.util;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.kit.JsonKit;

/**
 * Created by wuhongxu on 2016/8/31 0031.
 */
public class RenderKit {
    public static void renderSuccess(Controller me) {
        renderSuccess(me, "");
    }

    public static void renderSuccess(Controller me, Object msg) {
        renderMsg(me, msg, "success", 200);
    }

    public static void renderError(Controller me) {
        renderError(me, "");
    }

    public static void renderError(Controller me, Object msg) {
        renderMsg(me, msg, "error", 500);
    }

    public static void renderError(Controller me, Object msg, int code) {
        renderMsg(me, msg, "error", code);
    }

    public static void render403Error(Controller me, Object msg) {
        renderMsg(me, msg, "error", 403);
    }

    public static void render404Error(Controller me, Object msg) {
        renderMsg(me, msg, "error", 404);
    }


    public static void renderState(Controller me, Object state) {
        renderMsg(me, "", state, 200);
    }

    public static void renderMsg(Controller me, Object msg, Object state, Integer code) {
        renderMsgWidthLocation(me, msg, state, "", code);
    }

    public static void renderMsgWidthLocation(Controller me, Object msg, Object state, Object url, Integer code) {
        Resp resp = new Resp(state, msg, url);
        me.getResponse().setStatus(code);
        me.renderJson(resp);
    }
}
