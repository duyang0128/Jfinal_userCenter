/**
 * Copyright (c) 2011-2014, hubin (243194995@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.hudongwx.userCenter.controller;

import com.hudongwx.userCenter.util.CaptchaUtil;
import com.jfinal.core.Controller;
import com.jfinal.render.CaptchaRender;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 验证码
 */
public class VerifyCodeController extends Controller {

    /**
     * 验证码
     */
    public void index() throws IOException {
//        HttpServletResponse response = getResponse();
//        String verifyCode = CaptchaUtil.outputImage(response.getOutputStream());
//        getRequest().getSession(true).setAttribute("verifyCode", verifyCode);
//        renderNull();
        renderCaptcha();
    }
}
