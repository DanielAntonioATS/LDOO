package servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginServlet extends HttpServlet {
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
            try (PrintWriter out = response.getWriter()) {
                request.getRequestDispatcher("redirect.html").include(request, response);
                
                String name=request.getParameter("name");
                String password=request.getParameter("password");
                
                if(password.equals("admin123")){
                    out.print("Bienvenido, "+name);
                    HttpSession session=request.getSession();
                    session.setAttribute("name",name);
                }
                else{
                    out.print("Contraseña incorrecta");
                    request.getRequestDispatcher("login.html").include(request, response);
                }
            }
	}

}
