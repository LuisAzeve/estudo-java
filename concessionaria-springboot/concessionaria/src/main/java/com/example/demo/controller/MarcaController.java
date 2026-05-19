package com.example.demo.controller;

import com.example.demo.model.Marca;
import com.example.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository repository;

    // Substitui consultarMarcas()
    @GetMapping
    public List<Marca> listar() {
        return repository.findAll();
    }

    // Substitui cadastrarMarca()
    @PostMapping
    public Marca cadastrar(@RequestBody Marca marca) {
        return repository.save(marca);
    }

    // Substitui deletarMarca()
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
