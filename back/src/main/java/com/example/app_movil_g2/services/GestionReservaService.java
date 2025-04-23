package com.example.app_movil_g2.services;

import org.springframework.stereotype.Service;

import com.example.app_movil_g2.entities.ReservaMesa;
import com.example.app_movil_g2.repositories.ReservaRepo;

import java.util.List;
import java.util.Optional;

@Service
public class GestionReservaService {

    private final ReservaRepo reservaRepo;

    public GestionReservaService(ReservaRepo reservaRepo) {
        this.reservaRepo = reservaRepo;
    }

    public List<ReservaMesa> obtenerTodas() {
        return reservaRepo.findAll();
    }

    public Optional<ReservaMesa> obtenerPorId(Long id) {
        return reservaRepo.findById(id);
    }

    public ReservaMesa guardar(ReservaMesa reserva) {
        return reservaRepo.save(reserva);
    }

    public void eliminar(Long id) {
        reservaRepo.deleteById(id);
    }
}