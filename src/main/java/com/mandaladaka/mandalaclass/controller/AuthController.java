package com.mandaladaka.mandalaclass.controller;

import com.mandaladaka.mandalaclass.model.Professor;
import com.mandaladaka.mandalaclass.repository.ProfessorRepository;
import com.mandaladaka.mandalaclass.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor

public class AuthController {

    private final ProfessorRepository repository;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        Optional<Professor> professor = repository.findByEmail(request.email());

        if (professor.isPresent() && professor.get().getSenha().equals(request.senha())) {
            String token = tokenService.gerarToken(professor.get());
            return ResponseEntity.ok(token);
        }

        return ResponseEntity.status(401).body("Email ou senha inválidos");
    }

    public record LoginRequest(String email, String senha) {}
}