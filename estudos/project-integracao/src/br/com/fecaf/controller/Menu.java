package br.com.fecaf.controller;

import br.com.fecaf.model.Funcionario;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    FuncionarioController funcionarioController = new FuncionarioController();

    //metodo
    public void executarMenu(){

        boolean exit = false;

        while (!exit){
            System.out.println("----------- MENU -----------");
            System.out.println("1. Consultar funcionarios   ");
            System.out.println("2. Deletar Funcionarios   ");
            System.out.println("3. Cadastrar Funcionário     ");
            System.out.println("4. Sair                     ");

            System.out.print("Escolha uma opção: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption){
                case 1:
                    funcionarioController.consultarFuncionarios();
                    break;

                case 2:
                    funcionarioController.consultarFuncionarios();
                    System.out.println("Informe o ID do funcionario: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();

                    boolean validaDelete = funcionarioController.deletarFuncionario(idDelete);

                    if (validaDelete){
                        System.out.println("Funcionário deletado!!");
                    } else {
                        System.out.println("Funcionário não deletado!");
                    }

                    break;

                case 3:
                    Funcionario funcionario = new Funcionario();
                    funcionario.cadastrarFuncionario();

                    boolean validaCadastro = funcionarioController.cadastrarFuncionario(funcionario);
                    if (validaCadastro){
                        System.out.println("Funcionário cadastrado com sucesso");
                    } else {
                        System.out.println("Funcionário não cadastrado");
                    }



                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Ops!! escolha uma opção válida..");


            }

        }





    }
}
