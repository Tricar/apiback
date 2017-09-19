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
@Table(name = "cabgr")

public class Cabgr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabgr")
    private String codcabgr;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 100)
    @Column(name = "almacendestino")
    private String almacendestino;
    @Column(name = "codalmacendestino")
    private Integer codalmacendestino;
    @Size(max = 250)
    @Column(name = "puntopartida")
    private String puntopartida;
    @Size(max = 250)
    @Column(name = "puntollegada")
    private String puntollegada;
    @Size(max = 50)
    @Column(name = "tipotraslado")
    private String tipotraslado;
    @Column(name = "idtipotraslado")
    private Integer idtipotraslado;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Size(max = 50)
    @Column(name = "origennp")
    private String origennp;
    @Size(max = 50)
    @Column(name = "correlativo")
    private String correlativo;
    @Column(name = "codalmacenorigen")
    private Integer codalmacenorigen;
    @Size(max = 100)
    @Column(name = "almacenorigen")
    private String almacenorigen;
    @Column(name = "idserie")
    private Integer idserie;
    @Size(max = 50)
    @Column(name = "serie")
    private String serie;
    @Size(max = 50)
    @Column(name = "origencabfacbol")
    private String origencabfacbol;
    @Size(max = 50)
    @Column(name = "lugarExibicion")
    private String lugarExibicion;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idseriesunidad")
    private int idseriesunidad;
    @Column(name = "iddireccionenvio")
    private Integer iddireccionenvio;
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idtipodoc", referencedColumnName = "idtipodoc")
    @ManyToOne(optional = false)
    private Tipodoc tipodoc;
    @JoinColumn(name = "idtipoguia", referencedColumnName = "idtipoguia")
    @ManyToOne(optional = false)
    private Tipoguia tipoguia;
    @JoinColumn(name = "idtipooperacioncontable", referencedColumnName = "idtipoop")
    @ManyToOne(optional = false)
    private Tipooperacioncontable tipooperacioncontable;
    @JoinColumn(name = "idtipopedido", referencedColumnName = "idtipopedido")
    @ManyToOne(optional = false)
    private Tipopedido tipopedido;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    
    
    public Cabgr() {
    }

    public Cabgr(String codcabgr) {
        this.codcabgr = codcabgr;
    }

    public Cabgr(String codcabgr, int idseriesunidad) {
        this.codcabgr = codcabgr;
        this.idseriesunidad = idseriesunidad;
    }

    public String getCodcabgr() {
        return codcabgr;
    }

    public void setCodcabgr(String codcabgr) {
        this.codcabgr = codcabgr;
    }

    public Date getFecdoc() {
        return fecdoc;
    }

    public void setFecdoc(Date fecdoc) {
        this.fecdoc = fecdoc;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getAlmacendestino() {
        return almacendestino;
    }

    public void setAlmacendestino(String almacendestino) {
        this.almacendestino = almacendestino;
    }

    public Integer getCodalmacendestino() {
        return codalmacendestino;
    }

    public void setCodalmacendestino(Integer codalmacendestino) {
        this.codalmacendestino = codalmacendestino;
    }

    public String getPuntopartida() {
        return puntopartida;
    }

    public void setPuntopartida(String puntopartida) {
        this.puntopartida = puntopartida;
    }

    public String getPuntollegada() {
        return puntollegada;
    }

    public void setPuntollegada(String puntollegada) {
        this.puntollegada = puntollegada;
    }

    public String getTipotraslado() {
        return tipotraslado;
    }

    public void setTipotraslado(String tipotraslado) {
        this.tipotraslado = tipotraslado;
    }

    public Integer getIdtipotraslado() {
        return idtipotraslado;
    }

    public void setIdtipotraslado(Integer idtipotraslado) {
        this.idtipotraslado = idtipotraslado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public String getOrigennp() {
        return origennp;
    }

    public void setOrigennp(String origennp) {
        this.origennp = origennp;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public Integer getCodalmacenorigen() {
        return codalmacenorigen;
    }

    public void setCodalmacenorigen(Integer codalmacenorigen) {
        this.codalmacenorigen = codalmacenorigen;
    }

    public String getAlmacenorigen() {
        return almacenorigen;
    }

    public void setAlmacenorigen(String almacenorigen) {
        this.almacenorigen = almacenorigen;
    }

    public Integer getIdserie() {
        return idserie;
    }

    public void setIdserie(Integer idserie) {
        this.idserie = idserie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getOrigencabfacbol() {
        return origencabfacbol;
    }

    public void setOrigencabfacbol(String origencabfacbol) {
        this.origencabfacbol = origencabfacbol;
    }

    public String getLugarExibicion() {
        return lugarExibicion;
    }

    public void setLugarExibicion(String lugarExibicion) {
        this.lugarExibicion = lugarExibicion;
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

    public int getIdseriesunidad() {
        return idseriesunidad;
    }

    public void setIdseriesunidad(int idseriesunidad) {
        this.idseriesunidad = idseriesunidad;
    }

    public Integer getIddireccionenvio() {
        return iddireccionenvio;
    }

    public void setIddireccionenvio(Integer iddireccionenvio) {
        this.iddireccionenvio = iddireccionenvio;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Tipodoc getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(Tipodoc tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Tipoguia getTipoguia() {
        return tipoguia;
    }

    public void setTipoguia(Tipoguia tipoguia) {
        this.tipoguia = tipoguia;
    }

    public Tipooperacioncontable getTipooperacioncontable() {
        return tipooperacioncontable;
    }

    public void setTipooperacioncontable(Tipooperacioncontable tipooperacioncontable) {
        this.tipooperacioncontable = tipooperacioncontable;
    }

    public Tipopedido getTipopedido() {
        return tipopedido;
    }

    public void setTipopedido(Tipopedido tipopedido) {
        this.tipopedido = tipopedido;
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
        hash += (codcabgr != null ? codcabgr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabgr)) {
            return false;
        }
        Cabgr other = (Cabgr) object;
        if ((this.codcabgr == null && other.codcabgr != null) || (this.codcabgr != null && !this.codcabgr.equals(other.codcabgr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabgr[ codcabgr=" + codcabgr + " ]";
    }
    
}
