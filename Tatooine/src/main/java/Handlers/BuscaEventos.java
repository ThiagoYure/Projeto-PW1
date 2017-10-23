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
public class BuscaEventos extends SimpleTagSupport{
   private String nome;
   
   @Override
    public void doTag(){
       EventoDao dao = new EventoDao(); 
       getJspContext().setAttribute("ListaEventos", dao.readEventosGerais(nome));     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
