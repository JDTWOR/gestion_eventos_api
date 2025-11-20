package com.jdrr.crud_eventos.entities;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attende {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank
  private String name;
  @Email
  private String email;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "estudiante_curso", joinColumns = @JoinColumn(name = "attende_id"), inverseJoinColumns = @JoinColumn(name = "events_id"))
  private List<Event> events = new ArrayList<>();

}
