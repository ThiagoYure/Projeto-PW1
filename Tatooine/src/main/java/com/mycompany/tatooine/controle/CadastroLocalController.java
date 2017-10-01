/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import com.mycompany.tatooine.factory.ConFactory;
import com.mycompany.tatooine.interfaces.Command;
import com.mycompany.tatooine.modelo.FotosLocalDao;
import com.mycompany.tatooine.modelo.Local;
import com.mycompany.tatooine.modelo.LocalDao;
import com.mycompany.tatooine.modelo.Usuario;
import com.mycompany.tatooine.modelo.UsuarioDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author ThigoYure
 */
class CadastroLocalController implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws SQLException, ClassNotFoundException, IOException, ServletException {
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");
        String tipo = req.getParameter("tipo");
        String estado = req.getParameter("estado");
        String rua = req.getParameter("rua");
        String cidade = req.getParameter("cidade");
        HttpSession s = req.getSession();
        String email = ((Usuario) s.getAttribute("user")).getEmail();
        if (descricao.equals("") || nome.equals("") || tipo.equals("") || cidade.equals("") || rua.equals("") || cidade.equals("") || estado.equals("")) {
            res.sendRedirect("cadastroLocal.jsp?msg='Campos vazios...'");
        } else {
            LocalDao dao1 = new LocalDao();
            Local novoLocal = new Local(nome, email, tipo, cidade, rua, estado, descricao);
            if (dao1.read(email, nome) == null) {
                if (dao1.create(novoLocal)) {
                    res.sendRedirect("meusLocais.jsp");
                } else {
                    res.sendRedirect("cadastroLocal.jsp?msg='Falha ao criar novo local...Recarregue a página e tente novamente.'");
                }
            } else {
                res.sendRedirect("cadastroLocal.jsp?msg='Já existe um local com esse mesmo nome vinculado a este email...'");
            }
        }
        try {
            FotosLocalDao dao = new FotosLocalDao();
            String caminhoLocal = File.separator + req.getServletContext().getRealPath("locais") + File.separator + email + File.separator + nome;
            File pastaLocal = new File(caminhoLocal);
            if (!pastaLocal.exists()) {
                pastaLocal.mkdirs();
            }
            Collection<Part> path = req.getParts();
            for (Iterator<Part> it = path.iterator(); it.hasNext();) {
                Part next = it.next();
                String file = next.getName();
                System.out.println(file);
                if ("fotos".equals(file)) {
                    String cam = caminhoLocal + File.separator + next.getSubmittedFileName();
                    next.write(cam);
                    String foto = next.getSubmittedFileName();
                    try {
                        try (Connection con = ConFactory.getConnection()) {
                            PreparedStatement st = con.prepareStatement("SELECT max(id) FROM local");
                            ResultSet r = st.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("max");
                                dao.create(id, foto);
                            }
                            st.close();
                            con.close();
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } //CAMINHO DO DIRETÓRIO PARA O BANCO
        } catch (IOException e) {
            e.getMessage();
        }

    }

}
