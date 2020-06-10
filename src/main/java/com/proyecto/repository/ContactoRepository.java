package com.proyecto.repository;

import com.proyecto.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
