/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import com.mycompany.tatooine.interfaces.Command;
import com.mycompany.tatooine.modelo.Evento;
import com.mycompany.tatooine.modelo.Usuario;
import com.mycompany.tatooine.modelo.EventoDao;
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
        EventoDao dao = new EventoDao();
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");
        String local = req.getParameter("local");
        String data = req.getParameter("data");
        String hora = req.getParameter("hora");
        HttpSession session = req.getSession();
        Usuario user = (Usuario)session.getAttribute("user");
        String responsavel = user.getEmail();
        if(nome.equals("")||local.equals("")||descricao.equals("")||data.equals("")||hora.equals("")){
           res.sendRedirect("cadastroEvento.jsp?messageError=Campos vazios...");
        }else if(dao.read(nome, responsavel)==null){
            if(dao.create(new Evento(responsavel,nome,data,hora,descricao,local))){
                res.sendRedirect("meusEventos.jsp");
            }else{
                res.sendRedirect("cadastroEvento.jsp?messageError=Não foi possível cadastrar o evento...");
            }
            
        }else{
            res.sendRedirect("cadastroEvento.jsp?messageError=Você já cadastrou um evento com esse nome...");
        }
    }
    
}
