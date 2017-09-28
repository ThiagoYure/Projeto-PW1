/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import com.mycompany.tatooine.interfaces.Command;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThigoYure
 */
public class frontController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
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
        doPost(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String controller = request.getParameter("controller");
        System.out.println(controller);
        if (controller.equals("Login")) {
            LoginController command = new LoginController();
            try {
                command.execute(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frontController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (controller.equals("Cadastro")) {
            CadastroController command = new CadastroController();
            try {
                command.execute(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frontController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (controller.equals("sair")) {
            SairController command = new SairController();
            try {
                command.execute(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frontController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (controller.equals("cadastroLocal")) {
            CadastroLocalController command = new CadastroLocalController();
            try {
                command.execute(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frontController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (controller.equals("cadastroEvento")) {
            CadastroEventoController command = new CadastroEventoController();
            try {
                command.execute(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frontController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
