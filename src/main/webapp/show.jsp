<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-11
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ip统计结果</h1>
<table align="center" width="50%" border="1">
    <tr>
        <th>IP</th>
        <th>次数</th>
    </tr>
    <c:forEach items="${applicationScope.map}" var="entry">

    <tr>
        <td>${entry.key}</td>
        <td>${entry.value}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
