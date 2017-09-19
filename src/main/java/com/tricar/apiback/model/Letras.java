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
@Table(name = "letras")

public class Letras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idletras")
    private String idletras;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montoletra")
    private BigDecimal montoletra;
    @Column(name = "fecini")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecini;
    @Column(name = "fecven")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecven;
    @Size(max = 50)
    @Column(name = "canjeado")
    private String canjeado;
    @Column(name = "correlativo")
    private Integer correlativo;
    @Column(name = "montosininteres")
    private BigDecimal montosininteres;
    @Column(name = "solointeres")
    private BigDecimal solointeres;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "saldomontoletra")
    private BigDecimal saldomontoletra;
    @Size(max = 200)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 50)
    @Column(name = "flkkardex")
    private String flkkardex;
    @Column(name = "totalpagado")
    private BigDecimal totalpagado;
    @Column(name = "interersmoratorioaplicado")
    private Integer interersmoratorioaplicado;
    @Column(name = "montointeres")
    private BigDecimal montointeres;
    @Column(name = "referencialetra")
    private Integer referencialetra;
    @Column(name = "diasvencidos")
    private Integer diasvencidos;
    @Column(name = "montomora")
    private BigDecimal montomora;
    @Size(max = 50)
    @Column(name = "estadovencimiento")
    private String estadovencimiento;
    @Column(name = "descuentoaplicado")
    private Integer descuentoaplicado;    
    @JoinColumn(name = "idanexo", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;
    @JoinColumn(name = "idciudad", referencedColumnName = "idciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudad;
    @JoinColumn(name = "iddatocredito", referencedColumnName = "iddatocredito")
    @ManyToOne
    private Datoscredito datoscredito;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne(optional = false)
    private Moneda moneda;
    

    public Letras() {
    }

    public Letras(String idletras) {
        this.idletras = idletras;
    }

    public String getIdletras() {
        return idletras;
    }

    public void setIdletras(String idletras) {
        this.idletras = idletras;
    }

    public BigDecimal getMontoletra() {
        return montoletra;
    }

    public void setMontoletra(BigDecimal montoletra) {
        this.montoletra = montoletra;
    }

    public Date getFecini() {
        return fecini;
    }

    public void setFecini(Date fecini) {
        this.fecini = fecini;
    }

    public Date getFecven() {
        return fecven;
    }

    public void setFecven(Date fecven) {
        this.fecven = fecven;
    }

    public String getCanjeado() {
        return canjeado;
    }

    public void setCanjeado(String canjeado) {
        this.canjeado = canjeado;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getMontosininteres() {
        return montosininteres;
    }

    public void setMontosininteres(BigDecimal montosininteres) {
        this.montosininteres = montosininteres;
    }

    public BigDecimal getSolointeres() {
        return solointeres;
    }

    public void setSolointeres(BigDecimal solointeres) {
        this.solointeres = solointeres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getSaldomontoletra() {
        return saldomontoletra;
    }

    public void setSaldomontoletra(BigDecimal saldomontoletra) {
        this.saldomontoletra = saldomontoletra;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFlkkardex() {
        return flkkardex;
    }

    public void setFlkkardex(String flkkardex) {
        this.flkkardex = flkkardex;
    }

    public BigDecimal getTotalpagado() {
        return totalpagado;
    }

    public void setTotalpagado(BigDecimal totalpagado) {
        this.totalpagado = totalpagado;
    }

    public Integer getInterersmoratorioaplicado() {
        return interersmoratorioaplicado;
    }

    public void setInterersmoratorioaplicado(Integer interersmoratorioaplicado) {
        this.interersmoratorioaplicado = interersmoratorioaplicado;
    }

    public BigDecimal getMontointeres() {
        return montointeres;
    }

    public void setMontointeres(BigDecimal montointeres) {
        this.montointeres = montointeres;
    }

    public Integer getReferencialetra() {
        return referencialetra;
    }

    public void setReferencialetra(Integer referencialetra) {
        this.referencialetra = referencialetra;
    }

    public Integer getDiasvencidos() {
        return diasvencidos;
    }

    public void setDiasvencidos(Integer diasvencidos) {
        this.diasvencidos = diasvencidos;
    }

    public BigDecimal getMontomora() {
        return montomora;
    }

    public void setMontomora(BigDecimal montomora) {
        this.montomora = montomora;
    }

    public String getEstadovencimiento() {
        return estadovencimiento;
    }

    public void setEstadovencimiento(String estadovencimiento) {
        this.estadovencimiento = estadovencimiento;
    }

    public Integer getDescuentoaplicado() {
        return descuentoaplicado;
    }

    public void setDescuentoaplicado(Integer descuentoaplicado) {
        this.descuentoaplicado = descuentoaplicado;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Datoscredito getDatoscredito() {
        return datoscredito;
    }

    public void setDatoscredito(Datoscredito datoscredito) {
        this.datoscredito = datoscredito;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idletras != null ? idletras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Letras)) {
            return false;
        }
        Letras other = (Letras) object;
        if ((this.idletras == null && other.idletras != null) || (this.idletras != null && !this.idletras.equals(other.idletras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Letras[ idletras=" + idletras + " ]";
    }
    
}
