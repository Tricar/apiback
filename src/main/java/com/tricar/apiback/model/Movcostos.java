package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "movcostos")

public class Movcostos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmovcostos")
    private Integer idmovcostos;
    @Size(max = 50)
    @Column(name = "codni")
    private String codni;
    @Size(max = 50)
    @Column(name = "codns")
    private String codns;
    @Size(max = 50)
    @Column(name = "codguia")
    private String codguia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "costo")
    private BigDecimal costo;
    @Column(name = "stock")
    private BigDecimal stock;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "codproducto")
    private Integer codproducto;
    @Size(max = 150)
    @Column(name = "producto")
    private String producto;
    @Column(name = "precioundinc")
    private BigDecimal precioundinc;
    @Column(name = "idmoneda")
    private Integer idmoneda;
    @Size(max = 50)
    @Column(name = "moneda")
    private String moneda;
    @Size(max = 50)
    @Column(name = "codart2")
    private String codart2;
    @Size(max = 50)
    @Column(name = "tipomovimiento")
    private String tipomovimiento;
    @Column(name = "codalmacen")
    private Integer codalmacen;
    @Column(name = "stockanterior")
    private BigDecimal stockanterior;
    @Size(max = 150)
    @Column(name = "anexo")
    private String anexo;
    @Size(max = 50)
    @Column(name = "idtipodoc")
    private String idtipodoc;
    @Size(max = 50)
    @Column(name = "ndoc")
    private String ndoc;
    @Size(max = 50)
    @Column(name = "seriedoc")
    private String seriedoc;
    @Size(max = 50)
    @Column(name = "idtipoop")
    private String idtipoop;
    @Column(name = "costoanterior")
    private BigDecimal costoanterior;
    @Size(max = 150)
    @Column(name = "anexoolvidado")
    private String anexoolvidado;

    public Movcostos() {
    }

    public Movcostos(Integer idmovcostos) {
        this.idmovcostos = idmovcostos;
    }

    public Integer getIdmovcostos() {
        return idmovcostos;
    }

    public void setIdmovcostos(Integer idmovcostos) {
        this.idmovcostos = idmovcostos;
    }

    public String getCodni() {
        return codni;
    }

    public void setCodni(String codni) {
        this.codni = codni;
    }

    public String getCodns() {
        return codns;
    }

    public void setCodns(String codns) {
        this.codns = codns;
    }

    public String getCodguia() {
        return codguia;
    }

    public void setCodguia(String codguia) {
        this.codguia = codguia;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(Integer codproducto) {
        this.codproducto = codproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public BigDecimal getPrecioundinc() {
        return precioundinc;
    }

    public void setPrecioundinc(BigDecimal precioundinc) {
        this.precioundinc = precioundinc;
    }

    public Integer getIdmoneda() {
        return idmoneda;
    }

    public void setIdmoneda(Integer idmoneda) {
        this.idmoneda = idmoneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCodart2() {
        return codart2;
    }

    public void setCodart2(String codart2) {
        this.codart2 = codart2;
    }

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public Integer getCodalmacen() {
        return codalmacen;
    }

    public void setCodalmacen(Integer codalmacen) {
        this.codalmacen = codalmacen;
    }

    public BigDecimal getStockanterior() {
        return stockanterior;
    }

    public void setStockanterior(BigDecimal stockanterior) {
        this.stockanterior = stockanterior;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getIdtipodoc() {
        return idtipodoc;
    }

    public void setIdtipodoc(String idtipodoc) {
        this.idtipodoc = idtipodoc;
    }

    public String getNdoc() {
        return ndoc;
    }

    public void setNdoc(String ndoc) {
        this.ndoc = ndoc;
    }

    public String getSeriedoc() {
        return seriedoc;
    }

    public void setSeriedoc(String seriedoc) {
        this.seriedoc = seriedoc;
    }

    public String getIdtipoop() {
        return idtipoop;
    }

    public void setIdtipoop(String idtipoop) {
        this.idtipoop = idtipoop;
    }

    public BigDecimal getCostoanterior() {
        return costoanterior;
    }

    public void setCostoanterior(BigDecimal costoanterior) {
        this.costoanterior = costoanterior;
    }

    public String getAnexoolvidado() {
        return anexoolvidado;
    }

    public void setAnexoolvidado(String anexoolvidado) {
        this.anexoolvidado = anexoolvidado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovcostos != null ? idmovcostos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movcostos)) {
            return false;
        }
        Movcostos other = (Movcostos) object;
        if ((this.idmovcostos == null && other.idmovcostos != null) || (this.idmovcostos != null && !this.idmovcostos.equals(other.idmovcostos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Movcostos[ idmovcostos=" + idmovcostos + " ]";
    }
    
}
