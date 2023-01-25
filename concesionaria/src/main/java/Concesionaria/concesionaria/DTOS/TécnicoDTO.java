package Concesionaria.concesionaria.DTOS;

import Concesionaria.concesionaria.modelos.Tracción;
import Concesionaria.concesionaria.modelos.Técnico;

public class TécnicoDTO {
    private long id;

    private int pasajeros;
    private int tanqueCombustible;
    private int puertas;
    private int cilindros;
    private String motor;
    private int peso;
    private Tracción tracción;
    private int velocidades;
    private int valvulas;

    public TécnicoDTO(Técnico técnico) {
        this.id = técnico.getId();
        this.pasajeros = técnico.getPasajeros();
        this.tanqueCombustible = técnico.getTanqueCombustible();
        this.puertas = técnico.getPuertas();
        this.cilindros = técnico.getCilindros();
        this.motor = técnico.getMotor();
        this.peso = técnico.getPeso();
        this.tracción = técnico.getTracción();
        this.velocidades = técnico.getVelocidades();
        this.valvulas = técnico.getValvulas();
    }

    public long getId() {
        return id;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getTanqueCombustible() {
        return tanqueCombustible;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public String getMotor() {
        return motor;
    }

    public int getPeso() {
        return peso;
    }

    public Tracción getTracción() {
        return tracción;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public int getValvulas() {
        return valvulas;
    }
}
