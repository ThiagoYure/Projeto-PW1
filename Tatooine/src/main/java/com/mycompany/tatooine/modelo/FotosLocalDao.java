/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.modelo;

import com.mycompany.tatooine.factory.ConFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThigoYure
 */
public class FotosLocalDao {

    public FotosLocalDao() {
    }
    public boolean create(int id,String url) throws SQLException, ClassNotFoundException {
        try {
            try (Connection con = ConFactory.getConnection()) {
                boolean retorno;
                try (PreparedStatement st = con.prepareStatement("INSERT INTO fotos (idlocal,url)"
                        + "VALUES(?,?)")) {
                    st.setInt(1, id);
                    st.setString(2, url);
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
}
