package mx.ipn.escom.SistemaRecomendacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.ipn.escom.SistemaRecomendacion.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByNombre(String nombre);

}
