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
@Table(name = "condpago")

public class Condpago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codconpag")
    private Integer codconpag;
    @Size(max = 50)
    @Column(name = "descondpag")
    private String descondpag;
    @Column(name = "dias")
    private Integer dias;
    @Column(name = "letras")
    private Integer letras;    
    @JoinColumn(name = "idtipocondpago", referencedColumnName = "idtipocondpago")
    @ManyToOne(optional = false)
    private Tipocondpago tipocondpago;

    public Condpago() {
    }

    public Condpago(Integer codconpag) {
        this.codconpag = codconpag;
    }

    public Integer getCodconpag() {
        return codconpag;
    }

    public void setCodconpag(Integer codconpag) {
        this.codconpag = codconpag;
    }

    public String getDescondpag() {
        return descondpag;
    }

    public void setDescondpag(String descondpag) {
        this.descondpag = descondpag;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Integer getLetras() {
        return letras;
    }

    public void setLetras(Integer letras) {
        this.letras = letras;
    }

    public Tipocondpago getTipocondpago() {
        return tipocondpago;
    }

    public void setTipocondpago(Tipocondpago tipocondpago) {
        this.tipocondpago = tipocondpago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codconpag != null ? codconpag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condpago)) {
            return false;
        }
        Condpago other = (Condpago) object;
        if ((this.codconpag == null && other.codconpag != null) || (this.codconpag != null && !this.codconpag.equals(other.codconpag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Condpago[ codconpag=" + codconpag + " ]";
    }
    
}
