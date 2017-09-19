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
@Table(name = "cabot")

public class Cabot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabot")
    private String codcabot;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
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
    @Column(name = "encargado")
    private String encargado;
    @Size(max = 50)
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaulltimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaulltimomod;
    @Size(max = 300)
    @Column(name = "comentarioot")
    private String comentarioot;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idtipoot", referencedColumnName = "idtipoot")
    @ManyToOne(optional = false)
    private Tipoot tipoot;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;    

    public Cabot() {
    }

    public Cabot(String codcabot) {
        this.codcabot = codcabot;
    }

    public String getCodcabot() {
        return codcabot;
    }

    public void setCodcabot(String codcabot) {
        this.codcabot = codcabot;
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

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
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

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
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

    public Date getFechaulltimomod() {
        return fechaulltimomod;
    }

    public void setFechaulltimomod(Date fechaulltimomod) {
        this.fechaulltimomod = fechaulltimomod;
    }

    public String getComentarioot() {
        return comentarioot;
    }

    public void setComentarioot(String comentarioot) {
        this.comentarioot = comentarioot;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
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

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Tipoot getTipoot() {
        return tipoot;
    }

    public void setTipoot(Tipoot tipoot) {
        this.tipoot = tipoot;
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
        hash += (codcabot != null ? codcabot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabot)) {
            return false;
        }
        Cabot other = (Cabot) object;
        if ((this.codcabot == null && other.codcabot != null) || (this.codcabot != null && !this.codcabot.equals(other.codcabot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabot[ codcabot=" + codcabot + " ]";
    }
    
}
