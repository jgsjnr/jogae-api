package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

public class CadastroUsuarioDto implements Serializable {
    private Integer idUsuario;
    private String nmLogin;
    private String nmSenha;
    private String nmUsuario;
    private String cdEmail;
    private Boolean flAtualizaDados;
    private LocalDate dtNascimento;
    private OffsetDateTime dhInclusao;
    private OffsetDateTime dhAtualizacao;
    private OffsetDateTime dhExclusao;
    private OffsetDateTime dhUltimoAcesso;
    private OffsetDateTime dhAtualizacaoSenha;
    private Integer nrTentativaAcesso;

    public CadastroUsuarioDto() {
    }

    public CadastroUsuarioDto(Integer idUsuario, String nmLogin, String nmSenha, String nmUsuario, String cdEmail, Boolean flAtualizaDados, LocalDate dtNascimento, OffsetDateTime dhInclusao, OffsetDateTime dhAtualizacao, OffsetDateTime dhExclusao, OffsetDateTime dhUltimoAcesso, OffsetDateTime dhAtualizacaoSenha, Integer nrTentativaAcesso) {
        this.idUsuario = idUsuario;
        this.nmLogin = nmLogin;
        this.nmSenha = nmSenha;
        this.nmUsuario = nmUsuario;
        this.cdEmail = cdEmail;
        this.flAtualizaDados = flAtualizaDados;
        this.dtNascimento = dtNascimento;
        this.dhInclusao = dhInclusao;
        this.dhAtualizacao = dhAtualizacao;
        this.dhExclusao = dhExclusao;
        this.dhUltimoAcesso = dhUltimoAcesso;
        this.dhAtualizacaoSenha = dhAtualizacaoSenha;
        this.nrTentativaAcesso = nrTentativaAcesso;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getNmSenha() {
        return nmSenha;
    }

    public void setNmSenha(String nmSenha) {
        this.nmSenha = nmSenha;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getCdEmail() {
        return cdEmail;
    }

    public void setCdEmail(String cdEmail) {
        this.cdEmail = cdEmail;
    }

    public Boolean getFlAtualizaDados() {
        return flAtualizaDados;
    }

    public void setFlAtualizaDados(Boolean flAtualizaDados) {
        this.flAtualizaDados = flAtualizaDados;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public OffsetDateTime getDhInclusao() {
        return dhInclusao;
    }

    public void setDhInclusao(OffsetDateTime dhInclusao) {
        this.dhInclusao = dhInclusao;
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

    public OffsetDateTime getDhUltimoAcesso() {
        return dhUltimoAcesso;
    }

    public void setDhUltimoAcesso(OffsetDateTime dhUltimoAcesso) {
        this.dhUltimoAcesso = dhUltimoAcesso;
    }

    public OffsetDateTime getDhAtualizacaoSenha() {
        return dhAtualizacaoSenha;
    }

    public void setDhAtualizacaoSenha(OffsetDateTime dhAtualizacaoSenha) {
        this.dhAtualizacaoSenha = dhAtualizacaoSenha;
    }

    public Integer getNrTentativaAcesso() {
        return nrTentativaAcesso;
    }

    public void setNrTentativaAcesso(Integer nrTentativaAcesso) {
        this.nrTentativaAcesso = nrTentativaAcesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadastroUsuarioDto entity = (CadastroUsuarioDto) o;
        return Objects.equals(this.idUsuario, entity.idUsuario) &&
                Objects.equals(this.nmLogin, entity.nmLogin) &&
                Objects.equals(this.nmSenha, entity.nmSenha) &&
                Objects.equals(this.nmUsuario, entity.nmUsuario) &&
                Objects.equals(this.cdEmail, entity.cdEmail) &&
                Objects.equals(this.flAtualizaDados, entity.flAtualizaDados) &&
                Objects.equals(this.dtNascimento, entity.dtNascimento) &&
                Objects.equals(this.dhInclusao, entity.dhInclusao) &&
                Objects.equals(this.dhAtualizacao, entity.dhAtualizacao) &&
                Objects.equals(this.dhExclusao, entity.dhExclusao) &&
                Objects.equals(this.dhUltimoAcesso, entity.dhUltimoAcesso) &&
                Objects.equals(this.dhAtualizacaoSenha, entity.dhAtualizacaoSenha) &&
                Objects.equals(this.nrTentativaAcesso, entity.nrTentativaAcesso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nmLogin, nmSenha, nmUsuario, cdEmail, flAtualizaDados, dtNascimento, dhInclusao, dhAtualizacao, dhExclusao, dhUltimoAcesso, dhAtualizacaoSenha, nrTentativaAcesso);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idUsuario = " + idUsuario + ", " +
                "nmLogin = " + nmLogin + ", " +
                "nmSenha = " + nmSenha + ", " +
                "nmUsuario = " + nmUsuario + ", " +
                "cdEmail = " + cdEmail + ", " +
                "flAtualizaDados = " + flAtualizaDados + ", " +
                "dtNascimento = " + dtNascimento + ", " +
                "dhInclusao = " + dhInclusao + ", " +
                "dhAtualizacao = " + dhAtualizacao + ", " +
                "dhExclusao = " + dhExclusao + ", " +
                "dhUltimoAcesso = " + dhUltimoAcesso + ", " +
                "dhAtualizacaoSenha = " + dhAtualizacaoSenha + ", " +
                "nrTentativaAcesso = " + nrTentativaAcesso + ")";
    }
}
