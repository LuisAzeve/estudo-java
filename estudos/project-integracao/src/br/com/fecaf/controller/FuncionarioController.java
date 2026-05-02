package br.com.fecaf.controller;

import br.com.fecaf.database.model.Conexao;
import br.com.fecaf.model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FuncionarioController {

    //Metodo
    public void consultarFuncionarios(){

        try{

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryConsulta = "SELECT * FROM funcionario";

            ResultSet resultSet = statement.executeQuery(queryConsulta);

            while (resultSet.next()){

                Funcionario funcionario = new Funcionario();

                funcionario.setIdFuncionario(resultSet.getInt("idFuncionario"));
                funcionario.setNome(resultSet.getNString("nome"));
                funcionario.setMatricula(resultSet.getInt("matricula"));
                funcionario.setDepartamento(resultSet.getInt("Departamento_FK"));

                funcionario.exibirInformacoes();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public boolean cadastrarFuncionario(Funcionario funcionario) {

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryCreate = "insert into funcionario(idFuncionario,nome,matricula,departamento_FK)values ('"
                    + funcionario.getIdFuncionario() + "','" + funcionario.getNome() + "','" + funcionario.getMatricula()
                    + "','" + funcionario.getDepartamento() + "')";

            statement.executeUpdate(queryCreate);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarFuncionario(int idFuncionario){

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryDelete = "delete from funcionario where idFuncionario = " + idFuncionario;

            statement.executeUpdate(queryDelete);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }



}
