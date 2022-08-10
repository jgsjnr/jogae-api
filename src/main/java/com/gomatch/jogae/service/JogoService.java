package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.Jogo;
import com.gomatch.jogae.repos.JogadorRepository;
import com.gomatch.jogae.repos.JogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {
    final JogoRepository jogoRepository;
    public JogoService(JogoRepository jogoRepository){
        this.jogoRepository = jogoRepository;
    }

    public Object save(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public List<Jogo> findAll() {
        return jogoRepository.findAll();
    }

    public Optional<Jogo> findById(Integer idJogo) {
        return jogoRepository.findById(idJogo);
    }

    public void delete(Jogo jogo) {
        jogoRepository.delete(jogo);
    }
}
