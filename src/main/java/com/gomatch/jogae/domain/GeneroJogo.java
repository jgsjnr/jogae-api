package com.gomatch.jogae.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class GeneroJogo {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGeneroJogo;

    @Column(nullable = false, length = 40)
    private String nmGeneroJogo;

    @OneToMany(mappedBy = "generoJogo")
    private Set<Jogo> generoJogoJogos;

    @OneToMany(mappedBy = "generoJogo")
    private Set<Grupo> generoJogoGrupos;

    @OneToMany(mappedBy = "generoJogo")
    private Set<Comunidade> generoJogoComunidades;

    public Integer getIdGeneroJogo() {
        return idGeneroJogo;
    }

    public void setIdGeneroJogo(final Integer idGeneroJogo) {
        this.idGeneroJogo = idGeneroJogo;
    }

    public String getNmGeneroJogo() {
        return nmGeneroJogo;
    }

    public void setNmGeneroJogo(final String nmGeneroJogo) {
        this.nmGeneroJogo = nmGeneroJogo;
    }

    public Set<Jogo> getGeneroJogoJogos() {
        return generoJogoJogos;
    }

    public void setGeneroJogoJogos(final Set<Jogo> generoJogoJogos) {
        this.generoJogoJogos = generoJogoJogos;
    }

    public Set<Grupo> getGeneroJogoGrupos() {
        return generoJogoGrupos;
    }

    public void setGeneroJogoGrupos(final Set<Grupo> generoJogoGrupos) {
        this.generoJogoGrupos = generoJogoGrupos;
    }

    public Set<Comunidade> getGeneroJogoComunidades() {
        return generoJogoComunidades;
    }

    public void setGeneroJogoComunidades(final Set<Comunidade> generoJogoComunidades) {
        this.generoJogoComunidades = generoJogoComunidades;
    }

}
