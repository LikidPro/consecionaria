package Concesionaria.concesionaria.repositorios;

import Concesionaria.concesionaria.modelos.ColorDeProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ColorDeProductoRepositorio extends JpaRepository<ColorDeProducto, Long> {
}
