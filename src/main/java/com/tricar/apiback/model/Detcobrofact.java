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
@Table(name = "detcobrofact")

public class Detcobrofact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetcobrofact")
    private Integer iddetcobrofact;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 50)
    @Column(name = "noperacion")
    private String noperacion;
    @Column(name = "destinomovcaja")
    private Integer destinomovcaja;
    @Size(max = 50)
    @Column(name = "cabnp")
    private String cabnp;
    @Column(name = "origendatocredito")
    private Integer origendatocredito;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Size(max = 50)
    @Column(name = "tiporeferencia")
    private String tiporeferencia;
    @Size(max = 50)
    @Column(name = "mostradorcabecera")
    private String mostradorcabecera;
    @JoinColumn(name = "codcabnd", referencedColumnName = "codcabnd")
    @ManyToOne
    private Cabnd cabnd;
    @JoinColumn(name = "codcabfa", referencedColumnName = "codcabfa")
    @ManyToOne
    private Cabfacbol cabfacbol;
    @JoinColumn(name = "codnc", referencedColumnName = "codcabnc")
    @ManyToOne
    private Cabnc cabnc;
    @JoinColumn(name = "idanticipo", referencedColumnName = "idanticipos")
    @ManyToOne
    private Anticipos anticipos;
    @JoinColumn(name = "idletra", referencedColumnName = "idletras")
    @ManyToOne
    private Letras letras;
    @JoinColumn(name = "idtipopago", referencedColumnName = "idtipopago")
    @ManyToOne(optional = false)
    private Tipopago tipopago;
    @JoinColumn(name = "coddetfacbol", referencedColumnName = "coddetfacbol")
    @ManyToOne
    private Detfacbol detfacbol;

    public Detcobrofact() {
    }

    public Detcobrofact(Integer iddetcobrofact) {
        this.iddetcobrofact = iddetcobrofact;
    }

    public Integer getIddetcobrofact() {
        return iddetcobrofact;
    }

    public void setIddetcobrofact(Integer iddetcobrofact) {
        this.iddetcobrofact = iddetcobrofact;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNoperacion() {
        return noperacion;
    }

    public void setNoperacion(String noperacion) {
        this.noperacion = noperacion;
    }

    public Integer getDestinomovcaja() {
        return destinomovcaja;
    }

    public void setDestinomovcaja(Integer destinomovcaja) {
        this.destinomovcaja = destinomovcaja;
    }

    public String getCabnp() {
        return cabnp;
    }

    public void setCabnp(String cabnp) {
        this.cabnp = cabnp;
    }

    public Integer getOrigendatocredito() {
        return origendatocredito;
    }

    public void setOrigendatocredito(Integer origendatocredito) {
        this.origendatocredito = origendatocredito;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getTiporeferencia() {
        return tiporeferencia;
    }

    public void setTiporeferencia(String tiporeferencia) {
        this.tiporeferencia = tiporeferencia;
    }

    public String getMostradorcabecera() {
        return mostradorcabecera;
    }

    public void setMostradorcabecera(String mostradorcabecera) {
        this.mostradorcabecera = mostradorcabecera;
    }

    public Cabnd getCabnd() {
        return cabnd;
    }

    public void setCabnd(Cabnd cabnd) {
        this.cabnd = cabnd;
    }

    public Cabfacbol getCabfacbol() {
        return cabfacbol;
    }

    public void setCabfacbol(Cabfacbol cabfacbol) {
        this.cabfacbol = cabfacbol;
    }

    public Cabnc getCabnc() {
        return cabnc;
    }

    public void setCabnc(Cabnc cabnc) {
        this.cabnc = cabnc;
    }

    public Anticipos getAnticipos() {
        return anticipos;
    }

    public void setAnticipos(Anticipos anticipos) {
        this.anticipos = anticipos;
    }

    public Letras getLetras() {
        return letras;
    }

    public void setLetras(Letras letras) {
        this.letras = letras;
    }

    public Tipopago getTipopago() {
        return tipopago;
    }

    public void setTipopago(Tipopago tipopago) {
        this.tipopago = tipopago;
    }

    public Detfacbol getDetfacbol() {
        return detfacbol;
    }

    public void setDetfacbol(Detfacbol detfacbol) {
        this.detfacbol = detfacbol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetcobrofact != null ? iddetcobrofact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detcobrofact)) {
            return false;
        }
        Detcobrofact other = (Detcobrofact) object;
        if ((this.iddetcobrofact == null && other.iddetcobrofact != null) || (this.iddetcobrofact != null && !this.iddetcobrofact.equals(other.iddetcobrofact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Detcobrofact[ iddetcobrofact=" + iddetcobrofact + " ]";
    }
    
}
