package mx.ipn.escom.SistemaRecomendacion.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.escom.SistemaRecomendacion.model.HistorialBusqueda;
import mx.ipn.escom.SistemaRecomendacion.repository.HistorialBusquedaRepository;

@Service
public class HistorialBusquedaService {

    @Autowired
    private HistorialBusquedaRepository historialBusquedaRepository;

    public List<HistorialBusqueda> obtenerHistorialPorUsuario(Long usuarioId) {
        return historialBusquedaRepository.findByUsuarioId(usuarioId);
    }

    public HistorialBusqueda registrarBusqueda(HistorialBusqueda historial) {
        historial.setFechaBusqueda(LocalDateTime.now());
        return historialBusquedaRepository.save(historial);
    }

    public List<HistorialBusqueda> obtenerHistorialGlobal() {
        return historialBusquedaRepository.findAll();
    }
}
