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
@Table(name = "tipoos")

public class Tipoos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoos")
    private Integer idtipoos;
    @Size(max = 50)
    @Column(name = "tipoos")
    private String tipoos;
    

    public Tipoos() {
    }

    public Tipoos(Integer idtipoos) {
        this.idtipoos = idtipoos;
    }

    public Integer getIdtipoos() {
        return idtipoos;
    }

    public void setIdtipoos(Integer idtipoos) {
        this.idtipoos = idtipoos;
    }

    public String getTipoos() {
        return tipoos;
    }

    public void setTipoos(String tipoos) {
        this.tipoos = tipoos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoos != null ? idtipoos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoos)) {
            return false;
        }
        Tipoos other = (Tipoos) object;
        if ((this.idtipoos == null && other.idtipoos != null) || (this.idtipoos != null && !this.idtipoos.equals(other.idtipoos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipoos[ idtipoos=" + idtipoos + " ]";
    }
    
}
