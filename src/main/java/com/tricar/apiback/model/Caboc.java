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
@Table(name = "caboc")

public class Caboc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabc")
    private String codcabc;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totdoc")
    private BigDecimal totdoc;
    @Column(name = "saldoc")
    private BigDecimal saldoc;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "correlativo")
    private String correlativo;
    @Column(name = "totneto")
    private BigDecimal totneto;
    @Column(name = "totigv")
    private BigDecimal totigv;
    @Size(max = 150)
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "saldoafacturar")
    private BigDecimal saldoafacturar;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @Size(max = 50)
    @Column(name = "irigenosext")
    private String irigenosext;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimamod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimamod;
    @Size(max = 300)
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "fecharequerida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharequerida;
    @Column(name = "iddireccionentrega")
    private Integer iddireccionentrega;
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "codconpago", referencedColumnName = "codconpag")
    @ManyToOne(optional = false)
    private Condpago condpago;
    @JoinColumn(name = "codmoneda", referencedColumnName = "codmon")
    @ManyToOne(optional = false)
    private Moneda moneda;
    @JoinColumn(name = "codtipmov", referencedColumnName = "codtipmov")
    @ManyToOne(optional = false)
    private Tipmovimiento tipmovimiento;
    @JoinColumn(name = "idanexodestino", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo1;
    @JoinColumn(name = "iditpoos", referencedColumnName = "idtipoos")
    @ManyToOne
    private Tipoos tipoos;
    @JoinColumn(name = "idtipoc", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tipoc tipoc;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario usuario;
    

    public Caboc() {
    }

    public Caboc(String codcabc) {
        this.codcabc = codcabc;
    }

    public String getCodcabc() {
        return codcabc;
    }

    public void setCodcabc(String codcabc) {
        this.codcabc = codcabc;
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

    public BigDecimal getTotdoc() {
        return totdoc;
    }

    public void setTotdoc(BigDecimal totdoc) {
        this.totdoc = totdoc;
    }

    public BigDecimal getSaldoc() {
        return saldoc;
    }

    public void setSaldoc(BigDecimal saldoc) {
        this.saldoc = saldoc;
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

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getTotneto() {
        return totneto;
    }

    public void setTotneto(BigDecimal totneto) {
        this.totneto = totneto;
    }

    public BigDecimal getTotigv() {
        return totigv;
    }

    public void setTotigv(BigDecimal totigv) {
        this.totigv = totigv;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public BigDecimal getSaldoafacturar() {
        return saldoafacturar;
    }

    public void setSaldoafacturar(BigDecimal saldoafacturar) {
        this.saldoafacturar = saldoafacturar;
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

    public String getIrigenosext() {
        return irigenosext;
    }

    public void setIrigenosext(String irigenosext) {
        this.irigenosext = irigenosext;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFecharequerida() {
        return fecharequerida;
    }

    public void setFecharequerida(Date fecharequerida) {
        this.fecharequerida = fecharequerida;
    }

    public Integer getIddireccionentrega() {
        return iddireccionentrega;
    }

    public void setIddireccionentrega(Integer iddireccionentrega) {
        this.iddireccionentrega = iddireccionentrega;
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

    public Tipmovimiento getTipmovimiento() {
        return tipmovimiento;
    }

    public void setTipmovimiento(Tipmovimiento tipmovimiento) {
        this.tipmovimiento = tipmovimiento;
    }

    public Anexo getAnexo1() {
        return anexo1;
    }

    public void setAnexo1(Anexo anexo1) {
        this.anexo1 = anexo1;
    }

    public Tipoos getTipoos() {
        return tipoos;
    }

    public void setTipoos(Tipoos tipoos) {
        this.tipoos = tipoos;
    }

    public Tipoc getTipoc() {
        return tipoc;
    }

    public void setTipoc(Tipoc tipoc) {
        this.tipoc = tipoc;
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
        hash += (codcabc != null ? codcabc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caboc)) {
            return false;
        }
        Caboc other = (Caboc) object;
        if ((this.codcabc == null && other.codcabc != null) || (this.codcabc != null && !this.codcabc.equals(other.codcabc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Caboc[ codcabc=" + codcabc + " ]";
    }
    
}
