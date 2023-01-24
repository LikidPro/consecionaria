package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class ProductoUsado {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
     private String marca, modelo, descripcion, color;
     private long kilometros;
     private int año;
    @ElementCollection
    @Column (name = "links_fotos", length = 2000)
     private List<String> fotos = new ArrayList<>();
     private EstadoDeUsado estado;

    public ProductoUsado() {
    }

    public ProductoUsado(String marca, String modelo, String descripcion, String color, long kilometros, int año, List<String> fotos, EstadoDeUsado estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.color = color;
        this.kilometros = kilometros;
        this.año = año;
        this.fotos = fotos;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getKilometros() {
        return kilometros;
    }

    public void setKilometros(long kilometros) {
        this.kilometros = kilometros;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }

    public EstadoDeUsado getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeUsado estado) {
        this.estado = estado;
    }
}
