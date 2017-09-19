package com.tricar.apiback.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "centroconsumo")

public class Centroconsumo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcentroconsumo")
    private Integer idcentroconsumo;
    @Size(max = 50)
    @Column(name = "centroconsumo")
    private String centroconsumo;    
    @JoinColumn(name = "idcentrocostos", referencedColumnName = "idcentrocostos")
    @ManyToOne(optional = false)
    private Centrocostos centrocostos;

    public Centroconsumo() {
    }

    public Centroconsumo(Integer idcentroconsumo) {
        this.idcentroconsumo = idcentroconsumo;
    }

    public Integer getIdcentroconsumo() {
        return idcentroconsumo;
    }

    public void setIdcentroconsumo(Integer idcentroconsumo) {
        this.idcentroconsumo = idcentroconsumo;
    }

    public String getCentroconsumo() {
        return centroconsumo;
    }

    public void setCentroconsumo(String centroconsumo) {
        this.centroconsumo = centroconsumo;
    }

    public Centrocostos getCentrocostos() {
        return centrocostos;
    }

    public void setCentrocostos(Centrocostos centrocostos) {
        this.centrocostos = centrocostos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcentroconsumo != null ? idcentroconsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centroconsumo)) {
            return false;
        }
        Centroconsumo other = (Centroconsumo) object;
        if ((this.idcentroconsumo == null && other.idcentroconsumo != null) || (this.idcentroconsumo != null && !this.idcentroconsumo.equals(other.idcentroconsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Centroconsumo[ idcentroconsumo=" + idcentroconsumo + " ]";
    }
    
}
