package Concesionaria.concesionaria.services.implement;

import Concesionaria.concesionaria.repositorios.InteriorRepositorio;
import Concesionaria.concesionaria.services.InteriorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class interiorServicioImplement implements InteriorServicio {
    @Autowired
    private InteriorRepositorio interiorRepositorio;
}
