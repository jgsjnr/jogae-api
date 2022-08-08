package com.gomatch.jogae.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Funcao {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncao;

    @Column(nullable = false, length = 25)
    private String nmFuncao;

    @OneToMany(mappedBy = "funcao")
    private Set<CadastroUsuario> funcaoCadastroUsuarios;

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(final Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public String getNmFuncao() {
        return nmFuncao;
    }

    public void setNmFuncao(final String nmFuncao) {
        this.nmFuncao = nmFuncao;
    }

    public Set<CadastroUsuario> getFuncaoCadastroUsuarios() {
        return funcaoCadastroUsuarios;
    }

    public void setFuncaoCadastroUsuarios(final Set<CadastroUsuario> funcaoCadastroUsuarios) {
        this.funcaoCadastroUsuarios = funcaoCadastroUsuarios;
    }

}
