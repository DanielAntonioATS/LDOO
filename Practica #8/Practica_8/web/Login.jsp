<%-- 
    Document   : Login
    Created on : 6/04/2019, 06:28:04 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" import = "java.sql.*"%>
<html><body>
        <h1>Inicio de sesion</h1>
    <%
        String uname=request.getParameter("user");
        String pass = request.getParameter("pass");
       

        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","tiger");
    PreparedStatement stmt = con.prepareStatement("select password from user where username=?");
    stmt.setString(1, uname);  
    ResultSet rs = stmt.executeQuery();
    if(rs.next()){
        if(pass.equals(rs.getString(1)))
        {
            out.println("<h1>Inicio de Sesion exitoso</h1>");
        }
        }
    else{
    out.println("<h1>No existe este usuario</h1>");
    %>
    
    <jsp:include page="Register.html" ></jsp:include>
        <%
    }
        }catch(Exception e){out.println(e);}
   %>
    </body>
</html>