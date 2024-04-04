package com.atividade.aividadefixacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_instrutor")
public class Instrutor {

    @Id
    private Long id;
    private String nome;
    private String areaDeEspecializacao;

    @OneToMany
    private List<Curso> cursos;
}
