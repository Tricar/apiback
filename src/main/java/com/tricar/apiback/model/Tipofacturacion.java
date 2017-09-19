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
@Table(name = "tipofacturacion")

public class Tipofacturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipofacturacion")
    private Integer idtipofacturacion;
    @Size(max = 50)
    @Column(name = "tipo")
    private String tipo;
    
    public Tipofacturacion() {
    }

    public Tipofacturacion(Integer idtipofacturacion) {
        this.idtipofacturacion = idtipofacturacion;
    }

    public Integer getIdtipofacturacion() {
        return idtipofacturacion;
    }

    public void setIdtipofacturacion(Integer idtipofacturacion) {
        this.idtipofacturacion = idtipofacturacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipofacturacion != null ? idtipofacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipofacturacion)) {
            return false;
        }
        Tipofacturacion other = (Tipofacturacion) object;
        if ((this.idtipofacturacion == null && other.idtipofacturacion != null) || (this.idtipofacturacion != null && !this.idtipofacturacion.equals(other.idtipofacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipofacturacion[ idtipofacturacion=" + idtipofacturacion + " ]";
    }
    
}
