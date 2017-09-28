/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import com.mycompany.tatooine.interfaces.Command;
import com.mycompany.tatooine.modelo.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ThigoYure
 */
class CadastroEventoController implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws SQLException, ClassNotFoundException, IOException, ServletException {
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");
        String local = req.getParameter("local");
        String data = req.getParameter("data");
        String hora = req.getParameter("hora");
        HttpSession session = req.getSession();
        Usuario user = (Usuario)session.getAttribute("user");
        String responsavel = user.getEmail();
        if(nome==""){
            
        }
    }
    
}
