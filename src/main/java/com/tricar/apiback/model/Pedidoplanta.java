package com.tricar.apiback.model;

import java.io.Serializable;
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
@Table(name = "pedidoplanta")

public class Pedidoplanta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idpedidoplanta")
    private String idpedidoplanta;
    @Column(name = "fechadoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadoc;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @Column(name = "idalmacenorigen")
    private Integer idalmacenorigen;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "correlativo")
    private String correlativo;
    @Column(name = "fechaven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaven;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 450)
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "idalmacendestino", referencedColumnName = "codalm")
    @ManyToOne(optional = false)
    private Almacen almacen;
    @JoinColumn(name = "idanexo", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Pedidoplanta() {
    }

    public Pedidoplanta(String idpedidoplanta) {
        this.idpedidoplanta = idpedidoplanta;
    }

    public String getIdpedidoplanta() {
        return idpedidoplanta;
    }

    public void setIdpedidoplanta(String idpedidoplanta) {
        this.idpedidoplanta = idpedidoplanta;
    }

    public Date getFechadoc() {
        return fechadoc;
    }

    public void setFechadoc(Date fechadoc) {
        this.fechadoc = fechadoc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAprobadox() {
        return aprobadox;
    }

    public void setAprobadox(String aprobadox) {
        this.aprobadox = aprobadox;
    }

    public Integer getIdalmacenorigen() {
        return idalmacenorigen;
    }

    public void setIdalmacenorigen(Integer idalmacenorigen) {
        this.idalmacenorigen = idalmacenorigen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public Date getFechaven() {
        return fechaven;
    }

    public void setFechaven(Date fechaven) {
        this.fechaven = fechaven;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
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
        hash += (idpedidoplanta != null ? idpedidoplanta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidoplanta)) {
            return false;
        }
        Pedidoplanta other = (Pedidoplanta) object;
        if ((this.idpedidoplanta == null && other.idpedidoplanta != null) || (this.idpedidoplanta != null && !this.idpedidoplanta.equals(other.idpedidoplanta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Pedidoplanta[ idpedidoplanta=" + idpedidoplanta + " ]";
    }
    
}
