package com.atividade.aividadefixacao.model.dto;

import com.atividade.aividadefixacao.model.Aula;
import com.atividade.aividadefixacao.model.Inscricao;
import com.atividade.aividadefixacao.model.Instrutor;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.List;

public class CursoDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeCriacao;

    private Instrutor instrutor;

    private List<Aula> aulas;

    private List<Inscricao> inscricoes;
}
