package com.gomatch.jogae.service;

import com.gomatch.jogae.domain.Funcao;
import com.gomatch.jogae.repos.FuncaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncaoService{
    final FuncaoRepository funcaoRepository;
    public FuncaoService(FuncaoRepository funcaoRepository){
        this.funcaoRepository = funcaoRepository;
    }

    public Object save(Funcao funcao) {
        return funcaoRepository.save(funcao);
    }

    public Optional<Funcao> findById(Integer idFuncao) {
        return funcaoRepository.findById(idFuncao);
    }

    public void delete(Funcao funcao) {
        funcaoRepository.delete(funcao);
    }

    public List<Funcao> findAll() {
        return funcaoRepository.findAll();
    }
}
