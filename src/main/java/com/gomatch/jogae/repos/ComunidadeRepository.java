package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.Comunidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunidadeRepository extends JpaRepository<Comunidade, Integer> {
}
