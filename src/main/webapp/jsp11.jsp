<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 02.10.2022
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:out value="${userRole}" default="guest"/>
</body>
</html>