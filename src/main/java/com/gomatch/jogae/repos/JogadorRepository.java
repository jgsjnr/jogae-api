package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
    boolean existsByIdNick(Integer idNick);
}
