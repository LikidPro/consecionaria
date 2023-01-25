package Concesionaria.concesionaria.DTOS;

import Concesionaria.concesionaria.modelos.EstadoDeUsado;
import Concesionaria.concesionaria.modelos.ProductoUsado;

import java.util.ArrayList;
import java.util.List;

public class ProductoUsadoDTO {
    private long id;
    private String marca, modelo, descripcion, color;
    private long kilometros;
    private int año;
    private List<String> fotos = new ArrayList<>();
    private EstadoDeUsado estado;

    public ProductoUsadoDTO(ProductoUsado productoUsado) {
        this.id = productoUsado.getId();
        this.marca = productoUsado.getMarca();
        this.modelo = productoUsado.getModelo();
        this.descripcion = productoUsado.getDescripcion();
        this.color = productoUsado.getColor();
        this.kilometros = productoUsado.getKilometros();
        this.año = productoUsado.getAño();
        this.fotos = productoUsado.getFotos();
        this.estado = productoUsado.getEstado();
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getColor() {
        return color;
    }

    public long getKilometros() {
        return kilometros;
    }

    public int getAño() {
        return año;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public EstadoDeUsado getEstado() {
        return estado;
    }
}
