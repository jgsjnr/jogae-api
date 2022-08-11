package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class GeneroJogoDto implements Serializable {
    private Integer idGeneroJogo;
    private String nmGeneroJogo;
    private Integer vlGenero;

    public GeneroJogoDto() {
    }

    public GeneroJogoDto(Integer idGeneroJogo, String nmGeneroJogo, Integer vlGenero) {
        this.idGeneroJogo = idGeneroJogo;
        this.nmGeneroJogo = nmGeneroJogo;
        this.vlGenero = vlGenero;
    }

    public Integer getIdGeneroJogo() {
        return idGeneroJogo;
    }

    public void setIdGeneroJogo(Integer idGeneroJogo) {
        this.idGeneroJogo = idGeneroJogo;
    }

    public String getNmGeneroJogo() {
        return nmGeneroJogo;
    }

    public void setNmGeneroJogo(String nmGeneroJogo) {
        this.nmGeneroJogo = nmGeneroJogo;
    }

    public Integer getVlGenero() {
        return vlGenero;
    }

    public void setVlGenero(Integer vlGenero) {
        this.vlGenero = vlGenero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneroJogoDto entity = (GeneroJogoDto) o;
        return Objects.equals(this.idGeneroJogo, entity.idGeneroJogo) &&
                Objects.equals(this.nmGeneroJogo, entity.nmGeneroJogo) &&
                Objects.equals(this.vlGenero, entity.vlGenero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGeneroJogo, nmGeneroJogo, vlGenero);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idGeneroJogo = " + idGeneroJogo + ", " +
                "nmGeneroJogo = " + nmGeneroJogo + ", " +
                "vlGenero = " + vlGenero + ")";
    }
}
