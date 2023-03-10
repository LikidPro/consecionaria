package Concesionaria.concesionaria.repositorios;

import Concesionaria.concesionaria.modelos.Exterior;
import Concesionaria.concesionaria.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExteriorRepositorio extends JpaRepository<Exterior, Long> {

}
