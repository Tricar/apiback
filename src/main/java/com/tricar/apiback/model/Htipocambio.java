package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "htipocambio")

public class Htipocambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocambio")
    private Integer idtipocambio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tipocambio")
    private BigDecimal tipocambio;
    @Column(name = "fechavigente")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechavigente;
    @Column(name = "tipocambiocompra")
    private BigDecimal tipocambiocompra;

    public Htipocambio() {
    }

    public Htipocambio(Integer idtipocambio) {
        this.idtipocambio = idtipocambio;
    }

    public Integer getIdtipocambio() {
        return idtipocambio;
    }

    public void setIdtipocambio(Integer idtipocambio) {
        this.idtipocambio = idtipocambio;
    }

    public BigDecimal getTipocambio() {
        return tipocambio;
    }

    public void setTipocambio(BigDecimal tipocambio) {
        this.tipocambio = tipocambio;
    }

    public Date getFechavigente() {
        return fechavigente;
    }

    public void setFechavigente(Date fechavigente) {
        this.fechavigente = fechavigente;
    }

    public BigDecimal getTipocambiocompra() {
        return tipocambiocompra;
    }

    public void setTipocambiocompra(BigDecimal tipocambiocompra) {
        this.tipocambiocompra = tipocambiocompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocambio != null ? idtipocambio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Htipocambio)) {
            return false;
        }
        Htipocambio other = (Htipocambio) object;
        if ((this.idtipocambio == null && other.idtipocambio != null) || (this.idtipocambio != null && !this.idtipocambio.equals(other.idtipocambio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Htipocambio[ idtipocambio=" + idtipocambio + " ]";
    }
    
}
