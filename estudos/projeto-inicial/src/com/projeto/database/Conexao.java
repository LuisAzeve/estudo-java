package com.projeto.database;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    //atributos
    private String servidor,banco,user,password;
    public Connection conexao;

    //Metodo
    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_automotivo";
        this.user = "root"; //padrão
        this.password = "senha_aqui"; //troque a senha pela sua senha do banco
    }

    public boolean connectDrive(){

        try {

            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.password);
            return true;


        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public Connection getConnection(){
        boolean validaConexao = connectDrive();

        if (validaConexao){
            return this.conexao;
        }

        return null;
    }


}