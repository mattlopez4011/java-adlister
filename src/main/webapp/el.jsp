<%--
  Created by IntelliJ IDEA.
  User: matt_lopez
  Date: 10/21/19
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%
    request.setAttribute("username", "bill123");
    request.setAttribute("password", "aasdf1454");
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--Grab from setAttribute--%>
<h1>Username: <%=request.getAttribute("username")%></h1>
<h1>Username: ${username} Password: ${password}</h1>

<%--Grab the parameter assigned to the key "name"--%>
<h3> ${param.name} </h3>

</body>
</html>
