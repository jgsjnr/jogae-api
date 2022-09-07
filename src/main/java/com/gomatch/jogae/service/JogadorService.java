package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.repos.JogadorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {
    final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }
    @Transactional
    public Jogador save(Jogador jogador){
        return jogadorRepository.save(jogador);
    }

    public List<Jogador> findAll(){return jogadorRepository.findAll();}

    public boolean existsByIdNick(String nmNick) {return  jogadorRepository.existsById(nmNick);}

    public Optional<Jogador> findById(String nmNick) {
        return jogadorRepository.findById(nmNick);
    }
    @Transactional
    public void delete(Jogador jogador) {
        jogadorRepository.delete(jogador);
    }
}
