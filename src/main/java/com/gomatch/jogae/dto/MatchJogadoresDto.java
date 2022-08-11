package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

public class MatchJogadoresDto implements Serializable {
    private Integer idMatch;
    private OffsetDateTime dhMatch;

    public MatchJogadoresDto() {
    }

    public MatchJogadoresDto(Integer idMatch, OffsetDateTime dhMatch) {
        this.idMatch = idMatch;
        this.dhMatch = dhMatch;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public OffsetDateTime getDhMatch() {
        return dhMatch;
    }

    public void setDhMatch(OffsetDateTime dhMatch) {
        this.dhMatch = dhMatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchJogadoresDto entity = (MatchJogadoresDto) o;
        return Objects.equals(this.idMatch, entity.idMatch) &&
                Objects.equals(this.dhMatch, entity.dhMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, dhMatch);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idMatch = " + idMatch + ", " +
                "dhMatch = " + dhMatch + ")";
    }
}
