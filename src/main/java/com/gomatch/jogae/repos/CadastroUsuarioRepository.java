package com.gomatch.jogae.repos;

import com.gomatch.jogae.domain.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Integer> {
}
