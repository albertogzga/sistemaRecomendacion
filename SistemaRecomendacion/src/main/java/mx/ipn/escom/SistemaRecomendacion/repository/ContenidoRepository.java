package mx.ipn.escom.SistemaRecomendacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.ipn.escom.SistemaRecomendacion.model.Contenido;

public interface ContenidoRepository extends JpaRepository<Contenido, Long>{
    List<Contenido> findByTipo(String tipo);    
}
