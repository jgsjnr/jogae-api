package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.StatusCadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusCadastroRepository extends JpaRepository<StatusCadastro, Integer> {
}
