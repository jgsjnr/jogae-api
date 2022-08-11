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
    private OffsetDateTime dhMatch;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario_primario", nullable = false)
    private CadastroUsuario usuarioPrimario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario_match", nullable = false)
    private CadastroUsuario usuarioMatch;

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(final Integer idMatch) {
        this.idMatch = idMatch;
    }

    public OffsetDateTime getDhMatch() {
        return dhMatch;
    }

    public void setDhMatch(final OffsetDateTime dhMatch) {
        this.dhMatch = dhMatch;
    }

    public CadastroUsuario getUsuarioPrimario() {
        return usuarioPrimario;
    }

    public void setUsuarioPrimario(final CadastroUsuario usuarioPrimario) {
        this.usuarioPrimario = usuarioPrimario;
    }

    public CadastroUsuario getUsuarioMatch() {
        return usuarioMatch;
    }

    public void setUsuarioMatch(final CadastroUsuario usuarioMatch) {
        this.usuarioMatch = usuarioMatch;
    }

}
