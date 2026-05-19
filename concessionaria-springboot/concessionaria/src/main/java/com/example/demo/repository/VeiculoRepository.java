package com.example.demo.repository;

import com.example.demo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    // Substitui consultarPorModelo
    List<Veiculo> findByModeloFK(int modeloFK);

    // Substitui consultarPorStatus
    List<Veiculo> findByStatus(String status);

    // Substitui consultarPorPreco
    List<Veiculo> findByPrecoLessThanEqual(double preco);

    // Substitui consultarPorAno
    List<Veiculo> findByAno(int ano);

    // Substitui consultarPorMarca (JOIN com modelo)
    @Query("SELECT v FROM Veiculo v JOIN Modelo m ON v.modeloFK = m.idModelo WHERE m.marcaFK = :idMarca")
    List<Veiculo> findByMarcaId(@Param("idMarca") int idMarca);
}
