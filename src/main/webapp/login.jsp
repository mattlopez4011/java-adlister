<%--
  Created by IntelliJ IDEA.
  User: matt_lopez
  Date: 10/21/19
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%
//    request.getParameter("username");
//    request.getParameter("password");
//
//    if (request.getParameter("username") != null && request.getParameter("password") != null){
//        if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")){
//            response.sendRedirect("/profile.jsp");
//        }
//    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login practice</title>
<%--    Bootstrap 4--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<%@ include file="partials/footer.html" %>
<div class="container">
    <div class="card bg-secondary">
        <%--FORM--%>
        <form action="/login.jsp" method="post">
            <%--    username--%>
            <label class="text-white" for="username">Username: </label>
            <input id="username" type="text" name="username" placeholder="username">
            <br>
            <%--    password--%>
            <label class="text-white" for="password">Password: </label>
            <input id="password" type="password" name="password" placeholder="password">
            <br>

            <button class="btn btn-primary" type="submit">Submit</button>

        </form>
    </div>
</div>


<%--<c:if test="${param.username.equalsIgnoreCase('admin') and param.password.equalsIgnoreCase('password')}">--%>
<%--    <c:redirect url="profile.jsp"/>--%>
<%--</c:if>--%>




<c:if test="${param.username != null && param.password != null}">
<c:choose>
    <c:when test="${param.username.equalsIgnoreCase('admin') and param.password.equalsIgnoreCase('password')}">
        <c:redirect url="profile.jsp"/>
    </c:when>
    <c:otherwise>
        <c:redirect url="login.jsp"/>
    </c:otherwise>
</c:choose>

</c:if>


<%--Bootstrap 4 JS--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
