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
@Table(name = "detot")

public class Detot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetot")
    private Integer coddetot;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant")
    private BigDecimal cant;
    @Column(name = "saldoot")
    private BigDecimal saldoot;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @JoinColumn(name = "codart", referencedColumnName = "codart")
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "codcab", referencedColumnName = "codcabot")
    @ManyToOne(optional = false)
    private Cabot cabot;    

    public Detot() {
    }

    public Detot(Integer coddetot) {
        this.coddetot = coddetot;
    }

    public Integer getCoddetot() {
        return coddetot;
    }

    public void setCoddetot(Integer coddetot) {
        this.coddetot = coddetot;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public BigDecimal getSaldoot() {
        return saldoot;
    }

    public void setSaldoot(BigDecimal saldoot) {
        this.saldoot = saldoot;
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

    public Cabot getCabot() {
        return cabot;
    }

    public void setCabot(Cabot cabot) {
        this.cabot = cabot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetot != null ? coddetot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detot)) {
            return false;
        }
        Detot other = (Detot) object;
        if ((this.coddetot == null && other.coddetot != null) || (this.coddetot != null && !this.coddetot.equals(other.coddetot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detot[ coddetot=" + coddetot + " ]";
    }
    
}
