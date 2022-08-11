package com.gomatch.jogae.domain;

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
public class Comunidade {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComunidade;

    @Column(length = 60)
    private String nmComunidade;

    @Column(nullable = false)
    private OffsetDateTime dhCriacao;

    @Column
    private OffsetDateTime dhAtualizacao;

    @Column
    private OffsetDateTime dhExclusao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_jogo")
    private Jogo jogo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_genero_jogo")
    private GeneroJogo generoJogo;

    @OneToMany(mappedBy = "comunidade")
    private Set<CadastroUsuario> comunidadeCadastroUsuarios;

    public Integer getIdComunidade() {
        return idComunidade;
    }

    public void setIdComunidade(final Integer idComunidade) {
        this.idComunidade = idComunidade;
    }

    public String getNmComunidade() {
        return nmComunidade;
    }

    public void setNmComunidade(final String nmComunidade) {
        this.nmComunidade = nmComunidade;
    }

    public OffsetDateTime getDhCriacao() {
        return dhCriacao;
    }

    public void setDhCriacao(final OffsetDateTime dhCriacao) {
        this.dhCriacao = dhCriacao;
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

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(final Jogo jogo) {
        this.jogo = jogo;
    }

    public GeneroJogo getGeneroJogo() {
        return generoJogo;
    }

    public void setGeneroJogo(final GeneroJogo generoJogo) {
        this.generoJogo = generoJogo;
    }

    public Set<CadastroUsuario> getComunidadeCadastroUsuarios() {
        return comunidadeCadastroUsuarios;
    }

    public void setComunidadeCadastroUsuarios(
            final Set<CadastroUsuario> comunidadeCadastroUsuarios) {
        this.comunidadeCadastroUsuarios = comunidadeCadastroUsuarios;
    }

}
