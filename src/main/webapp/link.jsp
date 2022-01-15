<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-11
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>链接页面</h1>
<a href="${pageContext.request.contextPath}/BookServlet?method=findAll">查询所有</a>
<a href="${pageContext.request.contextPath}/BookServlet?method=findByCategory&category=1">查看SE分类</a>
<a href="${pageContext.request.contextPath}/BookServlet?method=findByCategory&category=2">查看EE分类</a>
<a href="${pageContext.request.contextPath}/BookServlet?method=findByCategory&category=3">查看框架分类</a>
</body>
</html>
