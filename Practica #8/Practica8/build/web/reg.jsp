<%-- 
    Document   : Register
    Created on : 6/04/2019, 06:27:26 PM
    Author     : Daniel
--%>

<%@page import="java.lang.String"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
String user=request.getParameter("userid"); 
session.putValue("userid",user); 
String pass=request.getParameter("pwd"); 
String email=request.getParameter("email"); 

Class.forName("com.mysql.jdbc.Driver"); 

java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Practica_8","root","1234"); 
Statement st= con.createStatement(); 

int i=st.executeUpdate("insert into users values ('"+user+"','"+pass+"','"+email+"')"); 

out.println("Registered"); 


%>

</br><a href ="Login.html">Login</a><br/><br/>
<a href="index.html">Home</a>
</body>
</html>