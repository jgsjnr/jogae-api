package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class JogadorDto implements Serializable {
    private String nmNick;
    private Integer vlJogador;
    private Integer rankJogador;

    public JogadorDto() {
    }

    public JogadorDto(String nmNick, Integer vlJogador, Integer rankJogador) {
        this.nmNick = nmNick;
        this.vlJogador = vlJogador;
        this.rankJogador = rankJogador;
    }

    public String getNmNick() {
        return nmNick;
    }

    public void setNmNick(String nmNick) {
        this.nmNick = nmNick;
    }

    public Integer getVlJogador() {
        return vlJogador;
    }

    public void setVlJogador(Integer vlJogador) {
        this.vlJogador = vlJogador;
    }

    public Integer getRankJogador() {
        return rankJogador;
    }

    public void setRankJogador(Integer rankJogador) {
        this.rankJogador = rankJogador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogadorDto entity = (JogadorDto) o;
        return Objects.equals(this.nmNick, entity.nmNick) &&
                Objects.equals(this.vlJogador, entity.vlJogador) &&
                Objects.equals(this.rankJogador, entity.rankJogador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nmNick, vlJogador, rankJogador);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nmNick = " + nmNick + ", " +
                "vlJogador = " + vlJogador + ", " +
                "rankJogador = " + rankJogador + ")";
    }
}
