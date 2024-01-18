package com.victor.HelpDesk.domain;

import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa{
    private static final long serialVersionID = 1L;
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico(){
        super();
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
