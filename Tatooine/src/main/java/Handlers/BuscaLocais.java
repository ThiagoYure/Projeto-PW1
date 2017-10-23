/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import com.mycompany.tatooine.modelo.LocalDao;
import com.mycompany.tatooine.modelo.UsuarioDao;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ThigoYure
 */
public class BuscaLocais extends SimpleTagSupport{
    private String nome;
    @Override
    public void doTag(){
       LocalDao dao = new LocalDao(); 
       getJspContext().setAttribute("ListaLocais", dao.readLocalGerais(nome));     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
