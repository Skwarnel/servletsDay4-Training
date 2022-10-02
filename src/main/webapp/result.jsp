<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 02.10.2022
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table>
    <c:forEach items="${books}" var="book">
      <tr>
        <td>${book.title}, ${book.author}, ${book.isbn}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
