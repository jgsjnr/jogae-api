package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

public class MatchJogadoresDto implements Serializable {
    private Integer idMatch;
    private Boolean flMatchConvite;
    private Boolean flMatchAceite;
    private OffsetDateTime dhMatchConvite;
    private OffsetDateTime dhMatchAceite;

    public MatchJogadoresDto() {
    }

    public MatchJogadoresDto(Integer idMatch, Boolean flMatchConvite, Boolean flMatchAceite, OffsetDateTime dhMatchConvite, OffsetDateTime dhMatchAceite) {
        this.idMatch = idMatch;
        this.flMatchConvite = flMatchConvite;
        this.flMatchAceite = flMatchAceite;
        this.dhMatchConvite = dhMatchConvite;
        this.dhMatchAceite = dhMatchAceite;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Boolean getFlMatchConvite() {
        return flMatchConvite;
    }

    public void setFlMatchConvite(Boolean flMatchConvite) {
        this.flMatchConvite = flMatchConvite;
    }

    public Boolean getFlMatchAceite() {
        return flMatchAceite;
    }

    public void setFlMatchAceite(Boolean flMatchAceite) {
        this.flMatchAceite = flMatchAceite;
    }

    public OffsetDateTime getDhMatchConvite() {
        return dhMatchConvite;
    }

    public void setDhMatchConvite(OffsetDateTime dhMatchConvite) {
        this.dhMatchConvite = dhMatchConvite;
    }

    public OffsetDateTime getDhMatchAceite() {
        return dhMatchAceite;
    }

    public void setDhMatchAceite(OffsetDateTime dhMatchAceite) {
        this.dhMatchAceite = dhMatchAceite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchJogadoresDto entity = (MatchJogadoresDto) o;
        return Objects.equals(this.idMatch, entity.idMatch) &&
                Objects.equals(this.flMatchConvite, entity.flMatchConvite) &&
                Objects.equals(this.flMatchAceite, entity.flMatchAceite) &&
                Objects.equals(this.dhMatchConvite, entity.dhMatchConvite) &&
                Objects.equals(this.dhMatchAceite, entity.dhMatchAceite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, flMatchConvite, flMatchAceite, dhMatchConvite, dhMatchAceite);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idMatch = " + idMatch + ", " +
                "flMatchConvite = " + flMatchConvite + ", " +
                "flMatchAceite = " + flMatchAceite + ", " +
                "dhMatchConvite = " + dhMatchConvite + ", " +
                "dhMatchAceite = " + dhMatchAceite + ")";
    }
}
