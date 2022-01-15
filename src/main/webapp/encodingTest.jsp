<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-11
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/EnCodingServlet?username=张三">get请求</a>
<form action="${pageContext.request.contextPath}/EnCodingServlet" method="post">
    用户名：<label>
    <input type="text" name="username" value="李四">
</label>
    <input type="submit" value="提交">
</form>
</body>
</html>
