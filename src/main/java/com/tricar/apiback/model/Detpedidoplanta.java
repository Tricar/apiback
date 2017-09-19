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

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "detpedidoplanta")

public class Detpedidoplanta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetpedidoplanta")
    private Integer iddetpedidoplanta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant")
    private BigDecimal cant;
    @Column(name = "saldoatencion")
    private BigDecimal saldoatencion;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "idpedidoplanta", referencedColumnName = "idpedidoplanta")
    @ManyToOne(optional = false)
    private Pedidoplanta pedidoplanta;

    public Detpedidoplanta() {
    }

    public Detpedidoplanta(Integer iddetpedidoplanta) {
        this.iddetpedidoplanta = iddetpedidoplanta;
    }

    public Integer getIddetpedidoplanta() {
        return iddetpedidoplanta;
    }

    public void setIddetpedidoplanta(Integer iddetpedidoplanta) {
        this.iddetpedidoplanta = iddetpedidoplanta;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getSaldoatencion() {
        return saldoatencion;
    }

    public void setSaldoatencion(BigDecimal saldoatencion) {
        this.saldoatencion = saldoatencion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Pedidoplanta getPedidoplanta() {
        return pedidoplanta;
    }

    public void setPedidoplanta(Pedidoplanta pedidoplanta) {
        this.pedidoplanta = pedidoplanta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetpedidoplanta != null ? iddetpedidoplanta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detpedidoplanta)) {
            return false;
        }
        Detpedidoplanta other = (Detpedidoplanta) object;
        if ((this.iddetpedidoplanta == null && other.iddetpedidoplanta != null) || (this.iddetpedidoplanta != null && !this.iddetpedidoplanta.equals(other.iddetpedidoplanta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detpedidoplanta[ iddetpedidoplanta=" + iddetpedidoplanta + " ]";
    }
    
}
