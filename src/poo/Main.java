package poo;


import java.util.Scanner;

public class Main {

    private static ContaService service = new ContaService();
    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
            var opcao = exibirMenu();
            while (opcao != 6) {
                try {
                    switch (opcao) {
                        case 1:
                            System.out.println("Entre com seus dados do cartão.");
                            break;
                        case 2:
                            compraEfetuada();
                            System.out.println("Realize uma compra.");
                            break;
                        case 3:
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
                            System.out.println("Sair do aplicativo.");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } catch (RegraDeNegocioException e) {
                    System.out.println("Erro: " + e.getMessage());
                    System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                    teclado.next();
                }
                opcao = exibirMenu();
            }
            System.out.println("Finalizando a aplicação.");
        }
        private static int exibirMenu() {
            System.out.println("""
                LUKE'S BANK - ESCOLHA UMA OPÇÃO:
                1 - Listar contas abertas
                2 - Abertura de conta
                3 - Encerramento de conta
                4 - Consultar saldo de uma conta
                5 - Realizar saque em uma conta
                6 - Realizar depósito em uma conta
                7 - Sair
                """);
            return teclado.nextInt();
        }
    }


