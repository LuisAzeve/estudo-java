package br.com.fecaf.controller;

import br.com.fecaf.Model.Cliente;
import br.com.fecaf.Model.Conta;

import java.util.Scanner;

public class Login {
    public String user;
    public int password;

    Scanner scanner = new Scanner(System.in);

    //metodo

    public Conta realizarLogin(Conta referenciaConta, Cliente referenciaCliente){
        System.out.print("Informe seu CPF: ");
        long cpfUser = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Informe a senha: ");
        String passwordUser = scanner.nextLine();

        Conta contaCliente = validarLogin(cpfUser,passwordUser,referenciaConta,referenciaCliente);

        if (contaCliente != null){
            return contaCliente;
        } else{
            System.out.println("Dados incorretos ! Verifique novmaente o abra uma conta.");
        }
        return null;
    }

    public Conta validarLogin(long cpfUser, String passwordUser, Conta referenciaConta, Cliente referenciaCliente){

        Cliente dadosCliente = referenciaCliente.pesquisarCliente(cpfUser);

        if (dadosCliente != null){
            Conta contaCliente = referenciaConta.pesquisarConta(dadosCliente);
            String password = contaCliente.getPassword();

            if (password.equals(passwordUser)){
                return contaCliente;
            }
        }
        return null;
    }

}
