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
@Table(name = "centrocostos")

public class Centrocostos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcentrocostos")
    private Integer idcentrocostos;
    @Size(max = 50)
    @Column(name = "centrocostos")
    private String centrocostos;
    

    public Centrocostos() {
    }

    public Centrocostos(Integer idcentrocostos) {
        this.idcentrocostos = idcentrocostos;
    }

    public Integer getIdcentrocostos() {
        return idcentrocostos;
    }

    public void setIdcentrocostos(Integer idcentrocostos) {
        this.idcentrocostos = idcentrocostos;
    }

    public String getCentrocostos() {
        return centrocostos;
    }

    public void setCentrocostos(String centrocostos) {
        this.centrocostos = centrocostos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcentrocostos != null ? idcentrocostos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centrocostos)) {
            return false;
        }
        Centrocostos other = (Centrocostos) object;
        if ((this.idcentrocostos == null && other.idcentrocostos != null) || (this.idcentrocostos != null && !this.idcentrocostos.equals(other.idcentrocostos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Centrocostos[ idcentrocostos=" + idcentrocostos + " ]";
    }
    
}
