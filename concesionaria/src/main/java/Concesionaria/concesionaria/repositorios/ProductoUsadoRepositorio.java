package Concesionaria.concesionaria.repositorios;

import Concesionaria.concesionaria.modelos.ProductoUsado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductoUsadoRepositorio extends JpaRepository<ProductoUsado, Long> {
}
