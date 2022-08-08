package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Integer> {
}
