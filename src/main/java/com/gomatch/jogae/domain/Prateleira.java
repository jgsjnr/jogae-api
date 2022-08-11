package com.gomatch.jogae.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Prateleira {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPrateleira;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario", nullable = false)
    private CadastroUsuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_jogo", nullable = false)
    private Jogo jogo;

    public Integer getIdPrateleira() {
        return idPrateleira;
    }

    public void setIdPrateleira(final Integer idPrateleira) {
        this.idPrateleira = idPrateleira;
    }

    public CadastroUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(final CadastroUsuario usuario) {
        this.usuario = usuario;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(final Jogo jogo) {
        this.jogo = jogo;
    }

}
