package com.projeto.controller;


import com.projeto.database.Conexao;
import com.projeto.model.Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloController {

    //metodo

    //consulta
    public ArrayList<Modelo> consultarModelos (){
        ArrayList<Modelo> listaModelos = new ArrayList<>();

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM modelo";

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                 Modelo modelo = new Modelo();

                modelo.setIdModelo(resultSet.getInt("idModelo"));
                modelo.setNome(resultSet.getString("nome"));
                modelo.setMarca_FK(resultSet.getInt("marca_FK"));

                listaModelos.add(modelo);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaModelos;
    }

    //cadastro
    public boolean cadastrarModelo(Modelo modelo){
        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryCreate = "INSERT INTO modelo(nome, marca_FK) VALUES ('"
                    + modelo.getNome() + "', "
                    + modelo.getMarca_FK() + ")";

            statement.executeUpdate(queryCreate);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //deletar
    public boolean deletarModelo(int idModelo){

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryDelete = "DELETE FROM modelo WHERE idModelo = " + idModelo;

            statement.executeUpdate(queryDelete);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }



    }

}
