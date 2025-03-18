package mx.ipn.escom.SistemaRecomendacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.ipn.escom.SistemaRecomendacion.model.HistorialBusqueda;

public interface HistorialBusquedaRepository extends JpaRepository<HistorialBusqueda, Long> {
    List<HistorialBusqueda> findByUsuarioId(Long usuarioId);
}
