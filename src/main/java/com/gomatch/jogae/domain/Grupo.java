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
public class Grupo {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGrupo;

    @Column(nullable = false, length = 40)
    private String nmGrupo;

    @Column
    private OffsetDateTime dhCriacao;

    @Column
    private OffsetDateTime dhAtualizacao;

    @Column
    private OffsetDateTime dhExclusao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jogo")
    private Jogo jogo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_genero_jogo")
    private GeneroJogo generoJogo;

    @OneToMany(mappedBy = "grupo")
    private Set<CadastroUsuario> grupoCadastroUsuarios;

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(final Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNmGrupo() {
        return nmGrupo;
    }

    public void setNmGrupo(final String nmGrupo) {
        this.nmGrupo = nmGrupo;
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

    public Set<CadastroUsuario> getGrupoCadastroUsuarios() {
        return grupoCadastroUsuarios;
    }

    public void setGrupoCadastroUsuarios(final Set<CadastroUsuario> grupoCadastroUsuarios) {
        this.grupoCadastroUsuarios = grupoCadastroUsuarios;
    }

}
