import java.util.Scanner;

public class ControleSimplesDeSaques {

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // double limiteDiario = scanner.nextDouble();
    // double valorSaque = scanner.nextDouble();

    // // Implementando o loop for para iterar sobre os saques
    // for (int saque = 1; saque <= limiteDiario; saque++) {
    // // Solicitando o valor do saque ao usuário
    // System.out.println("Informe o valor do saque:");
    // valorSaque = scanner.nextDouble();

    // // Verificando se o valor do saque é zero para encerrar as transações
    // if (valorSaque == 0) {
    // System.out.println("Transações encerradas.");
    // break;
    // }

    // // Verificando se o valor do saque ultrapassa o limite diário
    // if (valorSaque > limiteDiario) {
    // System.out.println("Limite diário excedido. Transação cancelada.");
    // continue; // Pula para a próxima iteração do loop
    // }

    // // Subtraindo o valor do saque do limite diário
    // limiteDiario -= valorSaque;

    // // Informando o saque realizado e mostrando o limite restante
    // System.out.println("Saque realizado com sucesso. Limite restante: " +
    // limiteDiario);
    // }

    // // Fechando o Scanner para evitar vazamento de recursos
    // scanner.close();
    // }
    // }

    public static void main(String[] args) {
        // Definindo variáveis
        double limiteDiario;
        double valorSaque;
        double saldoDisponivel = 0;
        Scanner scanner = new Scanner(System.in);

        // Lendo o limite diário do usuário
        System.out.println("Informe o limite diário de saque:");
        limiteDiario = scanner.nextDouble();

        // Processando os saques
        while (saldoDisponivel < limiteDiario) {
            System.out.println("Informe o valor do saque:");
            valorSaque = scanner.nextDouble();

            if (valorSaque <= limiteDiario - saldoDisponivel) {
                saldoDisponivel += valorSaque;
                System.out.println("Saque realizado. Limite restante: " + (limiteDiario - saldoDisponivel));
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }

        System.out.println("Transacoes encerradas.");
        scanner.close();
    }
}