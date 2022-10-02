<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 02.10.2022
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  Start od użytkownika: ${param.start}
  End od użytkownika: ${param.end}

  Start: ${start}
  End: ${end}

  <c:forEach begin="${start}" end="${end}" var="iteracja">
    <h3>Kolejny index: ${iteracja}</h3>
  </c:forEach>
</body>
</html>
