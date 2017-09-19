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
@Table(name = "tipopedido")
public class Tipopedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipopedido")
    private Integer idtipopedido;
    @Size(max = 50)
    @Column(name = "tipopedido")
    private String tipopedido;
    
    public Tipopedido() {
    }

    public Tipopedido(Integer idtipopedido) {
        this.idtipopedido = idtipopedido;
    }

    public Integer getIdtipopedido() {
        return idtipopedido;
    }

    public void setIdtipopedido(Integer idtipopedido) {
        this.idtipopedido = idtipopedido;
    }

    public String getTipopedido() {
        return tipopedido;
    }

    public void setTipopedido(String tipopedido) {
        this.tipopedido = tipopedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopedido != null ? idtipopedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopedido)) {
            return false;
        }
        Tipopedido other = (Tipopedido) object;
        if ((this.idtipopedido == null && other.idtipopedido != null) || (this.idtipopedido != null && !this.idtipopedido.equals(other.idtipopedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipopedido[ idtipopedido=" + idtipopedido + " ]";
    }
    
}
