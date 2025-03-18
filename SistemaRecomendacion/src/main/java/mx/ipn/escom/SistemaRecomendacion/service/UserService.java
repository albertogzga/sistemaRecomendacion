package mx.ipn.escom.SistemaRecomendacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mx.ipn.escom.SistemaRecomendacion.model.User;
import mx.ipn.escom.SistemaRecomendacion.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;  // Inyecta el codificador

    public void registrarUsuario(User user) {
        // Codifica la contraseña antes de guardar
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // Guarda el usuario en la base de datos
        userRepository.save(user);
    }
}