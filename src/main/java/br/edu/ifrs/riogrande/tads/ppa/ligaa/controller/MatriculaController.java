package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.MatriculaService;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovaMatricula;

@Controller
public class MatriculaController {
    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    // rotear

    @PostMapping(path = "/api/v1/matriculas", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novaMatricula(@RequestBody NovaMatricula matricula) {

        System.out.println(matricula);
        matriculaService.cadastrarMatricula(matricula); // não deve ser IDEMPOTENTE
    }

    @GetMapping(path = "/api/v1/matriculas")
    public ResponseEntity<List<Matricula>> buscaTodos() {
        return ResponseEntity.ok(matriculaService.findAll()); // outras opções: 404 ou 204
    }
}
