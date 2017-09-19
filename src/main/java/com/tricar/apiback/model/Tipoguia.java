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
@Table(name = "tipoguia")

public class Tipoguia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoguia")
    private Integer idtipoguia;
    @Size(max = 50)
    @Column(name = "tipoguia")
    private String tipoguia;
    
    public Tipoguia() {
    }

    public Tipoguia(Integer idtipoguia) {
        this.idtipoguia = idtipoguia;
    }

    public Integer getIdtipoguia() {
        return idtipoguia;
    }

    public void setIdtipoguia(Integer idtipoguia) {
        this.idtipoguia = idtipoguia;
    }

    public String getTipoguia() {
        return tipoguia;
    }

    public void setTipoguia(String tipoguia) {
        this.tipoguia = tipoguia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoguia != null ? idtipoguia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoguia)) {
            return false;
        }
        Tipoguia other = (Tipoguia) object;
        if ((this.idtipoguia == null && other.idtipoguia != null) || (this.idtipoguia != null && !this.idtipoguia.equals(other.idtipoguia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipoguia[ idtipoguia=" + idtipoguia + " ]";
    }
    
}
