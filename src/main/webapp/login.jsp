<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-11
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
用户名：<input type="text" name="username"/>
<input type="submit" value="登录"/>
</form>
</body>
</html>
