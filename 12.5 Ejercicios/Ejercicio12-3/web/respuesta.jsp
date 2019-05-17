<%-- 
    Document   : respuesta
    Created on : Apr 11, 2019, 12:30:05 PM
    Author     : n.lerible.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola <%out.print(request.getParameter("nombre"));%></h1>
    </body>
</html>
