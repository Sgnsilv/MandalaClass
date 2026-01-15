package com.mandaladaka.mandalaclass.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "professores")

public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @com.fasterxml.jackson.annotation.JsonProperty(access = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY)
    private String senha;
    
    @ManyToMany(mappedBy = "professores")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private java.util.List<Turma> turmas = new java.util.ArrayList<>();
}