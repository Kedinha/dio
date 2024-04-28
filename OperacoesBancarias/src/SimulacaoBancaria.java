import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        double saque;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        System.out.println("Escolha uma opcao");
        System.out.println("1.Depositar");
        System.out.println("2.Sacar");
        System.out.println("3.Consultar Saldo");
        System.out.println("4.Encerrar");
        while (true) {

            int opcao = scanner.nextInt();
            // Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    break;

                case 1:
                    System.out.println("Digite o valor a ser depositado");
                    saldo = scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado ");
                    saque = scanner.nextDouble();

                    if (saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: " + saldo);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    }

                    // if (saque > saldo) {
                    // System.out.println("Saldo insuficiente...");
                    // } else if (saque <= saldo) {
                    // saldo = saldo - saque;
                    // }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);

                    break;
                case 4:

                    System.out.println("Programa encerrado.");
                    break;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}