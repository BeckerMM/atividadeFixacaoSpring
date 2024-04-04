package com.atividade.aividadefixacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.image.CropImageFilter;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_aula")
public class Aula {

    @Id
    private Long id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataDePublicacao;

    @ManyToOne
    private Curso curso;
}
