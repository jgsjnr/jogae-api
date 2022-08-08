package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.JogadorRepository;
import org.springframework.stereotype.Service;

@Service
public class JogoService {
    final JogadorRepository jogadorRepository;
    public JogoService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }
}
