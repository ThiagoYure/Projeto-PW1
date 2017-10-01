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
                boolean retorno;
                try (PreparedStatement st = con.prepareStatement("INSERT INTO local (nome,inseridor,tipo,cidade,rua,estado,descricao)"
                        + "VALUES(?,?,?,?,?,?,?)")) {
                    st.setString(1, novo.getNome());
                    st.setString(2, novo.getInseridor());
                    st.setString(3, novo.getTipo());
                    st.setString(4, novo.getCidade());
                    st.setString(5, novo.getRua());
                    st.setString(6, novo.getEstado());
                    st.setString(7, novo.getDescricao());
                    retorno = st.executeUpdate() > 0;
                    con.close();
                }
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
                    local.setRua(r.getString("rua"));
                    local.setCidade(r.getString("cidade"));
                    local.setEstado(r.getString("estado"));
                    local.setDescricao(r.getString("descricao"));
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
                    local.setRua(r.getString("rua"));
                    local.setRua(r.getString("cidade"));
                    local.setRua(r.getString("estado"));
                    local.setDescricao(r.getString("descricao"));
                    retorno.add(local);
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

    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        try {
            try (Connection con = ConFactory.getConnection()) {

                PreparedStatement st = con.prepareStatement(
                        "DELETE FROM local WHERE id = ?");
                st.setInt(1, id);
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
                "UPDATE local SET (nome, inseridor, tipo,rua,estado,cidade,descricao)"
                + " = (?,?,?,?,?,?) WHERE id = ?");
        st.setString(1, localNovo.getNome());
        st.setString(2, localNovo.getInseridor());
        st.setString(3, localNovo.getTipo());
        st.setString(4, localNovo.getRua());
        st.setString(5, localNovo.getEstado());
        st.setString(6, localNovo.getCidade());
        st.setString(7, localNovo.getDescricao());
        st.setInt(8, id);
        boolean retorno = st.executeUpdate() > 0;
        con.close();
        return retorno;
    }
}
