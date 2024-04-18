package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtInsumoRepository extends JpaRepository<ArticuloInsumo,Long> {
}
