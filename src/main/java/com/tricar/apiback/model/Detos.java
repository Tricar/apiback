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
@Table(name = "detos")

public class Detos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetos")
    private Integer coddetos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant")
    private BigDecimal cant;
    @Column(name = "saldoos")
    private BigDecimal saldoos;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "codcabos", referencedColumnName = "codcabos")
    @ManyToOne(optional = false)
    private Cabos cabos;
    

    public Detos() {
    }

    public Detos(Integer coddetos) {
        this.coddetos = coddetos;
    }

    public Integer getCoddetos() {
        return coddetos;
    }

    public void setCoddetos(Integer coddetos) {
        this.coddetos = coddetos;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getSaldoos() {
        return saldoos;
    }

    public void setSaldoos(BigDecimal saldoos) {
        this.saldoos = saldoos;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cabos getCabos() {
        return cabos;
    }

    public void setCabos(Cabos cabos) {
        this.cabos = cabos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetos != null ? coddetos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detos)) {
            return false;
        }
        Detos other = (Detos) object;
        if ((this.coddetos == null && other.coddetos != null) || (this.coddetos != null && !this.coddetos.equals(other.coddetos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detos[ coddetos=" + coddetos + " ]";
    }
    
}
