package Concesionaria.concesionaria.repositorios;

import Concesionaria.concesionaria.modelos.Interior;
import Concesionaria.concesionaria.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InteriorRepositorio extends JpaRepository<Interior, Long> {

}
