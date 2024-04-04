package com.atividade.aividadefixacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_certificado")
public class Certificado {
    @Id
    private long id;
    private String nomeDoCurso;
    private LocalDateTime dataDeEmissao;

    @OneToOne
    private Usuario usuario;

}
