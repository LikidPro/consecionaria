package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class exterior {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
    private String neumaticos;
    private boolean ruedaAuxilio;
    private boolean poralizado;
    private boolean espejosColorDelAuto;
    private int altoDeCaja;
    private  int anchoDeCaja;

    public exterior(String neumaticos, boolean ruedaAuxilio, boolean poralizado, boolean espejosColorDelAuto, int altoDeCaja, int anchoDeCaja) {
        this.neumaticos = neumaticos;
        this.ruedaAuxilio = ruedaAuxilio;
        this.poralizado = poralizado;
        this.espejosColorDelAuto = espejosColorDelAuto;
        this.altoDeCaja = altoDeCaja;
        this.anchoDeCaja = anchoDeCaja;
    }

    public long getId() {
        return id;
    }

    public String getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(String neumaticos) {
        this.neumaticos = neumaticos;
    }

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public void setRuedaAuxilio(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }

    public boolean isPoralizado() {
        return poralizado;
    }

    public void setPoralizado(boolean poralizado) {
        this.poralizado = poralizado;
    }

    public boolean isEspejosColorDelAuto() {
        return espejosColorDelAuto;
    }

    public void setEspejosColorDelAuto(boolean espejosColorDelAuto) {
        this.espejosColorDelAuto = espejosColorDelAuto;
    }

    public int getAltoDeCaja() {
        return altoDeCaja;
    }

    public void setAltoDeCaja(int altoDeCaja) {
        this.altoDeCaja = altoDeCaja;
    }

    public int getAnchoDeCaja() {
        return anchoDeCaja;
    }

    public void setAnchoDeCaja(int anchoDeCaja) {
        this.anchoDeCaja = anchoDeCaja;
    }
}