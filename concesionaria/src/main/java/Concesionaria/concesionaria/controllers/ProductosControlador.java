package Concesionaria.concesionaria.controllers;

import Concesionaria.concesionaria.DTO.ProductoDTO;
import Concesionaria.concesionaria.services.ProductosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductosControlador {
    @Autowired
   private ProductosServicio productosServicio;

    @GetMapping("/productos")
    public List<ProductoDTO> getProductos(){
        return productosServicio.getProductos();
    }


}
