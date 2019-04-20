/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            
            String name = request.getParameter("user");
            String correo = request.getParameter("email");
            String password = request.getParameter("pass");
            String birthday = request.getParameter("bday");
            
            User user = new User (name, correo, password, birthday);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>User</h1>");
            out.println("<p></p>");
            out.println("<p>Name: " + name + "</p");
            out.println("<p>Email: " + correo + "</p");
            out.println("<p>Password: " + password + "</p");
            out.println("<p>Birthday: " + birthday + "</p");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

