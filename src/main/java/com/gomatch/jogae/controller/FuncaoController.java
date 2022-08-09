package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.Funcao;
import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.dto.FuncaoDto;
import com.gomatch.jogae.dto.JogadorDto;
import com.gomatch.jogae.service.FuncaoService;
import com.gomatch.jogae.service.JogadorService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/funcao")
public class FuncaoController {
    final FuncaoService funcaoService;
    public FuncaoController(FuncaoService funcaoService){this.funcaoService = funcaoService;}
    @PostMapping
    public ResponseEntity<Object> saveFuncao(@RequestBody FuncaoDto funcaoDto){
        var funcao = new Funcao();
        BeanUtils.copyProperties(funcaoDto, funcao);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcaoService.save(funcao));
    }
    @GetMapping
    public ResponseEntity<List<Funcao>> getAllJogador(){
        return ResponseEntity.status(HttpStatus.OK).body(funcaoService.findAll());
    }
    @GetMapping("/{idFuncao}")
    public ResponseEntity<Object> getOneFuncao(@PathVariable(value = "idFuncao") Integer idFuncao){
        Optional<Funcao> funcaoOptional = funcaoService.findById(idFuncao);
        if(!funcaoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(funcaoOptional.get());
    }
    @DeleteMapping("/{idFuncao}")
    public ResponseEntity<Object> deleteFuncao(@PathVariable(value = "idFuncao") Integer idFuncao){
        Optional<Funcao> funcaoOptional = funcaoService.findById(idFuncao);
        if(!funcaoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        funcaoService.delete(funcaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Removido com sucesso!");
    }
    @PutMapping("/{idFuncao}")
    public ResponseEntity<Object> updateFuncao(@PathVariable(value = "idFuncao") Integer idFuncao, @RequestBody FuncaoDto funcaoDto){
        Optional<Funcao> funcaoOptional = funcaoService.findById(idFuncao);
        if(!funcaoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        var funcao = new Funcao();
        BeanUtils.copyProperties(funcaoDto, funcao);
        funcao.setIdFuncao(idFuncao);
        return ResponseEntity.status(HttpStatus.OK).body(funcaoService.save(funcao));
    }
}
