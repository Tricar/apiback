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
@Table(name = "niespecificaciones")

public class Niespecificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "seriemotor")
    private String seriemotor;
    @Size(max = 50)
    @Column(name = "seriecahsis")
    private String seriecahsis;
    @Size(max = 50)
    @Column(name = "serievin")
    private String serievin;
    @Size(max = 100)
    @Column(name = "clase")
    private String clase;
    @Size(max = 50)
    @Column(name = "categoria")
    private String categoria;
    @Size(max = 50)
    @Column(name = "version")
    private String version;
    @Size(max = 50)
    @Column(name = "carroceria")
    private String carroceria;
    @Size(max = 50)
    @Column(name = "anomodelo")
    private String anomodelo;
    @Size(max = 50)
    @Column(name = "anofabricacion")
    private String anofabricacion;
    @Size(max = 50)
    @Column(name = "ncilindros")
    private String ncilindros;
    @Size(max = 50)
    @Column(name = "cilindrado")
    private String cilindrado;
    @Size(max = 50)
    @Column(name = "perfmotor")
    private String perfmotor;
    @Size(max = 50)
    @Column(name = "combustible")
    private String combustible;
    @Size(max = 50)
    @Column(name = "formula")
    private String formula;
    @Size(max = 50)
    @Column(name = "nruedas")
    private String nruedas;
    @Size(max = 50)
    @Column(name = "longitud")
    private String longitud;
    @Size(max = 50)
    @Column(name = "pesoneto")
    private String pesoneto;
    @Size(max = 50)
    @Column(name = "cargautil")
    private String cargautil;
    @Size(max = 50)
    @Column(name = "pesobruto")
    private String pesobruto;
    @Size(max = 50)
    @Column(name = "npasajeros")
    private String npasajeros;
    @Column(name = "idalmacenorigen")
    private Integer idalmacenorigen;
    @Size(max = 100)
    @Column(name = "almacenorigen")
    private String almacenorigen;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "idalmacendestino")
    private Integer idalmacendestino;
    @Size(max = 100)
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
    @Column(name = "coddetns")
    private Integer coddetns;
    @Size(max = 50)
    @Column(name = "cabot")
    private String cabot;
    @Size(max = 50)
    @Column(name = "cabni")
    private String cabni;
    @Column(name = "coddetniot")
    private Integer coddetniot;
    @Size(max = 100)
    @Column(name = "desarticulo")
    private String desarticulo;
    @Size(max = 100)
    @Column(name = "desmodelo")
    private String desmodelo;
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
    @Column(name = "idusuario")
    private String idusuario;
    @Column(name = "estadorecerva")
    private Boolean estadorecerva;
    @Size(max = 100)
    @Column(name = "recervadoxcliente")
    private String recervadoxcliente;
    @Size(max = 50)
    @Column(name = "recervadoxnp")
    private String recervadoxnp;
    @Column(name = "coddetnprecerva")
    private Integer coddetnprecerva;
    @Size(max = 50)
    @Column(name = "otromodelo")
    private String otromodelo;
    @Size(max = 50)
    @Column(name = "mostrador")
    private String mostrador;
    @Size(max = 50)
    @Column(name = "loteimportacion")
    private String loteimportacion;
    @Column(name = "ackd")
    private Integer ackd;
    @Column(name = "aml")
    private Integer aml;
    @Column(name = "aemp")
    private Integer aemp;
    @Size(max = 50)
    @Column(name = "stiackd")
    private String stiackd;
    @Size(max = 50)
    @Column(name = "stiaml")
    private String stiaml;
    @Size(max = 50)
    @Column(name = "stiaemp")
    private String stiaemp;
    @JoinColumn(name = "coddetni", referencedColumnName = "coddetni")
    @ManyToOne(optional = false)
    private Detni detni;
    @JoinColumn(name = "color", referencedColumnName = "idcolor")
    @ManyToOne(optional = false)
    private Color color;
    @JoinColumn(name = "marca", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca marca;
    @JoinColumn(name = "modelo", referencedColumnName = "idmodelo")
    @ManyToOne(optional = false)
    private Modelo modelo;
    
    public Niespecificaciones() {
    }

    public Niespecificaciones(String seriemotor) {
        this.seriemotor = seriemotor;
    }

    public String getSeriemotor() {
        return seriemotor;
    }

    public void setSeriemotor(String seriemotor) {
        this.seriemotor = seriemotor;
    }

    public String getSeriecahsis() {
        return seriecahsis;
    }

    public void setSeriecahsis(String seriecahsis) {
        this.seriecahsis = seriecahsis;
    }

    public String getSerievin() {
        return serievin;
    }

    public void setSerievin(String serievin) {
        this.serievin = serievin;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(String anomodelo) {
        this.anomodelo = anomodelo;
    }

    public String getAnofabricacion() {
        return anofabricacion;
    }

    public void setAnofabricacion(String anofabricacion) {
        this.anofabricacion = anofabricacion;
    }

    public String getNcilindros() {
        return ncilindros;
    }

    public void setNcilindros(String ncilindros) {
        this.ncilindros = ncilindros;
    }

    public String getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(String cilindrado) {
        this.cilindrado = cilindrado;
    }

    public String getPerfmotor() {
        return perfmotor;
    }

    public void setPerfmotor(String perfmotor) {
        this.perfmotor = perfmotor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getNruedas() {
        return nruedas;
    }

    public void setNruedas(String nruedas) {
        this.nruedas = nruedas;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPesoneto() {
        return pesoneto;
    }

    public void setPesoneto(String pesoneto) {
        this.pesoneto = pesoneto;
    }

    public String getCargautil() {
        return cargautil;
    }

    public void setCargautil(String cargautil) {
        this.cargautil = cargautil;
    }

    public String getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(String pesobruto) {
        this.pesobruto = pesobruto;
    }

    public String getNpasajeros() {
        return npasajeros;
    }

    public void setNpasajeros(String npasajeros) {
        this.npasajeros = npasajeros;
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

    public Integer getCoddetns() {
        return coddetns;
    }

    public void setCoddetns(Integer coddetns) {
        this.coddetns = coddetns;
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

    public String getDesarticulo() {
        return desarticulo;
    }

    public void setDesarticulo(String desarticulo) {
        this.desarticulo = desarticulo;
    }

    public String getDesmodelo() {
        return desmodelo;
    }

    public void setDesmodelo(String desmodelo) {
        this.desmodelo = desmodelo;
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

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public Boolean getEstadorecerva() {
        return estadorecerva;
    }

    public void setEstadorecerva(Boolean estadorecerva) {
        this.estadorecerva = estadorecerva;
    }

    public String getRecervadoxcliente() {
        return recervadoxcliente;
    }

    public void setRecervadoxcliente(String recervadoxcliente) {
        this.recervadoxcliente = recervadoxcliente;
    }

    public String getRecervadoxnp() {
        return recervadoxnp;
    }

    public void setRecervadoxnp(String recervadoxnp) {
        this.recervadoxnp = recervadoxnp;
    }

    public Integer getCoddetnprecerva() {
        return coddetnprecerva;
    }

    public void setCoddetnprecerva(Integer coddetnprecerva) {
        this.coddetnprecerva = coddetnprecerva;
    }

    public String getOtromodelo() {
        return otromodelo;
    }

    public void setOtromodelo(String otromodelo) {
        this.otromodelo = otromodelo;
    }

    public String getMostrador() {
        return mostrador;
    }

    public void setMostrador(String mostrador) {
        this.mostrador = mostrador;
    }

    public String getLoteimportacion() {
        return loteimportacion;
    }

    public void setLoteimportacion(String loteimportacion) {
        this.loteimportacion = loteimportacion;
    }

    public Integer getAckd() {
        return ackd;
    }

    public void setAckd(Integer ackd) {
        this.ackd = ackd;
    }

    public Integer getAml() {
        return aml;
    }

    public void setAml(Integer aml) {
        this.aml = aml;
    }

    public Integer getAemp() {
        return aemp;
    }

    public void setAemp(Integer aemp) {
        this.aemp = aemp;
    }

    public String getStiackd() {
        return stiackd;
    }

    public void setStiackd(String stiackd) {
        this.stiackd = stiackd;
    }

    public String getStiaml() {
        return stiaml;
    }

    public void setStiaml(String stiaml) {
        this.stiaml = stiaml;
    }

    public String getStiaemp() {
        return stiaemp;
    }

    public void setStiaemp(String stiaemp) {
        this.stiaemp = stiaemp;
    }

    public Detni getDetni() {
        return detni;
    }

    public void setDetni(Detni detni) {
        this.detni = detni;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seriemotor != null ? seriemotor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Niespecificaciones)) {
            return false;
        }
        Niespecificaciones other = (Niespecificaciones) object;
        if ((this.seriemotor == null && other.seriemotor != null) || (this.seriemotor != null && !this.seriemotor.equals(other.seriemotor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Niespecificaciones[ seriemotor=" + seriemotor + " ]";
    }
    
}
