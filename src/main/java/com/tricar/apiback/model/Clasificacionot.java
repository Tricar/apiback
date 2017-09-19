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
@Table(name = "clasificacionot")

public class Clasificacionot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclasificacionot")
    private Integer idclasificacionot;
    @Size(max = 50)
    @Column(name = "clasificacion")
    private String clasificacion;
    

    public Clasificacionot() {
    }

    public Clasificacionot(Integer idclasificacionot) {
        this.idclasificacionot = idclasificacionot;
    }

    public Integer getIdclasificacionot() {
        return idclasificacionot;
    }

    public void setIdclasificacionot(Integer idclasificacionot) {
        this.idclasificacionot = idclasificacionot;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclasificacionot != null ? idclasificacionot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacionot)) {
            return false;
        }
        Clasificacionot other = (Clasificacionot) object;
        if ((this.idclasificacionot == null && other.idclasificacionot != null) || (this.idclasificacionot != null && !this.idclasificacionot.equals(other.idclasificacionot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Clasificacionot[ idclasificacionot=" + idclasificacionot + " ]";
    }
    
}
