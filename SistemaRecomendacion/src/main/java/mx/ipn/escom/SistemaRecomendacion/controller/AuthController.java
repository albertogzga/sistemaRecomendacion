package mx.ipn.escom.SistemaRecomendacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.ipn.escom.SistemaRecomendacion.model.Usuario;
import mx.ipn.escom.SistemaRecomendacion.service.UsuarioService;

@Controller
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // Carga login.html
    }

    @GetMapping("/register")
    public String mostrarRegistro() {
        return "register"; // Carga register.html
    }

    @PostMapping("/register")
    public String registrarUsuario(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        Usuario usuario = new Usuario(nombre, email, password);
        usuarioService.registrarUsuario(usuario);

        model.addAttribute("mensaje", "Registro exitoso. Ahora puedes iniciar sesión.");
        return "registerSuccess";
    }
}
