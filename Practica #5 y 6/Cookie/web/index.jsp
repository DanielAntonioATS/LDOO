<%-- 
    Document   : index
    Created on : 27/03/2019, 8:05:23 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
            <title>Home</title>
    </head>
    <body>
        <center>
            <h1>Login</h1>
                <form action="Process" method="POST">
                <p>Usuario</p>
                <input type="text" name="usuario"/>
                <p>Contraseña</p>
                <input type="password" name="contrasena"/><br>
                <input type="submit" name="login" value="Login"/><br>
                <a href="registro.jsp">Register</a>
               
            </form>
        </center>
    </body>
</html>