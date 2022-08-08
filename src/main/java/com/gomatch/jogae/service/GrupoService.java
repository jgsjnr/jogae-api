package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.GrupoRepository;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {
    final GrupoRepository grupoRepository;
    public GrupoService(GrupoRepository grupoRepository){
        this.grupoRepository = grupoRepository;
    }
}
