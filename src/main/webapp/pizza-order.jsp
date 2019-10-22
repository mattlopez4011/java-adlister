<%--
  Created by IntelliJ IDEA.
  User: matt_lopez
  Date: 10/22/19
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Pizza</title>
    <%--    Bootstrap 4--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<%@ include file="partials/navbar.html" %>
<%@ include file="partials/footer.html" %>

<div class="container">
    <div class="card bg-secondary">
        <%--FORM--%>
        <form action="pizza-order-summary.jsp" method="post">
    <%--            Crust style--%>
            <input type="radio" name="crust" value="original" checked> Original<br>
            <input type="radio" name="crust" value="garlic"> Garlic<br>
            <input type="radio" name="crust" value="parmesan"> Parmesan
    <%--            Sauce radio btns--%>
            <input type="radio" name="sauce" value="marinara" checked> Marinara<br>
            <input type="radio" name="sauce" value="alfredo"> Alfredo<br>
            <input type="radio" name="sauce" value="pesto"> Pesto
    <%--            Size radio btns--%>
    <input type="radio" name="size" value="small" checked> Small<br>
    <input type="radio" name="size" value="med"> Medium<br>
    <input type="radio" name="size" value="lg"> Large
    <input type="radio" name="size" value="xl"> X-Large
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

<%--Bootstrap 4 JS--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>



This form features choices to select the crust type, sauce type, size type (use select inputs), toppings (checkboxes), and delivery address (text input)