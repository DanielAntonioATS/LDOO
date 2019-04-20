<%-- 
    Document   : Bienvenido
    Created on : 27/03/2019, 8:01:15 PM
    Author     : Daniel
--%>

<%@page import="Modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession ssn = request.getSession();
        String usuario,contrasena;
        usuario = ssn.getAttribute("username").toString();
        contrasena = ssn.getAttribute("password").toString();
        User user = new User(usuario,contrasena);
%>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Welcome</title>
       
    </head>
    <body background="imagenes/b.jpg">
    <center>
        <h1>Welcome, <%=user.getUsuario()%></h1>
        <p> Your password is <%= user.getContrasena()%></p>
        <form action="logout">
            <input type="submit" name="logout" value="Logout"/>
        </form>
        <br>

        Cookie JSessionID: <%= session.getId() %></br>
        The rest of the cookies<a href="Cookies">Your cookies</a>
    </center>
    </body>
</html>