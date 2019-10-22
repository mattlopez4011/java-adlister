<%--
  Created by IntelliJ IDEA.
  User: matt_lopez
  Date: 10/21/19
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color picked</title>
    <style>
        body{
            background-color: ${param.color};
        }

        .color-text{
            margin: 0 auto;

        }
    </style>
</head>
<body>
<h1 class="color-text">You picked ${param.color}</h1>

</body>
</html>
