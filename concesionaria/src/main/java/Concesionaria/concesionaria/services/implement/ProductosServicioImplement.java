package Concesionaria.concesionaria.services.implement;

import Concesionaria.concesionaria.DTO.ProductoDTO;
import Concesionaria.concesionaria.repositorios.ProductosRepositorio;
import Concesionaria.concesionaria.services.ProductosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductosServicioImplement implements ProductosServicio {
    @Autowired
    private ProductosRepositorio productosRepositorio;

    @Override
    public List<ProductoDTO> getProductos() {
        return productosRepositorio.findAll().stream().map(producto -> new ProductoDTO(producto)).collect(Collectors.toList());
    }
}
