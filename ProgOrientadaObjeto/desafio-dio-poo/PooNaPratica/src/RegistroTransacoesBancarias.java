import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saldo inicial
        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        // Quantidade de transações
        System.out.print("Informe a quantidade de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        // Entrada de transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.print("\nTransação " + i + ":");
            System.out.print("\nTipo (D para depósito, S para saque): ");
            String tipoTransacao = scanner.next().toUpperCase();

            System.out.print("Valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            saldoInicial = atualizarSaldo(saldoInicial, transacao);
        }

        // Exibição do saldo final e transações
        System.out.println("\nSaldo final: " + saldoInicial);
        System.out.println("\nTransações:");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }

        scanner.close();
    }

    private static double atualizarSaldo(double saldoInicial, Transacao transacao) {
        switch (transacao.getTipoTransacao()) {
            case "D":
                return saldoInicial + transacao.getValorTransacao();
            case "S":
                return saldoInicial - transacao.getValorTransacao();
            default:
                System.out.println("Tipo de transação inválido: " + transacao.getTipoTransacao());
                return saldoInicial;
        }
    }
}

class Transacao {
    private String tipoTransacao;
    private double valorTransacao;

    public Transacao(String tipoTransacao, double valorTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.valorTransacao = valorTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    @Override
    public String toString() {
        return tipoTransacao.equals("D") ? "Depósito de " + valorTransacao : "Saque de " + valorTransacao;
    }
}
