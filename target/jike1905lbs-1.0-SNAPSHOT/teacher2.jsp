<%--
  Created by IntelliJ IDEA.
  User: 吕冰森
  Date: 2022/4/15
  Time: 16:20
  To change this template use File | Settings | File Templates.
  展示学生成绩的页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>allStudent</title>
</head>
<link rel="stylesheet" href="table.css" type="text/css">

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

    p{
        color: #3498DB;
    }
</style>
<body>
<h1>学生成绩</h1>
<form action="gradeListShaiXuanServlet"method="post">
    <input type="text" name="courseCode" placeholder="输入课程代码"><input type="submit" value="筛选以打分">
    <table border="1px" align="center" cellspacing="0"cellpadding="0">
        <tr height = "60">
            <td width="120">学生账号</td>
            <td width="120">课程代码</td>
            <td width="120">考试成绩</td>
        </tr>
        <c:forEach items="${grades}" var="c">
        <tr height = "60">
            <td width="120">${c.student}</td>
            <td width="120">${c.course}</td>
            <td width="120">${c.grade}</td>
        </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
