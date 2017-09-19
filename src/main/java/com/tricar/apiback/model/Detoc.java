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
@Table(name = "detoc")

public class Detoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetoc")
    private Integer coddetoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant")
    private BigDecimal cant;
    @Column(name = "preuni")
    private BigDecimal preuni;
    @Column(name = "preinc")
    private BigDecimal preinc;
    @Column(name = "dscto")
    private BigDecimal dscto;
    @Column(name = "igv")
    private BigDecimal igv;
    @Column(name = "ademon")
    private BigDecimal ademon;
    @Column(name = "saldomon")
    private BigDecimal saldomon;
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Column(name = "saldocant")
    private BigDecimal saldocant;
    @Column(name = "adecant")
    private BigDecimal adecant;
    @Column(name = "subtotalneto")
    private BigDecimal subtotalneto;
    @Column(name = "subtotaligv")
    private BigDecimal subtotaligv;
    @Column(name = "saldooc")
    private BigDecimal saldooc;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Size(max = 50)
    @Column(name = "fechaingresoalmacen")
    private String fechaingresoalmacen;
    @Size(max = 200)
    @Column(name = "pedidocomentado")
    private String pedidocomentado;
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne
    private Articulo articulo;
    @JoinColumn(name = "codcab", referencedColumnName = "codcabc")
    @ManyToOne(optional = false)
    private Caboc caboc;
    @JoinColumn(name = "idcentroconsumo", referencedColumnName = "idcentroconsumo")
    @ManyToOne
    private Centroconsumo centroconsumo;
    @JoinColumn(name = "idcentrocostos", referencedColumnName = "idcentrocostos")
    @ManyToOne(optional = false)
    private Centrocostos centrocostos;
    @JoinColumn(name = "origenrq", referencedColumnName = "coddetor")
    @ManyToOne
    private Detor detor;    

    public Detoc() {
    }

    public Detoc(Integer coddetoc) {
        this.coddetoc = coddetoc;
    }

    public Integer getCoddetoc() {
        return coddetoc;
    }

    public void setCoddetoc(Integer coddetoc) {
        this.coddetoc = coddetoc;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getPreuni() {
        return preuni;
    }

    public void setPreuni(BigDecimal preuni) {
        this.preuni = preuni;
    }

    public BigDecimal getPreinc() {
        return preinc;
    }

    public void setPreinc(BigDecimal preinc) {
        this.preinc = preinc;
    }

    public BigDecimal getDscto() {
        return dscto;
    }

    public void setDscto(BigDecimal dscto) {
        this.dscto = dscto;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getAdemon() {
        return ademon;
    }

    public void setAdemon(BigDecimal ademon) {
        this.ademon = ademon;
    }

    public BigDecimal getSaldomon() {
        return saldomon;
    }

    public void setSaldomon(BigDecimal saldomon) {
        this.saldomon = saldomon;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getSaldocant() {
        return saldocant;
    }

    public void setSaldocant(BigDecimal saldocant) {
        this.saldocant = saldocant;
    }

    public BigDecimal getAdecant() {
        return adecant;
    }

    public void setAdecant(BigDecimal adecant) {
        this.adecant = adecant;
    }

    public BigDecimal getSubtotalneto() {
        return subtotalneto;
    }

    public void setSubtotalneto(BigDecimal subtotalneto) {
        this.subtotalneto = subtotalneto;
    }

    public BigDecimal getSubtotaligv() {
        return subtotaligv;
    }

    public void setSubtotaligv(BigDecimal subtotaligv) {
        this.subtotaligv = subtotaligv;
    }

    public BigDecimal getSaldooc() {
        return saldooc;
    }

    public void setSaldooc(BigDecimal saldooc) {
        this.saldooc = saldooc;
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

    public String getFechaingresoalmacen() {
        return fechaingresoalmacen;
    }

    public void setFechaingresoalmacen(String fechaingresoalmacen) {
        this.fechaingresoalmacen = fechaingresoalmacen;
    }

    public String getPedidocomentado() {
        return pedidocomentado;
    }

    public void setPedidocomentado(String pedidocomentado) {
        this.pedidocomentado = pedidocomentado;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Caboc getCaboc() {
        return caboc;
    }

    public void setCaboc(Caboc caboc) {
        this.caboc = caboc;
    }

    public Centroconsumo getCentroconsumo() {
        return centroconsumo;
    }

    public void setCentroconsumo(Centroconsumo centroconsumo) {
        this.centroconsumo = centroconsumo;
    }

    public Centrocostos getCentrocostos() {
        return centrocostos;
    }

    public void setCentrocostos(Centrocostos centrocostos) {
        this.centrocostos = centrocostos;
    }

    public Detor getDetor() {
        return detor;
    }

    public void setDetor(Detor detor) {
        this.detor = detor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetoc != null ? coddetoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detoc)) {
            return false;
        }
        Detoc other = (Detoc) object;
        if ((this.coddetoc == null && other.coddetoc != null) || (this.coddetoc != null && !this.coddetoc.equals(other.coddetoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detoc[ coddetoc=" + coddetoc + " ]";
    }
    
}
