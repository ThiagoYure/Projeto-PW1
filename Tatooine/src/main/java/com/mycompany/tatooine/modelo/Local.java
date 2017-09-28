/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.modelo;

import java.util.Objects;

/**
 *
 * @author Ricarte
 */
public class Local {
    private String nome;
    private String inseridor;
    private String tipo;
    private String endereco;
    private String descricao;
    private String foto;
    
    public Local(){
    }

    public Local(String nome, String inseridor, String tipo, String endereco, String descricao, String foto) {
        this.nome = nome;
        this.inseridor = inseridor;
        this.tipo = tipo;
        this.endereco = endereco;
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getInseridor() {
        return inseridor;
    }

    public void setInseridor(String inseridor) {
        this.inseridor = inseridor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Local{" + "inseridor=" + inseridor + ", nome=" + nome + ", tipo=" + tipo + ", endereco=" + endereco + ", descricao=" + descricao + ", foto=" + foto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.inseridor);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.endereco);
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.foto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Local other = (Local) obj;
        if (!Objects.equals(this.inseridor, other.inseridor)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        return true;
    }
    
    
    
}
