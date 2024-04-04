package com.atividade.aividadefixacao.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "tb_curso")
public class Curso {

    @Id
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeCriacao;

    @OneToOne
    private Instrutor instrutor;

    @OneToMany
    private List<Aula> aulas;

    @OneToMany()
    private List<Inscricao> inscricoes;

}
