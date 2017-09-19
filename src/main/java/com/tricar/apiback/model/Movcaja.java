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
@Table(name = "movcaja")

public class Movcaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmovcaja")
    private Integer idmovcaja;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Size(max = 50)
    @Column(name = "tipomov")
    private String tipomov;
    @Column(name = "fecmov")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecmov;
    @Size(max = 50)
    @Column(name = "origen")
    private String origen;
    @Size(max = 50)
    @Column(name = "origenanticipo")
    private String origenanticipo;
    @JoinColumn(name = "idcaja", referencedColumnName = "idcaja")
    @ManyToOne(optional = false)
    private Caja caja;

    public Movcaja() {
    }

    public Movcaja(Integer idmovcaja) {
        this.idmovcaja = idmovcaja;
    }

    public Integer getIdmovcaja() {
        return idmovcaja;
    }

    public void setIdmovcaja(Integer idmovcaja) {
        this.idmovcaja = idmovcaja;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipomov() {
        return tipomov;
    }

    public void setTipomov(String tipomov) {
        this.tipomov = tipomov;
    }

    public Date getFecmov() {
        return fecmov;
    }

    public void setFecmov(Date fecmov) {
        this.fecmov = fecmov;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigenanticipo() {
        return origenanticipo;
    }

    public void setOrigenanticipo(String origenanticipo) {
        this.origenanticipo = origenanticipo;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovcaja != null ? idmovcaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movcaja)) {
            return false;
        }
        Movcaja other = (Movcaja) object;
        if ((this.idmovcaja == null && other.idmovcaja != null) || (this.idmovcaja != null && !this.idmovcaja.equals(other.idmovcaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Movcaja[ idmovcaja=" + idmovcaja + " ]";
    }
    
}
