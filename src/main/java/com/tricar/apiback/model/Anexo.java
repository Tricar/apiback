package com.tricar.apiback.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "anexo")

public class Anexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codane")
    private Integer codane;
    @Size(max = 150)
    @Column(name = "nomane")
    private String nomane;
    @Size(max = 50)
    @Column(name = "idane1")
    private String idane1;
    @Size(max = 50)
    @Column(name = "idane2")
    private String idane2;
    @Size(max = 450)
    @Column(name = "dirane")
    private String dirane;
    @Size(max = 450)
    @Column(name = "telane")
    private String telane;
    @Size(max = 50)
    @Column(name = "faxane")
    private String faxane;
    @Size(max = 50)
    @Column(name = "celane")
    private String celane;
    @Size(max = 450)
    @Column(name = "mailane")
    private String mailane;
    @Size(max = 50)
    @Column(name = "webanex")
    private String webanex;
    @Column(name = "fechnac")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechnac;
    @Column(name = "fecingr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecingr;
    @Size(max = 50)
    @Column(name = "usucresis")
    private String usucresis;
    @Column(name = "fecresis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecresis;
    @Size(max = 50)
    @Column(name = "nomtra1")
    private String nomtra1;
    @Size(max = 50)
    @Column(name = "nomtra2")
    private String nomtra2;
    @Size(max = 50)
    @Column(name = "apellpat")
    private String apellpat;
    @Size(max = 50)
    @Column(name = "apellmat")
    private String apellmat;
    @Size(max = 50)
    @Column(name = "sexo")
    private String sexo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldomn")
    private BigDecimal saldomn;
    @Column(name = "saldome")
    private BigDecimal saldome;
    @Size(max = 50)
    @Column(name = "flkact")
    private String flkact;
    @Size(max = 150)
    @Column(name = "razon")
    private String razon;
    @Size(max = 80)
    @Column(name = "contacto")
    private String contacto;
    @Size(max = 50)
    @Column(name = "ubigeo")
    private String ubigeo;
    @Column(name = "codubigeo")
    private Integer codubigeo;
    @Column(name = "codrefempresa")
    private Integer codrefempresa;
    @Column(name = "lineacreditosollares")
    private BigDecimal lineacreditosollares;
    @Column(name = "lineacreditosoles")
    private BigDecimal lineacreditosoles;
    @Column(name = "saldolineacreditodolares")
    private BigDecimal saldolineacreditodolares;
    @Column(name = "saldolineacreditosoles")
    private BigDecimal saldolineacreditosoles;
    @Column(name = "totaldeudadolares")
    private BigDecimal totaldeudadolares;
    @Column(name = "totaldeudasoles")
    private BigDecimal totaldeudasoles;
    @Column(name = "totalvencidosdolares")
    private BigDecimal totalvencidosdolares;
    @Column(name = "totalvencidosoles")
    private BigDecimal totalvencidosoles;
    @Column(name = "i_totaldeudasoles")
    private BigDecimal iTotaldeudasoles;
    @Column(name = "i_deudavencidasoles")
    private BigDecimal iDeudavencidasoles;
    @Column(name = "i_deudapendientesoles")
    private BigDecimal iDeudapendientesoles;
    @Column(name = "i_deudamenor60diassoles")
    private BigDecimal iDeudamenor60diassoles;
    @Column(name = "i_deudamayor60diassoles")
    private BigDecimal iDeudamayor60diassoles;
    @Column(name = "i_deudamayor365diassoles")
    private BigDecimal iDeudamayor365diassoles;
    @Size(max = 50)
    @Column(name = "i_tipodeuda")
    private String iTipodeuda;
    @Column(name = "i_deudasolodolares")
    private BigDecimal iDeudasolodolares;
    @Column(name = "i_deudasolosoles")
    private BigDecimal iDeudasolosoles;
    @Size(max = 50)
    @Column(name = "i_tipounidad")
    private String iTipounidad;
    @Column(name = "e_totalingresossoles")
    private BigDecimal eTotalingresossoles;
    @Column(name = "e_ingresossoles")
    private BigDecimal eIngresossoles;
    @Column(name = "e_ingresosdolares")
    private BigDecimal eIngresosdolares;
    @Column(name = "e_ingresoscontado")
    private BigDecimal eIngresoscontado;
    @Column(name = "e_ingresoscobranza")
    private BigDecimal eIngresoscobranza;
    @Column(name = "e_ingresosanticipos")
    private BigDecimal eIngresosanticipos;
    @Column(name = "e_ingresosaldos")
    private BigDecimal eIngresosaldos;
    @Size(max = 50)
    @Column(name = "i_tipounidad_informe")
    private String iTipounidadInforme;
    @Size(max = 2)
    @Column(name = "cat")
    private String cat;    
    @JoinColumn(name = "idcondicioncredito", referencedColumnName = "codconpag")
    @ManyToOne
    private Condpago condpago;
    @JoinColumn(name = "idmodalidad", referencedColumnName = "codconpag")
    @ManyToOne
    private Condpago condpago1;
    @JoinColumn(name = "idmoneda", referencedColumnName = "codmon")
    @ManyToOne
    private Moneda moneda;
    @JoinColumn(name = "idtipo", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tipo tipo;    

    public Anexo() {
    }

    public Anexo(Integer codane) {
        this.codane = codane;
    }

    public Integer getCodane() {
        return codane;
    }

    public void setCodane(Integer codane) {
        this.codane = codane;
    }

    public String getNomane() {
        return nomane;
    }

    public void setNomane(String nomane) {
        this.nomane = nomane;
    }

    public String getIdane1() {
        return idane1;
    }

    public void setIdane1(String idane1) {
        this.idane1 = idane1;
    }

    public String getIdane2() {
        return idane2;
    }

    public void setIdane2(String idane2) {
        this.idane2 = idane2;
    }

    public String getDirane() {
        return dirane;
    }

    public void setDirane(String dirane) {
        this.dirane = dirane;
    }

    public String getTelane() {
        return telane;
    }

    public void setTelane(String telane) {
        this.telane = telane;
    }

    public String getFaxane() {
        return faxane;
    }

    public void setFaxane(String faxane) {
        this.faxane = faxane;
    }

    public String getCelane() {
        return celane;
    }

    public void setCelane(String celane) {
        this.celane = celane;
    }

    public String getMailane() {
        return mailane;
    }

    public void setMailane(String mailane) {
        this.mailane = mailane;
    }

    public String getWebanex() {
        return webanex;
    }

    public void setWebanex(String webanex) {
        this.webanex = webanex;
    }

    public Date getFechnac() {
        return fechnac;
    }

    public void setFechnac(Date fechnac) {
        this.fechnac = fechnac;
    }

    public Date getFecingr() {
        return fecingr;
    }

    public void setFecingr(Date fecingr) {
        this.fecingr = fecingr;
    }

    public String getUsucresis() {
        return usucresis;
    }

    public void setUsucresis(String usucresis) {
        this.usucresis = usucresis;
    }

    public Date getFecresis() {
        return fecresis;
    }

    public void setFecresis(Date fecresis) {
        this.fecresis = fecresis;
    }

    public String getNomtra1() {
        return nomtra1;
    }

    public void setNomtra1(String nomtra1) {
        this.nomtra1 = nomtra1;
    }

    public String getNomtra2() {
        return nomtra2;
    }

    public void setNomtra2(String nomtra2) {
        this.nomtra2 = nomtra2;
    }

    public String getApellpat() {
        return apellpat;
    }

    public void setApellpat(String apellpat) {
        this.apellpat = apellpat;
    }

    public String getApellmat() {
        return apellmat;
    }

    public void setApellmat(String apellmat) {
        this.apellmat = apellmat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public BigDecimal getSaldomn() {
        return saldomn;
    }

    public void setSaldomn(BigDecimal saldomn) {
        this.saldomn = saldomn;
    }

    public BigDecimal getSaldome() {
        return saldome;
    }

    public void setSaldome(BigDecimal saldome) {
        this.saldome = saldome;
    }

    public String getFlkact() {
        return flkact;
    }

    public void setFlkact(String flkact) {
        this.flkact = flkact;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Integer getCodubigeo() {
        return codubigeo;
    }

    public void setCodubigeo(Integer codubigeo) {
        this.codubigeo = codubigeo;
    }

    public Integer getCodrefempresa() {
        return codrefempresa;
    }

    public void setCodrefempresa(Integer codrefempresa) {
        this.codrefempresa = codrefempresa;
    }

    public BigDecimal getLineacreditosollares() {
        return lineacreditosollares;
    }

    public void setLineacreditosollares(BigDecimal lineacreditosollares) {
        this.lineacreditosollares = lineacreditosollares;
    }

    public BigDecimal getLineacreditosoles() {
        return lineacreditosoles;
    }

    public void setLineacreditosoles(BigDecimal lineacreditosoles) {
        this.lineacreditosoles = lineacreditosoles;
    }

    public BigDecimal getSaldolineacreditodolares() {
        return saldolineacreditodolares;
    }

    public void setSaldolineacreditodolares(BigDecimal saldolineacreditodolares) {
        this.saldolineacreditodolares = saldolineacreditodolares;
    }

    public BigDecimal getSaldolineacreditosoles() {
        return saldolineacreditosoles;
    }

    public void setSaldolineacreditosoles(BigDecimal saldolineacreditosoles) {
        this.saldolineacreditosoles = saldolineacreditosoles;
    }

    public BigDecimal getTotaldeudadolares() {
        return totaldeudadolares;
    }

    public void setTotaldeudadolares(BigDecimal totaldeudadolares) {
        this.totaldeudadolares = totaldeudadolares;
    }

    public BigDecimal getTotaldeudasoles() {
        return totaldeudasoles;
    }

    public void setTotaldeudasoles(BigDecimal totaldeudasoles) {
        this.totaldeudasoles = totaldeudasoles;
    }

    public BigDecimal getTotalvencidosdolares() {
        return totalvencidosdolares;
    }

    public void setTotalvencidosdolares(BigDecimal totalvencidosdolares) {
        this.totalvencidosdolares = totalvencidosdolares;
    }

    public BigDecimal getTotalvencidosoles() {
        return totalvencidosoles;
    }

    public void setTotalvencidosoles(BigDecimal totalvencidosoles) {
        this.totalvencidosoles = totalvencidosoles;
    }

    public BigDecimal getITotaldeudasoles() {
        return iTotaldeudasoles;
    }

    public void setITotaldeudasoles(BigDecimal iTotaldeudasoles) {
        this.iTotaldeudasoles = iTotaldeudasoles;
    }

    public BigDecimal getIDeudavencidasoles() {
        return iDeudavencidasoles;
    }

    public void setIDeudavencidasoles(BigDecimal iDeudavencidasoles) {
        this.iDeudavencidasoles = iDeudavencidasoles;
    }

    public BigDecimal getIDeudapendientesoles() {
        return iDeudapendientesoles;
    }

    public void setIDeudapendientesoles(BigDecimal iDeudapendientesoles) {
        this.iDeudapendientesoles = iDeudapendientesoles;
    }

    public BigDecimal getIDeudamenor60diassoles() {
        return iDeudamenor60diassoles;
    }

    public void setIDeudamenor60diassoles(BigDecimal iDeudamenor60diassoles) {
        this.iDeudamenor60diassoles = iDeudamenor60diassoles;
    }

    public BigDecimal getIDeudamayor60diassoles() {
        return iDeudamayor60diassoles;
    }

    public void setIDeudamayor60diassoles(BigDecimal iDeudamayor60diassoles) {
        this.iDeudamayor60diassoles = iDeudamayor60diassoles;
    }

    public BigDecimal getIDeudamayor365diassoles() {
        return iDeudamayor365diassoles;
    }

    public void setIDeudamayor365diassoles(BigDecimal iDeudamayor365diassoles) {
        this.iDeudamayor365diassoles = iDeudamayor365diassoles;
    }

    public String getITipodeuda() {
        return iTipodeuda;
    }

    public void setITipodeuda(String iTipodeuda) {
        this.iTipodeuda = iTipodeuda;
    }

    public BigDecimal getIDeudasolodolares() {
        return iDeudasolodolares;
    }

    public void setIDeudasolodolares(BigDecimal iDeudasolodolares) {
        this.iDeudasolodolares = iDeudasolodolares;
    }

    public BigDecimal getIDeudasolosoles() {
        return iDeudasolosoles;
    }

    public void setIDeudasolosoles(BigDecimal iDeudasolosoles) {
        this.iDeudasolosoles = iDeudasolosoles;
    }

    public String getITipounidad() {
        return iTipounidad;
    }

    public void setITipounidad(String iTipounidad) {
        this.iTipounidad = iTipounidad;
    }

    public BigDecimal getETotalingresossoles() {
        return eTotalingresossoles;
    }

    public void setETotalingresossoles(BigDecimal eTotalingresossoles) {
        this.eTotalingresossoles = eTotalingresossoles;
    }

    public BigDecimal getEIngresossoles() {
        return eIngresossoles;
    }

    public void setEIngresossoles(BigDecimal eIngresossoles) {
        this.eIngresossoles = eIngresossoles;
    }

    public BigDecimal getEIngresosdolares() {
        return eIngresosdolares;
    }

    public void setEIngresosdolares(BigDecimal eIngresosdolares) {
        this.eIngresosdolares = eIngresosdolares;
    }

    public BigDecimal getEIngresoscontado() {
        return eIngresoscontado;
    }

    public void setEIngresoscontado(BigDecimal eIngresoscontado) {
        this.eIngresoscontado = eIngresoscontado;
    }

    public BigDecimal getEIngresoscobranza() {
        return eIngresoscobranza;
    }

    public void setEIngresoscobranza(BigDecimal eIngresoscobranza) {
        this.eIngresoscobranza = eIngresoscobranza;
    }

    public BigDecimal getEIngresosanticipos() {
        return eIngresosanticipos;
    }

    public void setEIngresosanticipos(BigDecimal eIngresosanticipos) {
        this.eIngresosanticipos = eIngresosanticipos;
    }

    public BigDecimal getEIngresosaldos() {
        return eIngresosaldos;
    }

    public void setEIngresosaldos(BigDecimal eIngresosaldos) {
        this.eIngresosaldos = eIngresosaldos;
    }

    public String getITipounidadInforme() {
        return iTipounidadInforme;
    }

    public void setITipounidadInforme(String iTipounidadInforme) {
        this.iTipounidadInforme = iTipounidadInforme;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public Condpago getCondpago() {
        return condpago;
    }

    public void setCondpago(Condpago condpago) {
        this.condpago = condpago;
    }

    public Condpago getCondpago1() {
        return condpago1;
    }

    public void setCondpago1(Condpago condpago1) {
        this.condpago1 = condpago1;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codane != null ? codane.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anexo)) {
            return false;
        }
        Anexo other = (Anexo) object;
        if ((this.codane == null && other.codane != null) || (this.codane != null && !this.codane.equals(other.codane))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Anexo[ codane=" + codane + " ]";
    }
    
}
