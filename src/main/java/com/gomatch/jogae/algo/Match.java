package com.gomatch.jogae.algo;

import com.gomatch.jogae.domain.Jogador;
import com.gomatch.jogae.dto.JogadorDto;

import java.util.List;
import java.util.Map;

public class Match {
    private Jogador jogador;
    private Jogador jogadorMatch;

    private List<Jogador> candidatos;
    private String[] players = null;

    public Match(Jogador jogador, List<Jogador> candidatos) {
        //Player player_1 = new Player(Genericos.calculaHype(jogadorDto.getRankJogador()), jogadorDto.getVlJogador(), jogadorDto.getRankJogador());
        this.jogador = jogador;
        this.candidatos = candidatos;
    }
    double pl1 = Genericos.gerarNumMatch(jogador.getVlJogador(), Genericos.calculaHype(jogador.getRankJogador()));
    double test = 0;
    public void newMatch(){
        for(Jogador candidato: this.candidatos){
            double pl2 = Genericos.gerarNumMatch(candidato.getVlJogador(), Genericos.calculaHype(candidato.getRankJogador()));
            double result = pl1 - pl2;
            if(result < 0) result = result*-1;
            if(test <= result){
                test = result;
                jogadorMatch = candidato;
            }
        }
        this.players = new String[]{jogador.getNmNick(), jogadorMatch.getNmNick()};
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }
}
