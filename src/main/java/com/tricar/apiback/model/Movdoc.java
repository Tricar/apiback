package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "movdoc")

public class Movdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmovdoc")
    private Integer idmovdoc;
    @Column(name = "oor")
    private Integer oor;
    @Column(name = "doc")
    private Integer doc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantmov")
    private BigDecimal cantmov;

    public Movdoc() {
    }

    public Movdoc(Integer idmovdoc) {
        this.idmovdoc = idmovdoc;
    }

    public Integer getIdmovdoc() {
        return idmovdoc;
    }

    public void setIdmovdoc(Integer idmovdoc) {
        this.idmovdoc = idmovdoc;
    }

    public Integer getOor() {
        return oor;
    }

    public void setOor(Integer oor) {
        this.oor = oor;
    }

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    public BigDecimal getCantmov() {
        return cantmov;
    }

    public void setCantmov(BigDecimal cantmov) {
        this.cantmov = cantmov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovdoc != null ? idmovdoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movdoc)) {
            return false;
        }
        Movdoc other = (Movdoc) object;
        if ((this.idmovdoc == null && other.idmovdoc != null) || (this.idmovdoc != null && !this.idmovdoc.equals(other.idmovdoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Movdoc[ idmovdoc=" + idmovdoc + " ]";
    }
    
}
