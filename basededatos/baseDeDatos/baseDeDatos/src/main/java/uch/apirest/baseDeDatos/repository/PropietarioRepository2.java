package uch.apirest.baseDeDatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uch.apirest.baseDeDatos.entity.Propietario2;

@Repository
public interface PropietarioRepository2 extends JpaRepository<Propietario2, Long> {
}
