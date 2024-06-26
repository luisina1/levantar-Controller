package uch.apirest.baseDeDatos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uch.apirest.baseDeDatos.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {
}
