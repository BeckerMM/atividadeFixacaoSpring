package com.atividade.aividadefixacao.service;

import com.atividade.aividadefixacao.model.Certificado;
import com.atividade.aividadefixacao.model.Curso;
import com.atividade.aividadefixacao.model.dto.CertificadoDTO;
import com.atividade.aividadefixacao.model.dto.CursoDTO;
import com.atividade.aividadefixacao.repository.CertificadoRepository;
import com.atividade.aividadefixacao.repository.CursoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Data
@AllArgsConstructor
public class CertificadoService {

    private CertificadoRepository repository;
    private ModelMapper modelMapper;

    public Certificado save(CertificadoDTO dto) {
        Certificado certificado = new Certificado();
        modelMapper.map(dto, certificado);
        certificado.setDataDeEmissao(LocalDateTime.now());
        return repository.save(certificado);
    }

    public Certificado put(Long id, CertificadoDTO certificadoDTO) {
        Certificado certificado = repository.findById(id).get();
        modelMapper.map(certificadoDTO, certificado);
        return repository.save(certificado);
    }
}
