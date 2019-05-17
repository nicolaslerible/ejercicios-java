<%-- 
    Document   : piramide
    Created on : Apr 11, 2019, 2:03:20 PM
    Author     : n.lerible.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center">
        <%
        int alt = Integer.parseInt(request.getParameter("altura"));
        for(int i=0;i<=alt;i++){
            for(int j=0;j<i;j++){
             out.print("* ");
            }
            out.print("<br>");
        }
        %>
    </body>
</html>
