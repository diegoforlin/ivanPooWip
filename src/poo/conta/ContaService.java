package poo.conta;

import poo.cartao.Cartao;
import poo.cartao.Cliente;

import java.math.BigDecimal;
import java.util.Scanner;

import static poo.cartao.Cartao.senhaCartao;
import static poo.cartao.Cliente.*;

public class ContaService extends Conta {

    static Scanner sc = new Scanner(System.in);

    public static BigDecimal saldo = BigDecimal.valueOf(1000);

    public ContaService() {
        super(saldo);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static void pix() {
    }

    public static void sacar() {
    }

    public static void depositar() {

    }

    public static BigDecimal consultaSaldo() {
        return saldo;
    }

    public BigDecimal taxaSaque() {
        return BigDecimal.valueOf(1 + 0.03);
    }

    public static void sair() {
        System.out.println("Saindo do Luke's Bank...");
    }

    public static void exibeLimite() {

    }

    public static void limiteRestante() {

    }

    public static BigDecimal compraEfetuada() {

        String produto;
        System.out.println("Qual produto você deseja comprar?");
        produto = sc.nextLine();
        System.out.println("Qual o valor de " + produto + " ?");
        BigDecimal valor = sc.nextBigDecimal();
        System.out.println("Comprando um produto " + produto + " no valor de " + valor);
        saldo.subtract(valor);
        return compraEfetuada();
    }

    public static void login() {
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
        return bloqueado();
    }
}
