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
public class EventoDao {

    public EventoDao() {

    }

    public boolean create(Evento novo) throws SQLException, ClassNotFoundException{
        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("INSERT INTO evento (responsavel, nome, data, hora, descricao,local)"
                        + "VALUES(?,?,?,?,?,?)");
                st.setString(1, novo.getResponsavel());
                st.setString(2, novo.getNome());
                st.setString(3, novo.getData());
                st.setString(4, novo.getHora());
                st.setString(5, novo.getDescricao());
                st.setString(6, novo.getLocal());
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

    public List<Evento> readList(String nome) throws SQLException, ClassNotFoundException{

        List<Evento> retorno = new ArrayList<>();
        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM evento WHERE nome=?");
                st.setString(1, nome);
                ResultSet r = st.executeQuery();
                while (r.next()) {
                    Evento evento = new Evento();
                    evento.setId(r.getInt("id"));
                    evento.setResponsavel(r.getString("responsavel"));
                    evento.setNome(r.getString("nome"));
                    evento.setData(r.getString("data"));
                    evento.setHora(r.getString("hora"));
                    evento.setDescricao(r.getString("descricao"));
                    evento.setLocal(r.getString("local"));
                    retorno.add(evento);
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
    
    public Evento read(String nome, String responsavel) throws SQLException, ClassNotFoundException {

        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM evento WHERE nome=? AND responsavel=?");
                st.setString(1, nome);
                st.setString(2, responsavel);
                ResultSet r = st.executeQuery();
                if(r.next()) {
                    Evento evento = new Evento();
                    evento.setId(r.getInt("id"));
                    evento.setResponsavel(r.getString("responsavel"));
                    evento.setNome(r.getString("nome"));
                    evento.setData(r.getString("data"));
                    evento.setHora(r.getString("hora"));
                    evento.setDescricao(r.getString("descricao"));
                    evento.setLocal(r.getString("local"));
                    st.close();
                    con.close();
                    return evento;
                }
                st.close();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Evento read(int id) throws SQLException, ClassNotFoundException {

        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM evento WHERE id=?");
                st.setInt(1, id);
                ResultSet r = st.executeQuery();
                if(r.next()) {
                    Evento evento = new Evento();
                    evento.setId(r.getInt("id"));
                    evento.setResponsavel(r.getString("responsavel"));
                    evento.setNome(r.getString("nome"));
                    evento.setData(r.getString("data"));
                    evento.setHora(r.getString("hora"));
                    evento.setDescricao(r.getString("descricao"));
                    evento.setLocal(r.getString("local"));
                    st.close();
                    con.close();
                    return evento;
                }
                st.close();
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
                        "DELETE FROM evento WHERE id = ?");
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
    
    public boolean update(Evento eventoNovo, int id) throws ClassNotFoundException, SQLException {
        Connection con = ConFactory.getConnection();
        PreparedStatement st = con.prepareStatement(
                "UPDATE evento SET (nome, responsavel, data, hora, descricao)"
                + " = (?,?,?,?,?) WHERE id = id");
        st.setString(1, eventoNovo.getNome());
        st.setString(2, eventoNovo.getResponsavel());
        st.setString(3, eventoNovo.getData());
        st.setString(4, eventoNovo.getHora());
        st.setString(5, eventoNovo.getDescricao());

        boolean retorno = st.executeUpdate() > 0;
        con.close();
        return retorno;
    }
    public ArrayList<Evento> readEventosGerais(String nome) {

        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM evento WHERE nome ilike '"+nome+"%'");
                ResultSet r = st.executeQuery();
                ArrayList<Evento> resultado = new ArrayList<>();
                while (r.next()) {
                    Evento evento = new Evento();
                    evento.setId(r.getInt("id"));
                    evento.setResponsavel(r.getString("responsavel"));
                    evento.setNome(r.getString("nome"));
                    evento.setData(r.getString("data"));
                    evento.setHora(r.getString("hora"));
                    evento.setDescricao(r.getString("descricao"));
                    evento.setLocal(r.getString("local"));
                    resultado.add(evento);
                }
                con.close();
                st.close();
                return resultado;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Evento> readMeusEventos(String user) {

        try {
            try (Connection con = ConFactory.getConnection()) {
                PreparedStatement st = con.prepareStatement("SELECT * FROM evento WHERE responsavel = '"+user+"'");
                ResultSet r = st.executeQuery();
                ArrayList<Evento> resultado = new ArrayList<>();
                while (r.next()) {
                    Evento evento = new Evento();
                    evento.setId(r.getInt("id"));
                    evento.setResponsavel(r.getString("responsavel"));
                    evento.setNome(r.getString("nome"));
                    evento.setData(r.getString("data"));
                    evento.setHora(r.getString("hora"));
                    evento.setDescricao(r.getString("descricao"));
                    evento.setLocal(r.getString("local"));
                    resultado.add(evento);
                }
                con.close();
                st.close();
                return resultado;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
