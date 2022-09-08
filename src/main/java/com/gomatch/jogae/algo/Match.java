package com.gomatch.jogae.algo;

import com.gomatch.jogae.domain.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private final Jogador jogador;
    private List<Jogador> jogadoresMatch = new ArrayList<Jogador>();
    private final List<Jogador> candidatos;
    private final Genericos gen = new Genericos();
    public Match(Jogador jogador, List<Jogador> candidatos) {
        this.jogador = jogador;
        this.candidatos = candidatos;
        this.jogadoresMatch.add(this.jogador);
    }
    //pl1 = gen.gerarNumMatch(jogador.getVlJogador(), Genericos.calculaHype(jogador.getRankJogador()));
    public void newMatch(){
        this.jogadoresMatch.add(jogador);
        double test = 1;
        for(Jogador candidato: this.candidatos){
            var jogador_1 = gen.gerarNumMatch(jogador.getVlJogador(),gen.calculaHype(jogador.getRankJogador())) ;
            var jogador_2 = gen.gerarNumMatch(candidato.getVlJogador(), gen.calculaHype(candidato.getRankJogador()));
            double res = Math.abs(jogador_1 - jogador_2);
            if(res == 0) continue;
            System.out.println("Player 1: "+jogador.getNmNick());
            System.out.println("Match_1: "+gen.gerarNumMatch(jogador.getVlJogador(),gen.calculaHype(jogador.getRankJogador())));
            System.out.println("Player 2: "+candidato.getNmNick());
            System.out.println("Match_2: "+gen.gerarNumMatch(candidato.getVlJogador(), gen.calculaHype(candidato.getRankJogador())));
            System.out.println("RESULT: "+res);
            if(res <= test){
                test = res;
                System.out.println("Resultado final: "+res);
                jogadoresMatch.set(1, candidato);
                System.out.println("Resultado atual: "+res+" Candidato atual: "+candidato.getNmNick());
            }
        }
    }

    public List<Jogador> getJogadoresMatch() {
        return jogadoresMatch;
    }

}
