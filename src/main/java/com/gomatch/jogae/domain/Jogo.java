package com.gomatch.jogae.domain;

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
public class Jogo {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJogo;

    @Column(nullable = false, length = 60)
    private String nmJogo;

    @Column(nullable = false)
    private Integer vlJogo;

    @Column(nullable = false)
    private Integer rankJogo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_genero_jogo")
    private GeneroJogo generoJogo;

    @OneToMany(mappedBy = "jogo")
    private Set<Grupo> jogoGrupos;

    @OneToMany(mappedBy = "jogo")
    private Set<Comunidade> jogoComunidades;

    @OneToMany(mappedBy = "jogo")
    private Set<Prateleira> jogoPrateleiras;

    public Integer getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(final Integer idJogo) {
        this.idJogo = idJogo;
    }

    public String getNmJogo() {
        return nmJogo;
    }

    public void setNmJogo(final String nmJogo) {
        this.nmJogo = nmJogo;
    }

    public Integer getVlJogo() {
        return vlJogo;
    }

    public void setVlJogo(final Integer vlJogo) {
        this.vlJogo = vlJogo;
    }

    public Integer getRankJogo() {
        return rankJogo;
    }

    public void setRankJogo(final Integer rankJogo) {
        this.rankJogo = rankJogo;
    }

    public GeneroJogo getGeneroJogo() {
        return generoJogo;
    }

    public void setGeneroJogo(final GeneroJogo generoJogo) {
        this.generoJogo = generoJogo;
    }

    public Set<Grupo> getJogoGrupos() {
        return jogoGrupos;
    }

    public void setJogoGrupos(final Set<Grupo> jogoGrupos) {
        this.jogoGrupos = jogoGrupos;
    }

    public Set<Comunidade> getJogoComunidades() {
        return jogoComunidades;
    }

    public void setJogoComunidades(final Set<Comunidade> jogoComunidades) {
        this.jogoComunidades = jogoComunidades;
    }

    public Set<Prateleira> getJogoPrateleiras() {
        return jogoPrateleiras;
    }

    public void setJogoPrateleiras(final Set<Prateleira> jogoPrateleiras) {
        this.jogoPrateleiras = jogoPrateleiras;
    }

}
