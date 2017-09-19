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
@Table(name = "cabns")

public class Cabns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabns")
    private String codcabns;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    @Size(max = 50)
    @Column(name = "flkardex")
    private String flkardex;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "correlativo")
    private String correlativo;
    @Size(max = 50)
    @Column(name = "localidad")
    private String localidad;
    @Size(max = 50)
    @Column(name = "origen")
    private String origen;
    @Size(max = 50)
    @Column(name = "unidadnegocio")
    private String unidadnegocio;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Size(max = 50)
    @Column(name = "ndocsalida")
    private String ndocsalida;
    @Size(max = 50)
    @Column(name = "nseriesalida")
    private String nseriesalida;
    @Size(max = 150)
    @Column(name = "comentarios")
    private String comentarios;
    @JoinColumn(name = "codanexo", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idanexorecibidor", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo1;
    @JoinColumn(name = "idtipo", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tipons tipons;
    @JoinColumn(name = "idtipodoc", referencedColumnName = "idtipodoc")
    @ManyToOne(optional = false)
    private Tipodoc tipodoc;
    @JoinColumn(name = "idtipooperacioncontable", referencedColumnName = "idtipoop")
    @ManyToOne(optional = false)
    private Tipooperacioncontable tipooperacioncontable;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    
    
    public Cabns() {
    }

    public Cabns(String codcabns) {
        this.codcabns = codcabns;
    }

    public String getCodcabns() {
        return codcabns;
    }

    public void setCodcabns(String codcabns) {
        this.codcabns = codcabns;
    }

    public Date getFecdoc() {
        return fecdoc;
    }

    public void setFecdoc(Date fecdoc) {
        this.fecdoc = fecdoc;
    }

    public Date getFecven() {
        return fecven;
    }

    public void setFecven(Date fecven) {
        this.fecven = fecven;
    }

    public String getFlkardex() {
        return flkardex;
    }

    public void setFlkardex(String flkardex) {
        this.flkardex = flkardex;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getUnidadnegocio() {
        return unidadnegocio;
    }

    public void setUnidadnegocio(String unidadnegocio) {
        this.unidadnegocio = unidadnegocio;
    }

    public String getUltimousuario() {
        return ultimousuario;
    }

    public void setUltimousuario(String ultimousuario) {
        this.ultimousuario = ultimousuario;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechaultimomod() {
        return fechaultimomod;
    }

    public void setFechaultimomod(Date fechaultimomod) {
        this.fechaultimomod = fechaultimomod;
    }

    public String getNdocsalida() {
        return ndocsalida;
    }

    public void setNdocsalida(String ndocsalida) {
        this.ndocsalida = ndocsalida;
    }

    public String getNseriesalida() {
        return nseriesalida;
    }

    public void setNseriesalida(String nseriesalida) {
        this.nseriesalida = nseriesalida;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Anexo getAnexo1() {
        return anexo1;
    }

    public void setAnexo1(Anexo anexo1) {
        this.anexo1 = anexo1;
    }

    public Tipons getTipons() {
        return tipons;
    }

    public void setTipons(Tipons tipons) {
        this.tipons = tipons;
    }

    public Tipodoc getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(Tipodoc tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Tipooperacioncontable getTipooperacioncontable() {
        return tipooperacioncontable;
    }

    public void setTipooperacioncontable(Tipooperacioncontable tipooperacioncontable) {
        this.tipooperacioncontable = tipooperacioncontable;
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
        hash += (codcabns != null ? codcabns.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabns)) {
            return false;
        }
        Cabns other = (Cabns) object;
        if ((this.codcabns == null && other.codcabns != null) || (this.codcabns != null && !this.codcabns.equals(other.codcabns))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabns[ codcabns=" + codcabns + " ]";
    }
    
}
