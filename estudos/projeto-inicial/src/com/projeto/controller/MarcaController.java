package com.projeto.controller;

import com.projeto.database.Conexao;
import com.projeto.model.Marca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class MarcaController {

    //metodos
    //consulta
    public ArrayList<Marca> consultarMarcas (){
        ArrayList<Marca> listaMarcas = new ArrayList<>();

        try{

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM marca";

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()) {
                Marca marca = new Marca();

                marca.setIdMarca(resultSet.getInt("idMarca"));
                marca.setNome(resultSet.getString("nome"));

                listaMarcas.add(marca);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaMarcas;
    }

    //cadastro
    public boolean cadastrarMarca(Marca marca){

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryCreate = "INSERT INTO marca(nome) VALUES ('"
                    + marca.getNome() + "')";

            statement.executeUpdate(queryCreate);

            return true;


        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //deletar
    public boolean deletarMarca(int idMarca){

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryDelete = "DELETE FROM marca WHERE idMarca = " + idMarca;

            statement.executeUpdate(queryDelete);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }


    }
}
