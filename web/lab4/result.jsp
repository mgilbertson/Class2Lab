<%-- 
    Document   : result
    Created on : Jan 27, 2015, 8:04:06 AM
    Author     : Mitch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome!</title>
    </head>
    <body>
        <%
        Object obj = request.getAttribute("message");
        String message;
        if(obj == null){
            message = "sorry, null name";
        }else message = String.valueOf(obj);
        out.print("<h3>" + message + "</h3>");
        %>
    </body>
</html>
