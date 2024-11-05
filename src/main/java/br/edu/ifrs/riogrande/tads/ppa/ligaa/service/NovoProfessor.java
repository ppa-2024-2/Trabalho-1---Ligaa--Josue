package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;


// Data Transfer Object
// JavaBean

public class NovoProfessor {
    // CoC: Convention over Configuration
    // Convenção antes de Configuração

    private String nome;
    private String ciap;
    private String formacao;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCiap() {
        return ciap;
    }

    public void setCiap(String ciap) {
        this.ciap = ciap;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "NovoProfessor [nome=" + nome + ", ciap=" + ciap + ", formacao=" + formacao + "]";
    }

    
}
