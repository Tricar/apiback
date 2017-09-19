package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "caja")

public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcaja")
    private Integer idcaja;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private BigDecimal total;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;    
    @JoinColumn(name = "idunidadnegocio", referencedColumnName = "idunidadnegocio")
    @ManyToOne(optional = false)
    private Unidadnegocio unidadnegocio;
    @JoinColumn(name = "personaencargada", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne
    private Moneda moneda;
    @JoinColumn(name = "idtipocaja", referencedColumnName = "idtipocaja")
    @ManyToOne
    private Tipocaja tipocaja;
    

    public Caja() {
    }

    public Caja(Integer idcaja) {
        this.idcaja = idcaja;
    }

    public Integer getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(Integer idcaja) {
        this.idcaja = idcaja;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Unidadnegocio getUnidadnegocio() {
        return unidadnegocio;
    }

    public void setUnidadnegocio(Unidadnegocio unidadnegocio) {
        this.unidadnegocio = unidadnegocio;
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

    public Tipocaja getTipocaja() {
        return tipocaja;
    }

    public void setTipocaja(Tipocaja tipocaja) {
        this.tipocaja = tipocaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaja != null ? idcaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.idcaja == null && other.idcaja != null) || (this.idcaja != null && !this.idcaja.equals(other.idcaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Caja[ idcaja=" + idcaja + " ]";
    }
    
}
