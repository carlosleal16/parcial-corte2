package com.example.app_movil_g2.controllers;


import org.springframework.web.bind.annotation.*;

import com.example.app_movil_g2.entities.Comedor;
import com.example.app_movil_g2.repositories.ComedorRepo;

import java.util.List;

@RestController
@RequestMapping("/api/comedores")
public class MesaRestController {

    private final ComedorRepo comedorRepo;

    public MesaRestController(ComedorRepo comedorRepo) {
        this.comedorRepo = comedorRepo;
    }

    @GetMapping
    public List<Comedor> listar() {
        return comedorRepo.findAll();
    }

    @PostMapping
    public Comedor crear(@RequestBody Comedor comedor) {
        return comedorRepo.save(comedor);
    }
}