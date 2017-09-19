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
@Table(name = "tipmovimiento")

public class Tipmovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codtipmov")
    private Integer codtipmov;
    @Size(max = 50)
    @Column(name = "desmov")
    private String desmov;
    

    public Tipmovimiento() {
    }

    public Tipmovimiento(Integer codtipmov) {
        this.codtipmov = codtipmov;
    }

    public Integer getCodtipmov() {
        return codtipmov;
    }

    public void setCodtipmov(Integer codtipmov) {
        this.codtipmov = codtipmov;
    }

    public String getDesmov() {
        return desmov;
    }

    public void setDesmov(String desmov) {
        this.desmov = desmov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipmov != null ? codtipmov.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipmovimiento)) {
            return false;
        }
        Tipmovimiento other = (Tipmovimiento) object;
        if ((this.codtipmov == null && other.codtipmov != null) || (this.codtipmov != null && !this.codtipmov.equals(other.codtipmov))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipmovimiento[ codtipmov=" + codtipmov + " ]";
    }
    
}
