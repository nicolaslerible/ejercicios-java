<%-- 
    Document   : cambio
    Created on : Apr 11, 2019, 1:10:00 PM
    Author     : n.lerible.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 5</title>
    </head>
    <body>
        <h1>chiklin chiklin</h1>
        <p>El cambio es de 
            <%
            double peseta = Double.parseDouble(request.getParameter("euro"))*166.386;
            out.print(peseta);
            %> pesetas
        </p>
    </body>
</html>
