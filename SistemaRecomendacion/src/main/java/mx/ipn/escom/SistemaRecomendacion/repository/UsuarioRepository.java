package mx.ipn.escom.SistemaRecomendacion.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ipn.escom.SistemaRecomendacion.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNombre(String nombre);
    Usuario findByEmail(String email);
}