package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Turma;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.DisciplinaRepository;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.TurmaRepository;

@Service
public class TurmaService {
    private final TurmaRepository turmaRepository;
    private final DisciplinaRepository disciplinaRepository;
    public TurmaService(TurmaRepository turmaRepository, DisciplinaRepository disciplinaRepository) {
        this.turmaRepository = turmaRepository;
        this.disciplinaRepository = disciplinaRepository;

    }

    public void cadastrarTurma(NovaTurma novaTurma) {


        Turma turma = new Turma();
        Disciplina disciplina = disciplinaRepository.getDisciplina(novaTurma.getDisciplinaId());
        
        turma.setDisciplina(disciplina);
        turma.setSemestre(novaTurma.getSemestre());
        turma.setAno(novaTurma.getAno());
        turma.setSala(novaTurma.getSala());
        turma.setVagas(novaTurma.getVagas());
        turma.setVagasDisponiveis(novaTurma.getVagas());
        turma.setPeriodos(novaTurma.getPeriodos());
        turma.setMatriculas(new ArrayList<>());

        turmaRepository.save(turma);
    }

    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }
}
