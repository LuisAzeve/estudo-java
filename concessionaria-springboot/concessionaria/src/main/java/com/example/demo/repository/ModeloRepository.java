package com.example.demo.repository;

import com.example.demo.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {

    List<Modelo> findByMarcaFK(int marcaFK);
}
