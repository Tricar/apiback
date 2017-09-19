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
@Table(name = "tipodoc")

public class Tipodoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipodoc")
    private Integer idtipodoc;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 50)
    @Column(name = "codigocontable")
    private String codigocontable;
    

    public Tipodoc() {
    }

    public Tipodoc(Integer idtipodoc) {
        this.idtipodoc = idtipodoc;
    }

    public Integer getIdtipodoc() {
        return idtipodoc;
    }

    public void setIdtipodoc(Integer idtipodoc) {
        this.idtipodoc = idtipodoc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigocontable() {
        return codigocontable;
    }

    public void setCodigocontable(String codigocontable) {
        this.codigocontable = codigocontable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodoc != null ? idtipodoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodoc)) {
            return false;
        }
        Tipodoc other = (Tipodoc) object;
        if ((this.idtipodoc == null && other.idtipodoc != null) || (this.idtipodoc != null && !this.idtipodoc.equals(other.idtipodoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipodoc[ idtipodoc=" + idtipodoc + " ]";
    }
    
}
