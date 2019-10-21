<%--<h1>"name" parameter: <%= request.getParameter("name") %></h1>--%>
<%--<p>"username" parameter: <%= request.getParameter("username") %></p>--%>
<%--<p>"password" parameter: <%= request.getParameter("password") %></p>--%>

<%--Java Code:--%>
<%
    String name = request.getParameter("name");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

%>

<h1>Hello <%= name %> </h1>
<h2> You're Username is: <%= username %></h2>
<h2> You're Password is: <%= password %></h2>