package br.edu.ifrs.riogrande.tads.ppa.ligaa.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Turma;

@Repository
public class TurmaRepository implements IRepository<Turma>{
    private Map<UUID, Turma> mapa = new HashMap<>();


    public Optional<Turma> findById(UUID id) {
        return Optional.ofNullable(mapa.get(id));
    }
    
    @Override
    public Turma save(Turma t) {
        if (t.getId() == null) { // não é persistente
            t.setId(UUID.randomUUID());
        }

        mapa.put(t.getId(), t);

        return t;
    }

    @Override
    public boolean delete(Turma e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Turma> findAll() {
        return new ArrayList<Turma>(mapa.values());
    }

    public boolean hasMatriculaForAluno(UUID turmaId, UUID alunoId) {
        Turma turma = mapa.get(turmaId);
        if (turma == null) {
            return false; // Se a turma não existir, considere que não há matrícula
        }
        return turma.getMatriculas().stream()
            .anyMatch(matricula -> matricula.getAluno().getId().equals(alunoId));
    }
    

    
}
