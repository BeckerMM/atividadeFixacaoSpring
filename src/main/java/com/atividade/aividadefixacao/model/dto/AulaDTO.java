package com.atividade.aividadefixacao.model.dto;

import com.atividade.aividadefixacao.model.Curso;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class AulaDTO {
    private Long id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataDePublicacao;
    private Curso curso;
}
