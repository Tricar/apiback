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
@Table(name = "cabni")

public class Cabni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codni")
    private String codni;
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
    @Column(name = "correlativo")
    private Integer correlativo;
    @Column(name = "totigv")
    private BigDecimal totigv;
    @Column(name = "totneto")
    private BigDecimal totneto;
    @Size(max = 50)
    @Column(name = "condicionpago")
    private String condicionpago;
    @Size(max = 50)
    @Column(name = "tipomovimiento")
    private String tipomovimiento;
    @Column(name = "codcondicion")
    private Integer codcondicion;
    @Column(name = "codtipomov")
    private Integer codtipomov;
    @Size(max = 50)
    @Column(name = "origenoc")
    private String origenoc;
    @Size(max = 50)
    @Column(name = "nguia")
    private String nguia;
    @Size(max = 50)
    @Column(name = "nfactura")
    private String nfactura;
    @Size(max = 50)
    @Column(name = "unidadnegocio")
    private String unidadnegocio;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Size(max = 50)
    @Column(name = "sguia")
    private String sguia;
    @Size(max = 50)
    @Column(name = "sfactura")
    private String sfactura;
    @Size(max = 150)
    @Column(name = "comentarios")
    private String comentarios;    
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idtipodoc", referencedColumnName = "idtipodoc")
    @ManyToOne(optional = false)
    private Tipodoc tipodoc;
    @JoinColumn(name = "idtiponi", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tiponi tiponi;
    @JoinColumn(name = "idtipoop", referencedColumnName = "idtipoop")
    @ManyToOne(optional = false)
    private Tipooperacioncontable tipooperacioncontable;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Cabni() {
    }

    public Cabni(String codni) {
        this.codni = codni;
    }

    public String getCodni() {
        return codni;
    }

    public void setCodni(String codni) {
        this.codni = codni;
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

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getTotigv() {
        return totigv;
    }

    public void setTotigv(BigDecimal totigv) {
        this.totigv = totigv;
    }

    public BigDecimal getTotneto() {
        return totneto;
    }

    public void setTotneto(BigDecimal totneto) {
        this.totneto = totneto;
    }

    public String getCondicionpago() {
        return condicionpago;
    }

    public void setCondicionpago(String condicionpago) {
        this.condicionpago = condicionpago;
    }

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public Integer getCodcondicion() {
        return codcondicion;
    }

    public void setCodcondicion(Integer codcondicion) {
        this.codcondicion = codcondicion;
    }

    public Integer getCodtipomov() {
        return codtipomov;
    }

    public void setCodtipomov(Integer codtipomov) {
        this.codtipomov = codtipomov;
    }

    public String getOrigenoc() {
        return origenoc;
    }

    public void setOrigenoc(String origenoc) {
        this.origenoc = origenoc;
    }

    public String getNguia() {
        return nguia;
    }

    public void setNguia(String nguia) {
        this.nguia = nguia;
    }

    public String getNfactura() {
        return nfactura;
    }

    public void setNfactura(String nfactura) {
        this.nfactura = nfactura;
    }

    public String getUnidadnegocio() {
        return unidadnegocio;
    }

    public void setUnidadnegocio(String unidadnegocio) {
        this.unidadnegocio = unidadnegocio;
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

    public String getSguia() {
        return sguia;
    }

    public void setSguia(String sguia) {
        this.sguia = sguia;
    }

    public String getSfactura() {
        return sfactura;
    }

    public void setSfactura(String sfactura) {
        this.sfactura = sfactura;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Tipodoc getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(Tipodoc tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Tiponi getTiponi() {
        return tiponi;
    }

    public void setTiponi(Tiponi tiponi) {
        this.tiponi = tiponi;
    }

    public Tipooperacioncontable getTipooperacioncontable() {
        return tipooperacioncontable;
    }

    public void setTipooperacioncontable(Tipooperacioncontable tipooperacioncontable) {
        this.tipooperacioncontable = tipooperacioncontable;
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
        hash += (codni != null ? codni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabni)) {
            return false;
        }
        Cabni other = (Cabni) object;
        if ((this.codni == null && other.codni != null) || (this.codni != null && !this.codni.equals(other.codni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabni[ codni=" + codni + " ]";
    }
    
}
