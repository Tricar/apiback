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
@Table(name = "receta")

public class Receta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreceta")
    private Integer idreceta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "cantidaminima")
    private Integer cantidaminima;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @JoinColumn(name = "codarticuloreceta", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo1;

    public Receta() {
    }

    public Receta(Integer idreceta) {
        this.idreceta = idreceta;
    }

    public Integer getIdreceta() {
        return idreceta;
    }

    public void setIdreceta(Integer idreceta) {
        this.idreceta = idreceta;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidaminima() {
        return cantidaminima;
    }

    public void setCantidaminima(Integer cantidaminima) {
        this.cantidaminima = cantidaminima;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Articulo getArticulo1() {
        return articulo1;
    }

    public void setArticulo1(Articulo articulo1) {
        this.articulo1 = articulo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreceta != null ? idreceta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receta)) {
            return false;
        }
        Receta other = (Receta) object;
        if ((this.idreceta == null && other.idreceta != null) || (this.idreceta != null && !this.idreceta.equals(other.idreceta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Receta[ idreceta=" + idreceta + " ]";
    }
    
}
