package com.example.demo.controller;

import com.example.demo.model.Modelo;
import com.example.demo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private ModeloRepository repository;

    
    @GetMapping
    public List<Modelo> listar() {
        return repository.findAll();
    }

    
    @PostMapping
    public Modelo cadastrar(@RequestBody Modelo modelo) {
        return repository.save(modelo);
    }

    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
