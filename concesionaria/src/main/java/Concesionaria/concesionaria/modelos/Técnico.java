package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

public class Técnico {
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
    private Tracción tracción;
    private int velocidades;
    private int valvulas;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public Técnico() {
    }

    public Técnico(int pasajeros, int tanqueCombustible, int puertas, int cilindros, String motor, int peso, Tracción tracción, int velocidades, int valvulas) {
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

    public Tracción getTracción() {
        return tracción;
    }

    public void setTracción(Tracción tracción) {
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
