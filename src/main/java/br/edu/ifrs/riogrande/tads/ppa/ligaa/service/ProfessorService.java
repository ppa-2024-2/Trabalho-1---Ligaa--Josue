package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Professor;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.ProfessorRepository;

@Service
public class ProfessorService {
    
    // dependência
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public void cadastrarProfessor(NovoProfessor novoProfessor) {
        if(professorRepository.ciapExists(novoProfessor.getCiap())) {
            throw new IllegalStateException("CIAP já existe: " + novoProfessor.getCiap());
        }

        Professor professor = new Professor();

        professor.setCiap(novoProfessor.getCiap());
        professor.setNome(novoProfessor.getNome());
        professor.setFormacao(novoProfessor.getFormacao());

        professorRepository.save(professor);
    }

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }
}
