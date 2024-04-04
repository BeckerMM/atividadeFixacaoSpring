package com.atividade.aividadefixacao.model.dto;

import com.atividade.aividadefixacao.model.Certificado;
import com.atividade.aividadefixacao.model.Curso;
import com.atividade.aividadefixacao.model.Inscricao;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String senha;
    private LocalDateTime dataDeCadastro;
    private List<Curso> cursos;

    private List<Certificado> certificados;

    private List<Inscricao> inscricoes;
}
