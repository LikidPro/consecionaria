package Concesionaria.concesionaria.DTO;

import Concesionaria.concesionaria.modelos.Exterior;
import Concesionaria.concesionaria.modelos.Producto;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ExteriorDTO {
    private long id;
    private String neumaticos;
    private boolean ruedaAuxilio;
    private boolean poralizado;
    private boolean espejosColorDelAuto;
    private int altoDeCaja;
    private  int anchoDeCaja;


    public ExteriorDTO(Exterior exterior) {
        this.id = exterior.getId();
        this.neumaticos = exterior.getNeumaticos();
        this.ruedaAuxilio = exterior.isRuedaAuxilio();
        this.poralizado = exterior.isPoralizado();
        this.espejosColorDelAuto = exterior.isEspejosColorDelAuto();
        this.altoDeCaja = exterior.getAltoDeCaja();
        this.anchoDeCaja = exterior.getAnchoDeCaja();

    }

    public long getId() {
        return id;
    }

    public String getNeumaticos() {
        return neumaticos;
    }

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public boolean isPoralizado() {
        return poralizado;
    }

    public boolean isEspejosColorDelAuto() {
        return espejosColorDelAuto;
    }

    public int getAltoDeCaja() {
        return altoDeCaja;
    }

    public int getAnchoDeCaja() {
        return anchoDeCaja;
    }
}
