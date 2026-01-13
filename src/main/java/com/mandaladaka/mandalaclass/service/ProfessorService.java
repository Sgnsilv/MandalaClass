package com.mandaladaka.mandalaclass.service;

import com.mandaladaka.mandalaclass.model.Professor;
import com.mandaladaka.mandalaclass.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProfessorService {
    private final ProfessorRepository repository;

    public Professor criarProfessor(Professor professor) {
        if (repository.findByEmail(professor.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return repository.save(professor);
    }
    
    public List<Professor> listaProfessores() {
        return repository.findAll();
    }

    public Professor buscaPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));
    }
}
