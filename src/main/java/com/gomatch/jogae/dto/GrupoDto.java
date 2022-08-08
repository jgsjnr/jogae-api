package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

public class GrupoDto implements Serializable {
    private Integer idGrupo;
    private String nmGrupo;
    private OffsetDateTime dhCriacao;
    private OffsetDateTime dhAtualizacao;
    private OffsetDateTime dhExclusao;

    public GrupoDto() {
    }

    public GrupoDto(Integer idGrupo, String nmGrupo, OffsetDateTime dhCriacao, OffsetDateTime dhAtualizacao, OffsetDateTime dhExclusao) {
        this.idGrupo = idGrupo;
        this.nmGrupo = nmGrupo;
        this.dhCriacao = dhCriacao;
        this.dhAtualizacao = dhAtualizacao;
        this.dhExclusao = dhExclusao;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNmGrupo() {
        return nmGrupo;
    }

    public void setNmGrupo(String nmGrupo) {
        this.nmGrupo = nmGrupo;
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
        GrupoDto entity = (GrupoDto) o;
        return Objects.equals(this.idGrupo, entity.idGrupo) &&
                Objects.equals(this.nmGrupo, entity.nmGrupo) &&
                Objects.equals(this.dhCriacao, entity.dhCriacao) &&
                Objects.equals(this.dhAtualizacao, entity.dhAtualizacao) &&
                Objects.equals(this.dhExclusao, entity.dhExclusao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGrupo, nmGrupo, dhCriacao, dhAtualizacao, dhExclusao);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idGrupo = " + idGrupo + ", " +
                "nmGrupo = " + nmGrupo + ", " +
                "dhCriacao = " + dhCriacao + ", " +
                "dhAtualizacao = " + dhAtualizacao + ", " +
                "dhExclusao = " + dhExclusao + ")";
    }
}
