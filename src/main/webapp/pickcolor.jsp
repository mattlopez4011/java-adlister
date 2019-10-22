<%--
  Created by IntelliJ IDEA.
  User: matt_lopez
  Date: 10/21/19
  Time: 4:20 PM
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
    <title>Pick Color</title>
    <style>
        .container{
            width: 100%;
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .card{
            background: #1A2980;  /* fallback for old browsers */
            background: -webkit-linear-gradient(to top, #26D0CE, #1A2980);  /* Chrome 10-25, Safari 5.1-6 */
            background: linear-gradient(to top, #26D0CE, #1A2980); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            padding: 10px;
            margin: 10px;
            border-radius: .5em;
        }

        .color{
            color: white;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="card bg-secondary">
        <%--FORM--%>
        <form action="favColor.jsp" method="post">
<%--            Fav Color--%>
        <label class="color" for="color">Enter a Color:</label>
        <input id="color" type="text" name="color" placeholder="Enter Color">
        <br>
        <button class="btn btn-primary" type="submit">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
