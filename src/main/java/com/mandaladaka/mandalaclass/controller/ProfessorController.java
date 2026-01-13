package com.mandaladaka.mandalaclass.controller;

import com.mandaladaka.mandalaclass.model.Professor;
import com.mandaladaka.mandalaclass.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/professores")
@RequiredArgsConstructor

public class ProfessorController {
    private final ProfessorService service;

    @PostMapping
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        Professor novoProfessor = service.criarProfessor(professor);
        return ResponseEntity.status(201).body(novoProfessor);
    }

    @GetMapping
    public ResponseEntity<List<Professor>> listar() {
        return ResponseEntity.ok(service.listaProfessores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> buscaPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscaPorId(id));
    }

}
