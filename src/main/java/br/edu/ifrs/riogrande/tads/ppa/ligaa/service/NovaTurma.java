package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.ArrayList;
import java.util.UUID;

public class NovaTurma {
    private UUID disciplinaId;
    private String semestre;
    private String ano;
    private String sala;
    private int vagas;
    private String periodos;
    private ArrayList<String> matriculas;
    

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
    @Override
    public String toString() {
        return "NovaTurma [disciplinaId=" + disciplinaId + ", semestre=" + semestre + ", ano=" + ano + ", sala=" + sala
                + ", vagas=" + vagas + ", periodos=" + periodos + ", matriculas=" + matriculas + "]";
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
    public String getPeriodos() {
        return periodos;
    }
    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }
    public ArrayList<String> getMatriculas() {
        return matriculas;
    }
    public void setMatriculas(ArrayList<String> matriculas) {
        this.matriculas = matriculas;
    }
    public UUID getDisciplinaId() {
        return disciplinaId;
    }
    public void setDisciplinaId(UUID disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    
}
