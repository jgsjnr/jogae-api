package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.GeneroJogo;
import com.gomatch.jogae.repos.GeneroJogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroJogoService {
    final GeneroJogoRepository generoJogoRepository;
    public GeneroJogoService(GeneroJogoRepository generoJogoRepository){
        this.generoJogoRepository = generoJogoRepository;
    }

    public Object save(GeneroJogo generoJogo) {
        return generoJogoRepository.save(generoJogo);
    }

    public List<GeneroJogo> findAll() {
        return generoJogoRepository.findAll();
    }

    public Optional<GeneroJogo> findById(Integer idGeneroJogo) {
        return generoJogoRepository.findById(idGeneroJogo);
    }

    public void delete(GeneroJogo generoJogo) {
        generoJogoRepository.delete(generoJogo);
    }
}
