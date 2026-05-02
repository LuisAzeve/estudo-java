package br.com.fecaf.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    //Encapsulamento dos dados
    private String nome;
    private long cpf, rg, telefone;

    //Instanciando Scanner
    Scanner scanner = new Scanner(System.in);

    //list -> Arraylist
    //ArrayList<Cliente> listClientes = new ArrayList<>();

    //lista
    List<Cliente> listClientes = new ArrayList<>();


    //metodo
    public long cadastrarCliente(){
        System.out.println("/----------  Cadastrar Cliente  ------------/");
        System.out.print("Digite o nome de seu cliente: ");
        nome = scanner.nextLine();
        System.out.print("Informe o CPF: ");
        cpf = scanner.nextLong();
        System.out.print("Informe o RG: ");
        rg = scanner.nextLong();
        System.out.print("Informe o telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("/-----------------/");

        return getCpf();
    }

    //Get and setter para alterar dados

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void adicionarClientes(Cliente cliente){
        listClientes.add(cliente);
    }

    public void listarClientes(){
        for (Cliente cliente: listClientes){
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
        }
    }

    public Cliente pesquisarCliente(long cpf){
        for (Cliente cliente: listClientes){
            long cpfCliente = cliente.getCpf();

            if (cpfCliente == cpf){
                return cliente;
            }
        }
        return null;
    }












}
