package Concesionaria.concesionaria.controllers;

import Concesionaria.concesionaria.DTO.ProductoDTO;
import Concesionaria.concesionaria.DTO.ProductoUsadoDTO;
import Concesionaria.concesionaria.services.ProductosServicio;
import Concesionaria.concesionaria.services.ProductosUsadosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoUsadosControlador {
    @Autowired
    private ProductosUsadosServicio productosUsadosServicio;

    @GetMapping("/productosusados")
    public List<ProductoUsadoDTO> getProductos(){
        return productosUsadosServicio.getProductos();
    }
}
