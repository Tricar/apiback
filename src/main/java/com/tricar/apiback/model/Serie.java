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
@Table(name = "serie")

public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idserie")
    private Integer idserie;
    @Size(max = 50)
    @Column(name = "serie")
    private String serie;
    @Column(name = "ultimocorrelativo")
    private Integer ultimocorrelativo;
    @JoinColumn(name = "idtiposerie", referencedColumnName = "idtiposerie")
    @ManyToOne(optional = false)
    private Tiposerie tiposerie;

    public Serie() {
    }

    public Serie(Integer idserie) {
        this.idserie = idserie;
    }

    public Integer getIdserie() {
        return idserie;
    }

    public void setIdserie(Integer idserie) {
        this.idserie = idserie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getUltimocorrelativo() {
        return ultimocorrelativo;
    }

    public void setUltimocorrelativo(Integer ultimocorrelativo) {
        this.ultimocorrelativo = ultimocorrelativo;
    }

    public Tiposerie getTiposerie() {
        return tiposerie;
    }

    public void setTiposerie(Tiposerie tiposerie) {
        this.tiposerie = tiposerie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idserie != null ? idserie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.idserie == null && other.idserie != null) || (this.idserie != null && !this.idserie.equals(other.idserie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Serie[ idserie=" + idserie + " ]";
    }
    
}
