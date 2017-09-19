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
@Table(name = "recetaot")

public class Recetaot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrecetaot")
    private Integer idrecetaot;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant")
    private BigDecimal cant;
    @Column(name = "saldorecetaot")
    private BigDecimal saldorecetaot;
    @Column(name = "saldorqns")
    private BigDecimal saldorqns;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "saldorserie")
    private BigDecimal saldorserie;
    @JoinColumn(name = "coddetot", referencedColumnName = "coddetot")
    @ManyToOne(optional = false)
    private Detot detot;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Recetaot() {
    }

    public Recetaot(Integer idrecetaot) {
        this.idrecetaot = idrecetaot;
    }

    public Integer getIdrecetaot() {
        return idrecetaot;
    }

    public void setIdrecetaot(Integer idrecetaot) {
        this.idrecetaot = idrecetaot;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getSaldorecetaot() {
        return saldorecetaot;
    }

    public void setSaldorecetaot(BigDecimal saldorecetaot) {
        this.saldorecetaot = saldorecetaot;
    }

    public BigDecimal getSaldorqns() {
        return saldorqns;
    }

    public void setSaldorqns(BigDecimal saldorqns) {
        this.saldorqns = saldorqns;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public BigDecimal getSaldorserie() {
        return saldorserie;
    }

    public void setSaldorserie(BigDecimal saldorserie) {
        this.saldorserie = saldorserie;
    }
    
    public Detot getDetot() {
        return detot;
    }

    public void setDetot(Detot detot) {
        this.detot = detot;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrecetaot != null ? idrecetaot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recetaot)) {
            return false;
        }
        Recetaot other = (Recetaot) object;
        if ((this.idrecetaot == null && other.idrecetaot != null) || (this.idrecetaot != null && !this.idrecetaot.equals(other.idrecetaot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Recetaot[ idrecetaot=" + idrecetaot + " ]";
    }
    
}
