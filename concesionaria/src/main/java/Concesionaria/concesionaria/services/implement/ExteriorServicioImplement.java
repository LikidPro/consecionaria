package Concesionaria.concesionaria.services.implement;

import Concesionaria.concesionaria.repositorios.ExteriorRepositorio;
import Concesionaria.concesionaria.services.ExteriorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExteriorServicioImplement implements ExteriorServicio {
    @Autowired
    private ExteriorRepositorio exteriorRepositorio;

}
