package mx.ipn.escom.SistemaRecomendacion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.escom.SistemaRecomendacion.model.Rol;
import mx.ipn.escom.SistemaRecomendacion.repository.RolRepository;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Optional<Rol> obtenerRolPorNombre(String nombre) {
        return rolRepository.findByNombre(nombre);
    }

}
