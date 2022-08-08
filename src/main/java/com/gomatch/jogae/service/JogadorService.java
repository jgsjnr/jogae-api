package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.repos.JogadorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Transactional
    public List<Jogador> findAll(){return jogadorRepository.findAll();}

    public boolean existsByIdNick(Integer idNick) {return  jogadorRepository.existsById(idNick);}
}
