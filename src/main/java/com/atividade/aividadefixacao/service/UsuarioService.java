package com.atividade.aividadefixacao.service;

import com.atividade.aividadefixacao.model.Usuario;
import com.atividade.aividadefixacao.model.dto.UsuarioDTO;
import com.atividade.aividadefixacao.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Data
@AllArgsConstructor

public class UsuarioService {

    private UsuarioRepository repository;
    private ModelMapper modelMapper;

    public Usuario save(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        modelMapper.map(usuarioDTO, usuario);
        usuario.setDataDeCadastro(LocalDateTime.now());
        return repository.save(usuario);
    }

    public Usuario put(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = repository.findById(id).get();
        modelMapper.map(usuarioDTO, usuario);
        return repository.save(usuario);
    }

}
