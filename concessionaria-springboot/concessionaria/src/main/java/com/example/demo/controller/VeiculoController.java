package com.example.demo.controller;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    
    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }

    
    @GetMapping("/marca/{idMarca}")
    public List<Veiculo> porMarca(@PathVariable int idMarca) {
        return repository.findByMarcaId(idMarca);
    }

    
    @GetMapping("/modelo/{idModelo}")
    public List<Veiculo> porModelo(@PathVariable int idModelo) {
        return repository.findByModeloFK(idModelo);
    }

    
    @GetMapping("/preco/{precoMaximo}")
    public List<Veiculo> porPreco(@PathVariable double precoMaximo) {
        return repository.findByPrecoLessThanEqual(precoMaximo);
    }

    
    @GetMapping("/ano/{ano}")
    public List<Veiculo> porAno(@PathVariable int ano) {
        return repository.findByAno(ano);
    }

    
    @GetMapping("/status/{status}")
    public List<Veiculo> porStatus(@PathVariable String status) {
        return repository.findByStatus(status);
    }

    
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    
    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable int id, @RequestBody Veiculo dados) {
        Veiculo veiculo = repository.findById(id).orElseThrow();
        veiculo.setPreco(dados.getPreco());
        veiculo.setKm(dados.getKm());
        veiculo.setStatus(dados.getStatus());
        return repository.save(veiculo);
    }

    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
