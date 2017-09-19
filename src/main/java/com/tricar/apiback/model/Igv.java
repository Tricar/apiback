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
@Table(name = "igv")

public class Igv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigv")
    private Integer codigv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "igv")
    private BigDecimal igv;

    public Igv() {
    }

    public Igv(Integer codigv) {
        this.codigv = codigv;
    }

    public Integer getCodigv() {
        return codigv;
    }

    public void setCodigv(Integer codigv) {
        this.codigv = codigv;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigv != null ? codigv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Igv)) {
            return false;
        }
        Igv other = (Igv) object;
        if ((this.codigv == null && other.codigv != null) || (this.codigv != null && !this.codigv.equals(other.codigv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Igv[ codigv=" + codigv + " ]";
    }
    
}
