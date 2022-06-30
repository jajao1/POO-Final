package com.senai.ApresentacaoSenai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.ApresentacaoSenai.Models.Contatos;


@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long> {
    
}
