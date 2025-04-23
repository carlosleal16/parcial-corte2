package com.example.app_movil_g2.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.app_movil_g2.entities.Usuario;
import com.example.app_movil_g2.repositories.UsuarioRepo;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class ClienteRestController {

    private final UsuarioRepo usuarioRepo;

    public ClienteRestController(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioRepo.findAll();
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
}
