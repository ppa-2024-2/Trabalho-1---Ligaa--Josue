package br.edu.ifrs.riogrande.tads.ppa.ligaa.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;

@Repository
public class DisciplinaRepository implements IRepository<Disciplina>{


    private Map<UUID, Disciplina> mapa = new HashMap<>();

    @Override
    public Disciplina save(Disciplina d) {
        
        if (d.getId() == null) { // não é persistente
            d.setId(UUID.randomUUID()); // atribuir um ID  
        }
        
        mapa.put(d.getId(), d);
        
        return d;
    }

    public Disciplina getDisciplina(UUID id) {
        return mapa.get(id);
    }

    @Override
    public List<Disciplina> findAll() {
        return new ArrayList<Disciplina>(mapa.values());
    }

    @Override
    public boolean delete(Disciplina e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
