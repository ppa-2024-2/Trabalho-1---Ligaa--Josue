package br.edu.ifrs.riogrande.tads.ppa.ligaa.entity;

import java.util.ArrayList;
import java.util.UUID;

public class Turma {
    private UUID id;
    private Disciplina disciplina;
    private String semestre;
    private String ano;
    private String sala;
    private int vagas;
    private int vagasDisponiveis;
    private String periodos;
    private ArrayList<Matricula> matriculas;

    // dia turno

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return "Turma [id=" + id + ", disciplina=" + disciplina + ", semestre=" + semestre + ", ano=" + ano + ", sala="
                + sala + ", vagas=" + vagas + ", vagasDisponiveis=" + vagasDisponiveis + ", periodos=" + periodos
                + ", matriculas=" + matriculas + "]";
    }
    public String getPeriodos() {
        return periodos;
    }
    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }
    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }
    public void addVaga() {
        this.vagasDisponiveis = this.vagasDisponiveis - 1;
        System.out.println(this.vagasDisponiveis);
        if(this.vagasDisponiveis < 0) {
            this.vagasDisponiveis = 0;
        }
    }

    public void removeVaga() {
        this.vagasDisponiveis++;
        if(this.vagasDisponiveis > this.vagas) {
            this.vagasDisponiveis = this.vagas;
        }
    }

    
}
