package com.mandaladaka.mandalaclass.controller;

import com.mandaladaka.mandalaclass.model.Aluno;
import com.mandaladaka.mandalaclass.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @PostMapping
    public ResponseEntity<Aluno> cadastrar(@RequestBody Aluno aluno) {
        return ResponseEntity.status(201).body(service.cadastrar(aluno));
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }
}