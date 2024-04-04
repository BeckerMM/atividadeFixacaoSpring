package com.atividade.aividadefixacao.repository;

import com.atividade.aividadefixacao.model.Inscricao;
import com.atividade.aividadefixacao.model.InscricaoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, InscricaoId> {
}
