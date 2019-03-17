<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <form action="/Practica4/User" method="POST">
            Nombre:<br>
            <input type="text" name="name"><br>
            Email:<br>
                <input type="email" name="email"><br>
            Contraseña:<br>
                <input type="password" name="pass"><br>
            Fecha de Nacimiento:<br>
            <input type="date" name="bday"><br>
                
            <input type="submit" value="Enviar">
            
            
            
            
        </form>
    </body>
</html>
