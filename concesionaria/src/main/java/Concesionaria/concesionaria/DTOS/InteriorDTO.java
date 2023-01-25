package Concesionaria.concesionaria.DTOS;

import Concesionaria.concesionaria.modelos.Interior;
import Concesionaria.concesionaria.modelos.TapizadoAsiento;

public class InteriorDTO {
    private long id;
    private TapizadoAsiento tapizadoAsiento;
    private boolean levantaVidrioElectricoDelantero;
    private boolean levantaVidrioElectricoTrasero;
    private boolean trabaParaNiños;
    private boolean luzInterior;
    private boolean radio;
    private boolean calefaccion;
    private boolean aireAcondicionado;

    public InteriorDTO(Interior interior) {
        this.id = interior.getId();
        this.tapizadoAsiento = interior.getTapizadoAsiento();
        this.levantaVidrioElectricoDelantero = interior.isLevantaVidrioElectricoDelantero();
        this.levantaVidrioElectricoTrasero = interior.isLevantaVidrioElectricoTrasero();
        this.trabaParaNiños = interior.isTrabaParaNiños();
        this.luzInterior = interior.isLuzInterior();
        this.radio = interior.isRadio();
        this.calefaccion = interior.isCalefaccion();
        this.aireAcondicionado = interior.isAireAcondicionado();
    }

    public long getId() {
        return id;
    }

    public TapizadoAsiento getTapizadoAsiento() {
        return tapizadoAsiento;
    }

    public boolean isLevantaVidrioElectricoDelantero() {
        return levantaVidrioElectricoDelantero;
    }

    public boolean isLevantaVidrioElectricoTrasero() {
        return levantaVidrioElectricoTrasero;
    }

    public boolean isTrabaParaNiños() {
        return trabaParaNiños;
    }

    public boolean isLuzInterior() {
        return luzInterior;
    }

    public boolean isRadio() {
        return radio;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
}
