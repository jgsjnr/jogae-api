package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.dto.JogadorDto;
import com.gomatch.jogae.service.JogadorService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
