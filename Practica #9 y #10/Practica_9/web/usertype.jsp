<%-- 
    Document   : usertype
    Created on : 15/04/2019, 03:12:46 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <h1>Choose user type</h1>
         <form action="UType" method="post">
            <select name="utype">
                <option value="admin">Administrador</option>
                <option value="normal">Normal</option>
                <option value="guest">Invitado</option>
            </select>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
