package com.gomatch.jogae.domain;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class CadastroUsuario {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(nullable = false, length = 40)
    private String nmLogin;

    @Column(nullable = false, length = 40)
    private String nmSenha;

    @Column(nullable = false, length = 60)
    private String nmUsuario;

    @Column(nullable = false, length = 40)
    private String cdEmail;

    @Column(nullable = false)
    private Boolean flAtualizaDados;

    @Column(nullable = false)
    private LocalDate dtNascimento;

    @Column(nullable = false)
    private OffsetDateTime dhInclusao;

    @Column(nullable = false)
    private OffsetDateTime dhAtualizacao;

    @Column(nullable = false)
    private OffsetDateTime dhExclusao;

    @Column
    private OffsetDateTime dhUltimoAcesso;

    @Column
    private OffsetDateTime dhAtualizacaoSenha;

    @Column
    private Integer nrTentativaAcesso;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nm_nick", nullable = false)
    private Jogador nmNick;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_status_cadastro", nullable = false)
    private StatusCadastro statusCadastro;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_funcao", nullable = false)
    private Funcao funcao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_grupo", nullable = false)
    private Grupo grupo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_comunidade", nullable = false)
    private Comunidade comunidade;

    @OneToMany(mappedBy = "usuarioPrimario")
    private Set<MatchJogadores> usuarioPrimarioMatchJogadoress;

    @OneToMany(mappedBy = "usuarioMatch")
    private Set<MatchJogadores> usuarioMatchMatchJogadoress;

    @OneToMany(mappedBy = "usuario")
    private Set<Prateleira> usuarioPrateleiras;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(final Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(final String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getNmSenha() {
        return nmSenha;
    }

    public void setNmSenha(final String nmSenha) {
        this.nmSenha = nmSenha;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(final String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getCdEmail() {
        return cdEmail;
    }

    public void setCdEmail(final String cdEmail) {
        this.cdEmail = cdEmail;
    }

    public Boolean getFlAtualizaDados() {
        return flAtualizaDados;
    }

    public void setFlAtualizaDados(final Boolean flAtualizaDados) {
        this.flAtualizaDados = flAtualizaDados;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(final LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public OffsetDateTime getDhInclusao() {
        return dhInclusao;
    }

    public void setDhInclusao(final OffsetDateTime dhInclusao) {
        this.dhInclusao = dhInclusao;
    }

    public OffsetDateTime getDhAtualizacao() {
        return dhAtualizacao;
    }

    public void setDhAtualizacao(final OffsetDateTime dhAtualizacao) {
        this.dhAtualizacao = dhAtualizacao;
    }

    public OffsetDateTime getDhExclusao() {
        return dhExclusao;
    }

    public void setDhExclusao(final OffsetDateTime dhExclusao) {
        this.dhExclusao = dhExclusao;
    }

    public OffsetDateTime getDhUltimoAcesso() {
        return dhUltimoAcesso;
    }

    public void setDhUltimoAcesso(final OffsetDateTime dhUltimoAcesso) {
        this.dhUltimoAcesso = dhUltimoAcesso;
    }

    public OffsetDateTime getDhAtualizacaoSenha() {
        return dhAtualizacaoSenha;
    }

    public void setDhAtualizacaoSenha(final OffsetDateTime dhAtualizacaoSenha) {
        this.dhAtualizacaoSenha = dhAtualizacaoSenha;
    }

    public Integer getNrTentativaAcesso() {
        return nrTentativaAcesso;
    }

    public void setNrTentativaAcesso(final Integer nrTentativaAcesso) {
        this.nrTentativaAcesso = nrTentativaAcesso;
    }

    public Jogador getNmNick() {
        return nmNick;
    }

    public void setNmNick(final Jogador nmNick) {
        this.nmNick = nmNick;
    }

    public StatusCadastro getStatusCadastro() {
        return statusCadastro;
    }

    public void setStatusCadastro(final StatusCadastro statusCadastro) {
        this.statusCadastro = statusCadastro;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(final Funcao funcao) {
        this.funcao = funcao;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(final Grupo grupo) {
        this.grupo = grupo;
    }

    public Comunidade getComunidade() {
        return comunidade;
    }

    public void setComunidade(final Comunidade comunidade) {
        this.comunidade = comunidade;
    }

    public Set<MatchJogadores> getUsuarioPrimarioMatchJogadoress() {
        return usuarioPrimarioMatchJogadoress;
    }

    public void setUsuarioPrimarioMatchJogadoress(
            final Set<MatchJogadores> usuarioPrimarioMatchJogadoress) {
        this.usuarioPrimarioMatchJogadoress = usuarioPrimarioMatchJogadoress;
    }

    public Set<MatchJogadores> getUsuarioMatchMatchJogadoress() {
        return usuarioMatchMatchJogadoress;
    }

    public void setUsuarioMatchMatchJogadoress(
            final Set<MatchJogadores> usuarioMatchMatchJogadoress) {
        this.usuarioMatchMatchJogadoress = usuarioMatchMatchJogadoress;
    }

    public Set<Prateleira> getUsuarioPrateleiras() {
        return usuarioPrateleiras;
    }

    public void setUsuarioPrateleiras(final Set<Prateleira> usuarioPrateleiras) {
        this.usuarioPrateleiras = usuarioPrateleiras;
    }

}
