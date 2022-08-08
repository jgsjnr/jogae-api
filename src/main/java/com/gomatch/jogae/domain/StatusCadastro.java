package com.gomatch.jogae.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class StatusCadastro {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatusCadastro;

    @Column(nullable = false, length = 10)
    private String nmStatusCadastro;

    @OneToMany(mappedBy = "statusCadastro")
    private Set<CadastroUsuario> statusCadastroCadastroUsuarios;

    public Integer getIdStatusCadastro() {
        return idStatusCadastro;
    }

    public void setIdStatusCadastro(final Integer idStatusCadastro) {
        this.idStatusCadastro = idStatusCadastro;
    }

    public String getNmStatusCadastro() {
        return nmStatusCadastro;
    }

    public void setNmStatusCadastro(final String nmStatusCadastro) {
        this.nmStatusCadastro = nmStatusCadastro;
    }

    public Set<CadastroUsuario> getStatusCadastroCadastroUsuarios() {
        return statusCadastroCadastroUsuarios;
    }

    public void setStatusCadastroCadastroUsuarios(
            final Set<CadastroUsuario> statusCadastroCadastroUsuarios) {
        this.statusCadastroCadastroUsuarios = statusCadastroCadastroUsuarios;
    }

}
