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
@Table(name = "detfacbol")

public class Detfacbol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetfacbol")
    private Integer coddetfacbol;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Column(name = "punitario")
    private BigDecimal punitario;
    @Column(name = "saldoft")
    private BigDecimal saldoft;    
    @JoinColumn(name = "codcabfa", referencedColumnName = "codcabfa")
    @ManyToOne(optional = false)
    private Cabfacbol cabfacbol;
    @JoinColumn(name = "detgr", referencedColumnName = "coddetgr")
    @ManyToOne
    private Detgr detgr;
    @JoinColumn(name = "iddetnp", referencedColumnName = "coddetnp")
    @ManyToOne
    private Detnp detnp;
    @JoinColumn(name = "idmotor", referencedColumnName = "seriemotor")
    @ManyToOne
    private Niespecificaciones niespecificaciones;

    public Detfacbol() {
    }

    public Detfacbol(Integer coddetfacbol) {
        this.coddetfacbol = coddetfacbol;
    }

    public Integer getCoddetfacbol() {
        return coddetfacbol;
    }

    public void setCoddetfacbol(Integer coddetfacbol) {
        this.coddetfacbol = coddetfacbol;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public BigDecimal getPunitario() {
        return punitario;
    }

    public void setPunitario(BigDecimal punitario) {
        this.punitario = punitario;
    }

    public BigDecimal getSaldoft() {
        return saldoft;
    }

    public void setSaldoft(BigDecimal saldoft) {
        this.saldoft = saldoft;
    }

    public Cabfacbol getCabfacbol() {
        return cabfacbol;
    }

    public void setCabfacbol(Cabfacbol cabfacbol) {
        this.cabfacbol = cabfacbol;
    }

    public Detgr getDetgr() {
        return detgr;
    }

    public void setDetgr(Detgr detgr) {
        this.detgr = detgr;
    }

    public Detnp getDetnp() {
        return detnp;
    }

    public void setDetnp(Detnp detnp) {
        this.detnp = detnp;
    }

    public Niespecificaciones getNiespecificaciones() {
        return niespecificaciones;
    }

    public void setNiespecificaciones(Niespecificaciones niespecificaciones) {
        this.niespecificaciones = niespecificaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetfacbol != null ? coddetfacbol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detfacbol)) {
            return false;
        }
        Detfacbol other = (Detfacbol) object;
        if ((this.coddetfacbol == null && other.coddetfacbol != null) || (this.coddetfacbol != null && !this.coddetfacbol.equals(other.coddetfacbol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detfacbol[ coddetfacbol=" + coddetfacbol + " ]";
    }
    
}
