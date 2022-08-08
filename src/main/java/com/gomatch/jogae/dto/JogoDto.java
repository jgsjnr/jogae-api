package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class JogoDto implements Serializable {
    private Integer idJogo;
    private String nmJogo;

    public JogoDto() {
    }

    public JogoDto(Integer idJogo, String nmJogo) {
        this.idJogo = idJogo;
        this.nmJogo = nmJogo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogoDto entity = (JogoDto) o;
        return Objects.equals(this.idJogo, entity.idJogo) &&
                Objects.equals(this.nmJogo, entity.nmJogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJogo, nmJogo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idJogo = " + idJogo + ", " +
                "nmJogo = " + nmJogo + ")";
    }
}
