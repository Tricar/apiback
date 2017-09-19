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
@Table(name = "unidadnegocio")
public class Unidadnegocio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idunidadnegocio")
    private Integer idunidadnegocio;
    @Size(max = 200)
    @Column(name = "unidadnegocio")
    private String unidadnegocio;
    @Size(max = 50)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 50)
    @Column(name = "abreviacion")
    private String abreviacion;
    @JoinColumn(name = "idciudad", referencedColumnName = "idciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudad;
    @JoinColumn(name = "idempresa", referencedColumnName = "codempre")
    @ManyToOne(optional = false)
    private Empresa empresa;

    public Unidadnegocio() {
    }

    public Unidadnegocio(Integer idunidadnegocio) {
        this.idunidadnegocio = idunidadnegocio;
    }

    public Integer getIdunidadnegocio() {
        return idunidadnegocio;
    }

    public void setIdunidadnegocio(Integer idunidadnegocio) {
        this.idunidadnegocio = idunidadnegocio;
    }

    public String getUnidadnegocio() {
        return unidadnegocio;
    }

    public void setUnidadnegocio(String unidadnegocio) {
        this.unidadnegocio = unidadnegocio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidadnegocio != null ? idunidadnegocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadnegocio)) {
            return false;
        }
        Unidadnegocio other = (Unidadnegocio) object;
        if ((this.idunidadnegocio == null && other.idunidadnegocio != null) || (this.idunidadnegocio != null && !this.idunidadnegocio.equals(other.idunidadnegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Unidadnegocio[ idunidadnegocio=" + idunidadnegocio + " ]";
    }
    
}
