package mx.ipn.escom.SistemaRecomendacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.ipn.escom.SistemaRecomendacion.model.Usuario;
import mx.ipn.escom.SistemaRecomendacion.service.UsuarioService;

@Controller
public class AdminController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/admin/dashboard")
    public String mostrarPanelAdmin(Model model) {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "admin/dashboard"; // Carga dashboard.html
    }

    @GetMapping("/admin/delete")
    public String eliminarUsuario(@RequestParam("id") Long id) {
        usuarioService.eliminarUsuario(id);
        return "redirect:/admin/dashboard";
    }
}
