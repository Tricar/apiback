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
@Table(name = "direccionanexo")

public class Direccionanexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddireccionanexo")
    private Integer iddireccionanexo;
    @Size(max = 300)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codciudad")
    private Integer codciudad;
    @JoinColumn(name = "idanexo", referencedColumnName = "codane")
    @ManyToOne(optional = false)
    private Anexo anexo;

    public Direccionanexo() {
    }

    public Direccionanexo(Integer iddireccionanexo) {
        this.iddireccionanexo = iddireccionanexo;
    }

    public Integer getIddireccionanexo() {
        return iddireccionanexo;
    }

    public void setIddireccionanexo(Integer iddireccionanexo) {
        this.iddireccionanexo = iddireccionanexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodciudad() {
        return codciudad;
    }

    public void setCodciudad(Integer codciudad) {
        this.codciudad = codciudad;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddireccionanexo != null ? iddireccionanexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccionanexo)) {
            return false;
        }
        Direccionanexo other = (Direccionanexo) object;
        if ((this.iddireccionanexo == null && other.iddireccionanexo != null) || (this.iddireccionanexo != null && !this.iddireccionanexo.equals(other.iddireccionanexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Direccionanexo[ iddireccionanexo=" + iddireccionanexo + " ]";
    }
    
}
