package br.com.fecaf.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {

    //encapsulamento de dados
    private int numeroConta;
    private String agencia = "8208-XX";
    String password, confirmPassword;
    private double saldo = 0;
    private Cliente cliente;

    //lista
    List<Conta> listContas = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);





    public void criarConta(Cliente referenciaCliente){
        Cliente cliente = new Cliente();
        long cpfCliente = cliente.cadastrarCliente();

        referenciaCliente.adicionarClientes(cliente);

        Conta conta = new Conta();

        Cliente clienteConta = referenciaCliente.pesquisarCliente(cpfCliente);

        conta.gerarConta(clienteConta);
        adicionarList(conta);
    }



    public void gerarConta(Cliente cliente) {
        System.out.println("/----------------- Gerando conta -----------------/");
        numeroConta = (int) (Math.random() * 10000);
        System.out.print("Informe uma senha: ");
        password = scanner.nextLine();

        do {
            System.out.print("Confirme a senha: ");
            confirmPassword = scanner.nextLine();

            if (!password.equals(confirmPassword)) {
                System.out.println("Senhas não conferem!!");
            }
        } while (!password.equals(confirmPassword));

        System.out.println("/--------------------------/");

        this.cliente = cliente;
    }
    public void realizarSaque(double valorSaque){
        boolean validaSaque = avaliarSaque(valorSaque);

        if (validaSaque) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Impossívle realizar saque !!!");
        }

        System.out.println("O saldo disponivel na conta é: " + this.saldo);
    }

    public boolean avaliarSaque(double valorSaque){
        if (this.saldo >= valorSaque){
            return true;
        }
        return false;
    }

    public void realizarDeposito(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("O saldo disponível na conta é: " + this.saldo);
    }

    public void consultarSaldo(){
        System.out.println("O saldo disponível na conta é " + this.saldo);
    }

    public void adicionarList (Conta conta) {
        listContas.add(conta);
    }

    public Conta pesquisarConta (Cliente cliente){
        for (Conta conta : listContas){
            if (cliente == conta.cliente) {
                return conta;
            }
        }
        return null;
    }

    public void exibirPerfil (Conta conta){
        System.out.println("/-------------------------------/");
        System.out.println("Olá " + conta.cliente.getNome() + "!");
        System.out.println("Agência " + conta.getAgencia());
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("/-------------------------------/");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void transferir (Cliente referenciaCliente, Conta contaCliente){
        System.out.print("Informe o CPF do destinatário: ");
        long cpf = scanner.nextLong();
        scanner.nextLine();

        Cliente clienteDestinario = referenciaCliente.pesquisarCliente(cpf);
        Conta contaDestinario = pesquisarConta(cliente);

        if (contaDestinario != null){
            System.out.print("|        Transferência para " + clienteDestinario.getNome()+ "  |" );
            System.out.print("Informe o valor: ");
            double valorTransferencia = scanner.nextDouble();
            scanner.nextLine();

            if (contaCliente.saldo >= valorTransferencia){
                System.out.println("Transferência relizada com sucesso!!");
                System.out.println("----------> Comprovante: ");
                System.out.println("Agência: " + contaCliente.getAgencia());
                System.out.println("Conta: " + contaCliente.getNumeroConta());
                System.out.println("Remetente: " + contaCliente.cliente.getNome());
                System.out.println("CPF do remetente: " + contaCliente.cliente.getCpf());
                System.out.println("Valor: " + valorTransferencia);
                System.out.println("Agência: " + contaDestinario.getAgencia());
                System.out.println("Conta: " + contaDestinario.getNumeroConta());
                System.out.println("Destinatário: " + contaDestinario.cliente.getNome());
                System.out.println("CPF destinatário: " + contaDestinario.cliente.getCpf());
                System.out.println("-----------------------------------------------------");

                contaCliente.saldo -= valorTransferencia;
                contaDestinario.saldo += valorTransferencia;
            } else {
                System.out.println("Saldo para transferência indisponível! ");
            }


        } else {
            System.out.println("CPF destinatário não encontrado!!");
        }

    }


















}