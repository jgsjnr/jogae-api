package com.gomatch.jogae.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Jogador {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNick;

    @Column(nullable = false, length = 60)
    private String nmNick;

    public Integer getIdNick() {
        return idNick;
    }

    public void setIdNick(final Integer idNick) {
        this.idNick = idNick;
    }

    public String getNmNick() {
        return nmNick;
    }

    public void setNmNick(final String nmNick) {
        this.nmNick = nmNick;
    }

}