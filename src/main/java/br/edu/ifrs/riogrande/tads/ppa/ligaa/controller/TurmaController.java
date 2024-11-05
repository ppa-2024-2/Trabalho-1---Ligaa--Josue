package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Turma;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovaTurma;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.TurmaService;

@Controller
public class TurmaController {
    private final TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    // rotear
    @PostMapping(path = "/api/v1/turmas", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novaTurma(@RequestBody NovaTurma turma) {

        System.out.println(turma);
        turmaService.cadastrarTurma(turma); // não deve ser IDEMPOTENTE
    }

    @GetMapping(path = "/api/v1/turmas")
    public ResponseEntity<List<Turma>> buscaTodos() {
        return ResponseEntity.ok(turmaService.findAll()); // outras opções: 404 ou 204
    }
}
