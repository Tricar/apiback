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
@Table(name = "direccionunidad")

public class Direccionunidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddireccionunidades")
    private Integer iddireccionunidades;
    @Size(max = 350)
    @Column(name = "direcciones")
    private String direcciones;

    public Direccionunidad() {
    }

    public Direccionunidad(Integer iddireccionunidades) {
        this.iddireccionunidades = iddireccionunidades;
    }

    public Integer getIddireccionunidades() {
        return iddireccionunidades;
    }

    public void setIddireccionunidades(Integer iddireccionunidades) {
        this.iddireccionunidades = iddireccionunidades;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddireccionunidades != null ? iddireccionunidades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccionunidad)) {
            return false;
        }
        Direccionunidad other = (Direccionunidad) object;
        if ((this.iddireccionunidades == null && other.iddireccionunidades != null) || (this.iddireccionunidades != null && !this.iddireccionunidades.equals(other.iddireccionunidades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Direccionunidad[ iddireccionunidades=" + iddireccionunidades + " ]";
    }
    
}
