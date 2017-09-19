package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "detnc")

public class Detnc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetnc")
    private Integer iddetnc;
    @Size(max = 300)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Column(name = "precuni")
    private BigDecimal precuni;
    @JoinColumn(name = "codcabnc", referencedColumnName = "codcabnc")
    @ManyToOne
    private Cabnc cabnc;

    public Detnc() {
    }

    public Detnc(Integer iddetnc) {
        this.iddetnc = iddetnc;
    }

    public Integer getIddetnc() {
        return iddetnc;
    }

    public void setIddetnc(Integer iddetnc) {
        this.iddetnc = iddetnc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getPrecuni() {
        return precuni;
    }

    public void setPrecuni(BigDecimal precuni) {
        this.precuni = precuni;
    }

    public Cabnc getCabnc() {
        return cabnc;
    }

    public void setCabnc(Cabnc cabnc) {
        this.cabnc = cabnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetnc != null ? iddetnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detnc)) {
            return false;
        }
        Detnc other = (Detnc) object;
        if ((this.iddetnc == null && other.iddetnc != null) || (this.iddetnc != null && !this.iddetnc.equals(other.iddetnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detnc[ iddetnc=" + iddetnc + " ]";
    }
    
}
