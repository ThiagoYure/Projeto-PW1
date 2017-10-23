/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import com.mycompany.tatooine.modelo.EventoDao;
import com.mycompany.tatooine.modelo.LocalDao;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ThigoYure
 */
public class BuscaMeusLocais extends SimpleTagSupport {
    private String user;
    
    @Override
    public void doTag(){
       LocalDao dao = new LocalDao(); 
       getJspContext().setAttribute("ListaLocais", dao.readMeusLocais(user));     
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
