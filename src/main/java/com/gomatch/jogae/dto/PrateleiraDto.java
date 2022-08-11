package com.gomatch.jogae.dto;

import java.io.Serializable;
import java.util.Objects;

public class PrateleiraDto implements Serializable {
    private Integer idPrateleira;

    public PrateleiraDto() {
    }

    public PrateleiraDto(Integer idPrateleira) {
        this.idPrateleira = idPrateleira;
    }

    public Integer getIdPrateleira() {
        return idPrateleira;
    }

    public void setIdPrateleira(Integer idPrateleira) {
        this.idPrateleira = idPrateleira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrateleiraDto entity = (PrateleiraDto) o;
        return Objects.equals(this.idPrateleira, entity.idPrateleira);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrateleira);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idPrateleira = " + idPrateleira + ")";
    }
}
