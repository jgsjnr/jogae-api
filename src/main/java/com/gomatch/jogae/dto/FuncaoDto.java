package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class FuncaoDto implements Serializable {
    private Integer idFuncao;
    private String nmFuncao;

    public FuncaoDto() {
    }

    public FuncaoDto(Integer idFuncao, String nmFuncao) {
        this.idFuncao = idFuncao;
        this.nmFuncao = nmFuncao;
    }

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public String getNmFuncao() {
        return nmFuncao;
    }

    public void setNmFuncao(String nmFuncao) {
        this.nmFuncao = nmFuncao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuncaoDto entity = (FuncaoDto) o;
        return Objects.equals(this.idFuncao, entity.idFuncao) &&
                Objects.equals(this.nmFuncao, entity.nmFuncao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFuncao, nmFuncao);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idFuncao = " + idFuncao + ", " +
                "nmFuncao = " + nmFuncao + ")";
    }
}
