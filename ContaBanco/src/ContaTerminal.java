
// import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    /*
     * Crie o projeto ContaBanco que receberá dados via terminal contendo as
     * características de conta em banco conforme atributos abaixo:
     * Crie a classe ContaTerminal.java para realizar toda a codificação do nosso
     * programa.
     * Permita que os dados sejam inseridos via terminal sendo que o usuário
     * receberá a mensagem de qual informação será solicitada, exemplo:
     * Programa: "Por favor, digite o número da Agência !"
     * Usuário: 1021 (depois ENTER para o próximo campo)
     * Depois de todas as informações terem sido inseridas, o sistema deverá exibir
     * a seguinte mensagem:
     * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
     * .
     * Os campos em [ ] devem ser alterados pelas informações que forem inseridas
     * pelos usuários.
     * 
     * 
     * 
     */
    public static void main(String[] args) throws Exception {

        // "Conhecer e importar a classe Scanner"

        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite seu nome!\n");
        String usuario = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência!\n");
        // Obter pela classe scanner os valores digitados no terminal
        int numeroAgencia = scanner.nextInt();
        System.out.println("Agencia: " + numeroAgencia);

        String numeroConta = "1244-5";
        System.out.print("Número da Conta: " + numeroConta);

        System.out.println("\nDigite o valor a ser depositado");
        double saldo = scanner.nextDouble();
        System.out.print("\nCriando sua conta...\n");

        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco, sua Agência é: "
                + numeroAgencia + ", Conta nº: " + numeroConta + " e seu saldo é R$" + saldo);

        // Exibir a mensagem da conta criada
        scanner.close();
    }
}
