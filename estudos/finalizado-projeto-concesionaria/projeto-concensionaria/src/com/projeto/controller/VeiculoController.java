package com.projeto.controller;

import com.projeto.database.Conexao;
import com.projeto.model.Veiculo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VeiculoController {

    //metodo

    //busca geral
    public ArrayList<Veiculo> consultarVeiculos() {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM veiculo";

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(resultSet.getInt("idVeiculo"));
                veiculo.setModelo_FK(resultSet.getInt("modelo_FK"));
                veiculo.setAno(resultSet.getInt("ano"));
                veiculo.setCor(resultSet.getString("cor"));
                veiculo.setPreco(resultSet.getDouble("preco"));
                veiculo.setKm(resultSet.getInt("quilometragem"));
                veiculo.setStatus(resultSet.getString("status"));

                listaVeiculos.add(veiculo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaVeiculos;
    }

    // busca por marca
    public ArrayList<Veiculo> consultarPorMarca(int idMarca) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT veiculo.* FROM veiculo "
                    + "INNER JOIN modelo ON veiculo.modelo_FK = modelo.idModelo "
                    + "WHERE modelo.marca_FK = " + idMarca;

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(resultSet.getInt("idVeiculo"));
                veiculo.setModelo_FK(resultSet.getInt("modelo_FK"));
                veiculo.setAno(resultSet.getInt("ano"));
                veiculo.setCor(resultSet.getString("cor"));
                veiculo.setPreco(resultSet.getDouble("preco"));
                veiculo.setKm(resultSet.getInt("quilometragem"));
                veiculo.setStatus(resultSet.getString("status"));

                listaVeiculos.add(veiculo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listaVeiculos;
    }

    // busca por modelo
    public ArrayList<Veiculo> consultarPorModelo(int idModelo) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM veiculo WHERE modelo_FK = " + idModelo;

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(resultSet.getInt("idVeiculo"));
                veiculo.setModelo_FK(resultSet.getInt("modelo_FK"));
                veiculo.setAno(resultSet.getInt("ano"));
                veiculo.setCor(resultSet.getString("cor"));
                veiculo.setPreco(resultSet.getDouble("preco"));
                veiculo.setKm(resultSet.getInt("quilometragem"));
                veiculo.setStatus(resultSet.getString("status"));

                listaVeiculos.add(veiculo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listaVeiculos;
    }

    // busca por preço máximo
    public ArrayList<Veiculo> consultarPorPreco(double precoMaximo) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM veiculo WHERE preco <= " + precoMaximo;

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(resultSet.getInt("idVeiculo"));
                veiculo.setModelo_FK(resultSet.getInt("modelo_FK"));
                veiculo.setAno(resultSet.getInt("ano"));
                veiculo.setCor(resultSet.getString("cor"));
                veiculo.setPreco(resultSet.getDouble("preco"));
                veiculo.setKm(resultSet.getInt("quilometragem"));
                veiculo.setStatus(resultSet.getString("status"));

                listaVeiculos.add(veiculo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listaVeiculos;
    }

    // busca por ano
    public ArrayList<Veiculo> consultarPorAno(int ano) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM veiculo WHERE ano = " + ano;

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(resultSet.getInt("idVeiculo"));
                veiculo.setModelo_FK(resultSet.getInt("modelo_FK"));
                veiculo.setAno(resultSet.getInt("ano"));
                veiculo.setCor(resultSet.getString("cor"));
                veiculo.setPreco(resultSet.getDouble("preco"));
                veiculo.setKm(resultSet.getInt("quilometragem"));
                veiculo.setStatus(resultSet.getString("status"));

                listaVeiculos.add(veiculo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listaVeiculos;
    }

    //busca por status
    public ArrayList<Veiculo> consultarPorStatus(String status) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM veiculo WHERE status = '" + status + "'";

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();

                veiculo.setIdVeiculo(resultSet.getInt("idVeiculo"));
                veiculo.setModelo_FK(resultSet.getInt("modelo_FK"));
                veiculo.setAno(resultSet.getInt("ano"));
                veiculo.setCor(resultSet.getString("cor"));
                veiculo.setPreco(resultSet.getDouble("preco"));
                veiculo.setKm(resultSet.getInt("quilometragem"));
                veiculo.setStatus(resultSet.getString("status"));

                listaVeiculos.add(veiculo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaVeiculos;
    }

    //cadastro
    public boolean cadastrarVeiculo(Veiculo veiculo){

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryCreate = "INSERT INTO veiculo(modelo_FK, ano, cor, quilometragem, preco, status) VALUES ("
                    + veiculo.getModelo_FK() + ", "
                    + veiculo.getAno() + ", '"
                    + veiculo.getCor() + "', "
                    + veiculo.getKm() + ", "
                    + veiculo.getPreco() + ", '"
                    + veiculo.getStatus() + "')";

            statement.executeUpdate(queryCreate);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //excluir
    public boolean deletarVeiculo (int idVeiculo){

        try {
            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryDelete = "DELETE FROM veiculo WHERE idVeiculo = " + idVeiculo;

            statement.executeUpdate(queryDelete);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //atualizar (preço, quilometragem ou status de disponibilidade)
    public boolean atualizarVeiculo(int idVeiculo, double novoPreco, int novoKm, String novoStatus) {

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryUpdate = "UPDATE veiculo SET "
                    + "preco = " + novoPreco + ", "
                    + "quilometragem = " + novoKm + ", "
                    + "status = '" + novoStatus + "' "
                    + "WHERE idVeiculo = " + idVeiculo;

            statement.executeUpdate(queryUpdate);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}