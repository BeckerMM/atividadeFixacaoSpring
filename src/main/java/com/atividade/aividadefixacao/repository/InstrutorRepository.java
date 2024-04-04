package com.atividade.aividadefixacao.repository;

import com.atividade.aividadefixacao.model.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor,Long> {
}
