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
@Table(name = "unidad")
public class Unidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coduni")
    private Integer coduni;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 50)
    @Column(name = "simuni")
    private String simuni;
    
    public Unidad() {
    }

    public Unidad(Integer coduni) {
        this.coduni = coduni;
    }

    public Integer getCoduni() {
        return coduni;
    }

    public void setCoduni(Integer coduni) {
        this.coduni = coduni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSimuni() {
        return simuni;
    }

    public void setSimuni(String simuni) {
        this.simuni = simuni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coduni != null ? coduni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidad)) {
            return false;
        }
        Unidad other = (Unidad) object;
        if ((this.coduni == null && other.coduni != null) || (this.coduni != null && !this.coduni.equals(other.coduni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Unidad[ coduni=" + coduni + " ]";
    }
    
}
