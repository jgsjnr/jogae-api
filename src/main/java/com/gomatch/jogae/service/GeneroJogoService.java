package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.GeneroJogoRepository;
import org.springframework.stereotype.Service;

@Service
public class GeneroJogoService {
    final GeneroJogoRepository generoJogoRepository;
    public GeneroJogoService(GeneroJogoRepository generoJogoRepository){
        this.generoJogoRepository = generoJogoRepository;
    }
}
