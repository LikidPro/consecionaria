package Concesionaria.concesionaria.services.implement;

import Concesionaria.concesionaria.repositorios.T√©cnicoRepositorio;
import Concesionaria.concesionaria.services.TecnicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoServicioImplement implements TecnicoServicio{
    @Autowired
    private T√©cnicoRepositorio t√©cnicoRepositorio;
}
