<%--
  Created by IntelliJ IDEA.
  User: 吕冰森
  Date: 2022/4/15
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>book</title>
</head>

<body>
<%--
c:if  完成逻辑判断，替换了java中的if else
            <c:if test="${status == 1}">
                  启用
             </c:if>
            <c:if test="${status == 0}">
                   禁用
             </c:if>
--%>
<form action="#" method="post">
    <input type="text" name="name"placeholder="您可以尝试输入书名">
    <input type="text" name="author" placeholder="您也可以尝试输入作者">
    <input type="submit"value="查询">
</form>
<form action="#"method="post">
    <input type="button" value="新增" id="add">
    <input type="button" value="升序排列"id="asc"><br>
    <table border="1px" align="center" cellspacing="0"cellpadding="0">
        <tr height = "60">
            <td width="60">
                <input type="submit"value="批量删除">
            </td>
            <td width="60">id号</td>
            <td width="120">书名</td>
            <td width="120">作者</td>
            <td width="120">出版社</td>
            <td width="60">价格</td>
            <td width="120">出版时间</td>
            <td width="120">ISBN号</td>
            <td width="100">操作</td>
        </tr>

        <c:forEach items="${courses}" var="c">
        <tr height = "60">
            <td>${c.cId}</td>
            <td>${c.cName}</td>
        </tr>
        </c:forEach>
</form>

</table>
</body>
</html>
