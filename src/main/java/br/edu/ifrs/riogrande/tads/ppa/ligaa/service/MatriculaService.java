package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Aluno;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Turma;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.AlunoRepository;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.MatriculaRepository;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.TurmaRepository;

@Service
public class MatriculaService {
    // dependência
    private final MatriculaRepository matriculaRepository;
    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository, AlunoRepository alunoRepository,
            TurmaRepository turmaRepository) {
        this.matriculaRepository = matriculaRepository;
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
    }

    public void cadastrarMatricula(NovaMatricula novaMatricula) {

        Aluno aluno = alunoRepository
                .findById(novaMatricula.getAlunoId())
                .orElseThrow(() -> new IllegalStateException("Aluno não encontrado"));

        Turma turma = turmaRepository
                .findById(novaMatricula.getTurmaId())
                .orElseThrow(() -> new IllegalStateException("Turma não encontrada"));

        // Verifica se o aluno já está matriculado na turma
        boolean jaMatriculado = turma.getMatriculas().stream()
                .anyMatch(matricula -> matricula.getAluno().getId().equals(aluno.getId()));

        if (jaMatriculado) {
            throw new IllegalArgumentException("Aluno já está matriculado nesta turma.");
        }
        
        Matricula matricula = new Matricula();

        matricula.setAluno(aluno);
        matricula.setAprovado(novaMatricula.isAprovado());

        turma.addVaga();

        turma.getMatriculas().add(matricula);
        matriculaRepository.save(matricula);
    }

    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }
}
