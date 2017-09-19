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
@Table(name = "articulosfabrican")

public class Articulosfabrican implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idarticulofabrican")
    private Integer idarticulofabrican;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "system")
    private BigDecimal system;
    @Column(name = "stock")
    private BigDecimal stock;
    @Column(name = "pentiendesingreso")
    private BigDecimal pentiendesingreso;
    @Column(name = "pentiendessalida")
    private BigDecimal pentiendessalida;
    @Column(name = "consumo")
    private BigDecimal consumo;
    @JoinColumn(name = "cabrq", referencedColumnName = "codcabor")
    @ManyToOne
    private Cabor cabor;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Articulosfabrican() {
    }

    public Articulosfabrican(Integer idarticulofabrican) {
        this.idarticulofabrican = idarticulofabrican;
    }

    public Integer getIdarticulofabrican() {
        return idarticulofabrican;
    }

    public void setIdarticulofabrican(Integer idarticulofabrican) {
        this.idarticulofabrican = idarticulofabrican;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSystem() {
        return system;
    }

    public void setSystem(BigDecimal system) {
        this.system = system;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getPentiendesingreso() {
        return pentiendesingreso;
    }

    public void setPentiendesingreso(BigDecimal pentiendesingreso) {
        this.pentiendesingreso = pentiendesingreso;
    }

    public BigDecimal getPentiendessalida() {
        return pentiendessalida;
    }

    public void setPentiendessalida(BigDecimal pentiendessalida) {
        this.pentiendessalida = pentiendessalida;
    }

    public BigDecimal getConsumo() {
        return consumo;
    }

    public void setConsumo(BigDecimal consumo) {
        this.consumo = consumo;
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
        hash += (idarticulofabrican != null ? idarticulofabrican.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulosfabrican)) {
            return false;
        }
        Articulosfabrican other = (Articulosfabrican) object;
        if ((this.idarticulofabrican == null && other.idarticulofabrican != null) || (this.idarticulofabrican != null && !this.idarticulofabrican.equals(other.idarticulofabrican))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Articulosfabrican[ idarticulofabrican=" + idarticulofabrican + " ]";
    }
    
}
