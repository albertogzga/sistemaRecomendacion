package mx.ipn.escom.SistemaRecomendacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.ipn.escom.SistemaRecomendacion.model.HistorialBusqueda;
import mx.ipn.escom.SistemaRecomendacion.service.HistorialBusquedaService;

@RestController
@RequestMapping("/api/historial")
public class HistorialBusquedaController {
    
    @Autowired
    private HistorialBusquedaService historialBusquedaService;

    @GetMapping("/usuario/{usuarioId}")
    public List<HistorialBusqueda> obtenerHistorialPorUsuario(@PathVariable Long usuarioId) {
        return historialBusquedaService.obtenerHistorialPorUsuario(usuarioId);
    }

    @PostMapping
    public HistorialBusqueda registrarBusqueda(@RequestBody HistorialBusqueda historial) {
        return historialBusquedaService.registrarBusqueda(historial);
    }

    @GetMapping("/global")
    public List<HistorialBusqueda> obtenerHistorialGlobal() {
        return historialBusquedaService.obtenerHistorialGlobal();
    }

}
