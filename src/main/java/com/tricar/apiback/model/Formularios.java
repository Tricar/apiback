package com.tricar.apiback.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author D@joh
 */
@Entity
@Table(name = "formularios")

public class Formularios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idformulario")
    private Integer idformulario;
    @Size(max = 50)
    @Column(name = "formulario")
    private String formulario;
    

    public Formularios() {
    }

    public Formularios(Integer idformulario) {
        this.idformulario = idformulario;
    }

    public Integer getIdformulario() {
        return idformulario;
    }

    public void setIdformulario(Integer idformulario) {
        this.idformulario = idformulario;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformulario != null ? idformulario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formularios)) {
            return false;
        }
        Formularios other = (Formularios) object;
        if ((this.idformulario == null && other.idformulario != null) || (this.idformulario != null && !this.idformulario.equals(other.idformulario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Formularios[ idformulario=" + idformulario + " ]";
    }
    
}
