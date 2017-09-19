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
@Table(name = "detnp")

public class Detnp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetnp")
    private Integer coddetnp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "porcentajedescuento")
    private BigDecimal porcentajedescuento;
    @Column(name = "precioxunidadsindescuento")
    private BigDecimal precioxunidadsindescuento;
    @Column(name = "precioxunidadcondescuento")
    private BigDecimal precioxunidadcondescuento;
    @Column(name = "subtotalsindescuento")
    private BigDecimal subtotalsindescuento;
    @Column(name = "subtotalcondescuento")
    private BigDecimal subtotalcondescuento;
    @Column(name = "subtotaldescuentototal")
    private BigDecimal subtotaldescuentototal;
    @Column(name = "descuentoxunidad")
    private BigDecimal descuentoxunidad;
    @Column(name = "saldonp")
    private BigDecimal saldonp;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "saldorecerva")
    private BigDecimal saldorecerva;
    @Size(max = 50)
    @Column(name = "facturado")
    private String facturado;
    @Size(max = 50)
    @Column(name = "nfactura")
    private String nfactura;
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "codcabnp", referencedColumnName = "codcabnp")
    @ManyToOne(optional = false)
    private Cabnp cabnp;

    public Detnp() {
    }

    public Detnp(Integer coddetnp) {
        this.coddetnp = coddetnp;
    }

    public Integer getCoddetnp() {
        return coddetnp;
    }

    public void setCoddetnp(Integer coddetnp) {
        this.coddetnp = coddetnp;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPorcentajedescuento() {
        return porcentajedescuento;
    }

    public void setPorcentajedescuento(BigDecimal porcentajedescuento) {
        this.porcentajedescuento = porcentajedescuento;
    }

    public BigDecimal getPrecioxunidadsindescuento() {
        return precioxunidadsindescuento;
    }

    public void setPrecioxunidadsindescuento(BigDecimal precioxunidadsindescuento) {
        this.precioxunidadsindescuento = precioxunidadsindescuento;
    }

    public BigDecimal getPrecioxunidadcondescuento() {
        return precioxunidadcondescuento;
    }

    public void setPrecioxunidadcondescuento(BigDecimal precioxunidadcondescuento) {
        this.precioxunidadcondescuento = precioxunidadcondescuento;
    }

    public BigDecimal getSubtotalsindescuento() {
        return subtotalsindescuento;
    }

    public void setSubtotalsindescuento(BigDecimal subtotalsindescuento) {
        this.subtotalsindescuento = subtotalsindescuento;
    }

    public BigDecimal getSubtotalcondescuento() {
        return subtotalcondescuento;
    }

    public void setSubtotalcondescuento(BigDecimal subtotalcondescuento) {
        this.subtotalcondescuento = subtotalcondescuento;
    }

    public BigDecimal getSubtotaldescuentototal() {
        return subtotaldescuentototal;
    }

    public void setSubtotaldescuentototal(BigDecimal subtotaldescuentototal) {
        this.subtotaldescuentototal = subtotaldescuentototal;
    }

    public BigDecimal getDescuentoxunidad() {
        return descuentoxunidad;
    }

    public void setDescuentoxunidad(BigDecimal descuentoxunidad) {
        this.descuentoxunidad = descuentoxunidad;
    }

    public BigDecimal getSaldonp() {
        return saldonp;
    }

    public void setSaldonp(BigDecimal saldonp) {
        this.saldonp = saldonp;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public BigDecimal getSaldorecerva() {
        return saldorecerva;
    }

    public void setSaldorecerva(BigDecimal saldorecerva) {
        this.saldorecerva = saldorecerva;
    }

    public String getFacturado() {
        return facturado;
    }

    public void setFacturado(String facturado) {
        this.facturado = facturado;
    }

    public String getNfactura() {
        return nfactura;
    }

    public void setNfactura(String nfactura) {
        this.nfactura = nfactura;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cabnp getCabnp() {
        return cabnp;
    }

    public void setCabnp(Cabnp cabnp) {
        this.cabnp = cabnp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetnp != null ? coddetnp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detnp)) {
            return false;
        }
        Detnp other = (Detnp) object;
        if ((this.coddetnp == null && other.coddetnp != null) || (this.coddetnp != null && !this.coddetnp.equals(other.coddetnp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detnp[ coddetnp=" + coddetnp + " ]";
    }
    
}
