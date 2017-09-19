package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "configuracion")

public class Configuracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idconfiguracion")
    private Integer idconfiguracion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "parametron1n2d")
    private BigDecimal parametron1n2d;
    @Column(name = "factormora")
    private BigDecimal factormora;

    public Configuracion() {
    }

    public Configuracion(Integer idconfiguracion) {
        this.idconfiguracion = idconfiguracion;
    }

    public Integer getIdconfiguracion() {
        return idconfiguracion;
    }

    public void setIdconfiguracion(Integer idconfiguracion) {
        this.idconfiguracion = idconfiguracion;
    }

    public BigDecimal getParametron1n2d() {
        return parametron1n2d;
    }

    public void setParametron1n2d(BigDecimal parametron1n2d) {
        this.parametron1n2d = parametron1n2d;
    }

    public BigDecimal getFactormora() {
        return factormora;
    }

    public void setFactormora(BigDecimal factormora) {
        this.factormora = factormora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconfiguracion != null ? idconfiguracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configuracion)) {
            return false;
        }
        Configuracion other = (Configuracion) object;
        if ((this.idconfiguracion == null && other.idconfiguracion != null) || (this.idconfiguracion != null && !this.idconfiguracion.equals(other.idconfiguracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Configuracion[ idconfiguracion=" + idconfiguracion + " ]";
    }
    
}
