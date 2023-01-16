package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class técnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;

    private int pasajeros;
    private int tanqueCombustible;
    private int puertas;
    private int cilindros;
    private String motor;
    private int peso;
    private tracción tracción;
    private int velocidades;
    private int valvulas;

    public técnico() {
    }

    public técnico(int pasajeros, int tanqueCombustible, int puertas, int cilindros, String motor, int peso, Concesionaria.concesionaria.modelos.tracción tracción, int velocidades, int valvulas) {
        this.pasajeros = pasajeros;
        this.tanqueCombustible = tanqueCombustible;
        this.puertas = puertas;
        this.cilindros = cilindros;
        this.motor = motor;
        this.peso = peso;
        this.tracción = tracción;
        this.velocidades = velocidades;
        this.valvulas = valvulas;
    }

    public long getId() {
        return id;
    }


    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getTanqueCombustible() {
        return tanqueCombustible;
    }

    public void setTanqueCombustible(int tanqueCombustible) {
        this.tanqueCombustible = tanqueCombustible;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Concesionaria.concesionaria.modelos.tracción getTracción() {
        return tracción;
    }

    public void setTracción(Concesionaria.concesionaria.modelos.tracción tracción) {
        this.tracción = tracción;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }
}
