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
@Table(name = "tipocondpago")

public class Tipocondpago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocondpago")
    private Integer idtipocondpago;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    

    public Tipocondpago() {
    }

    public Tipocondpago(Integer idtipocondpago) {
        this.idtipocondpago = idtipocondpago;
    }

    public Integer getIdtipocondpago() {
        return idtipocondpago;
    }

    public void setIdtipocondpago(Integer idtipocondpago) {
        this.idtipocondpago = idtipocondpago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocondpago != null ? idtipocondpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocondpago)) {
            return false;
        }
        Tipocondpago other = (Tipocondpago) object;
        if ((this.idtipocondpago == null && other.idtipocondpago != null) || (this.idtipocondpago != null && !this.idtipocondpago.equals(other.idtipocondpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipocondpago[ idtipocondpago=" + idtipocondpago + " ]";
    }
    
}
