package edu.kedma.javabasico;
public class MinhaClasse {

    public static void main(String[] args) {

        /**
         * String meuNome = "Kédma";
         * 
         * int anoFabricacao = 2022;
         * 
         * boolean simNao = true; // Tipo nomeBemDefinifinido valor;
         */

        // int somar (int numeroUm, int numero2);

        String primeiroNome = "Kedma";
        String segundoNome = "Costa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    // Métodos

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
