package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class JogoDto implements Serializable {
    private Integer idJogo;
    private String nmJogo;
    private Integer vlJogo;
    private Integer rankJogo;

    public JogoDto() {
    }

    public JogoDto(Integer idJogo, String nmJogo, Integer vlJogo, Integer rankJogo) {
        this.idJogo = idJogo;
        this.nmJogo = nmJogo;
        this.vlJogo = vlJogo;
        this.rankJogo = rankJogo;
    }

    public Integer getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Integer idJogo) {
        this.idJogo = idJogo;
    }

    public String getNmJogo() {
        return nmJogo;
    }

    public void setNmJogo(String nmJogo) {
        this.nmJogo = nmJogo;
    }

    public Integer getVlJogo() {
        return vlJogo;
    }

    public void setVlJogo(Integer vlJogo) {
        this.vlJogo = vlJogo;
    }

    public Integer getRankJogo() {
        return rankJogo;
    }

    public void setRankJogo(Integer rankJogo) {
        this.rankJogo = rankJogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogoDto entity = (JogoDto) o;
        return Objects.equals(this.idJogo, entity.idJogo) &&
                Objects.equals(this.nmJogo, entity.nmJogo) &&
                Objects.equals(this.vlJogo, entity.vlJogo) &&
                Objects.equals(this.rankJogo, entity.rankJogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJogo, nmJogo, vlJogo, rankJogo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idJogo = " + idJogo + ", " +
                "nmJogo = " + nmJogo + ", " +
                "vlJogo = " + vlJogo + ", " +
                "rankJogo = " + rankJogo + ")";
    }
}
