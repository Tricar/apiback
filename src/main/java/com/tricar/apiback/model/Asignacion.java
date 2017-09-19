package com.tricar.apiback.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "asignacion")

public class Asignacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idasignacion")
    private Integer idasignacion;
    @JoinColumn(name = "idespecificaciones", referencedColumnName = "seriemotor")
    @ManyToOne(optional = false)
    private Niespecificaciones niespecificaciones;
    @JoinColumn(name = "idrecetaot", referencedColumnName = "idrecetaot")
    @ManyToOne(optional = false)
    private Recetaot recetaot;

    public Asignacion() {
    }

    public Asignacion(Integer idasignacion) {
        this.idasignacion = idasignacion;
    }

    public Integer getIdasignacion() {
        return idasignacion;
    }

    public void setIdasignacion(Integer idasignacion) {
        this.idasignacion = idasignacion;
    }

    public Niespecificaciones getNiespecificaciones() {
        return niespecificaciones;
    }

    public void setNiespecificaciones(Niespecificaciones niespecificaciones) {
        this.niespecificaciones = niespecificaciones;
    }

    public Recetaot getRecetaot() {
        return recetaot;
    }

    public void setRecetaot(Recetaot recetaot) {
        this.recetaot = recetaot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idasignacion != null ? idasignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignacion)) {
            return false;
        }
        Asignacion other = (Asignacion) object;
        if ((this.idasignacion == null && other.idasignacion != null) || (this.idasignacion != null && !this.idasignacion.equals(other.idasignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Asignacion[ idasignacion=" + idasignacion + " ]";
    }
    
}
