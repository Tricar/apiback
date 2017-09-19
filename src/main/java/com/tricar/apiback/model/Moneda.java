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
@Table(name = "moneda")

public class Moneda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codmon")
    private Integer codmon;
    @Size(max = 50)
    @Column(name = "desmon")
    private String desmon;
    @Size(max = 50)
    @Column(name = "simmon")
    private String simmon;
    

    public Moneda() {
    }

    public Moneda(Integer codmon) {
        this.codmon = codmon;
    }

    public Integer getCodmon() {
        return codmon;
    }

    public void setCodmon(Integer codmon) {
        this.codmon = codmon;
    }

    public String getDesmon() {
        return desmon;
    }

    public void setDesmon(String desmon) {
        this.desmon = desmon;
    }

    public String getSimmon() {
        return simmon;
    }

    public void setSimmon(String simmon) {
        this.simmon = simmon;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmon != null ? codmon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneda)) {
            return false;
        }
        Moneda other = (Moneda) object;
        if ((this.codmon == null && other.codmon != null) || (this.codmon != null && !this.codmon.equals(other.codmon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Moneda[ codmon=" + codmon + " ]";
    }
    
}
