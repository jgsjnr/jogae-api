package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.GeneroJogo;
import com.gomatch.jogae.dto.GeneroJogoDto;
import com.gomatch.jogae.dto.JogadorDto;
import com.gomatch.jogae.service.GeneroJogoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/generojogo")
public class GeneroJogoController {
    final GeneroJogoService generoJogoService;
    GeneroJogoController(GeneroJogoService generoJogoService){
        this.generoJogoService = generoJogoService;
    }
    @PostMapping
    public ResponseEntity<Object> saveGeneroJogo(@RequestBody GeneroJogoDto generoJogoDto){
        /*if(jogadorService.existsByIdNick(jogadorDto.getIdNick())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Jogador com esse ID já existe!");
        }*/
        var generoJogo = new GeneroJogo();
        BeanUtils.copyProperties(generoJogoDto, generoJogo);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoJogoService.save(generoJogo));
    }
    @GetMapping
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
    }
}
