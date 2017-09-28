/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.modelo;

import com.mycompany.tatooine.factory.ConFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThigoYure
 */
public class UsuarioDao {

    public UsuarioDao() {

    }

    public boolean create(Usuario novo) throws SQLException, ClassNotFoundException {
        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("INSERT INTO usuario (nome,email,senha,sexo,profissao,datanascimento,fotoPerfil,"
                        + "cidade) VALUES(?,?,?,?,?,?,?,?)");
                st.setString(1, novo.getNome());
                st.setString(2, novo.getEmail());
                st.setString(3, novo.getSenha());
                st.setString(4, novo.getSexo());
                st.setString(5, novo.getProfissao());
                st.setString(6, novo.getNascimento());
                st.setString(7, novo.getFotoPerfil());
                st.setString(8, novo.getCidade());
                boolean retorno = st.executeUpdate() > 0;
                con.close();
                st.close();
                return retorno;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public Usuario read(String nome) throws SQLException, ClassNotFoundException {

        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM usuario WHERE nome=?");
                st.setString(1, nome);
                ResultSet r = st.executeQuery();
                if (r.next()) {
                    Usuario user = new Usuario();
                    user.setNome(r.getString("nome"));
                    user.setEmail(r.getString("email"));
                    user.setCidade(r.getString("cidade"));
                    user.setSexo(r.getString("sexo"));
                    user.setFotoPerfil(r.getString("fotoperfil"));
                    user.setSenha(r.getString("senha"));
                    user.setProfissao(r.getString("profissao"));
                    user.setNascimento(r.getString("datanascimento"));
                    st.close();
                    con.close();
                    return user;
                }
                st.close();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Usuario> readList(String nome, String email) throws SQLException, ClassNotFoundException {

        List<Usuario> retorno = new ArrayList<>();
        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM usuario WHERE nome=? AND email=?");
                st.setString(1, nome);
                st.setString(2, email);
                ResultSet r = st.executeQuery();
                while (r.next()) {
                    Usuario user = new Usuario();
                    user.setNome(r.getString("nome"));
                    user.setEmail(r.getString("email"));
                    user.setCidade(r.getString("cidade"));
                    user.setSexo(r.getString("sexo"));
                    user.setFotoPerfil(r.getString("fotoperfil"));
                    user.setSenha(r.getString("senha"));
                    user.setProfissao(r.getString("profissao"));
                    user.setNascimento(r.getString("datanascimento"));
                }
                st.close();
                con.close();
                return retorno;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean delete(String nome) throws SQLException, ClassNotFoundException {
        try {
            try (Connection con = ConFactory.getConnection()) {

                PreparedStatement st = con.prepareStatement(
                        "DELETE FROM usuario WHERE nome = ?");
                st.setString(1, nome);

                boolean retorno = st.executeUpdate() > 0;
                con.close();
                st.close();

                return retorno;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean update(Usuario usuarioNovo, String email) throws ClassNotFoundException, SQLException {
        Connection con = ConFactory.getConnection();
        PreparedStatement st = con.prepareStatement(
                "UPDATE usuario SET (nome, descricao, usuario)"
                + " = (?,?,?,?,?,?,?,?) WHERE id = id");
        st.setString(1, usuarioNovo.getEmail());
        st.setString(2, usuarioNovo.getSenha());
        st.setString(3, usuarioNovo.getNome());
        st.setString(4, usuarioNovo.getCidade());
        st.setString(5, usuarioNovo.getNascimento());
        st.setString(6, usuarioNovo.getProfissao());
        st.setString(7, usuarioNovo.getFotoPerfil());
        st.setString(8, usuarioNovo.getSexo());

        boolean retorno = st.executeUpdate() > 0;
        con.close();
        return retorno;
    }
}
