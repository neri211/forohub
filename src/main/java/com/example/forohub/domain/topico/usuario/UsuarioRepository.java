package com.example.forohub.domain.topico.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método mágico de Spring Data para buscar al usuario por su nombre (login)
    UserDetails findByLogin(String login);
}