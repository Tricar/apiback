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
@Table(name = "recetaos2")

public class Recetaos2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrecetaos")
    private Integer idrecetaos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant")
    private BigDecimal cant;
    @Column(name = "saldorecetaos")
    private BigDecimal saldorecetaos;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @JoinColumn(name = "idarticulo", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "idcoddetoc", referencedColumnName = "coddetoc")
    @ManyToOne(optional = false)
    private Detoc detoc;

    public Recetaos2() {
    }

    public Recetaos2(Integer idrecetaos) {
        this.idrecetaos = idrecetaos;
    }

    public Integer getIdrecetaos() {
        return idrecetaos;
    }

    public void setIdrecetaos(Integer idrecetaos) {
        this.idrecetaos = idrecetaos;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getSaldorecetaos() {
        return saldorecetaos;
    }

    public void setSaldorecetaos(BigDecimal saldorecetaos) {
        this.saldorecetaos = saldorecetaos;
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

    public Detoc getDetoc() {
        return detoc;
    }

    public void setDetoc(Detoc detoc) {
        this.detoc = detoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrecetaos != null ? idrecetaos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recetaos2)) {
            return false;
        }
        Recetaos2 other = (Recetaos2) object;
        if ((this.idrecetaos == null && other.idrecetaos != null) || (this.idrecetaos != null && !this.idrecetaos.equals(other.idrecetaos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Recetaos2[ idrecetaos=" + idrecetaos + " ]";
    }
    
}
