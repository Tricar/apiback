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
@Table(name = "articulo")

public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codart")
    private Integer codart;
    @Size(max = 250)
    @Column(name = "desart")
    private String desart;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precmn")
    private BigDecimal precmn;
    @Column(name = "precme")
    private BigDecimal precme;
    @Column(name = "stktot")
    private BigDecimal stktot;
    @Column(name = "stkmin")
    private BigDecimal stkmin;
    @Column(name = "stkmax")
    private BigDecimal stkmax;
    @Column(name = "fecinv")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecinv;
    @Column(name = "cospro")
    private BigDecimal cospro;
    @Size(max = 50)
    @Column(name = "flkact")
    private String flkact;
    @Size(max = 50)
    @Column(name = "usucresis")
    private String usucresis;
    @Column(name = "feccresis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feccresis;
    @Size(max = 50)
    @Column(name = "usumosis")
    private String usumosis;
    @Column(name = "fecmodsis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecmodsis;
    @Column(name = "saldocantidadrq")
    private BigDecimal saldocantidadrq;
    @Column(name = "correlativo")
    private Integer correlativo;
    @Column(name = "saldocantidadoc")
    private BigDecimal saldocantidadoc;
    @Size(max = 50)
    @Column(name = "codart2")
    private String codart2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transformable")
    private boolean transformable;
    @Column(name = "stocktransitoOrigen")
    private BigDecimal stocktransitoOrigen;
    @Column(name = "stocktransitoDestino")
    private BigDecimal stocktransitoDestino;
    @Column(name = "stockProcesoTransf")
    private BigDecimal stockProcesoTransf;
    @Column(name = "stocktransitoComprallegando")
    private BigDecimal stocktransitoComprallegando;
    @Column(name = "stocktransitosaliendo")
    private BigDecimal stocktransitosaliendo;
    @Column(name = "costtemp")
    private BigDecimal costtemp;
    @Column(name = "stocksobrantes")
    private BigDecimal stocksobrantes;
    @Column(name = "pventadistribuidor")
    private BigDecimal pventadistribuidor;
    @Column(name = "pventaexclusivo")
    private BigDecimal pventaexclusivo;
    @Size(max = 100)
    @Column(name = "descripcionventa")
    private String descripcionventa;
    @Column(name = "pventadistribuidord")
    private BigDecimal pventadistribuidord;
    @Column(name = "pventaexcusivod")
    private BigDecimal pventaexcusivod;
    @Column(name = "pventadd1")
    private BigDecimal pventadd1;
    @Column(name = "pventadd2")
    private BigDecimal pventadd2;
    @Column(name = "pventadd3")
    private BigDecimal pventadd3;
    @Column(name = "pventadt1")
    private BigDecimal pventadt1;
    @Column(name = "pventadt2")
    private BigDecimal pventadt2;
    @Column(name = "pventadt3")
    private BigDecimal pventadt3;
    @Column(name = "pventasd1")
    private BigDecimal pventasd1;
    @Column(name = "pventasd2")
    private BigDecimal pventasd2;
    @Column(name = "pventasd3")
    private BigDecimal pventasd3;
    @Column(name = "pventast1")
    private BigDecimal pventast1;
    @Column(name = "pventast2")
    private BigDecimal pventast2;
    @Column(name = "pventast3")
    private BigDecimal pventast3;
    @Size(max = 50)
    @Column(name = "codexterno")
    private String codexterno;
    @Size(max = 150)
    @Column(name = "desartingles")
    private String desartingles;
    @Column(name = "insumoensamblaje")
    private Integer insumoensamblaje;
    @Column(name = "pventasd4")
    private BigDecimal pventasd4;
    @Column(name = "pventadd4")
    private BigDecimal pventadd4;
    @Column(name = "fobdolares")
    private BigDecimal fobdolares;
    @Column(name = "pdistribuidor")
    private BigDecimal pdistribuidor;
    @Column(name = "pmayor")
    private BigDecimal pmayor;
    @Column(name = "ppublico")
    private BigDecimal ppublico;
    @Size(max = 100)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Size(max = 50)
    @Column(name = "tipoconsumible")
    private String tipoconsumible;
    @Column(name = "ensb_mtx_vx")
    private BigDecimal ensbMtxVx;
    @Column(name = "ensb_mtx_tx")
    private BigDecimal ensbMtxTx;
    @Column(name = "ens_mtc_vx")
    private BigDecimal ensMtcVx;
    @Column(name = "sold_mtx_vx")
    private BigDecimal soldMtxVx;
    @Column(name = "sold_mtx_tx")
    private BigDecimal soldMtxTx;
    @Column(name = "sold_mtc_vx")
    private BigDecimal soldMtcVx;
    @Column(name = "tap_mtx_vx")
    private BigDecimal tapMtxVx;
    @Column(name = "tap_mtx_tx")
    private BigDecimal tapMtxTx;
    @Column(name = "tapc_mtc_vx")
    private BigDecimal tapcMtcVx;
    @Column(name = "consum_mtx")
    private BigDecimal consumMtx;
    @Column(name = "consum_mtf")
    private BigDecimal consumMtf;
    @Column(name = "consum_ml")
    private BigDecimal consumMl;
    @Column(name = "consum_sold")
    private BigDecimal consumSold;
    @Column(name = "consm_tap")
    private BigDecimal consmTap;
    @Column(name = "consum_desp")
    private BigDecimal consumDesp;
    @Size(max = 50)
    @Column(name = "comprapuc")
    private String comprapuc;
    @Column(name = "cos_mtx_zs")
    private BigDecimal cosMtxZs;
    @Column(name = "hab_mtx_zs")
    private BigDecimal habMtxZs;
    @Column(name = "hab_mtc_zs")
    private BigDecimal habMtcZs;
    @Column(name = "hab_mtx_vx")
    private BigDecimal habMtxVx;
    @JoinColumn(name = "codalm", referencedColumnName = "codalm")
    @ManyToOne(optional = false)
    private Almacen almacen;
    @JoinColumn(name = "codtipart", referencedColumnName = "codtipart")
    @ManyToOne(optional = false)
    private Tipoarticulo tipoarticulo;
    @JoinColumn(name = "coduni", referencedColumnName = "coduni")
    @ManyToOne(optional = false)
    private Unidad unidad;
    @JoinColumn(name = "idanexo", referencedColumnName = "codane")
    @ManyToOne
    private Anexo anexo;
    @JoinColumn(name = "idclasificacionot", referencedColumnName = "idclasificacionot")
    @ManyToOne
    private Clasificacionot clasificacionot;
    @JoinColumn(name = "idcolor", referencedColumnName = "idcolor")
    @ManyToOne(optional = false)
    private Color color;
    @JoinColumn(name = "idmodelo", referencedColumnName = "idmodelo")
    @ManyToOne(optional = false)
    private Modelo modelo;
    @JoinColumn(name = "idsubfamilia", referencedColumnName = "idsubfamilia")
    @ManyToOne
    private Subfamilia subfamilia;    

    public Articulo() {
    }

    public Articulo(Integer codart) {
        this.codart = codart;
    }

    public Articulo(Integer codart, boolean transformable) {
        this.codart = codart;
        this.transformable = transformable;
    }

    public Integer getCodart() {
        return codart;
    }

    public void setCodart(Integer codart) {
        this.codart = codart;
    }

    public String getDesart() {
        return desart;
    }

    public void setDesart(String desart) {
        this.desart = desart;
    }

    public BigDecimal getPrecmn() {
        return precmn;
    }

    public void setPrecmn(BigDecimal precmn) {
        this.precmn = precmn;
    }

    public BigDecimal getPrecme() {
        return precme;
    }

    public void setPrecme(BigDecimal precme) {
        this.precme = precme;
    }

    public BigDecimal getStktot() {
        return stktot;
    }

    public void setStktot(BigDecimal stktot) {
        this.stktot = stktot;
    }

    public BigDecimal getStkmin() {
        return stkmin;
    }

    public void setStkmin(BigDecimal stkmin) {
        this.stkmin = stkmin;
    }

    public BigDecimal getStkmax() {
        return stkmax;
    }

    public void setStkmax(BigDecimal stkmax) {
        this.stkmax = stkmax;
    }

    public Date getFecinv() {
        return fecinv;
    }

    public void setFecinv(Date fecinv) {
        this.fecinv = fecinv;
    }

    public BigDecimal getCospro() {
        return cospro;
    }

    public void setCospro(BigDecimal cospro) {
        this.cospro = cospro;
    }

    public String getFlkact() {
        return flkact;
    }

    public void setFlkact(String flkact) {
        this.flkact = flkact;
    }

    public String getUsucresis() {
        return usucresis;
    }

    public void setUsucresis(String usucresis) {
        this.usucresis = usucresis;
    }

    public Date getFeccresis() {
        return feccresis;
    }

    public void setFeccresis(Date feccresis) {
        this.feccresis = feccresis;
    }

    public String getUsumosis() {
        return usumosis;
    }

    public void setUsumosis(String usumosis) {
        this.usumosis = usumosis;
    }

    public Date getFecmodsis() {
        return fecmodsis;
    }

    public void setFecmodsis(Date fecmodsis) {
        this.fecmodsis = fecmodsis;
    }

    public BigDecimal getSaldocantidadrq() {
        return saldocantidadrq;
    }

    public void setSaldocantidadrq(BigDecimal saldocantidadrq) {
        this.saldocantidadrq = saldocantidadrq;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getSaldocantidadoc() {
        return saldocantidadoc;
    }

    public void setSaldocantidadoc(BigDecimal saldocantidadoc) {
        this.saldocantidadoc = saldocantidadoc;
    }

    public String getCodart2() {
        return codart2;
    }

    public void setCodart2(String codart2) {
        this.codart2 = codart2;
    }

    public boolean getTransformable() {
        return transformable;
    }

    public void setTransformable(boolean transformable) {
        this.transformable = transformable;
    }

    public BigDecimal getStocktransitoOrigen() {
        return stocktransitoOrigen;
    }

    public void setStocktransitoOrigen(BigDecimal stocktransitoOrigen) {
        this.stocktransitoOrigen = stocktransitoOrigen;
    }

    public BigDecimal getStocktransitoDestino() {
        return stocktransitoDestino;
    }

    public void setStocktransitoDestino(BigDecimal stocktransitoDestino) {
        this.stocktransitoDestino = stocktransitoDestino;
    }

    public BigDecimal getStockProcesoTransf() {
        return stockProcesoTransf;
    }

    public void setStockProcesoTransf(BigDecimal stockProcesoTransf) {
        this.stockProcesoTransf = stockProcesoTransf;
    }

    public BigDecimal getStocktransitoComprallegando() {
        return stocktransitoComprallegando;
    }

    public void setStocktransitoComprallegando(BigDecimal stocktransitoComprallegando) {
        this.stocktransitoComprallegando = stocktransitoComprallegando;
    }

    public BigDecimal getStocktransitosaliendo() {
        return stocktransitosaliendo;
    }

    public void setStocktransitosaliendo(BigDecimal stocktransitosaliendo) {
        this.stocktransitosaliendo = stocktransitosaliendo;
    }

    public BigDecimal getCosttemp() {
        return costtemp;
    }

    public void setCosttemp(BigDecimal costtemp) {
        this.costtemp = costtemp;
    }

    public BigDecimal getStocksobrantes() {
        return stocksobrantes;
    }

    public void setStocksobrantes(BigDecimal stocksobrantes) {
        this.stocksobrantes = stocksobrantes;
    }

    public BigDecimal getPventadistribuidor() {
        return pventadistribuidor;
    }

    public void setPventadistribuidor(BigDecimal pventadistribuidor) {
        this.pventadistribuidor = pventadistribuidor;
    }

    public BigDecimal getPventaexclusivo() {
        return pventaexclusivo;
    }

    public void setPventaexclusivo(BigDecimal pventaexclusivo) {
        this.pventaexclusivo = pventaexclusivo;
    }

    public String getDescripcionventa() {
        return descripcionventa;
    }

    public void setDescripcionventa(String descripcionventa) {
        this.descripcionventa = descripcionventa;
    }

    public BigDecimal getPventadistribuidord() {
        return pventadistribuidord;
    }

    public void setPventadistribuidord(BigDecimal pventadistribuidord) {
        this.pventadistribuidord = pventadistribuidord;
    }

    public BigDecimal getPventaexcusivod() {
        return pventaexcusivod;
    }

    public void setPventaexcusivod(BigDecimal pventaexcusivod) {
        this.pventaexcusivod = pventaexcusivod;
    }

    public BigDecimal getPventadd1() {
        return pventadd1;
    }

    public void setPventadd1(BigDecimal pventadd1) {
        this.pventadd1 = pventadd1;
    }

    public BigDecimal getPventadd2() {
        return pventadd2;
    }

    public void setPventadd2(BigDecimal pventadd2) {
        this.pventadd2 = pventadd2;
    }

    public BigDecimal getPventadd3() {
        return pventadd3;
    }

    public void setPventadd3(BigDecimal pventadd3) {
        this.pventadd3 = pventadd3;
    }

    public BigDecimal getPventadt1() {
        return pventadt1;
    }

    public void setPventadt1(BigDecimal pventadt1) {
        this.pventadt1 = pventadt1;
    }

    public BigDecimal getPventadt2() {
        return pventadt2;
    }

    public void setPventadt2(BigDecimal pventadt2) {
        this.pventadt2 = pventadt2;
    }

    public BigDecimal getPventadt3() {
        return pventadt3;
    }

    public void setPventadt3(BigDecimal pventadt3) {
        this.pventadt3 = pventadt3;
    }

    public BigDecimal getPventasd1() {
        return pventasd1;
    }

    public void setPventasd1(BigDecimal pventasd1) {
        this.pventasd1 = pventasd1;
    }

    public BigDecimal getPventasd2() {
        return pventasd2;
    }

    public void setPventasd2(BigDecimal pventasd2) {
        this.pventasd2 = pventasd2;
    }

    public BigDecimal getPventasd3() {
        return pventasd3;
    }

    public void setPventasd3(BigDecimal pventasd3) {
        this.pventasd3 = pventasd3;
    }

    public BigDecimal getPventast1() {
        return pventast1;
    }

    public void setPventast1(BigDecimal pventast1) {
        this.pventast1 = pventast1;
    }

    public BigDecimal getPventast2() {
        return pventast2;
    }

    public void setPventast2(BigDecimal pventast2) {
        this.pventast2 = pventast2;
    }

    public BigDecimal getPventast3() {
        return pventast3;
    }

    public void setPventast3(BigDecimal pventast3) {
        this.pventast3 = pventast3;
    }

    public String getCodexterno() {
        return codexterno;
    }

    public void setCodexterno(String codexterno) {
        this.codexterno = codexterno;
    }

    public String getDesartingles() {
        return desartingles;
    }

    public void setDesartingles(String desartingles) {
        this.desartingles = desartingles;
    }

    public Integer getInsumoensamblaje() {
        return insumoensamblaje;
    }

    public void setInsumoensamblaje(Integer insumoensamblaje) {
        this.insumoensamblaje = insumoensamblaje;
    }

    public BigDecimal getPventasd4() {
        return pventasd4;
    }

    public void setPventasd4(BigDecimal pventasd4) {
        this.pventasd4 = pventasd4;
    }

    public BigDecimal getPventadd4() {
        return pventadd4;
    }

    public void setPventadd4(BigDecimal pventadd4) {
        this.pventadd4 = pventadd4;
    }

    public BigDecimal getFobdolares() {
        return fobdolares;
    }

    public void setFobdolares(BigDecimal fobdolares) {
        this.fobdolares = fobdolares;
    }

    public BigDecimal getPdistribuidor() {
        return pdistribuidor;
    }

    public void setPdistribuidor(BigDecimal pdistribuidor) {
        this.pdistribuidor = pdistribuidor;
    }

    public BigDecimal getPmayor() {
        return pmayor;
    }

    public void setPmayor(BigDecimal pmayor) {
        this.pmayor = pmayor;
    }

    public BigDecimal getPpublico() {
        return ppublico;
    }

    public void setPpublico(BigDecimal ppublico) {
        this.ppublico = ppublico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoconsumible() {
        return tipoconsumible;
    }

    public void setTipoconsumible(String tipoconsumible) {
        this.tipoconsumible = tipoconsumible;
    }

    public BigDecimal getEnsbMtxVx() {
        return ensbMtxVx;
    }

    public void setEnsbMtxVx(BigDecimal ensbMtxVx) {
        this.ensbMtxVx = ensbMtxVx;
    }

    public BigDecimal getEnsbMtxTx() {
        return ensbMtxTx;
    }

    public void setEnsbMtxTx(BigDecimal ensbMtxTx) {
        this.ensbMtxTx = ensbMtxTx;
    }

    public BigDecimal getEnsMtcVx() {
        return ensMtcVx;
    }

    public void setEnsMtcVx(BigDecimal ensMtcVx) {
        this.ensMtcVx = ensMtcVx;
    }

    public BigDecimal getSoldMtxVx() {
        return soldMtxVx;
    }

    public void setSoldMtxVx(BigDecimal soldMtxVx) {
        this.soldMtxVx = soldMtxVx;
    }

    public BigDecimal getSoldMtxTx() {
        return soldMtxTx;
    }

    public void setSoldMtxTx(BigDecimal soldMtxTx) {
        this.soldMtxTx = soldMtxTx;
    }

    public BigDecimal getSoldMtcVx() {
        return soldMtcVx;
    }

    public void setSoldMtcVx(BigDecimal soldMtcVx) {
        this.soldMtcVx = soldMtcVx;
    }

    public BigDecimal getTapMtxVx() {
        return tapMtxVx;
    }

    public void setTapMtxVx(BigDecimal tapMtxVx) {
        this.tapMtxVx = tapMtxVx;
    }

    public BigDecimal getTapMtxTx() {
        return tapMtxTx;
    }

    public void setTapMtxTx(BigDecimal tapMtxTx) {
        this.tapMtxTx = tapMtxTx;
    }

    public BigDecimal getTapcMtcVx() {
        return tapcMtcVx;
    }

    public void setTapcMtcVx(BigDecimal tapcMtcVx) {
        this.tapcMtcVx = tapcMtcVx;
    }

    public BigDecimal getConsumMtx() {
        return consumMtx;
    }

    public void setConsumMtx(BigDecimal consumMtx) {
        this.consumMtx = consumMtx;
    }

    public BigDecimal getConsumMtf() {
        return consumMtf;
    }

    public void setConsumMtf(BigDecimal consumMtf) {
        this.consumMtf = consumMtf;
    }

    public BigDecimal getConsumMl() {
        return consumMl;
    }

    public void setConsumMl(BigDecimal consumMl) {
        this.consumMl = consumMl;
    }

    public BigDecimal getConsumSold() {
        return consumSold;
    }

    public void setConsumSold(BigDecimal consumSold) {
        this.consumSold = consumSold;
    }

    public BigDecimal getConsmTap() {
        return consmTap;
    }

    public void setConsmTap(BigDecimal consmTap) {
        this.consmTap = consmTap;
    }

    public BigDecimal getConsumDesp() {
        return consumDesp;
    }

    public void setConsumDesp(BigDecimal consumDesp) {
        this.consumDesp = consumDesp;
    }

    public String getComprapuc() {
        return comprapuc;
    }

    public void setComprapuc(String comprapuc) {
        this.comprapuc = comprapuc;
    }

    public BigDecimal getCosMtxZs() {
        return cosMtxZs;
    }

    public void setCosMtxZs(BigDecimal cosMtxZs) {
        this.cosMtxZs = cosMtxZs;
    }

    public BigDecimal getHabMtxZs() {
        return habMtxZs;
    }

    public void setHabMtxZs(BigDecimal habMtxZs) {
        this.habMtxZs = habMtxZs;
    }

    public BigDecimal getHabMtcZs() {
        return habMtcZs;
    }

    public void setHabMtcZs(BigDecimal habMtcZs) {
        this.habMtcZs = habMtcZs;
    }

    public BigDecimal getHabMtxVx() {
        return habMtxVx;
    }

    public void setHabMtxVx(BigDecimal habMtxVx) {
        this.habMtxVx = habMtxVx;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Tipoarticulo getTipoarticulo() {
        return tipoarticulo;
    }

    public void setTipoarticulo(Tipoarticulo tipoarticulo) {
        this.tipoarticulo = tipoarticulo;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }

    public Clasificacionot getClasificacionot() {
        return clasificacionot;
    }

    public void setClasificacionot(Clasificacionot clasificacionot) {
        this.clasificacionot = clasificacionot;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Subfamilia getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(Subfamilia subfamilia) {
        this.subfamilia = subfamilia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codart != null ? codart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codart == null && other.codart != null) || (this.codart != null && !this.codart.equals(other.codart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tricar.apiback.model.Articulo[ codart=" + codart + " ]";
    }
    
}
