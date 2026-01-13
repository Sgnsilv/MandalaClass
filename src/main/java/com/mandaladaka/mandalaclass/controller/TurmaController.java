package com.mandaladaka.mandalaclass.controller;

import com.mandaladaka.mandalaclass.model.Turma;
import com.mandaladaka.mandalaclass.service.TurmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
@RequiredArgsConstructor
public class TurmaController {

    private final TurmaService service;

    @PostMapping
    public ResponseEntity<Turma> criar(@RequestBody Turma turma) {
        return ResponseEntity.status(201).body(service.criarTurma(turma));
    }

    @GetMapping
    public ResponseEntity<List<Turma>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @PostMapping("/{turmaId}/professores/{professorId}")
    public ResponseEntity<Turma> adicionarProfessor(
            @PathVariable Long turmaId, 
            @PathVariable Long professorId) {
        
        return ResponseEntity.ok(service.adicionarProfessor(turmaId, professorId));
    }
}