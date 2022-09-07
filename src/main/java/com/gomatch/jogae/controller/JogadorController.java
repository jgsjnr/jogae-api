package com.gomatch.jogae.controller;

import com.gomatch.jogae.algo.Match;
import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.domain.MatchBody;
import com.gomatch.jogae.domain.Teste;
import com.gomatch.jogae.dto.JogadorDto;
import com.gomatch.jogae.service.JogadorService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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
    @PostMapping("/teste")
    public ResponseEntity<Object> testeJogador(@RequestBody Map<String, String> body){
        var teste = new Teste();
        teste.setString1(body.get("string1"));
        teste.setString2(body.get("string2"));
        return ResponseEntity.status(HttpStatus.CREATED).body(teste);
    }
    @GetMapping("/{nmNick}")
    public ResponseEntity<Object> getOneJogador(@PathVariable(value = "nmNick") String nmNick){
        Optional<Jogador> jogadorOptional = jogadorService.findById(nmNick);
        if(!jogadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(jogadorOptional.get());
    }
    @DeleteMapping("/{nmNick}")
    public ResponseEntity<Object> deleteJogador(@PathVariable(value = "nmNick") String nmNick){
        Optional<Jogador> jogadorOptional = jogadorService.findById(nmNick);
        if(!jogadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        jogadorService.delete(jogadorOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Removido com sucesso!");
    }
    @PutMapping("/{nmNick}")
    public ResponseEntity<Object> updateJogador(@PathVariable(value = "nmNick") String nmNick, @RequestBody JogadorDto jogadorDto){
        Optional<Jogador> jogadorOptional = jogadorService.findById(nmNick);
        if(!jogadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");
        }
        var jogador = new Jogador();
        BeanUtils.copyProperties(jogadorDto, jogador);
        jogador.setNmNick(nmNick);
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.save(jogador));
    }

    @GetMapping("/match")
    public ResponseEntity<Object> getMatch(@RequestParam String player){
        Optional<Jogador> jogadorOptional = jogadorService.findById(player);
        Jogador jogador;
        if(!jogadorOptional.isPresent()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        else jogador = jogadorService.findById(player).get();
        Match match = new Match(jogador, jogadorService.findAll());
        MatchBody matchBody = new MatchBody();
        matchBody.setPlayer_1(match.getPlayers()[0]);
        matchBody.setPlayer_2(match.getPlayers()[1]);
        return ResponseEntity.status(HttpStatus.CREATED).body(matchBody);
    }
}
