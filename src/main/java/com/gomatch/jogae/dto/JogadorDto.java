package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class JogadorDto implements Serializable {
    private Integer idNick;
    private String nmNick;

    public JogadorDto() {
    }

    public JogadorDto(Integer idNick, String nmNick) {
        this.idNick = idNick;
        this.nmNick = nmNick;
    }

    public Integer getIdNick() {
        return idNick;
    }

    public void setIdNick(Integer idNick) {
        this.idNick = idNick;
    }

    public String getNmNick() {
        return nmNick;
    }

    public void setNmNick(String nmNick) {
        this.nmNick = nmNick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogadorDto entity = (JogadorDto) o;
        return Objects.equals(this.idNick, entity.idNick) &&
                Objects.equals(this.nmNick, entity.nmNick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNick, nmNick);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idNick = " + idNick + ", " +
                "nmNick = " + nmNick + ")";
    }
}
