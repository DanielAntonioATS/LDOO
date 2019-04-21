/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Model;

import Classes.Admin;
import Classes.Guest;
import Classes.Normal;
import Classes.UsersFactory;
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
public class Registrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        UsersFactory factory = UsersFactory.Factory(); 
        
        factory.newU(request.getParameter("subscription"+"name"+"pass"+"email"+"pass"+"bday"+"fullname"+"adress"+"numemple"));
               String utype = request.getParameter("utype");
                String fullname = request.getParameter("fullname");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String pass = request.getParameter("pass");
                String bday = request.getParameter("bday");
                String adress = request.getParameter("adress");
                String subcription = request.getParameter("subcription");
                int numemp = 0;

            if (utype.equals("admin")){
                    numemp = ((Admin)factory.obtenerUser(request.getParameter("name"))).getNumEmple();
                        fullname = ((Normal)factory.obtenerUser(request.getParameter("name"))).getFullName();
                        subcription = ((Normal)factory.obtenerUser(request.getParameter("name"))).getSubscription();
                        adress = ((Normal)factory.obtenerUser(request.getParameter("name"))).getAdress();
                            }else if (utype.equals("guest")) {
                                fullname = ((Guest)factory.obtenerUser(request.getParameter("name"))).getFullName();

        }
            response.sendRedirect("index.jsp");
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}


