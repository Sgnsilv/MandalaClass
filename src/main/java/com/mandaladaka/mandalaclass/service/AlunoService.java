package com.mandaladaka.mandalaclass.service;

import com.mandaladaka.mandalaclass.model.Aluno;
import com.mandaladaka.mandalaclass.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

    public Aluno cadastrar(Aluno aluno) {
        if (repository.existsByMatricula(aluno.getMatricula())) {
            throw new RuntimeException("Já existe um aluno com esta matrícula!");
        }
        return repository.save(aluno);
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }
    
    public Aluno buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}