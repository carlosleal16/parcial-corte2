package com.example.app_movil_g2.controllers;


import org.springframework.web.bind.annotation.*;

import com.example.app_movil_g2.entities.ReservaMesa;
import com.example.app_movil_g2.services.GestionReservaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservas")
public class BookingRestController {

    private final GestionReservaService gestionReservaService;

    public BookingRestController(GestionReservaService gestionReservaService) {
        this.gestionReservaService = gestionReservaService;
    }

    @GetMapping
    public List<ReservaMesa> obtenerReservas() {
        return gestionReservaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<ReservaMesa> obtenerPorId(@PathVariable Long id) {
        return gestionReservaService.obtenerPorId(id);
    }

    @PostMapping
    public ReservaMesa crear(@RequestBody ReservaMesa reserva) {
        return gestionReservaService.guardar(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        gestionReservaService.eliminar(id);
    }
}