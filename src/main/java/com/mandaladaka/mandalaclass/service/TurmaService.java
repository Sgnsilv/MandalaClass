package com.mandaladaka.mandalaclass.service;

import com.mandaladaka.mandalaclass.model.Professor;
import com.mandaladaka.mandalaclass.model.Turma;
import com.mandaladaka.mandalaclass.repository.ProfessorRepository;
import com.mandaladaka.mandalaclass.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TurmaService {

    private final TurmaRepository turmaRepository;
    private final ProfessorRepository professorRepository;

    public Turma criarTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    public List<Turma> listarTodas() {
        return turmaRepository.findAll();
    }

    public Turma adicionarProfessor(Long turmaId, Long professorId) {
        Turma turma = turmaRepository.findById(turmaId)
                .orElseThrow(() -> new RuntimeException("Turma não encontrada"));
        
        Professor professor = professorRepository.findById(professorId)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        turma.getProfessores().add(professor);
        
        return turmaRepository.save(turma);
    }
}