package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Professor;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovoProfessor;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.ProfessorService;

@RestController
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    // rotear
    @PostMapping(path = "/api/v1/professores", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novoProfessor(@RequestBody NovoProfessor professor) {

        System.out.println(professor);
        professorService.cadastrarProfessor(professor); // não deve ser IDEMPOTENTE
    }

    @GetMapping(path = "/api/v1/professores")
    public ResponseEntity<List<Professor>> buscaTodos() {
        return ResponseEntity.ok(professorService.findAll()); // outras opções: 404 ou 204
    }
}
