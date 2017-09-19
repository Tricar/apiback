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
@Table(name = "cabnd")

public class Cabnd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabnd")
    private String codcabnd;
    @Column(name = "fechadoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totaldoc")
    private BigDecimal totaldoc;
    @Column(name = "saldodebito")
    private BigDecimal saldodebito;
    @Size(max = 50)
    @Column(name = "estadoa")
    private String estadoa;
    @Size(max = 50)
    @Column(name = "estacadoc")
    private String estacadoc;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Column(name = "idseriesunidad")
    private Integer idseriesunidad;
    @Column(name = "nserie")
    private Integer nserie;
    @Column(name = "totalpagado")
    private BigDecimal totalpagado;
    @Size(max = 50)
    @Column(name = "referenciaquesemodifico")
    private String referenciaquesemodifico;
    @Size(max = 50)
    @Column(name = "txtdocreferencia")
    private String txtdocreferencia;
    @Size(max = 100)
    @Column(name = "codigohash")
    private String codigohash;    
    @JoinColumn(name = "codane", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "codcabfa", referencedColumnName = "codcabfa")
    @ManyToOne
    private Cabfacbol cabfacbol;
    @JoinColumn(name = "idciudad", referencedColumnName = "idciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudad;
    @JoinColumn(name = "idletras", referencedColumnName = "idletras")
    @ManyToOne
    private Letras letras;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne(optional = false)
    private Moneda moneda;
    @JoinColumn(name = "idpedido", referencedColumnName = "codcabnp")
    @ManyToOne
    private Cabnp cabnp;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Cabnd() {
    }

    public Cabnd(String codcabnd) {
        this.codcabnd = codcabnd;
    }

    public String getCodcabnd() {
        return codcabnd;
    }

    public void setCodcabnd(String codcabnd) {
        this.codcabnd = codcabnd;
    }

    public Date getFechadoc() {
        return fechadoc;
    }

    public void setFechadoc(Date fechadoc) {
        this.fechadoc = fechadoc;
    }

    public BigDecimal getTotaldoc() {
        return totaldoc;
    }

    public void setTotaldoc(BigDecimal totaldoc) {
        this.totaldoc = totaldoc;
    }

    public BigDecimal getSaldodebito() {
        return saldodebito;
    }

    public void setSaldodebito(BigDecimal saldodebito) {
        this.saldodebito = saldodebito;
    }

    public String getEstadoa() {
        return estadoa;
    }

    public void setEstadoa(String estadoa) {
        this.estadoa = estadoa;
    }

    public String getEstacadoc() {
        return estacadoc;
    }

    public void setEstacadoc(String estacadoc) {
        this.estacadoc = estacadoc;
    }

    public String getAprobadox() {
        return aprobadox;
    }

    public void setAprobadox(String aprobadox) {
        this.aprobadox = aprobadox;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public Integer getIdseriesunidad() {
        return idseriesunidad;
    }

    public void setIdseriesunidad(Integer idseriesunidad) {
        this.idseriesunidad = idseriesunidad;
    }

    public Integer getNserie() {
        return nserie;
    }

    public void setNserie(Integer nserie) {
        this.nserie = nserie;
    }

    public BigDecimal getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(BigDecimal totalpagado) {
        this.totalpagado = totalpagado;
    }

    public String getReferenciaquesemodifico() {
        return referenciaquesemodifico;
    }

    public void setReferenciaquesemodifico(String referenciaquesemodifico) {
        this.referenciaquesemodifico = referenciaquesemodifico;
    }

    public String getTxtdocreferencia() {
        return txtdocreferencia;
    }

    public void setTxtdocreferencia(String txtdocreferencia) {
        this.txtdocreferencia = txtdocreferencia;
    }

    public String getCodigohash() {
        return codigohash;
    }

    public void setCodigohash(String codigohash) {
        this.codigohash = codigohash;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Cabfacbol getCabfacbol() {
        return cabfacbol;
    }

    public void setCabfacbol(Cabfacbol cabfacbol) {
        this.cabfacbol = cabfacbol;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Letras getLetras() {
        return letras;
    }

    public void setLetras(Letras letras) {
        this.letras = letras;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Cabnp getCabnp() {
        return cabnp;
    }

    public void setCabnp(Cabnp cabnp) {
        this.cabnp = cabnp;
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
        hash += (codcabnd != null ? codcabnd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabnd)) {
            return false;
        }
        Cabnd other = (Cabnd) object;
        if ((this.codcabnd == null && other.codcabnd != null) || (this.codcabnd != null && !this.codcabnd.equals(other.codcabnd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabnd[ codcabnd=" + codcabnd + " ]";
    }
    
}
