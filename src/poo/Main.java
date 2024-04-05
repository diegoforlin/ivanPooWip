package poo;
import poo.cartao.CartaoCredito;
import poo.cartao.Cliente;
import poo.conta.Conta;
import poo.conta.ContaService;

import java.util.Scanner;

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
}




