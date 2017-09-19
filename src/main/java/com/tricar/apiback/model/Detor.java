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
@Table(name = "detor")

public class Detor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetor")
    private Integer coddetor;
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
    @Column(name = "saldorq")
    private BigDecimal saldorq;
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Column(name = "subtotalneto")
    private BigDecimal subtotalneto;
    @Column(name = "subtotaligv")
    private BigDecimal subtotaligv;
    @Column(name = "saldorqns")
    private BigDecimal saldorqns;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Column(name = "consumoplan")
    private BigDecimal consumoplan;
    @Size(max = 200)
    @Column(name = "pedidocomentado")
    private String pedidocomentado;
    @Column(name = "cantsystem")
    private BigDecimal cantsystem;
    @Column(name = "stock")
    private BigDecimal stock;
    @Column(name = "stocktransitoComprallegando")
    private BigDecimal stocktransitoComprallegando;
    @Column(name = "stocktransitosaliendo")
    private BigDecimal stocktransitosaliendo;
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne
    private Articulo articulo;
    @JoinColumn(name = "codcabor", referencedColumnName = "codcabor")
    @ManyToOne(optional = false)
    private Cabor cabor;
    @JoinColumn(name = "idcentroconsumo", referencedColumnName = "idcentroconsumo")
    @ManyToOne
    private Centroconsumo centroconsumo;
    @JoinColumn(name = "idcentrocostos", referencedColumnName = "idcentrocostos")
    @ManyToOne(optional = false)
    private Centrocostos centrocostos;
    @JoinColumn(name = "idcondicion", referencedColumnName = "codconpag")
    @ManyToOne
    private Condpago condpago;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne
    private Moneda moneda;
    @JoinColumn(name = "idproveedor", referencedColumnName = "codane")
    @ManyToOne
    private Anexo anexo;    

    public Detor() {
    }

    public Detor(Integer coddetor) {
        this.coddetor = coddetor;
    }

    public Integer getCoddetor() {
        return coddetor;
    }

    public void setCoddetor(Integer coddetor) {
        this.coddetor = coddetor;
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

    public BigDecimal getSaldorq() {
        return saldorq;
    }

    public void setSaldorq(BigDecimal saldorq) {
        this.saldorq = saldorq;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
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

    public Date getFechaultimomod() {
        return fechaultimomod;
    }

    public void setFechaultimomod(Date fechaultimomod) {
        this.fechaultimomod = fechaultimomod;
    }

    public BigDecimal getConsumoplan() {
        return consumoplan;
    }

    public void setConsumoplan(BigDecimal consumoplan) {
        this.consumoplan = consumoplan;
    }

    public String getPedidocomentado() {
        return pedidocomentado;
    }

    public void setPedidocomentado(String pedidocomentado) {
        this.pedidocomentado = pedidocomentado;
    }

    public BigDecimal getCantsystem() {
        return cantsystem;
    }

    public void setCantsystem(BigDecimal cantsystem) {
        this.cantsystem = cantsystem;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getStocktransitoComprallegando() {
        return stocktransitoComprallegando;
    }

    public void setStocktransitoComprallegando(BigDecimal stocktransitoComprallegando) {
        this.stocktransitoComprallegando = stocktransitoComprallegando;
    }

    public BigDecimal getStocktransitosaliendo() {
        return stocktransitosaliendo;
    }

    public void setStocktransitosaliendo(BigDecimal stocktransitosaliendo) {
        this.stocktransitosaliendo = stocktransitosaliendo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cabor getCabor() {
        return cabor;
    }

    public void setCabor(Cabor cabor) {
        this.cabor = cabor;
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

    public Condpago getCondpago() {
        return condpago;
    }

    public void setCondpago(Condpago condpago) {
        this.condpago = condpago;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetor != null ? coddetor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detor)) {
            return false;
        }
        Detor other = (Detor) object;
        if ((this.coddetor == null && other.coddetor != null) || (this.coddetor != null && !this.coddetor.equals(other.coddetor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detor[ coddetor=" + coddetor + " ]";
    }
    
}
