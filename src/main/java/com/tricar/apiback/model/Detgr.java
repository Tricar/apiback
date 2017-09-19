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
@Table(name = "detgr")

public class Detgr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetgr")
    private Integer coddetgr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Size(max = 50)
    @Column(name = "facturado")
    private String facturado;
    @Column(name = "origendetped")
    private Integer origendetped;
    @Size(max = 100)
    @Column(name = "desart")
    private String desart;
    @Column(name = "destinomov")
    private Integer destinomov;
    @Column(name = "codartdestino")
    private Integer codartdestino;
    @Column(name = "cantidadrecibida")
    private BigDecimal cantidadrecibida;
    @Column(name = "destinodetni")
    private Integer destinodetni;
    @Column(name = "preciocondescuento")
    private BigDecimal preciocondescuento;
    @Column(name = "preciosindescuento")
    private BigDecimal preciosindescuento;
    @Size(max = 50)
    @Column(name = "Nfactura")
    private String nfactura;
    @Size(max = 50)
    @Column(name = "cabni")
    private String cabni;
    @Size(max = 50)
    @Column(name = "facturafinal")
    private String facturafinal;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "iddetpedidoplanta")
    private Integer iddetpedidoplanta;
    @JoinColumn(name = "codcabgr", referencedColumnName = "codcabgr")
    @ManyToOne(optional = false)
    private Cabgr cabgr;
    @JoinColumn(name = "seriemotor", referencedColumnName = "seriemotor")
    @ManyToOne
    private Niespecificaciones niespecificaciones;
    @JoinColumn(name = "codartorigen", referencedColumnName = "codart")
    @ManyToOne
    private Articulo articulo;
    

    public Detgr() {
    }

    public Detgr(Integer coddetgr) {
        this.coddetgr = coddetgr;
    }

    public Integer getCoddetgr() {
        return coddetgr;
    }

    public void setCoddetgr(Integer coddetgr) {
        this.coddetgr = coddetgr;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getFacturado() {
        return facturado;
    }

    public void setFacturado(String facturado) {
        this.facturado = facturado;
    }

    public Integer getOrigendetped() {
        return origendetped;
    }

    public void setOrigendetped(Integer origendetped) {
        this.origendetped = origendetped;
    }

    public String getDesart() {
        return desart;
    }

    public void setDesart(String desart) {
        this.desart = desart;
    }

    public Integer getDestinomov() {
        return destinomov;
    }

    public void setDestinomov(Integer destinomov) {
        this.destinomov = destinomov;
    }

    public Integer getCodartdestino() {
        return codartdestino;
    }

    public void setCodartdestino(Integer codartdestino) {
        this.codartdestino = codartdestino;
    }

    public BigDecimal getCantidadrecibida() {
        return cantidadrecibida;
    }

    public void setCantidadrecibida(BigDecimal cantidadrecibida) {
        this.cantidadrecibida = cantidadrecibida;
    }

    public Integer getDestinodetni() {
        return destinodetni;
    }

    public void setDestinodetni(Integer destinodetni) {
        this.destinodetni = destinodetni;
    }

    public BigDecimal getPreciocondescuento() {
        return preciocondescuento;
    }

    public void setPreciocondescuento(BigDecimal preciocondescuento) {
        this.preciocondescuento = preciocondescuento;
    }

    public BigDecimal getPreciosindescuento() {
        return preciosindescuento;
    }

    public void setPreciosindescuento(BigDecimal preciosindescuento) {
        this.preciosindescuento = preciosindescuento;
    }

    public String getNfactura() {
        return nfactura;
    }

    public void setNfactura(String nfactura) {
        this.nfactura = nfactura;
    }

    public String getCabni() {
        return cabni;
    }

    public void setCabni(String cabni) {
        this.cabni = cabni;
    }

    public String getFacturafinal() {
        return facturafinal;
    }

    public void setFacturafinal(String facturafinal) {
        this.facturafinal = facturafinal;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIddetpedidoplanta() {
        return iddetpedidoplanta;
    }

    public void setIddetpedidoplanta(Integer iddetpedidoplanta) {
        this.iddetpedidoplanta = iddetpedidoplanta;
    }

    public Cabgr getCabgr() {
        return cabgr;
    }

    public void setCabgr(Cabgr cabgr) {
        this.cabgr = cabgr;
    }

    public Niespecificaciones getNiespecificaciones() {
        return niespecificaciones;
    }

    public void setNiespecificaciones(Niespecificaciones niespecificaciones) {
        this.niespecificaciones = niespecificaciones;
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
        hash += (coddetgr != null ? coddetgr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detgr)) {
            return false;
        }
        Detgr other = (Detgr) object;
        if ((this.coddetgr == null && other.coddetgr != null) || (this.coddetgr != null && !this.coddetgr.equals(other.coddetgr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detgr[ coddetgr=" + coddetgr + " ]";
    }
    
}
