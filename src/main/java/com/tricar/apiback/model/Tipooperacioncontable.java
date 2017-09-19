package com.tricar.apiback.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "tipooperacioncontable")

public class Tipooperacioncontable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoop")
    private Integer idtipoop;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 50)
    @Column(name = "codigocontableto")
    private String codigocontableto;
    
    public Tipooperacioncontable() {
    }

    public Tipooperacioncontable(Integer idtipoop) {
        this.idtipoop = idtipoop;
    }

    public Integer getIdtipoop() {
        return idtipoop;
    }

    public void setIdtipoop(Integer idtipoop) {
        this.idtipoop = idtipoop;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigocontableto() {
        return codigocontableto;
    }

    public void setCodigocontableto(String codigocontableto) {
        this.codigocontableto = codigocontableto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoop != null ? idtipoop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipooperacioncontable)) {
            return false;
        }
        Tipooperacioncontable other = (Tipooperacioncontable) object;
        if ((this.idtipoop == null && other.idtipoop != null) || (this.idtipoop != null && !this.idtipoop.equals(other.idtipoop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipooperacioncontable[ idtipoop=" + idtipoop + " ]";
    }
    
}
