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
@Table(name = "anticipos")

public class Anticipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idanticipos")
    private String idanticipos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private BigDecimal monto;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 50)
    @Column(name = "noperacion")
    private String noperacion;
    @Column(name = "destinomovcaja")
    private Integer destinomovcaja;
    @Size(max = 50)
    @Column(name = "idusuario")
    private String idusuario;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Column(name = "saldomonto")
    private BigDecimal saldomonto;
    @Column(name = "idseriesunidad")
    private Integer idseriesunidad;
    @Column(name = "nserie")
    private Integer nserie;
    @Column(name = "tc")
    private BigDecimal tc;
    @Column(name = "montooriginal")
    private BigDecimal montooriginal;    
    @JoinColumn(name = "idanexo", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idcaja", referencedColumnName = "idcaja")
    @ManyToOne(optional = false)
    private Caja caja;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne
    private Moneda moneda;
    @JoinColumn(name = "idtipopago", referencedColumnName = "idtipopago")
    @ManyToOne
    private Tipopago tipopago;

    public Anticipos() {
    }

    public Anticipos(String idanticipos) {
        this.idanticipos = idanticipos;
    }

    public String getIdanticipos() {
        return idanticipos;
    }

    public void setIdanticipos(String idanticipos) {
        this.idanticipos = idanticipos;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public BigDecimal getSaldomonto() {
        return saldomonto;
    }

    public void setSaldomonto(BigDecimal saldomonto) {
        this.saldomonto = saldomonto;
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

    public BigDecimal getTc() {
        return tc;
    }

    public void setTc(BigDecimal tc) {
        this.tc = tc;
    }

    public BigDecimal getMontooriginal() {
        return montooriginal;
    }

    public void setMontooriginal(BigDecimal montooriginal) {
        this.montooriginal = montooriginal;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Tipopago getTipopago() {
        return tipopago;
    }

    public void setTipopago(Tipopago tipopago) {
        this.tipopago = tipopago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanticipos != null ? idanticipos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anticipos)) {
            return false;
        }
        Anticipos other = (Anticipos) object;
        if ((this.idanticipos == null && other.idanticipos != null) || (this.idanticipos != null && !this.idanticipos.equals(other.idanticipos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Anticipos[ idanticipos=" + idanticipos + " ]";
    }
    
}
