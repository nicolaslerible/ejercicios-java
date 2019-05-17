<%-- 
    Document   : index
    Created on : Apr 11, 2019, 12:42:39 PM
    Author     : n.lerible.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <h1>Calculo la media de tres notas</h1>
        <form method="get" action="respuesta.jsp">
            Primera nota <input name="nota1" type="number"><br>
            Segunda nota<input name="nota2" type="number"><br>
            Tercera nota <input name="nota3" type="number"><br>
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
