package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.FuncaoRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncaoService{
    final FuncaoRepository funcaoRepository;
    public FuncaoService(FuncaoRepository funcaoRepository){
        this.funcaoRepository = funcaoRepository;
    }
}
