package com.atividade.aividadefixacao.model.dto;

import com.atividade.aividadefixacao.model.Usuario;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

public class CertificadoDTO {

    private long id;
    private String nomeDoCurso;
    private LocalDateTime dataDeEmissao;

    private Usuario usuario;
}
