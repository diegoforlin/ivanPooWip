package poo;
import poo.cartao.Cliente;
import java.math.BigDecimal;
import java.util.Scanner;
import static poo.conta.Conta.limite;
import static poo.conta.Conta.saldo;
public class Main {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cliente cliente = new Cliente();
    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 11) {
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
                        limiteUtilizado();
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
                    case 10:
                        comprarCredito();
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

    private static void comprarCredito() {
        System.out.println("Qual produto você deseja comprar?");
        String produto;
        sc.nextLine();
        produto = sc.nextLine();
        System.out.println("Qual o valor de " + produto + " ?");
        BigDecimal valor;
        valor = sc.nextBigDecimal();
        System.out.println("Comprando um produto " + produto + " no valor de " + valor);
        limite = limite.subtract(valor);
        System.out.println("Calculando limite. Pressione enter para continuar.");
        sc.next();
        System.out.println("Seu limite atual é de " + limite);
        System.out.println("Voltando ao menu principal...");
    }

    private static void chequeEspecial() {
    }

    private static void limiteUtilizado() {
        BigDecimal valor = BigDecimal.valueOf(0);
        System.out.println("Entre com seu CPF.");
        String cpf = sc.nextLine();
        sc.nextLine();
        BigDecimal limiteUtilizado = limite.subtract(valor);
        System.out.println("Seu limite utilizado é de: " + limiteUtilizado);
        sc.next();
        System.out.println("Voltando ao menu principal...");
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
        System.out.println("Digite a conta o qual deseja depositar o pix.");
        String conta;
        conta = sc.nextLine();
        sc.next();
        BigDecimal valor;
        System.out.println("Digite o valor a ser depositado.");
        valor = sc.nextBigDecimal();
        System.out.println("Você depositou R$" + valor + ". Seu saldo é de " + saldo);
        saldo = saldo.subtract(valor);
        System.out.println("Voltando ao menu principal...");
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
                10 - Comprar com cartão de crédito.
                11 - Sair
                """);
        return sc.nextInt();
    }

    private static void compraEfetuada() {
        System.out.println("Qual produto você deseja comprar?");
        String produto;
        sc.nextLine();
        produto = sc.nextLine();
        System.out.println("Qual o valor de " + produto + " ?");
        BigDecimal valor;
        valor = sc.nextBigDecimal();
        System.out.println("Comprando um produto " + produto + " no valor de " + valor);
        saldo = saldo.subtract(valor);
        System.out.println("Calculando saldo. Pressione enter para continuar.");
        sc.next();
        System.out.println("Seu saldo atual é de " + saldo);
        System.out.println("Voltando ao menu principal...");
    }
}




