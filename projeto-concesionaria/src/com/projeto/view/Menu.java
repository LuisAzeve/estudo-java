package com.projeto.view;

import com.projeto.controller.MarcaController;
import com.projeto.controller.ModeloController;
import com.projeto.controller.VeiculoController;
import com.projeto.model.Marca;
import com.projeto.model.Modelo;
import com.projeto.model.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    MarcaController marcaController = new MarcaController();
    ModeloController modeloController = new ModeloController();
    VeiculoController veiculoController = new VeiculoController();

    public void executarMenu() {

        boolean sair = false;

        while (!sair) {
            System.out.println("\n========== SISTEMA AUTOMOTIVO ==========");
            System.out.println("1.  Cadastrar Marca");
            System.out.println("2.  Consultar Marcas");
            System.out.println("3.  Deletar Marca");
            System.out.println("4.  Cadastrar Modelo");
            System.out.println("5.  Consultar Modelos");
            System.out.println("6.  Deletar Modelo");
            System.out.println("7.  Cadastrar Veículo");
            System.out.println("8.  Consultar Veículos");
            System.out.println("9.  Atualizar Veículo");
            System.out.println("10. Deletar Veículo");
            System.out.println("11. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:  cadastrarMarca();   break;
                case 2:  consultarMarcas();  break;
                case 3:  deletarMarca();     break;
                case 4:  cadastrarModelo();  break;
                case 5:  consultarModelos(); break;
                case 6:  deletarModelo();    break;
                case 7:  cadastrarVeiculo(); break;
                case 8:  consultarVeiculos();break;
                case 9:  atualizarVeiculo(); break;
                case 10: deletarVeiculo();   break;
                case 11:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ==================== MARCA ====================

    public void cadastrarMarca() {
        Marca marca = new Marca();

        System.out.print("Informe o nome da marca: ");
        marca.setNome(scanner.nextLine());

        boolean sucesso = marcaController.cadastrarMarca(marca);

        if (sucesso) {
            System.out.println("Marca cadastrada com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar marca.");
        }
    }

    public void consultarMarcas() {
        ArrayList<Marca> marcas = marcaController.consultarMarcas();

        System.out.println("\n--------- MARCAS CADASTRADAS ---------");
        for (Marca marca : marcas) {
            System.out.println("ID: " + marca.getIdMarca() + " | Nome: " + marca.getNome());
        }
        System.out.println("--------------------------------------");
    }

    public void deletarMarca() {
        consultarMarcas();

        System.out.print("Informe o ID da marca para deletar: ");
        int idMarca = scanner.nextInt();
        scanner.nextLine();

        boolean sucesso = marcaController.deletarMarca(idMarca);

        if (sucesso) {
            System.out.println("Marca deletada com sucesso!");
        } else {
            System.out.println("Erro ao deletar marca.");
        }
    }

    // ==================== MODELO ====================

    public void cadastrarModelo() {
        consultarMarcas();

        Modelo modelo = new Modelo();

        System.out.print("Informe o nome do modelo: ");
        modelo.setNome(scanner.nextLine());

        System.out.print("Informe o ID da marca: ");
        modelo.setMarca_FK(scanner.nextInt());
        scanner.nextLine();

        boolean sucesso = modeloController.cadastrarModelo(modelo);

        if (sucesso) {
            System.out.println("Modelo cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar modelo.");
        }
    }

    public void consultarModelos() {
        ArrayList<Modelo> modelos = modeloController.consultarModelos();

        System.out.println("\n--------- MODELOS CADASTRADOS ---------");
        for (Modelo modelo : modelos) {
            System.out.println("ID: " + modelo.getIdModelo() + " | Nome: " + modelo.getNome() + " | ID Marca: " + modelo.getMarca_FK());
        }
        System.out.println("---------------------------------------");
    }

    public void deletarModelo() {
        consultarModelos();

        System.out.print("Informe o ID do modelo para deletar: ");
        int idModelo = scanner.nextInt();
        scanner.nextLine();

        boolean sucesso = modeloController.deletarModelo(idModelo);

        if (sucesso) {
            System.out.println("Modelo deletado com sucesso!");
        } else {
            System.out.println("Erro ao deletar modelo.");
        }
    }

    // ==================== VEÍCULO ====================

    public void cadastrarVeiculo() {
        consultarModelos();

        Veiculo veiculo = new Veiculo();

        System.out.print("Informe o ID do modelo: ");
        veiculo.setModelo_FK(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Informe o ano: ");
        veiculo.setAno(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Informe a cor: ");
        veiculo.setCor(scanner.nextLine());

        System.out.print("Informe a quilometragem: ");
        veiculo.setKm(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Informe o preço: ");
        veiculo.setPreco(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Informe o status (disponivel/vendido): ");
        veiculo.setStatus(scanner.nextLine());

        boolean sucesso = veiculoController.cadastrarVeiculo(veiculo);

        if (sucesso) {
            System.out.println("Veículo cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar veículo.");
        }
    }

    public void consultarVeiculos() {
        System.out.println("\n--- FILTRAR POR ---");
        System.out.println("1. Todos");
        System.out.println("2. Status");
        System.out.println("3. Ano");
        System.out.println("4. Preço máximo");
        System.out.println("5. Modelo");
        System.out.println("6. Marca");
        System.out.print("Escolha: ");

        int filtro = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Veiculo> veiculos;

        switch (filtro) {
            case 2:
                System.out.print("Status (disponivel/vendido): ");
                veiculos = veiculoController.consultarPorStatus(scanner.nextLine());
                break;
            case 3:
                System.out.print("Ano: ");
                veiculos = veiculoController.consultarPorAno(scanner.nextInt());
                scanner.nextLine();
                break;
            case 4:
                System.out.print("Preço máximo: ");
                veiculos = veiculoController.consultarPorPreco(scanner.nextDouble());
                scanner.nextLine();
                break;
            case 5:
                consultarModelos();
                System.out.print("ID do modelo: ");
                veiculos = veiculoController.consultarPorModelo(scanner.nextInt());
                scanner.nextLine();
                break;
            case 6:
                consultarMarcas();
                System.out.print("ID da marca: ");
                veiculos = veiculoController.consultarPorMarca(scanner.nextInt());
                scanner.nextLine();
                break;
            default:
                veiculos = veiculoController.consultarVeiculos();
        }

        System.out.println("\n--------- VEÍCULOS ---------");
        for (Veiculo veiculo : veiculos) {
            System.out.println("ID: "     + veiculo.getIdVeiculo());
            System.out.println("Modelo: " + veiculo.getModelo_FK());
            System.out.println("Ano: "    + veiculo.getAno());
            System.out.println("Cor: "    + veiculo.getCor());
            System.out.println("KM: "     + veiculo.getKm());
            System.out.println("Preço: R$ "+ veiculo.getPreco());
            System.out.println("Status: " + veiculo.getStatus());
            System.out.println("----------------------------");
        }
    }

    public void atualizarVeiculo() {
        consultarVeiculos();

        System.out.print("Informe o ID do veículo para atualizar: ");
        int idVeiculo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Novo preço: ");
        double novoPreco = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nova quilometragem: ");
        int novoKm = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Novo status (disponivel/vendido): ");
        String novoStatus = scanner.nextLine();

        boolean sucesso = veiculoController.atualizarVeiculo(idVeiculo, novoPreco, novoKm, novoStatus);

        if (sucesso) {
            System.out.println("Veículo atualizado com sucesso!");
        } else {
            System.out.println("Erro ao atualizar veículo.");
        }
    }

    public void deletarVeiculo() {
        consultarVeiculos();

        System.out.print("Informe o ID do veículo para deletar: ");
        int idVeiculo = scanner.nextInt();
        scanner.nextLine();

        boolean sucesso = veiculoController.deletarVeiculo(idVeiculo);

        if (sucesso) {
            System.out.println("Veículo deletado com sucesso!");
        } else {
            System.out.println("Erro ao deletar veículo.");
        }
    }
}