package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.StatusCadastro;
import com.gomatch.jogae.repos.StatusCadastroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusCadastroService {
    final StatusCadastroRepository statusCadastroRepository;
    public StatusCadastroService(StatusCadastroRepository statusCadastroRepository){
        this.statusCadastroRepository = statusCadastroRepository;
    }

    public Object save(StatusCadastro statusCadastro) {
        return statusCadastroRepository.save(statusCadastro);
    }

    public List<StatusCadastro> findAll() {
        return statusCadastroRepository.findAll();
    }

    public Optional<StatusCadastro> findById(Integer idStatusCadastro) {
        return statusCadastroRepository.findById(idStatusCadastro);
    }

    public void delete(StatusCadastro statusCadastro) {
        statusCadastroRepository.delete(statusCadastro);
    }
}
