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
@Table(name = "cabor")

public class Cabor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabor")
    private String codcabor;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totdoc")
    private BigDecimal totdoc;
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
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Size(max = 150)
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "saldomontorq")
    private BigDecimal saldomontorq;
    @Column(name = "totalpagado")
    private BigDecimal totalpagado;
    @Column(name = "faltarendir")
    private BigDecimal faltarendir;
    @Column(name = "saldototalpagado")
    private BigDecimal saldototalpagado;
    @Column(name = "secrearonot")
    private Integer secrearonot;
    @Size(max = 50)
    @Column(name = "estadovisto")
    private String estadovisto;
    @Size(max = 50)
    @Column(name = "vistox")
    private String vistox;
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne
    private Moneda moneda;
    @JoinColumn(name = "idtiporq", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tipoorden tipoorden;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    

    public Cabor() {
    }

    public Cabor(String codcabor) {
        this.codcabor = codcabor;
    }

    public String getCodcabor() {
        return codcabor;
    }

    public void setCodcabor(String codcabor) {
        this.codcabor = codcabor;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public BigDecimal getSaldomontorq() {
        return saldomontorq;
    }

    public void setSaldomontorq(BigDecimal saldomontorq) {
        this.saldomontorq = saldomontorq;
    }

    public BigDecimal getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(BigDecimal totalpagado) {
        this.totalpagado = totalpagado;
    }

    public BigDecimal getFaltarendir() {
        return faltarendir;
    }

    public void setFaltarendir(BigDecimal faltarendir) {
        this.faltarendir = faltarendir;
    }

    public BigDecimal getSaldototalpagado() {
        return saldototalpagado;
    }

    public void setSaldototalpagado(BigDecimal saldototalpagado) {
        this.saldototalpagado = saldototalpagado;
    }

    public Integer getSecrearonot() {
        return secrearonot;
    }

    public void setSecrearonot(Integer secrearonot) {
        this.secrearonot = secrearonot;
    }

    public String getEstadovisto() {
        return estadovisto;
    }

    public void setEstadovisto(String estadovisto) {
        this.estadovisto = estadovisto;
    }

    public String getVistox() {
        return vistox;
    }

    public void setVistox(String vistox) {
        this.vistox = vistox;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Tipoorden getTipoorden() {
        return tipoorden;
    }

    public void setTipoorden(Tipoorden tipoorden) {
        this.tipoorden = tipoorden;
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
        hash += (codcabor != null ? codcabor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabor)) {
            return false;
        }
        Cabor other = (Cabor) object;
        if ((this.codcabor == null && other.codcabor != null) || (this.codcabor != null && !this.codcabor.equals(other.codcabor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabor[ codcabor=" + codcabor + " ]";
    }
    
}
