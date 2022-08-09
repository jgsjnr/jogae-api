package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.GeneroJogo;
import com.gomatch.jogae.domain.Jogo;
import com.gomatch.jogae.dto.GeneroJogoDto;
import com.gomatch.jogae.dto.JogadorDto;
import com.gomatch.jogae.dto.JogoDto;
import com.gomatch.jogae.service.GeneroJogoService;
import com.gomatch.jogae.service.JogoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/jogo")
public class JogoController {
    final JogoService jogoService;
    final GeneroJogoService generoJogoService;
    public JogoController(JogoService jogoService, GeneroJogoService generoJogoService){
        this.generoJogoService = generoJogoService;
        this.jogoService = jogoService;
    }


    @PostMapping("/{idGeneroJogo}")
    public ResponseEntity<Object> saveJogo(@RequestBody JogoDto jogoDto, @PathVariable Integer idGeneroJogo){
        /*if(jogadorService.existsByIdNick(jogadorDto.getIdNick())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Jogador com esse ID já existe!");
        }*/
        Optional<GeneroJogo> generoJogoOptional = generoJogoService.findById(idGeneroJogo);
        if(!generoJogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Genero do jogo não encontrado!");
        }
        var jogo = new Jogo();
        BeanUtils.copyProperties(jogoDto, jogo);
        jogo.setGeneroJogo(generoJogoOptional.get());
        return ResponseEntity.status(HttpStatus.CREATED).body(jogoService.save(jogo));
    }
    /*@GetMapping
    public ResponseEntity<List<GeneroJogo>> getAllGeneroJogo(){
        return ResponseEntity.status(HttpStatus.OK).body(generoJogoService.findAll());
    }
    @GetMapping("/{idGeneroJogo}")
    public ResponseEntity<Object> getOneGeneroJogo(@PathVariable(value = "idGeneroJogo") Integer idGeneroJogo){
        Optional<GeneroJogo> generoJogoOptional = generoJogoService.findById(idGeneroJogo);
        if(!generoJogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(generoJogoOptional.get());
    }
    @DeleteMapping("/{idGeneroJogo}")
    public ResponseEntity<Object> deleteGeneroJogo(@PathVariable(value = "idGeneroJogo") Integer idGeneroJogo){
        Optional<GeneroJogo> generoJogoOptional = generoJogoService.findById(idGeneroJogo);
        if(!generoJogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        generoJogoService.delete(generoJogoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Removido com sucesso!");
    }
    @PutMapping("/{idGeneroJogo}")
    public ResponseEntity<Object> updateGeneroJogo(@PathVariable(value = "idGeneroJogo") Integer idGeneroJogo, @RequestBody JogadorDto jogadorDto){
        Optional<GeneroJogo> generoJogoOptional = generoJogoService.findById(idGeneroJogo);
        if(!generoJogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        var generoJogo = new GeneroJogo();
        BeanUtils.copyProperties(generoJogoOptional, generoJogo);
        generoJogo.setIdGeneroJogo(idGeneroJogo);
        return ResponseEntity.status(HttpStatus.OK).body(generoJogoService.save(generoJogo));
    }*/
}
