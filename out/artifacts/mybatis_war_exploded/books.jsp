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
<form action="selectByConditionServlet" method="post">
<input type="text" name="name"placeholder="您可以尝试输入书名">
<input type="text" name="author" placeholder="您也可以尝试输入作者">
    <input type="submit"value="查询">
</form>
<form action="deProServlet"method="post">
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


        <c:forEach items="${books}" var="book">
            <tr height = "60">
                <td>
                    <input type="checkbox"name="del"value="${book.id}">
                </td>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.published}</td>
                <td>${book.price}</td>
                <td>${book.time}</td>
                <td>${book.isbn}</td>
                <td><a href="selectByIdServlet?id=${book.id}">修改</a>  <a href="deServlet?id=${book.id}">删除</a></td>
            </tr>
        </c:forEach>
    </form>

</table>

<script>
    document.getElementById("add").onclick = function (){
        location.href = "addBook.jsp";
    }
</script>
<script>
    document.getElementById("asc").onclick = function (){
        location.href = "asc";
    }
</script>
</body>
</html>
