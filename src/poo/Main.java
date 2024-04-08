package poo;
import java.math.BigDecimal;
import java.util.Scanner;

import static poo.conta.Conta.limite;
import static poo.conta.Conta.saldo;
public class Main {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

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
                        break;
                    case 3:
                        exibeLimite();
                        break;
                    case 4:
                        limiteRestante();
                        break;
                    case 5:
                        chequeEspecial();
                        break;
                    case 6:
                        consultaSaldo();
                        break;
                    case 7:
                        depositar();
                        break;
                    case 8:
                        sacar();
                        break;
                    case 9:
                        pix();
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

    private static void chequeEspecial() {
    }

    private static void limiteRestante() {
        System.out.println("Entre com seu CPF.");
        String cpf = sc.nextLine();
        sc.nextLine();
        System.out.println("Seu limite restante é de: ");
    }

    private static void exibeLimite() {
        System.out.println("Entre com seu CPF.");
        String cpf = sc.nextLine();
        sc.nextLine();
        System.out.println("Seu limite é de: ");
        System.out.println(limite);
        System.out.println("Voltando ao menu principal...");
    }

    private static void pix() {

    }

    private static void depositar() {
        System.out.println("Entre com seu CPF.");
        String cpf = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite quantos R$ deseja depositar na sua conta:");
        BigDecimal valor;
        valor = sc.nextBigDecimal();
        System.out.println("Depositando R$" + valor + " reais na conta pessoa física.");
        saldo = saldo.add(valor);
        System.out.println("Seu saldo atual é de " + saldo);
        System.out.println("Voltando ao menu principal...");
    }

    public static BigDecimal taxaSaque() {
        return BigDecimal.valueOf(1 + 0.10);
    }
    private static BigDecimal aplicaTaxaSaque(BigDecimal valorSaque){
        return valorSaque.multiply(taxaSaque());
    }

    private static void sacar() {
        System.out.println("Digite o CPF:");
        sc.nextLine();
        String cpf = sc.nextLine();
        System.out.println("Quanto você deseja sacar do seu saldo de " + saldo + " ?");
        BigDecimal valor = sc.nextBigDecimal();
        saldo = saldo.subtract(aplicaTaxaSaque(valor));
        System.out.println("Você sacou " + valor + " e com a taxa de saque seu saldo ficou em " + saldo);
        System.out.println("Voltando ao menu principal...");
    }

    private static void consultaSaldo() {
        
        System.out.println("Digite o CPF:");
        sc.nextLine();
        String cpf = sc.nextLine();
        System.out.println("Saldo da conta: ");
        System.out.println(saldo);
        System.out.println("Voltando ao menu principal...");
    }

    private static void login() {
        System.out.println("Entre com seu nome.");
        String nome;
        sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Bem-vindo, " + nome + ". Entre com seu cpf.");
        String cpf;
        cpf = sc.nextLine();
        System.out.println("Seu cpf é " + cpf + ". Entre com sua data de aniversário, " + nome + ". Formato DD/MM/YYYY.");
        String dataAniversario;
        dataAniversario = sc.nextLine();
        System.out.println("Sua data de aniversário é " + dataAniversario +". Entre com o seu número de cartão.");
        String numeroCartao;
        numeroCartao = sc.nextLine();
        System.out.println("Seu número do cartão é " + numeroCartao + ". Agora, entre com a data de validade do cartão. Formato MM/YYYY");
        String dataValidadeCartao;
        dataValidadeCartao = sc.nextLine();
        System.out.println("A data de validade do seu cartão é " + dataValidadeCartao + ". Digite a sua senha de seis dígitos.");
        String senhaCartao;
        senhaCartao = sc.nextLine();
        System.out.println("Senha inserida com sucesso. Voltando ao menu...");
    }

    public static int exibirMenu() {
        System.out.println("""
                LUKE'S BANK - ESCOLHA UMA OPÇÃO:
                1 - Fazer login no Luke's Bank.
                2 - Realizar uma compra.
                3 - Checar o limite.
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
}




