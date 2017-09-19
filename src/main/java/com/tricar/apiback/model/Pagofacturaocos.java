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
@Table(name = "pagofacturaocos")

public class Pagofacturaocos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpagofacturaocos")
    private Integer idpagofacturaocos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private BigDecimal monto;
    @Column(name = "fechapago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapago;
    @Size(max = 50)
    @Column(name = "noperacion")
    private String noperacion;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @JoinColumn(name = "codcabor", referencedColumnName = "codcabor")
    @ManyToOne
    private Cabor cabor;
    @JoinColumn(name = "idfacturaocos", referencedColumnName = "idfacturaocos")
    @ManyToOne
    private Facturaocos facturaocos;
    @JoinColumn(name = "idtipopago", referencedColumnName = "idtipopago")
    @ManyToOne(optional = false)
    private Tipopago tipopago;

    public Pagofacturaocos() {
    }

    public Pagofacturaocos(Integer idpagofacturaocos) {
        this.idpagofacturaocos = idpagofacturaocos;
    }

    public Integer getIdpagofacturaocos() {
        return idpagofacturaocos;
    }

    public void setIdpagofacturaocos(Integer idpagofacturaocos) {
        this.idpagofacturaocos = idpagofacturaocos;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getNoperacion() {
        return noperacion;
    }

    public void setNoperacion(String noperacion) {
        this.noperacion = noperacion;
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

    public Cabor getCabor() {
        return cabor;
    }

    public void setCabor(Cabor cabor) {
        this.cabor = cabor;
    }

    public Facturaocos getFacturaocos() {
        return facturaocos;
    }

    public void setFacturaocos(Facturaocos facturaocos) {
        this.facturaocos = facturaocos;
    }

    public Tipopago getTipopago() {
        return tipopago;
    }

    public void setTipopago(Tipopago tipopago) {
        this.tipopago = tipopago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpagofacturaocos != null ? idpagofacturaocos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagofacturaocos)) {
            return false;
        }
        Pagofacturaocos other = (Pagofacturaocos) object;
        if ((this.idpagofacturaocos == null && other.idpagofacturaocos != null) || (this.idpagofacturaocos != null && !this.idpagofacturaocos.equals(other.idpagofacturaocos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Pagofacturaocos[ idpagofacturaocos=" + idpagofacturaocos + " ]";
    }
    
}
