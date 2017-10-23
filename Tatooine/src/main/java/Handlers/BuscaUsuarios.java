
package Handlers;

import com.mycompany.tatooine.modelo.UsuarioDao;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class BuscaUsuarios extends SimpleTagSupport {
    private String nome;
    
    @Override
    public void doTag(){
       UsuarioDao dao = new UsuarioDao(); 
       getJspContext().setAttribute("ListaUsuarios", dao.readUsuariosGerais(nome));     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
