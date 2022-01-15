<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-11
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
</head>
<body>
<h1 align="center">图书列表</h1>
<table border="1" align="center" width="50%">
    <tr>
        <th>书名</th>
        <th>单价</th>
        <th>分类</th>
    </tr>
<jsp:useBean id="bookList" scope="request" type="java.util.List"/>
<c:forEach items="${bookList}" var="book">
    <tr>
        <td>${book.bname}</td>
        <td>${book.price}</td>
        <c:choose>
            <c:when test="${book.category eq 1}"><td style="color: red">Java_SE</td></c:when>
            <c:when test="${book.category eq 2}"><td style="color: darkmagenta">Java_EE</td></c:when>
            <c:when test="${book.category eq 3}"><td style="color: green">Java_framework</td></c:when>
        </c:choose>

    </tr>
</c:forEach>
</table>
</body>
</html>
