package mx.ipn.escom.SistemaRecomendacion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.ipn.escom.SistemaRecomendacion.model.Contenido;
import mx.ipn.escom.SistemaRecomendacion.service.ContenidoService;

@RestController
@RequestMapping("/api/contenidos")
public class ContenidoController {

    @Autowired
    private ContenidoService contenidoService;

    @GetMapping
    public List<Contenido> obtenerContenidos(){
        return contenidoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Contenido> obtenerContenidoPorId(@PathVariable Long id){
        return contenidoService.obtenerPorId(id);
    }

    @GetMapping("/tipo/{tipo}")
    public List<Contenido> obtenerContenidoPorTipo(@PathVariable String tipo){
        return contenidoService.obtenerPorTipo(tipo);
    }

    @PostMapping
    public Contenido crearContenido(@RequestBody Contenido contenido){
        return contenidoService.guardarContenido(contenido);
    }

    @DeleteMapping("/{id}")
    public void eliminarContenido(@PathVariable Long id){
        contenidoService.eliminarContenido(id);
    }

}
