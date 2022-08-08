package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.StatusCadastroRepository;
import org.springframework.stereotype.Service;

@Service
public class StatusCadastroService {
    final StatusCadastroRepository statusCadastroRepository;
    public StatusCadastroService(StatusCadastroRepository statusCadastroRepository){
        this.statusCadastroRepository = statusCadastroRepository;
    }
}
