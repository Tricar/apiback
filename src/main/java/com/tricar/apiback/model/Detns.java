package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "detns")

public class Detns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codetns")
    private Integer codetns;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "origenrq")
    private Integer origenrq;
    @Column(name = "codconsumo")
    private Integer codconsumo;
    @Size(max = 50)
    @Column(name = "consumo")
    private String consumo;
    @Column(name = "saldons")
    private BigDecimal saldons;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Column(name = "idmovcostos")
    private Integer idmovcostos;
    @Column(name = "sobrantes")
    private BigDecimal sobrantes;
    @Column(name = "cantidadpedida")
    private BigDecimal cantidadpedida;
    @Column(name = "saldodelpedido")
    private BigDecimal saldodelpedido;
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "codcabns", referencedColumnName = "codcabns")
    @ManyToOne(optional = false)
    private Cabns cabns;

    public Detns() {
    }

    public Detns(Integer codetns) {
        this.codetns = codetns;
    }

    public Integer getCodetns() {
        return codetns;
    }

    public void setCodetns(Integer codetns) {
        this.codetns = codetns;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getOrigenrq() {
        return origenrq;
    }

    public void setOrigenrq(Integer origenrq) {
        this.origenrq = origenrq;
    }

    public Integer getCodconsumo() {
        return codconsumo;
    }

    public void setCodconsumo(Integer codconsumo) {
        this.codconsumo = codconsumo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public BigDecimal getSaldons() {
        return saldons;
    }

    public void setSaldons(BigDecimal saldons) {
        this.saldons = saldons;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechaultimomod() {
        return fechaultimomod;
    }

    public void setFechaultimomod(Date fechaultimomod) {
        this.fechaultimomod = fechaultimomod;
    }

    public Integer getIdmovcostos() {
        return idmovcostos;
    }

    public void setIdmovcostos(Integer idmovcostos) {
        this.idmovcostos = idmovcostos;
    }

    public BigDecimal getSobrantes() {
        return sobrantes;
    }

    public void setSobrantes(BigDecimal sobrantes) {
        this.sobrantes = sobrantes;
    }

    public BigDecimal getCantidadpedida() {
        return cantidadpedida;
    }

    public void setCantidadpedida(BigDecimal cantidadpedida) {
        this.cantidadpedida = cantidadpedida;
    }

    public BigDecimal getSaldodelpedido() {
        return saldodelpedido;
    }

    public void setSaldodelpedido(BigDecimal saldodelpedido) {
        this.saldodelpedido = saldodelpedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cabns getCabns() {
        return cabns;
    }

    public void setCabns(Cabns cabns) {
        this.cabns = cabns;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codetns != null ? codetns.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detns)) {
            return false;
        }
        Detns other = (Detns) object;
        if ((this.codetns == null && other.codetns != null) || (this.codetns != null && !this.codetns.equals(other.codetns))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detns[ codetns=" + codetns + " ]";
    }
    
}
