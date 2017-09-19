package com.tricar.apiback.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "empresa")

public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codempre")
    private Integer codempre;
    @Size(max = 50)
    @Column(name = "nomemp")
    private String nomemp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "rucemp")
    private String rucemp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "logempresa")
    private String logempresa;
    @Size(max = 255)
    @Column(name = "rutlog")
    private String rutlog;
    @Size(max = 100)
    @Column(name = "diremp")
    private String diremp;
    @Size(max = 30)
    @Column(name = "telemp")
    private String telemp;
    @Size(max = 30)
    @Column(name = "faxemp")
    private String faxemp;
    @Size(max = 255)
    @Column(name = "bkuemp")
    private String bkuemp;
    @Size(max = 50)
    @Column(name = "desemp")
    private String desemp;
    @Size(max = 50)
    @Column(name = "nomloc")
    private String nomloc;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 70)
    @Column(name = "email")
    private String email;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "rutfirma")
    private String rutfirma;
    @Size(max = 50)
    @Column(name = "web")
    private String web;
    @JoinColumn(name = "codgru", referencedColumnName = "codgru")
    @ManyToOne(optional = false)
    private Grupo grupo;

    public Empresa() {
    }

    public Empresa(Integer codempre) {
        this.codempre = codempre;
    }

    public Empresa(Integer codempre, String rucemp, String logempresa) {
        this.codempre = codempre;
        this.rucemp = rucemp;
        this.logempresa = logempresa;
    }

    public Integer getCodempre() {
        return codempre;
    }

    public void setCodempre(Integer codempre) {
        this.codempre = codempre;
    }

    public String getNomemp() {
        return nomemp;
    }

    public void setNomemp(String nomemp) {
        this.nomemp = nomemp;
    }

    public String getRucemp() {
        return rucemp;
    }

    public void setRucemp(String rucemp) {
        this.rucemp = rucemp;
    }

    public String getLogempresa() {
        return logempresa;
    }

    public void setLogempresa(String logempresa) {
        this.logempresa = logempresa;
    }

    public String getRutlog() {
        return rutlog;
    }

    public void setRutlog(String rutlog) {
        this.rutlog = rutlog;
    }

    public String getDiremp() {
        return diremp;
    }

    public void setDiremp(String diremp) {
        this.diremp = diremp;
    }

    public String getTelemp() {
        return telemp;
    }

    public void setTelemp(String telemp) {
        this.telemp = telemp;
    }

    public String getFaxemp() {
        return faxemp;
    }

    public void setFaxemp(String faxemp) {
        this.faxemp = faxemp;
    }

    public String getBkuemp() {
        return bkuemp;
    }

    public void setBkuemp(String bkuemp) {
        this.bkuemp = bkuemp;
    }

    public String getDesemp() {
        return desemp;
    }

    public void setDesemp(String desemp) {
        this.desemp = desemp;
    }

    public String getNomloc() {
        return nomloc;
    }

    public void setNomloc(String nomloc) {
        this.nomloc = nomloc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRutfirma() {
        return rutfirma;
    }

    public void setRutfirma(String rutfirma) {
        this.rutfirma = rutfirma;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codempre != null ? codempre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.codempre == null && other.codempre != null) || (this.codempre != null && !this.codempre.equals(other.codempre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Empresa[ codempre=" + codempre + " ]";
    }
    
}
