package br.edu.ifrs.riogrande.tads.ppa.ligaa.entity;

import java.util.UUID;

public class Matricula {
    private UUID id;
    private Aluno aluno;
    private boolean aprovado;
    private boolean desativada;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    public boolean getDesativada() {
        return desativada;
    }
    public void setAtiva(boolean desativada) {
        this.desativada = desativada;
    }
    @Override
    public String toString() {
        return "Matricula [id=" + id  + ", aluno=" + aluno + ", aprovado=" + aprovado + ", desativada="
                + desativada + "]";
    }

    
}
