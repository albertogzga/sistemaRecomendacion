package mx.ipn.escom.SistemaRecomendacion.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {
    @GetMapping("/admin")
    public String adminPage(Authentication authentication){
        System.out.println("Usuario autenticado: " + authentication.getName());
        System.out.println("Roles del usuario: " + authentication.getAuthorities());

        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))){
            System.out.println("Accesso permitido: Usuario administrador");
            return "admin";
        }else{
            System.out.println("Accesso denegado: Usuario no es administrador");
            return "accessDenied";
        }
    }
}
