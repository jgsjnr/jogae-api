package com.gomatch.jogae.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Jogador {

    @Id
    @Column(nullable = false, updatable = false, length = 60)
    private String nmNick;

    @Column(nullable = false)
    private Integer vlJogador;

    @Column(nullable = false)
    private Integer rankJogador;

    @OneToMany(mappedBy = "nmNick")
    @JsonIgnore
    private Set<CadastroUsuario> nmNickCadastroUsuarios;

    public String getNmNick() {
        return nmNick;
    }

    public void setNmNick(final String nmNick) {
        this.nmNick = nmNick;
    }

    public Integer getVlJogador() {
        return vlJogador;
    }

    public void setVlJogador(final Integer vlJogador) {
        this.vlJogador = vlJogador;
    }

    public Integer getRankJogador() {
        return rankJogador;
    }

    public void setRankJogador(final Integer rankJogador) {
        this.rankJogador = rankJogador;
    }

    public Set<CadastroUsuario> getNmNickCadastroUsuarios() {
        return nmNickCadastroUsuarios;
    }

    public void setNmNickCadastroUsuarios(final Set<CadastroUsuario> nmNickCadastroUsuarios) {
        this.nmNickCadastroUsuarios = nmNickCadastroUsuarios;
    }

}
