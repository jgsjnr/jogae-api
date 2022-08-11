package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.GeneroJogo;
import com.gomatch.jogae.domain.Jogo;
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
    @GetMapping
    public ResponseEntity<List<Jogo>> getAllJogo(){
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.findAll());
    }
    @GetMapping("/{idJogo}")
    public ResponseEntity<Object> getOneJogo(@PathVariable(value = "idJogo") Integer idJogo){
        Optional<Jogo> jogoOptional = jogoService.findById(idJogo);
        if(!jogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(jogoOptional.get());
    }
    @DeleteMapping("/{idJogo}")
    public ResponseEntity<Object> deleteJogo(@PathVariable(value = "idJogo") Integer idJogo){
        Optional<Jogo> jogoOptional = jogoService.findById(idJogo);
        if(!jogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        jogoService.delete(jogoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Removido com sucesso!");
    }
    @PutMapping("/{idJogo}")
    public ResponseEntity<Object> updateJogo(@PathVariable(value = "idJogo") Integer idJogo, @RequestBody JogoDto jogoDto){
        Optional<Jogo> jogoOptional = jogoService.findById(idJogo);
        if(!jogoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        var jogo = new Jogo();
        BeanUtils.copyProperties(jogoOptional, jogo);
        jogo.setIdJogo(idJogo);
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.save(jogo));
    }
}
