package desafio;

import java.util.Scanner;

public class VerificadorNumeroConta {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // : Inicialize um bloco try-catch para capturar exceções:
	System.out.print("Digite o número da conta bancária: ");
    	String numeroConta = scanner.nextLine();
    try {
      // : Leia a entrada do usuário como uma string representando o número da conta:
	verificarNumeroConta(numeroConta);
	// Imprime que o número de conta é válido:
     System.out.println("Numero de conta valido." + numeroConta);

    } catch (IllegalArgumentException e) {
	System.out.println(e.getMessage());
               
      }
      // : Capture a exceção do tipo IllegalArgumentException, que pode ser lançada
      // pelo método verificarNumeroConta:
      // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à
      // exceção:
      System.out.println("Erro: " + e.getMessage());

    } finally

    {
      scanner.close();
    }
  }

  // Declaração do método verificarNumeroConta, que verifica se o número de conta
  // tem exatamente 8 dígitos:
  private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException{

    // Chame o método verificarNumeroConta, passando o número da conta como
    // argumento:

    // Verifique se o número da conta tem exatamente 8 dígitos:
 	if (numeroConta.length() != 8) {
 	
	throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos."); 

 }
 // Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:

         try {
            Long.parseLong(numeroConta);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro: Número de conta inválido. Digite apenas números.");
        }
	}
  }
