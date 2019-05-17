<%-- 
    Document   : respuesta
    Created on : Apr 11, 2019, 12:48:56 PM
    Author     : n.lerible.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
    </head>
    <body>
        <h1>El resultado de tu media es: 
        <%int n1 = Integer.parseInt(request.getParameter("nota1")); 
        int n2 = Integer.parseInt(request.getParameter("nota2"));
        int n3 = Integer.parseInt(request.getParameter("nota3"));
        out.print((n1+n2+n3)/3);%> 
        </h1>
    </body>
</html>
