<%--
  Created by IntelliJ IDEA.
  User: 吕冰森
  Date: 2022/4/15
  Time: 16:20
  To change this template use File | Settings | File Templates.
  展示学生选课页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>选课</title>
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


</style>
<body>
<h1>学生用户：${num_msg}正在选课......</h1>
<h3>请不要重复选择，否则后果自负！</h3>
<p>你已经选择了如下课程：${k}</p>
<form action="s_index.jsp"method="post">
    <input type="submit" value="返回主页">
    <table border="1px" align="center" cellspacing="0"cellpadding="0">
        <tr height = "60">
            <td width="120">课程代码</td>
            <td width="120">课程名称</td>
            <td width="60">操作</td>
        </tr>

        <c:forEach items="${courses}" var="c">
        <tr height = "60">
            <td width="120">${c.cId}</td>
            <td width="120">${c.cName}</td>
            <td width="60"><a href="selectCourseServlet?cid=${c.cId}">选课</a></td>
        </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
