/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import com.mycompany.tatooine.modelo.LocalDao;
import com.mycompany.tatooine.modelo.UsuarioDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ThigoYure
 */
public class BuscaLocal extends SimpleTagSupport{
    private int id;

    @Override
    public void doTag(){
       LocalDao dao = new LocalDao(); 
        try {     
            getJspContext().setAttribute("Local", dao.read(id));
        } catch (SQLException ex) {
            Logger.getLogger(BuscaLocal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
