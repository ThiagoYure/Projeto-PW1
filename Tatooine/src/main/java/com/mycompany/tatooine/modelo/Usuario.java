/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ThigoYure
 */
public class Usuario implements Serializable{
    private String email;
    private String senha;
    private String nome;
    private String cidade;
    private String nascimento;
    private String profissao;
    private String fotoPerfil;
    private String sexo;

    public Usuario() {
    }

    public Usuario(String email, String senha, String nome, String cidade, String nascimento, String profissao, String fotoPerfil, String sexo) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.cidade = cidade;
        this.nascimento = nascimento;
        this.profissao = profissao;
        this.fotoPerfil = fotoPerfil;
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.email);
        hash = 61 * hash + Objects.hashCode(this.senha);
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.cidade);
        hash = 61 * hash + Objects.hashCode(this.nascimento);
        hash = 61 * hash + Objects.hashCode(this.profissao);
        hash = 61 * hash + Objects.hashCode(this.fotoPerfil);
        hash = 61 * hash + Objects.hashCode(this.sexo);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.profissao, other.profissao)) {
            return false;
        }
        if (!Objects.equals(this.fotoPerfil, other.fotoPerfil)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", senha=" + senha + ", nome=" + nome + ", cidade=" + cidade + ", nascimento=" + nascimento + ", profissao=" + profissao + ", fotoPerfil=" + fotoPerfil + ", sexo=" + sexo + '}';
    }
    
    
}
