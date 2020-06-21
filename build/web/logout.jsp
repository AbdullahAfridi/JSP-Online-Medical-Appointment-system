<%-- 
    Document   : logout
    Created on : Dec 2, 2018, 6:41:13 PM
    Author     : ACS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body> <%
        session.invalidate();
        response.sendRedirect("index.jsp");
        %>
    </body>
</html>
