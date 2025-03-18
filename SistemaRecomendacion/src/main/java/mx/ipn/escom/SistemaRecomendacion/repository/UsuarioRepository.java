package mx.ipn.escom.SistemaRecomendacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.ipn.escom.SistemaRecomendacion.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
