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
 * @author Ricarte
 */
public class LocalDao {

    public LocalDao() {
    }

    public boolean create(Local novo) throws SQLException, ClassNotFoundException {
        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("INSERT INTO local (nome,inseridor,tipo,endereco,descricao,foto)"
                        + "VALUES(?,?,?,?,?,?)");
                st.setString(1, novo.getNome());
                st.setString(2, novo.getInseridor());
                st.setString(3, novo.getTipo());
                st.setString(4, novo.getEndereco());
                st.setString(5, novo.getDescricao());
                st.setString(6, novo.getFoto());
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

    public Local read(String nome, String inseridor) throws SQLException, ClassNotFoundException {

        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM local WHERE nome=? AND inseridor=?");
                st.setString(1, nome);
                st.setString(2, inseridor);
                ResultSet r = st.executeQuery();
                if(r.next()) {
                    Local local = new Local();
                    local.setNome(r.getString("nome"));
                    local.setInseridor(r.getString("inseridor"));
                    local.setTipo(r.getString("tipo"));
                    local.setEndereco(r.getString("endereco"));
                    local.setDescricao(r.getString("descricao"));
                    local.setFoto(r.getString("foto"));
                    st.close();
                    con.close();
                    return local;
                }
                st.close();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Local> readList(String nome) throws SQLException, ClassNotFoundException {
        List<Local> retorno = new ArrayList<>();
        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM local WHERE nome=? AND inseridor=?");
                st.setString(1, nome);
                ResultSet r = st.executeQuery();
                while (r.next()) {
                    Local local = new Local();
                    local.setNome(r.getString("nome"));
                    local.setInseridor(r.getString("inseridor"));
                    local.setTipo(r.getString("tipo"));
                    local.setEndereco(r.getString("endereco"));
                    local.setDescricao(r.getString("descricao"));
                    local.setFoto(r.getString("foto"));
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
                        "DELETE FROM local WHERE nome = ?");
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

    public boolean update(Local localNovo, int id) throws ClassNotFoundException, SQLException {
        Connection con = ConFactory.getConnection();
        PreparedStatement st = con.prepareStatement(
                "UPDATE local SET (nome, descricao, usuario)"
                + " = (?,?,?,?,?,?) WHERE id = id");
        st.setString(1, localNovo.getNome());
        st.setString(2, localNovo.getInseridor());
        st.setString(3, localNovo.getTipo());
        st.setString(4, localNovo.getEndereco());
        st.setString(5, localNovo.getDescricao());
        st.setString(6, localNovo.getFoto());

        boolean retorno = st.executeUpdate() > 0;
        con.close();
        return retorno;
    }
}
