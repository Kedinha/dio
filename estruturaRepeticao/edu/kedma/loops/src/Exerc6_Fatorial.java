import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Exerc6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");

        // System.out.print("Fatorial de: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println("Fatorial de: "+ fatorial + "!");
        for (int i = fatorial; i >= 1; i--) {

            multiplicacao = multiplicacao * i;
            System.out.println(multiplicacao + " X " + i + " = "+ multiplicacao);
        }
        // System.out.println(multiplicacao);

        scan.close();
    }
}
