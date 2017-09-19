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
@Table(name = "cabos")

public class Cabos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabos")
    private String codcabos;
    @Column(name = "fecdoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecdoc;
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
    @Column(name = "ultimousuario")
    private String ultimousuario;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fechaultimomod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaultimomod;
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idcondpago", referencedColumnName = "codconpag")
    @ManyToOne(optional = false)
    private Condpago condpago;
    @JoinColumn(name = "iditpoos", referencedColumnName = "idtipoos")
    @ManyToOne
    private Tipoos tipoos;
    @JoinColumn(name = "idtipoos", referencedColumnName = "idtipoos")
    @ManyToOne(optional = false)
    private Tipoos tipoos1;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    

    public Cabos() {
    }

    public Cabos(String codcabos) {
        this.codcabos = codcabos;
    }

    public String getCodcabos() {
        return codcabos;
    }

    public void setCodcabos(String codcabos) {
        this.codcabos = codcabos;
    }

    public Date getFecdoc() {
        return fecdoc;
    }

    public void setFecdoc(Date fecdoc) {
        this.fecdoc = fecdoc;
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

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Condpago getCondpago() {
        return condpago;
    }

    public void setCondpago(Condpago condpago) {
        this.condpago = condpago;
    }

    public Tipoos getTipoos() {
        return tipoos;
    }

    public void setTipoos(Tipoos tipoos) {
        this.tipoos = tipoos;
    }

    public Tipoos getTipoos1() {
        return tipoos1;
    }

    public void setTipoos1(Tipoos tipoos1) {
        this.tipoos1 = tipoos1;
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
        hash += (codcabos != null ? codcabos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabos)) {
            return false;
        }
        Cabos other = (Cabos) object;
        if ((this.codcabos == null && other.codcabos != null) || (this.codcabos != null && !this.codcabos.equals(other.codcabos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabos[ codcabos=" + codcabos + " ]";
    }
    
}
