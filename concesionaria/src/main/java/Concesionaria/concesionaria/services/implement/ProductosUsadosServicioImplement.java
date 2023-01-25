package Concesionaria.concesionaria.services.implement;

import Concesionaria.concesionaria.DTO.ProductoDTO;
import Concesionaria.concesionaria.DTO.ProductoUsadoDTO;
import Concesionaria.concesionaria.repositorios.ProductosRepositorio;
import Concesionaria.concesionaria.repositorios.ProductosUsadosRepositorio;
import Concesionaria.concesionaria.services.ProductosUsadosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductosUsadosServicioImplement implements ProductosUsadosServicio {
    @Autowired
    private ProductosUsadosRepositorio productosUsadosRepositorio;

    @Override
    public List<ProductoUsadoDTO> getProductos() {
        return productosUsadosRepositorio.findAll().stream().map(producto -> new ProductoUsadoDTO(producto)).collect(Collectors.toList());
    }
}
