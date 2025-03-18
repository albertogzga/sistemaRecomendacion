package mx.ipn.escom.SistemaRecomendacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.escom.SistemaRecomendacion.repository.ContenidoRepository;

import java.util.List;
import java.util.Optional;

import mx.ipn.escom.SistemaRecomendacion.model.Contenido;
@Service
public class ContenidoService {
    @Autowired
    private ContenidoRepository contenidoRepository;

    public List<Contenido> obtenerTodos(){
        return contenidoRepository.findAll();
    }
    
    public Optional<Contenido> obtenerPorId(Long id) {
        return contenidoRepository.findById(id);
    }

    public List<Contenido> obtenerPorTipo(String tipo) {
        return contenidoRepository.findByTipo(tipo);
    }

    public Contenido guardarContenido(Contenido contenido) {
        return contenidoRepository.save(contenido);
    }

    public void eliminarContenido(Long id) {
        contenidoRepository.deleteById(id);
    }

}
