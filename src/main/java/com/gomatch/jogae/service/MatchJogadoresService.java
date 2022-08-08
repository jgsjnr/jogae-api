package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.MatchJogadoresRepository;
import org.springframework.stereotype.Service;

@Service
public class MatchJogadoresService {
    final MatchJogadoresRepository matchJogadoresRepository;
    public MatchJogadoresService(MatchJogadoresRepository matchJogadoresRepository){
        this.matchJogadoresRepository = matchJogadoresRepository;
    }
}
