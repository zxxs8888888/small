<%--
  Created by IntelliJ IDEA.
  User: 吕冰森
  Date: 2022/4/15
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加书籍</title>
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
</style>
<body>
<form  class="box" method="post"action="addServlet">
    <h1>增加书籍</h1>
    <input type="text" name="id" placeholder="id号">
    <input type="text" name="name" placeholder="书名">
    <input type="text" name="author" placeholder="作者">
    <input type="text" name="published" placeholder="出版社">
    <input type="text" name="price" placeholder="价格">
    <input type="text" name="time" placeholder="出版时间">
    <input type="password" name="isbn" placeholder="ISBN号">
    <input type="submit" name="" value="提交">
</form>
</body>
</html>
