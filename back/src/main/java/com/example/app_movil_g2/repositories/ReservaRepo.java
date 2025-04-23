package com.example.app_movil_g2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app_movil_g2.entities.ReservaMesa;

public interface ReservaRepo extends JpaRepository<ReservaMesa, Long> {
}