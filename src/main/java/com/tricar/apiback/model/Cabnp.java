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
@Table(name = "cabnp")

public class Cabnp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabnp")
    private String codcabnp;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    @Size(max = 300)
    @Column(name = "observacion")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totcondescuento")
    private BigDecimal totcondescuento;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 50)
    @Column(name = "correlativo")
    private String correlativo;
    @Column(name = "totsindescuento")
    private BigDecimal totsindescuento;
    @Column(name = "totaldescuento")
    private BigDecimal totaldescuento;
    @Column(name = "saldototalfaltante")
    private BigDecimal saldototalfaltante;
    @Column(name = "saldototalcancelado")
    private BigDecimal saldototalcancelado;
    @Column(name = "pagoinicial")
    private BigDecimal pagoinicial;
    @Size(max = 50)
    @Column(name = "creditodirectoaprobado")
    private String creditodirectoaprobado;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Size(max = 300)
    @Column(name = "direccionenvio")
    private String direccionenvio;
    @Column(name = "iddireccionenvio")
    private Integer iddireccionenvio;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @Size(max = 350)
    @Column(name = "comentariocreco")
    private String comentariocreco;
    @Size(max = 50)
    @Column(name = "tiporeferencia")
    private String tiporeferencia;
    @Size(max = 50)
    @Column(name = "txtreferencia")
    private String txtreferencia;
    @Column(name = "diasgracia")
    private BigDecimal diasgracia;    
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "codconpag", referencedColumnName = "codconpag")
    @ManyToOne(optional = false)
    private Condpago condpago;
    @JoinColumn(name = "codmon", referencedColumnName = "codmon")
    @ManyToOne(optional = false)
    private Moneda moneda;
    @JoinColumn(name = "idtipopedido", referencedColumnName = "idtipopedido")
    @ManyToOne(optional = false)
    private Tipopedido tipopedido;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "idvendedor", referencedColumnName = "codane")
    @ManyToOne
    private Anexo anexo1;    

    public Cabnp() {
    }

    public Cabnp(String codcabnp) {
        this.codcabnp = codcabnp;
    }

    public String getCodcabnp() {
        return codcabnp;
    }

    public void setCodcabnp(String codcabnp) {
        this.codcabnp = codcabnp;
    }

    public Date getFecdoc() {
        return fecdoc;
    }

    public void setFecdoc(Date fecdoc) {
        this.fecdoc = fecdoc;
    }

    public Date getFecven() {
        return fecven;
    }

    public void setFecven(Date fecven) {
        this.fecven = fecven;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getTotcondescuento() {
        return totcondescuento;
    }

    public void setTotcondescuento(BigDecimal totcondescuento) {
        this.totcondescuento = totcondescuento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getTotsindescuento() {
        return totsindescuento;
    }

    public void setTotsindescuento(BigDecimal totsindescuento) {
        this.totsindescuento = totsindescuento;
    }

    public BigDecimal getTotaldescuento() {
        return totaldescuento;
    }

    public void setTotaldescuento(BigDecimal totaldescuento) {
        this.totaldescuento = totaldescuento;
    }

    public BigDecimal getSaldototalfaltante() {
        return saldototalfaltante;
    }

    public void setSaldototalfaltante(BigDecimal saldototalfaltante) {
        this.saldototalfaltante = saldototalfaltante;
    }

    public BigDecimal getSaldototalcancelado() {
        return saldototalcancelado;
    }

    public void setSaldototalcancelado(BigDecimal saldototalcancelado) {
        this.saldototalcancelado = saldototalcancelado;
    }

    public BigDecimal getPagoinicial() {
        return pagoinicial;
    }

    public void setPagoinicial(BigDecimal pagoinicial) {
        this.pagoinicial = pagoinicial;
    }

    public String getCreditodirectoaprobado() {
        return creditodirectoaprobado;
    }

    public void setCreditodirectoaprobado(String creditodirectoaprobado) {
        this.creditodirectoaprobado = creditodirectoaprobado;
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

    public Date getFechaultimomod() {
        return fechaultimomod;
    }

    public void setFechaultimomod(Date fechaultimomod) {
        this.fechaultimomod = fechaultimomod;
    }

    public String getDireccionenvio() {
        return direccionenvio;
    }

    public void setDireccionenvio(String direccionenvio) {
        this.direccionenvio = direccionenvio;
    }

    public Integer getIddireccionenvio() {
        return iddireccionenvio;
    }

    public void setIddireccionenvio(Integer iddireccionenvio) {
        this.iddireccionenvio = iddireccionenvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAprobadox() {
        return aprobadox;
    }

    public void setAprobadox(String aprobadox) {
        this.aprobadox = aprobadox;
    }

    public String getComentariocreco() {
        return comentariocreco;
    }

    public void setComentariocreco(String comentariocreco) {
        this.comentariocreco = comentariocreco;
    }

    public String getTiporeferencia() {
        return tiporeferencia;
    }

    public void setTiporeferencia(String tiporeferencia) {
        this.tiporeferencia = tiporeferencia;
    }

    public String getTxtreferencia() {
        return txtreferencia;
    }

    public void setTxtreferencia(String txtreferencia) {
        this.txtreferencia = txtreferencia;
    }

    public BigDecimal getDiasgracia() {
        return diasgracia;
    }

    public void setDiasgracia(BigDecimal diasgracia) {
        this.diasgracia = diasgracia;
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

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
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

    public Anexo getAnexo1() {
        return anexo1;
    }

    public void setAnexo1(Anexo anexo1) {
        this.anexo1 = anexo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcabnp != null ? codcabnp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabnp)) {
            return false;
        }
        Cabnp other = (Cabnp) object;
        if ((this.codcabnp == null && other.codcabnp != null) || (this.codcabnp != null && !this.codcabnp.equals(other.codcabnp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabnp[ codcabnp=" + codcabnp + " ]";
    }
    
}
