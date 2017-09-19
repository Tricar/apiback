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
@Table(name = "tipocaja")

public class Tipocaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocaja")
    private Integer idtipocaja;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    
    public Tipocaja() {
    }

    public Tipocaja(Integer idtipocaja) {
        this.idtipocaja = idtipocaja;
    }

    public Integer getIdtipocaja() {
        return idtipocaja;
    }

    public void setIdtipocaja(Integer idtipocaja) {
        this.idtipocaja = idtipocaja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocaja != null ? idtipocaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocaja)) {
            return false;
        }
        Tipocaja other = (Tipocaja) object;
        if ((this.idtipocaja == null && other.idtipocaja != null) || (this.idtipocaja != null && !this.idtipocaja.equals(other.idtipocaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipocaja[ idtipocaja=" + idtipocaja + " ]";
    }
    
}
