package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
    // dependência
    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public void cadastrarDisciplina(NovaDisciplina novaDisciplina) {

        // ONDE FICAM AS REGRAS DE DOMÍNIO
        Disciplina disciplina = new Disciplina();

        disciplina.setNome(novaDisciplina.getNome());
        disciplina.setCargaHoraria(novaDisciplina.getCargaHoraria());
        disciplina.setEmenta(novaDisciplina.getEmenta());
        disciplina.setPrerequesitos(novaDisciplina.getPrerequesitos());
        disciplina.setAulasSemanais(novaDisciplina.getAulasSemanais());
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }
}
