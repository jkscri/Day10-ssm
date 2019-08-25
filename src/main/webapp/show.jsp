<%--
  Created by IntelliJ IDEA.
  User: feiadmin
  Date: 2019/6/17
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${ulist}" var="user" varStatus="u">
${u.count}---${user.username}---${user.password}<br>
</c:forEach>

</body>
</html>
