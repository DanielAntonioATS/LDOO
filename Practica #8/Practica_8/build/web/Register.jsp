<%-- 
    Document   : Register
    Created on : 6/04/2019, 06:27:26 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" import="java.sql.*"%>
<html><body>
        <h1>Registration JSP Page</h1>
    <%
        String uname=request.getParameter("user");
        String pass1 = request.getParameter("pass");
        String pass2 = request.getParameter("rpass");
        String email = request.getParameter("email");
        
  if(pass1.equals(pass2)){
        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","tiger");
    PreparedStatement stmt = con.prepareStatement("insert into user values (?,?,?)");
    stmt.setString(1, uname);    
    stmt.setString(2, pass1);
    stmt.setString(3, email);    
    int row = stmt.executeUpdate();
    if(row==1) { out.println("Registration Successful"); }
    else {    
        out.println("Fallo en el registro");
        %>
            <jsp:include page="Register.html" ></jsp:include>
        <%
    
        }
    }catch(Exception e){out.println(e);}
  }
  else 
  {
  out.println("<h1>Contraseña Incorrecta</h1>");
  %>
  <jsp:include page="Register.html" ></jsp:include>
<%  }
    %>
    </body>
</html>