package poo;
import poo.cartao.Cartao;
import poo.cartao.CartaoCredito;
import poo.cartao.Cliente;

import java.math.BigDecimal;
import java.util.Scanner;

import static poo.cartao.Cartao.senhaCartao;
import static poo.cartao.Cliente.*;

public class Main {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        CartaoCredito cartaoCredito = new CartaoCredito();
        var opcao = exibirMenu();
        while (opcao != 6) {
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
                        System.out.println("Cheque o seu saldo financeiro.");
                        break;
                    case 7:
                        quit();
                        System.out.println("Sair do aplicativo.");
                        break;
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
    private static void exibeLimite() {

    }

    private static void limiteRestante() {
    }

    private static void compraEfetuada() {
    }

    private static void login() {
        System.out.println("Entre com seu nome.");
        nome = sc.nextLine();
        System.out.println("Bem-vindo, + " + nome + ". Entre com seu cpf.");
        cpf = sc.nextLine();
        System.out.println("Seu cpf é " + cpf + " .Entre com sua data de aniversário, " + nome + " . Formato DD/MM/YYYY.");
        Cliente.dataAniversario = sc.nextLine();
        System.out.println("Sua data de aniversário é " + dataAniversario + " .Entre com o seu número de cartão.");
        Cartao.numeroCartao = sc.nextLine();
        System.out.println("Agora, entre com a data de validade do cartão.");
        Cartao.dataValidadeCartao = sc.nextLine();
        System.out.println("Digite a sua senha de seis dígitos.");
        senhaCartao = sc.nextLine();
        bloqueado();
        System.out.println("Você logou com segurança. Por favor, aperte 1 para voltar ao menu ou 2 para encerrar a aplicação.");
        char a = sc.next().charAt(0);
        if (a == 1) {
            exibirMenu();
        } else {
                quit();
            }
                System.out.println("Saindo do Luke's Bank...");
                }
    private static void quit() {
        System.out.println("Saindo do Luke's Bank...");
        sc.close();
    }
            }
    private static int exibirMenu() {
        System.out.println("""
                LUKE'S BANK - ESCOLHA UMA OPÇÃO:
                1 - Fazer login no Luke's Bank.
                2 - Realizar uma compra.
                3 - Checar o limite restante.
                4 - Checar o limite utilizado.
                5 - Usar o cheque especial em um cartão de débito.
                6 - Checar o saldo financeiro.
                7 - Sair
                """);
    }
    private static boolean bloqueado() {
        int tentativas = 3;
        if (tentativas != 0) {
            if (senhaCartao.equals(tentativas)) {
                System.out.println("Senha correta.");
            } else {
                System.out.println("Senha incorreta. Favor tentar novamente.");
            }
        } else {
            System.out.println("Tentativas para desbloquear o cartão excedidas.");
        }
    }



