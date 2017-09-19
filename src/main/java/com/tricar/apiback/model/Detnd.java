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
@Table(name = "detnd")

public class Detnd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coddetnd")
    private Integer coddetnd;
    @Column(name = "fechadoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "preciounitario")
    private BigDecimal preciounitario;
    @Size(max = 300)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 300)
    @Column(name = "descripcionaux")
    private String descripcionaux;
    @JoinColumn(name = "codcabnd", referencedColumnName = "codcabnd")
    @ManyToOne(optional = false)
    private Cabnd cabnd;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario usuario;

    public Detnd() {
    }

    public Detnd(Integer coddetnd) {
        this.coddetnd = coddetnd;
    }

    public Integer getCoddetnd() {
        return coddetnd;
    }

    public void setCoddetnd(Integer coddetnd) {
        this.coddetnd = coddetnd;
    }

    public Date getFechadoc() {
        return fechadoc;
    }

    public void setFechadoc(Date fechadoc) {
        this.fechadoc = fechadoc;
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

    public BigDecimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionaux() {
        return descripcionaux;
    }

    public void setDescripcionaux(String descripcionaux) {
        this.descripcionaux = descripcionaux;
    }

    public Cabnd getCabnd() {
        return cabnd;
    }

    public void setCabnd(Cabnd cabnd) {
        this.cabnd = cabnd;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddetnd != null ? coddetnd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detnd)) {
            return false;
        }
        Detnd other = (Detnd) object;
        if ((this.coddetnd == null && other.coddetnd != null) || (this.coddetnd != null && !this.coddetnd.equals(other.coddetnd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detnd[ coddetnd=" + coddetnd + " ]";
    }
    
}
