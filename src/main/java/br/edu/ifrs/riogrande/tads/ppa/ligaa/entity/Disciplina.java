package br.edu.ifrs.riogrande.tads.ppa.ligaa.entity;

import java.util.ArrayList;
import java.util.UUID;

public class Disciplina {
    private UUID id;
    private String nome;
    private String cargaHoraria;
    private String ementa;
    private ArrayList<String> prerequesitos;
    private int aulasSemanais;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public ArrayList<String> getPrerequesitos() {
        return prerequesitos;
    }
    public void setPrerequesitos(ArrayList<String> prerequesitos) {
        this.prerequesitos = prerequesitos;
    }
    public int getAulasSemanais() {
        return aulasSemanais;
    }
    public void setAulasSemanais(int aulasSemanais) {
        this.aulasSemanais = aulasSemanais;
    }
    @Override
    public String toString() {
        return "Disciplina [id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", ementa=" + ementa
                + ", prerequesitos=" + prerequesitos + ", aulasSemanais=" + aulasSemanais + "]";
    }

}
