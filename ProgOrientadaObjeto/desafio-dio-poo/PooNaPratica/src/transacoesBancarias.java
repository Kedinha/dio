import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class transacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // Inicializando o saldo
        saldo = scanner.nextDouble();
        System.out.println("Saldo: " + saldo);

        // Criando a lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Processando as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.print("Transacao " + i + ": ");
            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao.equalsIgnoreCase("D")) {
                saldo += valorTransacao;
                transacoes.add(new Transacao(i, "Deposito de ", valorTransacao));
            } else if (tipoTransacao.equalsIgnoreCase("S")) {
                saldo -= valorTransacao;
                transacoes.add(new Transacao(i, "Saque de ", valorTransacao));
            } else {
                System.out.println("Opcao invalida. Utilize D para deposito ou S para saque.");
                i--; // Ignora a transacao invalida
            }
        }

        // Exibindo o saldo final
        System.out.println("\nSaldo: " + saldo);

        // Exibindo as transacoes
        System.out.println("\nTransacoes:");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }

        // Fechando o scanner
        scanner.close();
    }
}

class Transacao {
    private int numero;
    private String tipo;
    private double valor;

    public Transacao(int numero, String tipo, double valor) {
        this.numero = numero;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return numero + ". " + tipo + ": " + valor;
    }
}
