package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

public class ComunidadeDto implements Serializable {
    private Integer idComunidade;
    private String nmComunidade;
    private OffsetDateTime dhCriacao;
    private OffsetDateTime dhAtualizacao;
    private OffsetDateTime dhExclusao;

    public ComunidadeDto() {
    }

    public ComunidadeDto(Integer idComunidade, String nmComunidade, OffsetDateTime dhCriacao, OffsetDateTime dhAtualizacao, OffsetDateTime dhExclusao) {
        this.idComunidade = idComunidade;
        this.nmComunidade = nmComunidade;
        this.dhCriacao = dhCriacao;
        this.dhAtualizacao = dhAtualizacao;
        this.dhExclusao = dhExclusao;
    }

    public Integer getIdComunidade() {
        return idComunidade;
    }

    public void setIdComunidade(Integer idComunidade) {
        this.idComunidade = idComunidade;
    }

    public String getNmComunidade() {
        return nmComunidade;
    }

    public void setNmComunidade(String nmComunidade) {
        this.nmComunidade = nmComunidade;
    }

    public OffsetDateTime getDhCriacao() {
        return dhCriacao;
    }

    public void setDhCriacao(OffsetDateTime dhCriacao) {
        this.dhCriacao = dhCriacao;
    }

    public OffsetDateTime getDhAtualizacao() {
        return dhAtualizacao;
    }

    public void setDhAtualizacao(OffsetDateTime dhAtualizacao) {
        this.dhAtualizacao = dhAtualizacao;
    }

    public OffsetDateTime getDhExclusao() {
        return dhExclusao;
    }

    public void setDhExclusao(OffsetDateTime dhExclusao) {
        this.dhExclusao = dhExclusao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComunidadeDto entity = (ComunidadeDto) o;
        return Objects.equals(this.idComunidade, entity.idComunidade) &&
                Objects.equals(this.nmComunidade, entity.nmComunidade) &&
                Objects.equals(this.dhCriacao, entity.dhCriacao) &&
                Objects.equals(this.dhAtualizacao, entity.dhAtualizacao) &&
                Objects.equals(this.dhExclusao, entity.dhExclusao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComunidade, nmComunidade, dhCriacao, dhAtualizacao, dhExclusao);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idComunidade = " + idComunidade + ", " +
                "nmComunidade = " + nmComunidade + ", " +
                "dhCriacao = " + dhCriacao + ", " +
                "dhAtualizacao = " + dhAtualizacao + ", " +
                "dhExclusao = " + dhExclusao + ")";
    }
}
