package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

public class Interior {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
    private TapizadoAsiento tapizadoAsiento;
    private boolean levantaVidrioElectricoDelantero;
    private boolean levantaVidrioElectricoTrasero;
    private boolean trabaParaNiños;
    private boolean luzInterior;
    private boolean radio;
    private boolean calefaccion;
    private boolean aireAcondicionado;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public Interior() {
    }

    public Interior(TapizadoAsiento tapizadoAsiento, boolean levantaVidrioElectricoDelantero, boolean levantaVidrioElectricoTrasero, boolean trabaParaNiños, boolean luzInterior, boolean radio, boolean calefaccion, boolean aireAcondicionado) {
        this.tapizadoAsiento = tapizadoAsiento;
        this.levantaVidrioElectricoDelantero = levantaVidrioElectricoDelantero;
        this.levantaVidrioElectricoTrasero = levantaVidrioElectricoTrasero;
        this.trabaParaNiños = trabaParaNiños;
        this.luzInterior = luzInterior;
        this.radio = radio;
        this.calefaccion = calefaccion;
        this.aireAcondicionado = aireAcondicionado;
    }

    public long getId() {
        return id;
    }

    public TapizadoAsiento getTapizadoAsiento() {
        return tapizadoAsiento;
    }

    public void setTapizadoAsiento(TapizadoAsiento tapizadoAsiento) {
        this.tapizadoAsiento = tapizadoAsiento;
    }

    public boolean isLevantaVidrioElectricoDelantero() {
        return levantaVidrioElectricoDelantero;
    }

    public void setLevantaVidrioElectricoDelantero(boolean levantaVidrioElectricoDelantero) {
        this.levantaVidrioElectricoDelantero = levantaVidrioElectricoDelantero;
    }

    public boolean isLevantaVidrioElectricoTrasero() {
        return levantaVidrioElectricoTrasero;
    }

    public void setLevantaVidrioElectricoTrasero(boolean levantaVidrioElectricoTrasero) {
        this.levantaVidrioElectricoTrasero = levantaVidrioElectricoTrasero;
    }

    public boolean isTrabaParaNiños() {
        return trabaParaNiños;
    }

    public void setTrabaParaNiños(boolean trabaParaNiños) {
        this.trabaParaNiños = trabaParaNiños;
    }

    public boolean isLuzInterior() {
        return luzInterior;
    }

    public void setLuzInterior(boolean luzInterior) {
        this.luzInterior = luzInterior;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
