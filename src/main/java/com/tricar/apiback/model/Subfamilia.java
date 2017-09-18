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
@Table(name = "subfamilia")

public class Subfamilia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsubfamilia")
    private Integer idsubfamilia;
    @Size(max = 50)
    @Column(name = "subfamilia")
    private String subfamilia;
    @Size(max = 50)
    @Column(name = "codigo")
    private String codigo;
    @JoinColumn(name = "idfamilia", referencedColumnName = "idfamilia")
    @ManyToOne(optional = false)
    private Familia familia;

    public Subfamilia() {
    }

    public Subfamilia(Integer idsubfamilia) {
        this.idsubfamilia = idsubfamilia;
    }

    public Integer getIdsubfamilia() {
        return idsubfamilia;
    }

    public void setIdsubfamilia(Integer idsubfamilia) {
        this.idsubfamilia = idsubfamilia;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubfamilia != null ? idsubfamilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subfamilia)) {
            return false;
        }
        Subfamilia other = (Subfamilia) object;
        if ((this.idsubfamilia == null && other.idsubfamilia != null) || (this.idsubfamilia != null && !this.idsubfamilia.equals(other.idsubfamilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Subfamilia[ idsubfamilia=" + idsubfamilia + " ]";
    }
    
}
