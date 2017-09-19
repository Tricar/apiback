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
@Table(name = "tipoarticulo")

public class Tipoarticulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codtipart")
    private Integer codtipart;
    @Size(max = 50)
    @Column(name = "destipartic")
    private String destipartic;
    @Size(max = 50)
    @Column(name = "abreviatura")
    private String abreviatura;
    

    public Tipoarticulo() {
    }

    public Tipoarticulo(Integer codtipart) {
        this.codtipart = codtipart;
    }

    public Integer getCodtipart() {
        return codtipart;
    }

    public void setCodtipart(Integer codtipart) {
        this.codtipart = codtipart;
    }

    public String getDestipartic() {
        return destipartic;
    }

    public void setDestipartic(String destipartic) {
        this.destipartic = destipartic;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipart != null ? codtipart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoarticulo)) {
            return false;
        }
        Tipoarticulo other = (Tipoarticulo) object;
        if ((this.codtipart == null && other.codtipart != null) || (this.codtipart != null && !this.codtipart.equals(other.codtipart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Tipoarticulo[ codtipart=" + codtipart + " ]";
    }
    
}
