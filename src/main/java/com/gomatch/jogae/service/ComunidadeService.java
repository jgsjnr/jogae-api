package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.ComunidadeRepository;
import org.springframework.stereotype.Service;

@Service
public class ComunidadeService {
    final ComunidadeRepository comunidadeRepository;
    public ComunidadeService(ComunidadeRepository comunidadeRepository){
        this.comunidadeRepository = comunidadeRepository;
    }
}
