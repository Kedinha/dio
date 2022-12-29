import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exerc4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nNumeros;
        int numero;
        int quantPar = 0, quantImpar = 0;

        System.out.print("Quantidade de números: ");

        nNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.print("Número: ");

            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPar++;
            else
                quantImpar++;

            count++;

        } while (count < nNumeros);

        System.out.println("Quantidade de Números Pares: " + quantPar);
        System.out.println("Quantidade de Núemros Impares: " + quantImpar);

        scan.close();
    }

}
