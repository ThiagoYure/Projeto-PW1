/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import com.mycompany.tatooine.modelo.EventoDao;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ThigoYure
 */
public class BuscaMeusEventos extends SimpleTagSupport{
    private String user;
    
    @Override
    public void doTag(){
       EventoDao dao = new EventoDao(); 
       getJspContext().setAttribute("ListaEventos", dao.readMeusEventos(user));     
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
