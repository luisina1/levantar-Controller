package uch.apirest.baseDeDatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uch.apirest.baseDeDatos.entity.Patente;

public interface PatenteInterface extends JpaRepository<Patente, Long> {
}
