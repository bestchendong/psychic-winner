﻿<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="/user/user/login" name="loginfrom" accept-charset="utf-8" method="get">
    <label class="label-tips" for="u">账号:</label>
    <input type="text" id="loginName" name="loginName" class="inputstyle"/>
    <div>
        <label class="lable-tips" for="password">密码:</label>
        <input type="password" id="password" name="password" class="inputstyle" />
    </div>
    <div>
        <label class="lable-tips" for="password">验证码:</label>
        <input type="text" name="vrifyCode" />
        <!-- <img alt="这是图片" src="/img/001.png"/> -->
        <img alt="验证码" onclick = "this.src='/user/user/defaultKaptcha?d='+new Date()*1" src="/user/user/defaultKaptcha?d="+new Date()*1 />
    </div>
    <input name="button" type="submit" value="登录"/>
</form>
<script>
/*function login() {
    var loginname = $("#loginname").val();
    var password = $("#password").val();
    console.log("loginname:"+loginname+"====password:"+password);
//    window.location.href="/user/user/login?loginname="+loginname+"&password="+password;
}*/

</script>
</body>
</html>