package br.edu.ifrs.riogrande.tads.ppa.ligaa.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;

@Repository
public class MatriculaRepository implements IRepository<Matricula>{

private Map<UUID, Matricula> mapa = new HashMap<>();

    @Override
    public Matricula save(Matricula mat) {
        if (mat.getId() == null) { // não é persistente
            mat.setId(UUID.randomUUID());
        }

        mapa.put(mat.getId(), mat);

        return mat;
    }

    @Override
    public boolean delete(Matricula mat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Matricula> findAll() {
        return new ArrayList<Matricula>(mapa.values());
    }   
    
}
