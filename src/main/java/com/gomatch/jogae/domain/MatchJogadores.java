package com.gomatch.jogae.domain;

import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class MatchJogadores {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMatch;

    @Column
    private Boolean flMatchConvite;

    @Column
    private Boolean flMatchAceite;

    @Column
    private OffsetDateTime dhMatchConvite;

    @Column
    private OffsetDateTime dhMatchAceite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private CadastroUsuario usuario;

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(final Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Boolean getFlMatchConvite() {
        return flMatchConvite;
    }

    public void setFlMatchConvite(final Boolean flMatchConvite) {
        this.flMatchConvite = flMatchConvite;
    }

    public Boolean getFlMatchAceite() {
        return flMatchAceite;
    }

    public void setFlMatchAceite(final Boolean flMatchAceite) {
        this.flMatchAceite = flMatchAceite;
    }

    public OffsetDateTime getDhMatchConvite() {
        return dhMatchConvite;
    }

    public void setDhMatchConvite(final OffsetDateTime dhMatchConvite) {
        this.dhMatchConvite = dhMatchConvite;
    }

    public OffsetDateTime getDhMatchAceite() {
        return dhMatchAceite;
    }

    public void setDhMatchAceite(final OffsetDateTime dhMatchAceite) {
        this.dhMatchAceite = dhMatchAceite;
    }

    public CadastroUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(final CadastroUsuario usuario) {
        this.usuario = usuario;
    }

}
