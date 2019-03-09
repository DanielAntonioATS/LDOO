<%-- 
    Document   : mainjsp
    Created on : 8/03/2019, 10:18:09 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <ul>
         <li><h3><b>Nombre</b>
            <%= request.getParameter("name")%>
         </h3></li>
         <li><h3><b>Correo:</b>
            <%= request.getParameter("email")%>
         </h3></li>
         <li><h3><b>Contraseña:</b>
            <%= request.getParameter("contrasenia")%>
         </h3></li>
         <li><h3><b>Año de Nacimiento:</b>
            <%= request.getParameter("bday")%>
         </h3></li>
      </ul>
    </body>
</html>
