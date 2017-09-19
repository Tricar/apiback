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
@Table(name = "almacen")

public class Almacen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codalm")
    private Integer codalm;
    @Size(max = 50)
    @Column(name = "nomalm")
    private String nomalm;
    @Size(max = 250)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 50)
    @Column(name = "seriedoc")
    private String seriedoc;
    @Size(max = 50)
    @Column(name = "agrupacion")
    private String agrupacion;
    @Size(max = 50)
    @Column(name = "clasificacion")
    private String clasificacion;
    @Size(max = 50)
    @Column(name = "agrupacion2")
    private String agrupacion2;
    @Size(max = 50)
    @Column(name = "agrupacionot")
    private String agrupacionot;    
    @JoinColumn(name = "idunidadnegocio", referencedColumnName = "idunidadnegocio")
    @ManyToOne(optional = false)
    private Unidadnegocio unidadnegocio;    

    public Almacen() {
    }

    public Almacen(Integer codalm) {
        this.codalm = codalm;
    }

    public Integer getCodalm() {
        return codalm;
    }

    public void setCodalm(Integer codalm) {
        this.codalm = codalm;
    }

    public String getNomalm() {
        return nomalm;
    }

    public void setNomalm(String nomalm) {
        this.nomalm = nomalm;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSeriedoc() {
        return seriedoc;
    }

    public void setSeriedoc(String seriedoc) {
        this.seriedoc = seriedoc;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAgrupacion2() {
        return agrupacion2;
    }

    public void setAgrupacion2(String agrupacion2) {
        this.agrupacion2 = agrupacion2;
    }

    public String getAgrupacionot() {
        return agrupacionot;
    }

    public void setAgrupacionot(String agrupacionot) {
        this.agrupacionot = agrupacionot;
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
        hash += (codalm != null ? codalm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacen)) {
            return false;
        }
        Almacen other = (Almacen) object;
        if ((this.codalm == null && other.codalm != null) || (this.codalm != null && !this.codalm.equals(other.codalm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Almacen[ codalm=" + codalm + " ]";
    }
    
}
