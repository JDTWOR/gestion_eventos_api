package com.jdrr.crud_eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdrr.crud_eventos.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
