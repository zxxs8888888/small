<%--
  Created by IntelliJ IDEA.
  User: 吕冰森
  Date: 2022/4/18
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<style type="text/css">
    body{margin:0;padding:0;font-family:sans-serif;background: #34495e;}
    .box{
        width: 300px;
        padding:40px;
        position: absolute;
        top:50%;
        left:50%;
        transform: translate(-50%,-50%);
        background: #191919;
        text-align: center;
        border-radius: 20px;
        opacity: 0.9;
    }
    .box h1{
        color:white;
        text-transform: uppercase;
        font-weight: 500;
    }
    .box input[type="text"],.box input[type="password"]{
        border: 0;
        background: none;
        display: block;
        margin: 20px auto;
        text-align: center;
        border: 2px solid #3498db;
        padding: 14px 10px;
        width: 200px;
        outline: none;
        color: white;
        border-radius: 24px;
        transition: 0.25s;
    }
    .box input[type="text"]:focus,.box input[type="password"]:focus{
        width: 280px;
        border-color: #2ecc71;
    }
    .box input[type="submit"]{
        border: 0;
        background: none;
        display: block;
        margin: 20px auto;
        text-align: center;
        border: 2px solid #2ecc71;
        padding: 14px 40px;
        outline: none;
        color: white;
        border-radius: 24px;
        transition: 0.25s;
        cursor: pointer;
    }
    .box input[type="submit"]:hover{
        background: #2ecc71;
    }
    .box input[type="reset"]{
        border: 0;
        background: none;
        display: block;
        margin: 20px auto;
        text-align: center;
        border: 2px solid #2ecc71;
        padding: 14px 40px;
        outline: none;
        color: white;
        border-radius: 24px;
        transition: 0.25s;
        cursor: pointer;
    }
    .box input[type="reset"]:hover{
        background: #2ecc71;
    }
    p{
        color: #3498DB;
    }
</style>
<body>
<form  class="box" method="post"action="loginCheckServlet">
    <h1>系统登录</h1>
    <p>${login_msg}${register_msg}</p>
    <input type="text" name="username" value="${cookie.username.value}" placeholder="用户名">
    <input type="password" name="password" value="${cookie.password.value}" placeholder="密码">
    <table align="center">
        <tr>
            <td colspan="1"><input type="submit" name="" value="登录"></td>
            <td><input type="reset" name="" value="取消"></td>
        </tr>
        <tr>

        <td colspan="1"><p><input type="checkbox" name="remember"value="1">记住密码</p></td>
        <td><a href="register.jsp">点击注册</a></td>
        </tr>
    </table>
</form>
</body>
</html>
