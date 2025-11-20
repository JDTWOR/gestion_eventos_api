package com.jdrr.crud_eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdrr.crud_eventos.entities.Attende;

public interface AttendeRepository extends JpaRepository<Attende, Long> {
}
