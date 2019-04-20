<%-- 
    Document   : Login
    Created on : 6/04/2019, 06:28:04 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" import="java.sql.*"%>
<html><body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
String userid=request.getParameter("usr"); 
session.putValue("userid",userid); 
String pwd=request.getParameter("pwd"); 

Class.forName("com.mysql.jdbc.Driver"); 

java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Practica_8","root","1234"); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select * from users where userid='"+userid+"'"); 
if(rs.next()) 
{ 
    if(rs.getString(2).equals(pwd)) 
        { 
        out.println("Welcome, "+userid); 

        } 
            else 
                { 
                out.println("Invalid password"); 
                } 
                } 
%>
</br>
<a href="index.html">Home</a>
</body>
</html>