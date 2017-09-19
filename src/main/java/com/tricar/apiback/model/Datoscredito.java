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
@Table(name = "datoscredito")

public class Datoscredito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddatocredito")
    private Integer iddatocredito;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tasainteres")
    private BigDecimal tasainteres;
    @Column(name = "nletras")
    private Integer nletras;
    @Column(name = "saldonletras")
    private Integer saldonletras;
    @Column(name = "totalxcuota")
    private BigDecimal totalxcuota;
    @Size(max = 50)
    @Column(name = "aprobado")
    private String aprobado;
    @Column(name = "periodoletra")
    private Integer periodoletra;
    @Size(max = 50)
    @Column(name = "canjeado")
    private String canjeado;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Size(max = 50)
    @Column(name = "aprobadox")
    private String aprobadox;
    @Column(name = "utilizadebito")
    private Integer utilizadebito;
    @JoinColumn(name = "cabnd", referencedColumnName = "codcabnd")
    @ManyToOne
    private Cabnd cabnd;
    @JoinColumn(name = "idcabnp", referencedColumnName = "codcabnp")
    @ManyToOne(optional = false)
    private Cabnp cabnp;    

    public Datoscredito() {
    }

    public Datoscredito(Integer iddatocredito) {
        this.iddatocredito = iddatocredito;
    }

    public Integer getIddatocredito() {
        return iddatocredito;
    }

    public void setIddatocredito(Integer iddatocredito) {
        this.iddatocredito = iddatocredito;
    }

    public BigDecimal getTasainteres() {
        return tasainteres;
    }

    public void setTasainteres(BigDecimal tasainteres) {
        this.tasainteres = tasainteres;
    }

    public Integer getNletras() {
        return nletras;
    }

    public void setNletras(Integer nletras) {
        this.nletras = nletras;
    }

    public Integer getSaldonletras() {
        return saldonletras;
    }

    public void setSaldonletras(Integer saldonletras) {
        this.saldonletras = saldonletras;
    }

    public BigDecimal getTotalxcuota() {
        return totalxcuota;
    }

    public void setTotalxcuota(BigDecimal totalxcuota) {
        this.totalxcuota = totalxcuota;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    public Integer getPeriodoletra() {
        return periodoletra;
    }

    public void setPeriodoletra(Integer periodoletra) {
        this.periodoletra = periodoletra;
    }

    public String getCanjeado() {
        return canjeado;
    }

    public void setCanjeado(String canjeado) {
        this.canjeado = canjeado;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getAprobadox() {
        return aprobadox;
    }

    public void setAprobadox(String aprobadox) {
        this.aprobadox = aprobadox;
    }

    public Integer getUtilizadebito() {
        return utilizadebito;
    }

    public void setUtilizadebito(Integer utilizadebito) {
        this.utilizadebito = utilizadebito;
    }

    public Cabnd getCabnd() {
        return cabnd;
    }

    public void setCabnd(Cabnd cabnd) {
        this.cabnd = cabnd;
    }

    public Cabnp getCabnp() {
        return cabnp;
    }

    public void setCabnp(Cabnp cabnp) {
        this.cabnp = cabnp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddatocredito != null ? iddatocredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datoscredito)) {
            return false;
        }
        Datoscredito other = (Datoscredito) object;
        if ((this.iddatocredito == null && other.iddatocredito != null) || (this.iddatocredito != null && !this.iddatocredito.equals(other.iddatocredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Datoscredito[ iddatocredito=" + iddatocredito + " ]";
    }
    
}
