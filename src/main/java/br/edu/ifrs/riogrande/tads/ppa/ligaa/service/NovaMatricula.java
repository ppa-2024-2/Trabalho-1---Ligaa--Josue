package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;
import java.util.UUID;

public class NovaMatricula {
    private UUID turmaId;
    private UUID alunoId;
    private boolean aprovado;
    public UUID getTurmaId() {
        return turmaId;
    }
    public void setTurmaId(UUID turmaId) {
        this.turmaId = turmaId;
    }
    public UUID getAlunoId() {
        return alunoId;
    }
    public void setAlunoId(UUID alunoId) {
        this.alunoId = alunoId;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    @Override
    public String toString() {
        return "NovaMatricula [turmaId=" + turmaId + ", alunoId=" + alunoId + ", aprovado=" + aprovado + "]";
    }
    
    
    
}
