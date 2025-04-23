package com.example.app_movil_g2.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app_movil_g2.entities.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}