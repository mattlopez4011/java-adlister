<%@ page import="java.util.Scanner" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--evaluate arbitrary Java code--%>
<%
    Scanner input = new Scanner(System.in);
    int x = 3;
%>

<%--Define instance variables--%>
<%! int count = 0; // creates instance property
%>


<% count += 1;
    x += 1; %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<%@ include file="partials/navbar.html" %>

<h1>First JSP!</h1>
<h2> My name is <%= "Justin" %></h2>
<h3>Counter: <%= count %></h3>
<h3>X Variable: <%= x %></h3>

<p>"username" parameter: <%= request.getParameter("username") %></p>
<p>"password" parameter: <%= request.getParameter("password") %></p>

<form action="/hello.jsp" method="post">
    <label for="username">Enter username:</label>
    <input id="username" type="text" name="username" placeholder="username">
    <br>
    <label for="password">Enter Password:</label>
    <input id="password" name="password" placeholder="password">
    <input type="submit">
</form>

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>