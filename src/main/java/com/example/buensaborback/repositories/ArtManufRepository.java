package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.ArticuloManuf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtManufRepository extends JpaRepository<ArticuloManuf,Long> {
}
