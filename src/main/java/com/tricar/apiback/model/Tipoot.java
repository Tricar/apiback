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
@Table(name = "tipoot")
public class Tipoot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoot")
    private Integer idtipoot;
    @Size(max = 3)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idalmacen", referencedColumnName = "codalm")
    @ManyToOne(optional = false)
    private Almacen almacen;
    @JoinColumn(name = "idciudad", referencedColumnName = "idciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudad;

    public Tipoot() {
    }

    public Tipoot(Integer idtipoot) {
        this.idtipoot = idtipoot;
    }

    public Integer getIdtipoot() {
        return idtipoot;
    }

    public void setIdtipoot(Integer idtipoot) {
        this.idtipoot = idtipoot;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoot != null ? idtipoot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoot)) {
            return false;
        }
        Tipoot other = (Tipoot) object;
        if ((this.idtipoot == null && other.idtipoot != null) || (this.idtipoot != null && !this.idtipoot.equals(other.idtipoot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipoot[ idtipoot=" + idtipoot + " ]";
    }
    
}
