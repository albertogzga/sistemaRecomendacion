package mx.ipn.escom.SistemaRecomendacion.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.ipn.escom.SistemaRecomendacion.model.Usuario;
import mx.ipn.escom.SistemaRecomendacion.service.UsuarioService;

@Controller
public class UserController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/user/profile")
    public String mostrarPerfilUsuario(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName(); // Obtiene el email del usuario autenticado

        Optional<Usuario> usuario = usuarioService.obtenerUsuarioPorId(1L); // Buscar usuario en la BD
        usuario.ifPresent(value -> model.addAttribute("usuario", value));

        return "profile"; // Carga profile.html
    }

}
