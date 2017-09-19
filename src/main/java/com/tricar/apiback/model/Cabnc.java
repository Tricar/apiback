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
@Table(name = "cabnc")

public class Cabnc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codcabnc")
    private String codcabnc;
    @Column(name = "fechadoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totaldoc")
    private BigDecimal totaldoc;
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
    @Column(name = "saldonc")
    private BigDecimal saldonc;
    @Size(max = 50)
    @Column(name = "referenciacanje")
    private String referenciacanje;
    @Size(max = 50)
    @Column(name = "referenciadoctxt")
    private String referenciadoctxt;    
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
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario usuario;

    public Cabnc() {
    }

    public Cabnc(String codcabnc) {
        this.codcabnc = codcabnc;
    }

    public String getCodcabnc() {
        return codcabnc;
    }

    public void setCodcabnc(String codcabnc) {
        this.codcabnc = codcabnc;
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

    public BigDecimal getSaldonc() {
        return saldonc;
    }

    public void setSaldonc(BigDecimal saldonc) {
        this.saldonc = saldonc;
    }

    public String getReferenciacanje() {
        return referenciacanje;
    }

    public void setReferenciacanje(String referenciacanje) {
        this.referenciacanje = referenciacanje;
    }

    public String getReferenciadoctxt() {
        return referenciadoctxt;
    }

    public void setReferenciadoctxt(String referenciadoctxt) {
        this.referenciadoctxt = referenciadoctxt;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcabnc != null ? codcabnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabnc)) {
            return false;
        }
        Cabnc other = (Cabnc) object;
        if ((this.codcabnc == null && other.codcabnc != null) || (this.codcabnc != null && !this.codcabnc.equals(other.codcabnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Cabnc[ codcabnc=" + codcabnc + " ]";
    }
    
}
