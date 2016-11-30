<#include "../macro-head.ftl">
<!DOCTYPE html>
<html style="height:100%">
<head>
<@head title="登录">
    </@head>
</head>
<body style="height:100%;width:100%;background: rgba(215, 215, 215, 0.2);">
<div style="float:left; height:50%; margin-bottom:-200px;"></div>
<div class="item">
    <form role="form" method="post" action="${staticServePath}/login/login">
        <div class="form-group">
            <label class="control-label sr-only">账号:</label>
            <input class="form-control" type="text" name="username" placeholder="电子邮箱/手机号" autocomplete="off"
                   value="">
        </div>
        <div class="form-group">
            <label class="control-label sr-only">密码：</label>
            <input class="form-control" type="password" name="password" placeholder="请输入密码" autocomplete="off">
        </div>
        <div class="form-group">
            <label class="control-label sr-only">验证码：</label>
            <div class="col-md-9">
                <input class="form-control" type="text" name="vcode" placeholder="验证码"/>
            </div>
            <img onclick="this.src=('/verify?reload='+(new Date()).getTime())" class="vcode" src="/verify"
                 width="85" height="35" alt="">
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <label>
                    <input type="checkbox" id="chk11" name="remember_me"> 记住密码
                </label>
            </div>
        </div>
        <div class="sr-only">
            <label>
                <input type="text" value="${url}" name="url">
            </label>
        </div>
        <div>
            <input class="btn btn-success center-block" type="submit" value="登  录">
        </div>
        <div class="form-group text-center">
            <p class=".form-control-static">还没有账号？<a class="res">马上注册</a></p>
        </div>
        <hr/>
        <div class="text-center"><span>其他注册方式</span></div>
        <div class=""></div>
        <input type="hidden" name="refer" value="site/">
    </form>
</div>

</body>
</html>
