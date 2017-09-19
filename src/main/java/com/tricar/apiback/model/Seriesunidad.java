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

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "seriesunidad")

public class Seriesunidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idseriesunidad")
    private Integer idseriesunidad;
    @JoinColumn(name = "idserie", referencedColumnName = "idserie")
    @ManyToOne(optional = false)
    private Serie serie;
    @JoinColumn(name = "idunidadnegocio", referencedColumnName = "idunidadnegocio")
    @ManyToOne(optional = false)
    private Unidadnegocio unidadnegocio;

    public Seriesunidad() {
    }

    public Seriesunidad(Integer idseriesunidad) {
        this.idseriesunidad = idseriesunidad;
    }

    public Integer getIdseriesunidad() {
        return idseriesunidad;
    }

    public void setIdseriesunidad(Integer idseriesunidad) {
        this.idseriesunidad = idseriesunidad;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Unidadnegocio getUnidadnegocio() {
        return unidadnegocio;
    }

    public void setUnidadnegocio(Unidadnegocio unidadnegocio) {
        this.unidadnegocio = unidadnegocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idseriesunidad != null ? idseriesunidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seriesunidad)) {
            return false;
        }
        Seriesunidad other = (Seriesunidad) object;
        if ((this.idseriesunidad == null && other.idseriesunidad != null) || (this.idseriesunidad != null && !this.idseriesunidad.equals(other.idseriesunidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Seriesunidad[ idseriesunidad=" + idseriesunidad + " ]";
    }
    
}
