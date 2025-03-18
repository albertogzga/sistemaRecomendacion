package mx.ipn.escom.SistemaRecomendacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import mx.ipn.escom.SistemaRecomendacion.model.User;
import mx.ipn.escom.SistemaRecomendacion.service.UserService;

@Controller

public class RegisterController {

    @Autowired
    //Inyecta el servicio de usuario para registrar usuarios en la base de datos
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("usuario") User user, Model model){
        userService.registrarUsuario(user);
        model.addAttribute("usuario", model);
        return "registerSuccess";
    }

}
