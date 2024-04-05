package poo;
import poo.cartao.Cartao;
import poo.cartao.CartaoCredito;
import poo.cartao.Cliente;
import poo.conta.ContaService;

import java.math.BigDecimal;
import java.util.Scanner;

import static poo.cartao.Cliente.*;
import static poo.conta.ContaService.*;

public class Main {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static ContaService contaService = new ContaService();
    private static Cliente cliente = new Cliente();
    private static CartaoCredito cartaoCredito = new CartaoCredito();

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 10) {
            try {
                switch (opcao) {
                    case 1:
                        login();
                        break;
                    case 2:
                        compraEfetuada();
                        System.out.println("Realize uma compra.");
                        break;
                    case 3:
                        exibeLimite();
                        System.out.println("Cheque o seu limite.");
                        break;
                    case 4:
                        limiteRestante();
                        System.out.println("Cheque o limite utilizado.");
                        break;
                    case 5:
                        System.out.println("Use o cheque especial no cartão de débito.");
                        break;
                    case 6:
                        consultaSaldo();
                        System.out.println("Cheque o seu saldo financeiro.");
                        break;
                    case 7:
                        depositar();
                        System.out.println("Deposite dinheiro em sua conta.");
                    case 8:
                        sacar();
                        System.out.println("Saque dinheiro de sua conta.");
                    case 9:
                        pix();
                        System.out.println("Realize um pix para outra conta bancária.");
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (RegraDeNegocioException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                sc.next();
            }
            opcao = exibirMenu();
        }
        System.out.println("Finalizando a aplicação.");
    }

    public static int exibirMenu() {
        System.out.println("""
                LUKE'S BANK - ESCOLHA UMA OPÇÃO:
                1 - Fazer login no Luke's Bank.
                2 - Realizar uma compra.
                3 - Checar o limite restante.
                4 - Checar o limite utilizado.
                5 - Usar o cheque especial em um cartão de débito.
                6 - Checar o saldo financeiro.
                7 - Deposite dinheiro em sua conta.
                8 - Saque o seu dinheiro.
                9 - Realize um pix para outra conta bancária.
                10 - Sair
                """);
        return sc.nextInt();
    }

    public static void consultaSaldo() {
        System.out.println("Digite o CPF:");
        sc.nextLine();
        Cliente.cpf = sc.nextLine();
        contaService.getSaldo();
        System.out.println("Saldo da conta: ");
        System.out.println(saldo);
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        sc.next();
    }

    public static BigDecimal compraEfetuada() {
        String produto;
        System.out.println("Qual produto você deseja comprar?");
        sc.next();
        produto = sc.nextLine();
        System.out.println("Qual o valor de " + produto + " ?");
        sc.next();
        BigDecimal valor = sc.nextBigDecimal();
        System.out.println("Comprando um produto " + produto + " no valor de " + valor);
        sc.next();
        saldo.subtract(valor);
        return compraEfetuada();
    }

    public static void login() {
        System.out.println("Entre com seu nome.");
        sc.next();
        Cliente.nome = sc.nextLine();
        System.out.println("Bem-vindo, " + Cliente.nome + ". Entre com seu cpf.");
        sc.next();
        Cliente.cpf = sc.nextLine();
        System.out.println("Seu cpf é " + Cliente.cpf + " .Entre com sua data de aniversário, " + nome + " . Formato DD/MM/YYYY.");
        sc.next();
        Cliente.dataAniversario = sc.nextLine();
        System.out.println("Sua data de aniversário é " + Cliente.dataAniversario + " .Entre com o seu número de cartão.");
        sc.next();
        Cartao.numeroCartao = sc.nextLine();
        System.out.println("Agora, entre com a data de validade do cartão.");
        sc.next();
        Cartao.dataValidadeCartao = sc.nextLine();
        System.out.println("Digite a sua senha de seis dígitos.");
        sc.next();
        Cartao.senhaCartao = sc.nextLine();
        bloqueado();
        System.out.println("Você logou com segurança. Por favor, aperte 1 para voltar ao menu ou 2 para encerrar a aplicação.");
        char opcao2 = 2;
        if (opcao2 == 2) {
            sc.close();
        } else {
            exibirMenu();
            return;
        }
        exibirMenu();
    }
}




