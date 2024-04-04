package com.atividade.aividadefixacao.service;

import com.atividade.aividadefixacao.model.Curso;
import com.atividade.aividadefixacao.model.Usuario;
import com.atividade.aividadefixacao.model.dto.CursoDTO;
import com.atividade.aividadefixacao.model.dto.UsuarioDTO;
import com.atividade.aividadefixacao.repository.CursoRepository;
import com.atividade.aividadefixacao.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Data
@AllArgsConstructor
public class CursoService {


    private CursoRepository repository;
    private ModelMapper modelMapper;

    public Curso save(CursoDTO dto) {
        Curso curso = new Curso();
        modelMapper.map(dto, curso);
        curso.setDataDeCriacao(LocalDateTime.now());
        return repository.save(curso);
    }

    public Curso put(Long id, CursoDTO cursoDTO) {
        Curso curso = repository.findById(id).get();
        modelMapper.map(cursoDTO, curso);
        return repository.save(curso);
    }
}
