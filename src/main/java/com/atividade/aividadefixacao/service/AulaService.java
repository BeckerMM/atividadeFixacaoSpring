package com.atividade.aividadefixacao.service;

import com.atividade.aividadefixacao.model.Aula;
import com.atividade.aividadefixacao.model.Certificado;
import com.atividade.aividadefixacao.model.Usuario;
import com.atividade.aividadefixacao.model.dto.AulaDTO;
import com.atividade.aividadefixacao.model.dto.CertificadoDTO;
import com.atividade.aividadefixacao.model.dto.UsuarioDTO;
import com.atividade.aividadefixacao.repository.AulaRepository;
import com.atividade.aividadefixacao.repository.CertificadoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class AulaService {
    private AulaRepository repository;
    private ModelMapper modelMapper;

    public Aula save(AulaDTO dto) {
        Aula aula = new Aula();
        modelMapper.map(dto, aula);
        aula.setDataDePublicacao(LocalDateTime.now());
        return repository.save(aula);
    }

    public Aula put(Long id, AulaDTO dto) {
        Aula aula = repository.findById(id).get();
        modelMapper.map(dto, aula);
        return repository.save(aula);
    }


}
