package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.GeneroJogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroJogoRepository extends JpaRepository<GeneroJogo, Integer> {
}
