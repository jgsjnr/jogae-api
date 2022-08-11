package com.gomatch.jogae.controller;

import com.gomatch.jogae.domain.StatusCadastro;
import com.gomatch.jogae.dto.StatusCadastroDto;
import com.gomatch.jogae.service.StatusCadastroService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/statuscadastro")
public class StatusCadastroController {
    final StatusCadastroService statusCadastroService;
    public StatusCadastroController(StatusCadastroService statusCadastroService){this.statusCadastroService = statusCadastroService;}
    @PostMapping
    public ResponseEntity<Object> saveJogador(@RequestBody StatusCadastroDto statusCadastroDto){
        /*if(jogadorService.existsByIdNick(jogadorDto.getIdNick())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Jogador com esse ID já existe!");
        }*/
        var statusCadastro = new StatusCadastro();
        BeanUtils.copyProperties(statusCadastroDto, statusCadastro);
        return ResponseEntity.status(HttpStatus.CREATED).body(statusCadastroService.save(statusCadastro));
    }
    @GetMapping
    public ResponseEntity<List<StatusCadastro>> getAllStatusCadastro(){
        return ResponseEntity.status(HttpStatus.OK).body(statusCadastroService.findAll());
    }
    @GetMapping("/{idStatusCadastro}")
    public ResponseEntity<Object> getOneJogador(@PathVariable(value = "idStatusCadastro") Integer idStatusCadastro){
        Optional<StatusCadastro> statusCadastroOptional = statusCadastroService.findById(idStatusCadastro);
        if(!statusCadastroOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(statusCadastroOptional.get());
    }
    @DeleteMapping("/{idStatusCadastro}")
    public ResponseEntity<Object> deleteStatusCadastro(@PathVariable(value = "idStatusCadastro") Integer idStatusCadastro){
        Optional<StatusCadastro> statusCadastroOptional = statusCadastroService.findById(idStatusCadastro);
        if(!statusCadastroOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        statusCadastroService.delete(statusCadastroOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Removido com sucesso!");
    }
    @PutMapping("/{idStatusCadastro}")
    public ResponseEntity<Object> updateStatusCadastro(@PathVariable(value = "idStatusCadastro") Integer idStatusCadastro, @RequestBody StatusCadastroDto statusCadastroDto){
        Optional<StatusCadastro> statusCadastroOptional = statusCadastroService.findById(idStatusCadastro);
        if(!statusCadastroOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        var statusCadastro = new StatusCadastro();
        BeanUtils.copyProperties(statusCadastroDto, statusCadastro);
        statusCadastro.setIdStatusCadastro(idStatusCadastro);
        return ResponseEntity.status(HttpStatus.OK).body(statusCadastroService.save(statusCadastro));
    }
}
