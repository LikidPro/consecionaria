package Concesionaria.concesionaria.repositorios;

import Concesionaria.concesionaria.modelos.Técnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TécnicoRepositorio extends JpaRepository<Técnico, Long> {
}
