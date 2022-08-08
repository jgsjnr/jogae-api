package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class StatusCadastroDto implements Serializable {
    private Integer idStatusCadastro;
    private String nmStatusCadastro;

    public StatusCadastroDto() {
    }

    public StatusCadastroDto(Integer idStatusCadastro, String nmStatusCadastro) {
        this.idStatusCadastro = idStatusCadastro;
        this.nmStatusCadastro = nmStatusCadastro;
    }

    public Integer getIdStatusCadastro() {
        return idStatusCadastro;
    }

    public void setIdStatusCadastro(Integer idStatusCadastro) {
        this.idStatusCadastro = idStatusCadastro;
    }

    public String getNmStatusCadastro() {
        return nmStatusCadastro;
    }

    public void setNmStatusCadastro(String nmStatusCadastro) {
        this.nmStatusCadastro = nmStatusCadastro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusCadastroDto entity = (StatusCadastroDto) o;
        return Objects.equals(this.idStatusCadastro, entity.idStatusCadastro) &&
                Objects.equals(this.nmStatusCadastro, entity.nmStatusCadastro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStatusCadastro, nmStatusCadastro);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idStatusCadastro = " + idStatusCadastro + ", " +
                "nmStatusCadastro = " + nmStatusCadastro + ")";
    }
}
