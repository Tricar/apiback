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
@Table(name = "facturaocos")

public class Facturaocos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfacturaocos")
    private Integer idfacturaocos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montofactura")
    private BigDecimal montofactura;
    @Column(name = "saldomontofactura")
    private BigDecimal saldomontofactura;
    @Column(name = "fecemision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecemision;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "nfactura")
    private String nfactura;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 50)
    @Column(name = "descripciondoc")
    private String descripciondoc;
    @Column(name = "totalpagado")
    private BigDecimal totalpagado;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Size(max = 50)
    @Column(name = "ultimousuariomod")
    private String ultimousuariomod;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Size(max = 50)
    @Column(name = "conciliacionrq")
    private String conciliacionrq;    
    @JoinColumn(name = "codcaboc", referencedColumnName = "codcabc")
    @ManyToOne
    private Caboc caboc;

    public Facturaocos() {
    }

    public Facturaocos(Integer idfacturaocos) {
        this.idfacturaocos = idfacturaocos;
    }

    public Integer getIdfacturaocos() {
        return idfacturaocos;
    }

    public void setIdfacturaocos(Integer idfacturaocos) {
        this.idfacturaocos = idfacturaocos;
    }

    public BigDecimal getMontofactura() {
        return montofactura;
    }

    public void setMontofactura(BigDecimal montofactura) {
        this.montofactura = montofactura;
    }

    public BigDecimal getSaldomontofactura() {
        return saldomontofactura;
    }

    public void setSaldomontofactura(BigDecimal saldomontofactura) {
        this.saldomontofactura = saldomontofactura;
    }

    public Date getFecemision() {
        return fecemision;
    }

    public void setFecemision(Date fecemision) {
        this.fecemision = fecemision;
    }

    public Date getFecven() {
        return fecven;
    }

    public void setFecven(Date fecven) {
        this.fecven = fecven;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNfactura() {
        return nfactura;
    }

    public void setNfactura(String nfactura) {
        this.nfactura = nfactura;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public String getDescripciondoc() {
        return descripciondoc;
    }

    public void setDescripciondoc(String descripciondoc) {
        this.descripciondoc = descripciondoc;
    }

    public BigDecimal getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(BigDecimal totalpagado) {
        this.totalpagado = totalpagado;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getUltimousuariomod() {
        return ultimousuariomod;
    }

    public void setUltimousuariomod(String ultimousuariomod) {
        this.ultimousuariomod = ultimousuariomod;
    }

    public Date getFechaultimomod() {
        return fechaultimomod;
    }

    public void setFechaultimomod(Date fechaultimomod) {
        this.fechaultimomod = fechaultimomod;
    }

    public String getConciliacionrq() {
        return conciliacionrq;
    }

    public void setConciliacionrq(String conciliacionrq) {
        this.conciliacionrq = conciliacionrq;
    }

    public Caboc getCaboc() {
        return caboc;
    }

    public void setCaboc(Caboc caboc) {
        this.caboc = caboc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturaocos != null ? idfacturaocos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturaocos)) {
            return false;
        }
        Facturaocos other = (Facturaocos) object;
        if ((this.idfacturaocos == null && other.idfacturaocos != null) || (this.idfacturaocos != null && !this.idfacturaocos.equals(other.idfacturaocos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Facturaocos[ idfacturaocos=" + idfacturaocos + " ]";
    }
    
}
