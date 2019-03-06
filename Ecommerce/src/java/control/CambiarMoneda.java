/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luis.burgos
 */
public class CambiarMoneda extends HttpServlet {

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
        HttpSession sesion = request.getSession();
        if(sesion.getAttribute("moneda")!=null){
            switch(request.getParameter("moneda")){
                case "MXN":
                    sesion.setAttribute("moneda", "MXN");
                    sesion.setAttribute("non_moneda", "$ Pesos Mexicanos");
                    break;
                    
                case "COP":
                    sesion.setAttribute("moneda", request.getParameter("moneda"));
                    sesion.setAttribute("non_moneda", "$ Pesos Colombianos");
                    break;
                 
                case "USD":
                    sesion.setAttribute("moneda", request.getParameter("moneda"));
                    sesion.setAttribute("non_moneda", "$ Dólar USA");
                    break;
                 
                case "PEN":
                    sesion.setAttribute("moneda", request.getParameter("moneda"));
                    sesion.setAttribute("non_moneda", "S/. Sol Peruano");
                    break;
                    
                default: 
                    sesion.setAttribute("moneda", "MXN");
                    sesion.setAttribute("non_moneda", "$ Pesos Mexicanos");
            }

        }
        response.sendRedirect("Inicio");
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
