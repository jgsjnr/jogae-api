package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.dto.JogadorDto;
import com.gomatch.jogae.service.JogadorService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/jogador")
public class JogadorController {
    final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public ResponseEntity<Object> saveJogador(@RequestBody JogadorDto jogadorDto){
        /*if(jogadorService.existsByIdNick(jogadorDto.getIdNick())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Jogador com esse ID já existe!");
        }*/
        var jogador = new Jogador();
        BeanUtils.copyProperties(jogadorDto, jogador);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorService.save(jogador));
    }
    @GetMapping
    public ResponseEntity<List<Jogador>> getAllJogador(){
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.findAll());
    }
    @GetMapping("/{idNick}")
    public ResponseEntity<Object> getOneJogador(@PathVariable(value = "idNick") Integer idNick){
        Optional<Jogador> jogadorOptional = jogadorService.findById(idNick);
        if(!jogadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(jogadorOptional.get());
    }
    @DeleteMapping("/{idNick}")
    public ResponseEntity<Object> deleteJogador(@PathVariable(value = "idNick") Integer idNick){
        Optional<Jogador> jogadorOptional = jogadorService.findById(idNick);
        if(!jogadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        jogadorService.delete(jogadorOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Removido com sucesso!");
    }
    @PutMapping("/{idNick}")
    public ResponseEntity<Object> updateJogador(@PathVariable(value = "idNick") Integer idNick, @RequestBody JogadorDto jogadorDto){
        Optional<Jogador> jogadorOptional = jogadorService.findById(idNick);
        if(!jogadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        var jogador = jogadorOptional.get();
        BeanUtils.copyProperties(jogadorDto, jogador);
        jogador.setIdNick(jogadorOptional.get().getIdNick());
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.save(jogador));
    }
}
