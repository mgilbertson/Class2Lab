<%-- 
    Document   : PageGenerator2
    Created on : Jan 22, 2015, 1:15:34 PM
    Author     : mgilbertson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String color = request.getParameter("color");
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1 style="color:<%=color%>">This is a JSP table</h1>
        <table border = 1>
            <%
                int count = 0;
                for (int row = 0; row < 3; row++) {
                    out.println("<tr>");
                    for (int col = 0; col < 3; col++) {
                        out.println("<td>" + count + "</td>");
                        count++;
                    }
                    out.println("</tr>");
                }
            %>
        </table>

    </body>
</html>
