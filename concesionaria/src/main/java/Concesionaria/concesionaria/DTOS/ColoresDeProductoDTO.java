package Concesionaria.concesionaria.DTOS;

import Concesionaria.concesionaria.modelos.ColorDeProducto;

import java.util.List;

public class ColoresDeProductoDTO {
    private String color;

    private List<String> fotos;

    public ColoresDeProductoDTO(ColorDeProducto colorDeProducto) {
        this.color = colorDeProducto.getColor();
        this.fotos = colorDeProducto.getFotos();
    }

    public String getColor() {
        return color;
    }

    public List<String> getFotos() {
        return fotos;
    }
}
