package Concesionaria.concesionaria.repositorios;

import Concesionaria.concesionaria.modelos.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductosRepositorio extends JpaRepository<Productos,Long> {
}
