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
@Table(name = "equivalencias")

public class Equivalencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idequivalencia")
    private Integer idequivalencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "equiva")
    private BigDecimal equiva;
    @Size(max = 50)
    @Column(name = "simunidad")
    private String simunidad;
    @Column(name = "coduni")
    private Integer coduni;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Equivalencias() {
    }

    public Equivalencias(Integer idequivalencia) {
        this.idequivalencia = idequivalencia;
    }

    public Integer getIdequivalencia() {
        return idequivalencia;
    }

    public void setIdequivalencia(Integer idequivalencia) {
        this.idequivalencia = idequivalencia;
    }

    public BigDecimal getEquiva() {
        return equiva;
    }

    public void setEquiva(BigDecimal equiva) {
        this.equiva = equiva;
    }

    public String getSimunidad() {
        return simunidad;
    }

    public void setSimunidad(String simunidad) {
        this.simunidad = simunidad;
    }

    public Integer getCoduni() {
        return coduni;
    }

    public void setCoduni(Integer coduni) {
        this.coduni = coduni;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequivalencia != null ? idequivalencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equivalencias)) {
            return false;
        }
        Equivalencias other = (Equivalencias) object;
        if ((this.idequivalencia == null && other.idequivalencia != null) || (this.idequivalencia != null && !this.idequivalencia.equals(other.idequivalencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Equivalencias[ idequivalencia=" + idequivalencia + " ]";
    }
    
}
