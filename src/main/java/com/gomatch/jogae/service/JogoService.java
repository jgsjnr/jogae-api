package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.Jogo;
import com.gomatch.jogae.repos.JogadorRepository;
import com.gomatch.jogae.repos.JogoRepository;
import org.springframework.stereotype.Service;

@Service
public class JogoService {
    final JogoRepository jogoRepository;
    public JogoService(JogoRepository jogoRepository){
        this.jogoRepository = jogoRepository;
    }

    public Object save(Jogo jogo) {
        return jogoRepository.save(jogo);
    }
}
