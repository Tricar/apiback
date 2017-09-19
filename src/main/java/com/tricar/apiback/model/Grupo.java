package com.tricar.apiback.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "grupo")

public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codgru")
    private Integer codgru;
    @Size(max = 50)
    @Column(name = "nomgrup")
    private String nomgrup;
    @Size(max = 50)
    @Column(name = "pdmdbname")
    private String pdmdbname;
    @Size(max = 50)
    @Column(name = "pdmdbserver")
    private String pdmdbserver;
    @Column(name = "feccre")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feccre;    

    public Grupo() {
    }

    public Grupo(Integer codgru) {
        this.codgru = codgru;
    }

    public Integer getCodgru() {
        return codgru;
    }

    public void setCodgru(Integer codgru) {
        this.codgru = codgru;
    }

    public String getNomgrup() {
        return nomgrup;
    }

    public void setNomgrup(String nomgrup) {
        this.nomgrup = nomgrup;
    }

    public String getPdmdbname() {
        return pdmdbname;
    }

    public void setPdmdbname(String pdmdbname) {
        this.pdmdbname = pdmdbname;
    }

    public String getPdmdbserver() {
        return pdmdbserver;
    }

    public void setPdmdbserver(String pdmdbserver) {
        this.pdmdbserver = pdmdbserver;
    }

    public Date getFeccre() {
        return feccre;
    }

    public void setFeccre(Date feccre) {
        this.feccre = feccre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codgru != null ? codgru.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.codgru == null && other.codgru != null) || (this.codgru != null && !this.codgru.equals(other.codgru))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Grupo[ codgru=" + codgru + " ]";
    }
    
}
