package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class interior {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
    private tapizadoAsiento tapizadoAsiento;
    private boolean levantaVidrioElectricoDelantero;
    private boolean levantaVidrioElectricoTrasero;
    private boolean trabaParaNiños;
    private boolean luzInterior;
    private boolean radio;
    private boolean calefaccion;
    private boolean aireAcondicionado;

    public interior() {
    }

    public interior(Concesionaria.concesionaria.modelos.tapizadoAsiento tapizadoAsiento, boolean levantaVidrioElectricoDelantero, boolean levantaVidrioElectricoTrasero, boolean trabaParaNiños, boolean luzInterior, boolean radio, boolean calefaccion, boolean aireAcondicionado) {
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

    public Concesionaria.concesionaria.modelos.tapizadoAsiento getTapizadoAsiento() {
        return tapizadoAsiento;
    }

    public void setTapizadoAsiento(Concesionaria.concesionaria.modelos.tapizadoAsiento tapizadoAsiento) {
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
}
