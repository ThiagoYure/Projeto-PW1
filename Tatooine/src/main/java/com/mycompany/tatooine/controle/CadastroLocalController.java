/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import com.mycompany.tatooine.interfaces.Command;
import com.mycompany.tatooine.modelo.Usuario;
import com.mycompany.tatooine.modelo.UsuarioDao;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author ThigoYure
 */
class CadastroLocalController implements Command{

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws SQLException, ClassNotFoundException, IOException, ServletException {
        Part part = req.getPart("fotos");
    }
    
}
