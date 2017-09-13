/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import com.mycompany.tatooine.interfaces.Command;
import com.mycompany.tatooine.modelo.Usuario;
import com.mycompany.tatooine.modelo.UsuarioDao;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author ThigoYure
 */
class CadastroController implements Command {

    public CadastroController() {
    }

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws SQLException, ClassNotFoundException, IOException, ServletException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String sexo = req.getParameter("sexo");
        String nascimento = req.getParameter("nascimento");
        String cidade = req.getParameter("cidade");
        String profissao = req.getParameter("profissao");
        String caminhoUser = File.separator + req.getServletContext().getRealPath("usuarios") + File.separator + email;
        File pastaUser = new File(caminhoUser);
        if (!pastaUser.exists()) {
            pastaUser.mkdirs();
        }
        Part path = req.getPart("fotoPerfil");
        String cam = caminhoUser + File.separator + path.getSubmittedFileName();
        path.write(cam);
        //CAMINHO DO DIRETÓRIO PARA O BANCO
        String fotoPerfil = "usuarios/" + email + "/" + path.getSubmittedFileName();
        Usuario novoUser = new Usuario(email, senha, nome, cidade, nascimento, profissao, fotoPerfil, sexo);
        UsuarioDao dao = new UsuarioDao();
        if (email.equals("") || nome.equals("") || senha.equals("") || cidade.equals("") || nascimento.equals("") || profissao.equals("") || sexo.equals("") || nascimento.equals("")) {
            res.sendRedirect("cadastro.jsp?msg='Campos vazios...'");
        } else {
            if (dao.read(email) == null) {
                if (dao.create(novoUser)) {
                    res.sendRedirect("index.jsp");
                } else {
                    res.sendRedirect("cadastro.jsp?msg='Falha ao criar nova conta...Recarregue a página e tente novamente.'");
                }
            } else {
                res.sendRedirect("cadastro.jsp?msg='Já existe um usuario vinculado a este email...'");
            }
        }
    }

}
