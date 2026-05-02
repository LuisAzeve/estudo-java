package br.com.fecaf.controller;

import br.com.fecaf.Model.Cliente;
import br.com.fecaf.Model.Conta;

import java.text.BreakIterator;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Cliente referenciaCliente = new Cliente();
    Conta referenciaConta = new Conta();
    Login login = new Login();


    //metodo

    public void executarMenu(){
        boolean exit = false;

        while (!exit){

            Conta contaCliente = new Conta();

            System.out.println("---------------- Bem vindo -----------------------");
            System.out.println("|                Banco Ilusório                 |");
            System.out.println("             Seu dinheiro está aqui              ");
            System.out.println("--------------------------------------------------");
            System.out.println("| 1 - Login                                      |");
            System.out.println("| 2 - Criar conta                                |");
            System.out.println("| 3 - Exit                                       |");
            System.out.println("--------------------------------------------------");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser){

                case 1:
                    contaCliente = login.realizarLogin(referenciaConta, referenciaCliente);

                    if (contaCliente != null){
                        contaCliente.exibirPerfil(contaCliente);

                        acessarConta(contaCliente);
                    }

                    break;

                case 2:
                    referenciaConta.criarConta(referenciaCliente);
                    break;


                case 3:
                    exit = true;
                    break;
            }
        }

    }

    public void acessarConta(Conta conta){
         boolean continuarMenu = true;

         while (continuarMenu){
             System.out.println("------------------- Menu -------------------");
             System.out.println("/ 1 - Consultar Saldo                      /");
             System.out.println("/ 2 - Realizar saque                       /");
             System.out.println("/ 3 - Realizar depósito                    /");
             System.out.println("/ 4 - Realizar Transferência               /");
             System.out.println("/ 5 - Encerrar Sessão                      /");
             System.out.println("--------------------------------------------");

             int optionUser = scanner.nextInt();
             scanner.nextLine();

             switch (optionUser){
                 case 1:
                     conta.consultarSaldo();
                     break;

                 case 2:
                     System.out.print("Informe o valor que deseja sacar: ");
                     double valorSaque = scanner.nextDouble();
                     scanner.nextLine();

                     conta.realizarSaque(valorSaque);
                     break;

                 case 3:
                     System.out.println("Informe o valor que deseja depositar: ");
                     double valorDeposito = scanner.nextDouble();
                     scanner.nextLine();

                     conta.realizarDeposito(valorDeposito);
                     break;

                 case 4:
                     referenciaConta.transferir(referenciaCliente,conta);
                     break;

                 case 5:
                     continuarMenu = false;
                     break;
             }
         }
    }


}
