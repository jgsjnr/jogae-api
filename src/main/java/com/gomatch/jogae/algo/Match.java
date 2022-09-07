package com.gomatch.jogae.algo;

import com.gomatch.jogae.domain.Jogador;

import java.util.List;

public class Match {
    private final Jogador jogador;
    private Jogador jogadorMatch;
    private final List<Jogador> candidatos;
    double pl1, test, pl2, result;
    private String[] players = null;
    private final Genericos gen = new Genericos();
    public Match(Jogador jogador, List<Jogador> candidatos) {
        this.jogador = jogador;
        this.candidatos = candidatos;
        newMatch();
    }
    //pl1 = gen.gerarNumMatch(jogador.getVlJogador(), Genericos.calculaHype(jogador.getRankJogador()));
    public void newMatch(){
        result = 1;
        test = 0;
        this.pl1 = gen.gerarNumMatch(jogador.getVlJogador(),gen.calculaHype(jogador.getRankJogador()));
        System.out.println("PL1: "+pl1);
        System.out.println("Player 1: "+jogador.getNmNick());
        for(Jogador candidato: this.candidatos){
            this.pl2 = gen.gerarNumMatch(candidato.getVlJogador(), gen.calculaHype(candidato.getRankJogador()));
            System.out.println("Player 2: "+candidato.getNmNick());
            System.out.println("PL2: "+pl2);
            double result = pl1 - pl2;
            System.out.println("RESULT: "+result);
            if(result < 0) result *= -1;
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
