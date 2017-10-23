/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import com.mycompany.tatooine.modelo.UsuarioDao;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ThigoYure
 */
public class BuscaUsuario extends SimpleTagSupport{
    private String email;
    
    @Override
    public void doTag(){
       UsuarioDao dao = new UsuarioDao(); 
       getJspContext().setAttribute("Usuario", dao.read(email));     
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
