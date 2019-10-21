<%@ page import="java.util.List" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: matt_lopez
  Date: 10/21/19
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%
    List<String> favFoods = Arrays.asList("pizza","Pho","Loaded Fries");
    request.setAttribute("favFoods", favFoods);
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL Example</title>
</head>
<body>

    <h1>JSTL Example</h1>

    <c:if test=" ${2 < 3}">
        <h2>Will not display</h2>
    </c:if>

    <c:if test="${url<1}">
        <c:redirect url="http://javatpoint.com"/>
    </c:if>
    <c:otherwise>
        <p>none of the above tests were true</p>
    </c:otherwise>

    <ol>
        <c:forEach var="favFood" items="${favFoods}">
            <li>${favFood}</li>
        </c:forEach>
    </ol>
</body>
</html>
