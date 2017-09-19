package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "detinventario")

public class Detinventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetinventario")
    private Integer iddetinventario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "conteo1")
    private BigDecimal conteo1;
    @Column(name = "conteo2")
    private BigDecimal conteo2;
    @Column(name = "stockcapturado")
    private BigDecimal stockcapturado;
    @Column(name = "correlativo")
    private Integer correlativo;
    @Column(name = "conteofinal")
    private BigDecimal conteofinal;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "idcabinventario", referencedColumnName = "idinventario")
    @ManyToOne(optional = false)
    private Cabinventario cabinventario;

    public Detinventario() {
    }

    public Detinventario(Integer iddetinventario) {
        this.iddetinventario = iddetinventario;
    }

    public Integer getIddetinventario() {
        return iddetinventario;
    }

    public void setIddetinventario(Integer iddetinventario) {
        this.iddetinventario = iddetinventario;
    }

    public BigDecimal getConteo1() {
        return conteo1;
    }

    public void setConteo1(BigDecimal conteo1) {
        this.conteo1 = conteo1;
    }

    public BigDecimal getConteo2() {
        return conteo2;
    }

    public void setConteo2(BigDecimal conteo2) {
        this.conteo2 = conteo2;
    }

    public BigDecimal getStockcapturado() {
        return stockcapturado;
    }

    public void setStockcapturado(BigDecimal stockcapturado) {
        this.stockcapturado = stockcapturado;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getConteofinal() {
        return conteofinal;
    }

    public void setConteofinal(BigDecimal conteofinal) {
        this.conteofinal = conteofinal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cabinventario getCabinventario() {
        return cabinventario;
    }

    public void setCabinventario(Cabinventario cabinventario) {
        this.cabinventario = cabinventario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetinventario != null ? iddetinventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detinventario)) {
            return false;
        }
        Detinventario other = (Detinventario) object;
        if ((this.iddetinventario == null && other.iddetinventario != null) || (this.iddetinventario != null && !this.iddetinventario.equals(other.iddetinventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detinventario[ iddetinventario=" + iddetinventario + " ]";
    }
    
}
