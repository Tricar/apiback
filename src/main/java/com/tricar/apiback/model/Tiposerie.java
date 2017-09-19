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
@Table(name = "tiposerie")
public class Tiposerie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtiposerie")
    private Integer idtiposerie;
    @Size(max = 50)
    @Column(name = "tiposerie")
    private String tiposerie;
    
    public Tiposerie() {
    }

    public Tiposerie(Integer idtiposerie) {
        this.idtiposerie = idtiposerie;
    }

    public Integer getIdtiposerie() {
        return idtiposerie;
    }

    public void setIdtiposerie(Integer idtiposerie) {
        this.idtiposerie = idtiposerie;
    }

    public String getTiposerie() {
        return tiposerie;
    }

    public void setTiposerie(String tiposerie) {
        this.tiposerie = tiposerie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposerie != null ? idtiposerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposerie)) {
            return false;
        }
        Tiposerie other = (Tiposerie) object;
        if ((this.idtiposerie == null && other.idtiposerie != null) || (this.idtiposerie != null && !this.idtiposerie.equals(other.idtiposerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tiposerie[ idtiposerie=" + idtiposerie + " ]";
    }
    
}
