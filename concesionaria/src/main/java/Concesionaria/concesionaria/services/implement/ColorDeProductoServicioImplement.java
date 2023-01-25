package Concesionaria.concesionaria.services.implement;

import Concesionaria.concesionaria.repositorios.ColorDeProductoRepositorio;
import Concesionaria.concesionaria.services.ColorDeProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorDeProductoServicioImplement implements ColorDeProductoServicio {
    @Autowired
    private ColorDeProductoRepositorio colorDeProductoRepositorio;
}
