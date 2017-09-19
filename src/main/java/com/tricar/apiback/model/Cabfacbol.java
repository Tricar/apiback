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
@Table(name = "cabfacbol")

public class Cabfacbol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabfa")
    private String codcabfa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalfactura")
    private BigDecimal totalfactura;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "saldofactura")
    private BigDecimal saldofactura;
    @Column(name = "totalpagado")
    private BigDecimal totalpagado;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    @Size(max = 50)
    @Column(name = "txtcabgr")
    private String txtcabgr;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimamod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimamod;
    @Column(name = "idseriesunidad")
    private Integer idseriesunidad;
    @Column(name = "nserie")
    private Integer nserie;
    @Size(max = 300)
    @Column(name = "direccionfacturacion")
    private String direccionfacturacion;
    @Column(name = "interesmoratorioaplicado")
    private Integer interesmoratorioaplicado;
    @Column(name = "montoaplicado")
    private BigDecimal montoaplicado;
    @Column(name = "diasvencidos")
    private Integer diasvencidos;
    @Column(name = "montomora")
    private BigDecimal montomora;
    @Size(max = 50)
    @Column(name = "estadovencimiento")
    private String estadovencimiento;
    @Column(name = "descuentoaplicado")
    private Integer descuentoaplicado;
    @Size(max = 50)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 50)
    @Column(name = "codigohash")
    private String codigohash;
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idcondicionpago", referencedColumnName = "codconpag")
    @ManyToOne(optional = false)
    private Condpago condpago;
    @JoinColumn(name = "idletra", referencedColumnName = "idletras")
    @ManyToOne
    private Letras letras;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne(optional = false)
    private Moneda moneda;
    @JoinColumn(name = "idserie", referencedColumnName = "idserie")
    @ManyToOne(optional = false)
    private Serie serie;
    @JoinColumn(name = "idtipofacturacon", referencedColumnName = "idtipofacturacion")
    @ManyToOne
    private Tipofacturacion tipofacturacion;
    @JoinColumn(name = "idtipopago", referencedColumnName = "idtipopago")
    @ManyToOne
    private Tipopagofactura tipopagofactura;
    @JoinColumn(name = "idtipopedido", referencedColumnName = "idtipopedido")
    @ManyToOne(optional = false)
    private Tipopedido tipopedido;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    
    
    public Cabfacbol() {
    }

    public Cabfacbol(String codcabfa) {
        this.codcabfa = codcabfa;
    }

    public String getCodcabfa() {
        return codcabfa;
    }

    public void setCodcabfa(String codcabfa) {
        this.codcabfa = codcabfa;
    }

    public BigDecimal getTotalfactura() {
        return totalfactura;
    }

    public void setTotalfactura(BigDecimal totalfactura) {
        this.totalfactura = totalfactura;
    }

    public Date getFecdoc() {
        return fecdoc;
    }

    public void setFecdoc(Date fecdoc) {
        this.fecdoc = fecdoc;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public BigDecimal getSaldofactura() {
        return saldofactura;
    }

    public void setSaldofactura(BigDecimal saldofactura) {
        this.saldofactura = saldofactura;
    }

    public BigDecimal getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(BigDecimal totalpagado) {
        this.totalpagado = totalpagado;
    }

    public Date getFecven() {
        return fecven;
    }

    public void setFecven(Date fecven) {
        this.fecven = fecven;
    }

    public String getTxtcabgr() {
        return txtcabgr;
    }

    public void setTxtcabgr(String txtcabgr) {
        this.txtcabgr = txtcabgr;
    }

    public String getUltimousuario() {
        return ultimousuario;
    }

    public void setUltimousuario(String ultimousuario) {
        this.ultimousuario = ultimousuario;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechaultimamod() {
        return fechaultimamod;
    }

    public void setFechaultimamod(Date fechaultimamod) {
        this.fechaultimamod = fechaultimamod;
    }

    public Integer getIdseriesunidad() {
        return idseriesunidad;
    }

    public void setIdseriesunidad(Integer idseriesunidad) {
        this.idseriesunidad = idseriesunidad;
    }

    public Integer getNserie() {
        return nserie;
    }

    public void setNserie(Integer nserie) {
        this.nserie = nserie;
    }

    public String getDireccionfacturacion() {
        return direccionfacturacion;
    }

    public void setDireccionfacturacion(String direccionfacturacion) {
        this.direccionfacturacion = direccionfacturacion;
    }

    public Integer getInteresmoratorioaplicado() {
        return interesmoratorioaplicado;
    }

    public void setInteresmoratorioaplicado(Integer interesmoratorioaplicado) {
        this.interesmoratorioaplicado = interesmoratorioaplicado;
    }

    public BigDecimal getMontoaplicado() {
        return montoaplicado;
    }

    public void setMontoaplicado(BigDecimal montoaplicado) {
        this.montoaplicado = montoaplicado;
    }

    public Integer getDiasvencidos() {
        return diasvencidos;
    }

    public void setDiasvencidos(Integer diasvencidos) {
        this.diasvencidos = diasvencidos;
    }

    public BigDecimal getMontomora() {
        return montomora;
    }

    public void setMontomora(BigDecimal montomora) {
        this.montomora = montomora;
    }

    public String getEstadovencimiento() {
        return estadovencimiento;
    }

    public void setEstadovencimiento(String estadovencimiento) {
        this.estadovencimiento = estadovencimiento;
    }

    public Integer getDescuentoaplicado() {
        return descuentoaplicado;
    }

    public void setDescuentoaplicado(Integer descuentoaplicado) {
        this.descuentoaplicado = descuentoaplicado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCodigohash() {
        return codigohash;
    }

    public void setCodigohash(String codigohash) {
        this.codigohash = codigohash;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Condpago getCondpago() {
        return condpago;
    }

    public void setCondpago(Condpago condpago) {
        this.condpago = condpago;
    }

    public Letras getLetras() {
        return letras;
    }

    public void setLetras(Letras letras) {
        this.letras = letras;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Tipofacturacion getTipofacturacion() {
        return tipofacturacion;
    }

    public void setTipofacturacion(Tipofacturacion tipofacturacion) {
        this.tipofacturacion = tipofacturacion;
    }

    public Tipopagofactura getTipopagofactura() {
        return tipopagofactura;
    }

    public void setTipopagofactura(Tipopagofactura tipopagofactura) {
        this.tipopagofactura = tipopagofactura;
    }

    public Tipopedido getTipopedido() {
        return tipopedido;
    }

    public void setTipopedido(Tipopedido tipopedido) {
        this.tipopedido = tipopedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcabfa != null ? codcabfa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabfacbol)) {
            return false;
        }
        Cabfacbol other = (Cabfacbol) object;
        if ((this.codcabfa == null && other.codcabfa != null) || (this.codcabfa != null && !this.codcabfa.equals(other.codcabfa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabfacbol[ codcabfa=" + codcabfa + " ]";
    }
    
}
