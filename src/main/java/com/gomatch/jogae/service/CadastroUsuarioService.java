package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.CadastroUsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastroUsuarioService {
    final CadastroUsuarioRepository cadastroUsuarioRepository;
    public CadastroUsuarioService(CadastroUsuarioRepository cadastroUsuarioRepository){
        this.cadastroUsuarioRepository = cadastroUsuarioRepository;
    }
}
