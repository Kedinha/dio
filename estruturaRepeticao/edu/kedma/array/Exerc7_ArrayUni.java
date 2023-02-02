package edu.kedma.array;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exerc7_ArrayUni {
    public static void main(String[] args) {
       
        System.out.print("Vetores: ");
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count]+ " ");
            count++;            
        }

        System.out.print("\nVetores intertidos: ");
        
         for (int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i]+ " ");
         }

    }
}
