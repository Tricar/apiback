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
@Table(name = "articuloplan")

public class Articuloplan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idarticuloplan")
    private Integer idarticuloplan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @JoinColumn(name = "cabrq", referencedColumnName = "codcabor")
    @ManyToOne(optional = false)
    private Cabor cabor;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Articuloplan() {
    }

    public Articuloplan(Integer idarticuloplan) {
        this.idarticuloplan = idarticuloplan;
    }

    public Integer getIdarticuloplan() {
        return idarticuloplan;
    }

    public void setIdarticuloplan(Integer idarticuloplan) {
        this.idarticuloplan = idarticuloplan;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Cabor getCabor() {
        return cabor;
    }

    public void setCabor(Cabor cabor) {
        this.cabor = cabor;
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
        hash += (idarticuloplan != null ? idarticuloplan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articuloplan)) {
            return false;
        }
        Articuloplan other = (Articuloplan) object;
        if ((this.idarticuloplan == null && other.idarticuloplan != null) || (this.idarticuloplan != null && !this.idarticuloplan.equals(other.idarticuloplan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Articuloplan[ idarticuloplan=" + idarticuloplan + " ]";
    }
    
}
