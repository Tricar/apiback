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
@Table(name = "movespecificaciones")

public class Movespecificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codmovespecificaciones")
    private Integer codmovespecificaciones;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "idalmacenorigen")
    private Integer idalmacenorigen;
    @Size(max = 50)
    @Column(name = "almacenorigen")
    private String almacenorigen;
    @Column(name = "idalmacendestino")
    private Integer idalmacendestino;
    @Size(max = 50)
    @Column(name = "almacendestino")
    private String almacendestino;
    @Column(name = "codartorigen")
    private Integer codartorigen;
    @Column(name = "codartdestino")
    private Integer codartdestino;
    @Size(max = 50)
    @Column(name = "codguia")
    private String codguia;
    @Size(max = 50)
    @Column(name = "codns")
    private String codns;
    @Size(max = 50)
    @Column(name = "cabot")
    private String cabot;
    @Size(max = 50)
    @Column(name = "cabni")
    private String cabni;
    @Column(name = "coddetniot")
    private Integer coddetniot;
    @Size(max = 100)
    @Column(name = "desart")
    private String desart;
    @Size(max = 100)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 50)
    @Column(name = "NFactura")
    private String nFactura;
    @Size(max = 50)
    @Column(name = "codart2")
    private String codart2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Totalfactura")
    private BigDecimal totalfactura;
    @Size(max = 50)
    @Column(name = "mostradorcliente")
    private String mostradorcliente;
    @JoinColumn(name = "motor", referencedColumnName = "seriemotor")
    @ManyToOne(optional = false)
    private Niespecificaciones niespecificaciones;

    public Movespecificaciones() {
    }

    public Movespecificaciones(Integer codmovespecificaciones) {
        this.codmovespecificaciones = codmovespecificaciones;
    }

    public Integer getCodmovespecificaciones() {
        return codmovespecificaciones;
    }

    public void setCodmovespecificaciones(Integer codmovespecificaciones) {
        this.codmovespecificaciones = codmovespecificaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdalmacenorigen() {
        return idalmacenorigen;
    }

    public void setIdalmacenorigen(Integer idalmacenorigen) {
        this.idalmacenorigen = idalmacenorigen;
    }

    public String getAlmacenorigen() {
        return almacenorigen;
    }

    public void setAlmacenorigen(String almacenorigen) {
        this.almacenorigen = almacenorigen;
    }

    public Integer getIdalmacendestino() {
        return idalmacendestino;
    }

    public void setIdalmacendestino(Integer idalmacendestino) {
        this.idalmacendestino = idalmacendestino;
    }

    public String getAlmacendestino() {
        return almacendestino;
    }

    public void setAlmacendestino(String almacendestino) {
        this.almacendestino = almacendestino;
    }

    public Integer getCodartorigen() {
        return codartorigen;
    }

    public void setCodartorigen(Integer codartorigen) {
        this.codartorigen = codartorigen;
    }

    public Integer getCodartdestino() {
        return codartdestino;
    }

    public void setCodartdestino(Integer codartdestino) {
        this.codartdestino = codartdestino;
    }

    public String getCodguia() {
        return codguia;
    }

    public void setCodguia(String codguia) {
        this.codguia = codguia;
    }

    public String getCodns() {
        return codns;
    }

    public void setCodns(String codns) {
        this.codns = codns;
    }

    public String getCabot() {
        return cabot;
    }

    public void setCabot(String cabot) {
        this.cabot = cabot;
    }

    public String getCabni() {
        return cabni;
    }

    public void setCabni(String cabni) {
        this.cabni = cabni;
    }

    public Integer getCoddetniot() {
        return coddetniot;
    }

    public void setCoddetniot(Integer coddetniot) {
        this.coddetniot = coddetniot;
    }

    public String getDesart() {
        return desart;
    }

    public void setDesart(String desart) {
        this.desart = desart;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNFactura() {
        return nFactura;
    }

    public void setNFactura(String nFactura) {
        this.nFactura = nFactura;
    }

    public String getCodart2() {
        return codart2;
    }

    public void setCodart2(String codart2) {
        this.codart2 = codart2;
    }

    public BigDecimal getTotalfactura() {
        return totalfactura;
    }

    public void setTotalfactura(BigDecimal totalfactura) {
        this.totalfactura = totalfactura;
    }

    public String getMostradorcliente() {
        return mostradorcliente;
    }

    public void setMostradorcliente(String mostradorcliente) {
        this.mostradorcliente = mostradorcliente;
    }

    public Niespecificaciones getNiespecificaciones() {
        return niespecificaciones;
    }

    public void setNiespecificaciones(Niespecificaciones niespecificaciones) {
        this.niespecificaciones = niespecificaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmovespecificaciones != null ? codmovespecificaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movespecificaciones)) {
            return false;
        }
        Movespecificaciones other = (Movespecificaciones) object;
        if ((this.codmovespecificaciones == null && other.codmovespecificaciones != null) || (this.codmovespecificaciones != null && !this.codmovespecificaciones.equals(other.codmovespecificaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Movespecificaciones[ codmovespecificaciones=" + codmovespecificaciones + " ]";
    }
    
}
