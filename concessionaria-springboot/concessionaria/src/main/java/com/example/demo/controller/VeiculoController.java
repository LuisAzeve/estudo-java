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

    // Substitui consultarVeiculos()
    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }

    // Substitui consultarPorMarca()
    @GetMapping("/marca/{idMarca}")
    public List<Veiculo> porMarca(@PathVariable int idMarca) {
        return repository.findByMarcaId(idMarca);
    }

    // Substitui consultarPorModelo()
    @GetMapping("/modelo/{idModelo}")
    public List<Veiculo> porModelo(@PathVariable int idModelo) {
        return repository.findByModeloFK(idModelo);
    }

    // Substitui consultarPorPreco()
    @GetMapping("/preco/{precoMaximo}")
    public List<Veiculo> porPreco(@PathVariable double precoMaximo) {
        return repository.findByPrecoLessThanEqual(precoMaximo);
    }

    // Substitui consultarPorAno()
    @GetMapping("/ano/{ano}")
    public List<Veiculo> porAno(@PathVariable int ano) {
        return repository.findByAno(ano);
    }

    // Substitui consultarPorStatus()
    @GetMapping("/status/{status}")
    public List<Veiculo> porStatus(@PathVariable String status) {
        return repository.findByStatus(status);
    }

    // Substitui cadastrarVeiculo()
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    // Substitui atualizarVeiculo()
    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable int id, @RequestBody Veiculo dados) {
        Veiculo veiculo = repository.findById(id).orElseThrow();
        veiculo.setPreco(dados.getPreco());
        veiculo.setKm(dados.getKm());
        veiculo.setStatus(dados.getStatus());
        return repository.save(veiculo);
    }

    // Substitui deletarVeiculo()
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
