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
@Table(name = "tb_inscricao")
public class Inscricao {
    @EmbeddedId
    private InscricaoId inscricaoId ;

    private LocalDateTime dataDeInscricao;

}
