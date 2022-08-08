package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.MatchJogadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchJogadoresRepository extends JpaRepository<MatchJogadores, Integer> {
}
