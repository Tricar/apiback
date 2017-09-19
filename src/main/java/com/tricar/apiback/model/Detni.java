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
@Table(name = "detni")

public class Detni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetni")
    private Integer coddetni;
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
    @Column(name = "subtotaligv")
    private BigDecimal subtotaligv;
    @Column(name = "subtotalneto")
    private BigDecimal subtotalneto;
    @Column(name = "codcentrocostos")
    private Integer codcentrocostos;
    @Size(max = 50)
    @Column(name = "centrocostos")
    private String centrocostos;
    @Column(name = "origendetoc")
    private Integer origendetoc;
    @Column(name = "saldonii")
    private BigDecimal saldonii;
    @Column(name = "saldoniot")
    private BigDecimal saldoniot;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechaultimamod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimamod;
    @Column(name = "idmovcostos")
    private Integer idmovcostos;
    @Size(max = 200)
    @Column(name = "pedidocomentado")
    private String pedidocomentado;
    @Size(max = 150)
    @Column(name = "origenanexo")
    private String origenanexo;    
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne
    private Articulo articulo;
    @JoinColumn(name = "codni", referencedColumnName = "codni")
    @ManyToOne(optional = false)
    private Cabni cabni;

    public Detni() {
    }

    public Detni(Integer coddetni) {
        this.coddetni = coddetni;
    }

    public Integer getCoddetni() {
        return coddetni;
    }

    public void setCoddetni(Integer coddetni) {
        this.coddetni = coddetni;
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

    public BigDecimal getSubtotaligv() {
        return subtotaligv;
    }

    public void setSubtotaligv(BigDecimal subtotaligv) {
        this.subtotaligv = subtotaligv;
    }

    public BigDecimal getSubtotalneto() {
        return subtotalneto;
    }

    public void setSubtotalneto(BigDecimal subtotalneto) {
        this.subtotalneto = subtotalneto;
    }

    public Integer getCodcentrocostos() {
        return codcentrocostos;
    }

    public void setCodcentrocostos(Integer codcentrocostos) {
        this.codcentrocostos = codcentrocostos;
    }

    public String getCentrocostos() {
        return centrocostos;
    }

    public void setCentrocostos(String centrocostos) {
        this.centrocostos = centrocostos;
    }

    public Integer getOrigendetoc() {
        return origendetoc;
    }

    public void setOrigendetoc(Integer origendetoc) {
        this.origendetoc = origendetoc;
    }

    public BigDecimal getSaldonii() {
        return saldonii;
    }

    public void setSaldonii(BigDecimal saldonii) {
        this.saldonii = saldonii;
    }

    public BigDecimal getSaldoniot() {
        return saldoniot;
    }

    public void setSaldoniot(BigDecimal saldoniot) {
        this.saldoniot = saldoniot;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechaultimamod() {
        return fechaultimamod;
    }

    public void setFechaultimamod(Date fechaultimamod) {
        this.fechaultimamod = fechaultimamod;
    }

    public Integer getIdmovcostos() {
        return idmovcostos;
    }

    public void setIdmovcostos(Integer idmovcostos) {
        this.idmovcostos = idmovcostos;
    }

    public String getPedidocomentado() {
        return pedidocomentado;
    }

    public void setPedidocomentado(String pedidocomentado) {
        this.pedidocomentado = pedidocomentado;
    }

    public String getOrigenanexo() {
        return origenanexo;
    }

    public void setOrigenanexo(String origenanexo) {
        this.origenanexo = origenanexo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cabni getCabni() {
        return cabni;
    }

    public void setCabni(Cabni cabni) {
        this.cabni = cabni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetni != null ? coddetni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detni)) {
            return false;
        }
        Detni other = (Detni) object;
        if ((this.coddetni == null && other.coddetni != null) || (this.coddetni != null && !this.coddetni.equals(other.coddetni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detni[ coddetni=" + coddetni + " ]";
    }
    
}
