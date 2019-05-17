<%-- 
    Document   : index
    Created on : Apr 11, 2019, 1:05:00 PM
    Author     : n.lerible.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 6</title>
    </head>
    <body>
        <h1>Conversor pesetas-euros</h1>
        <form action="cambio.jsp" method="get">
            <select name="tipo">
                <option value="Pes">Pesetas</option>
                <option value="Eur">Euros</option>
            </select>
            Introduce la cantidad: <input name="moneda" type="number">
            <input value="Cambiar" type="submit">
        </form>
    </body>
</html>
