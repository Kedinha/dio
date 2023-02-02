package edu.kedma.tiposvariaveis;

public class Operadores {

    public static void main(String[] args) {
        // Atribuição
        String nome = "GLEYSON";
        System.out.println(nome);

        int idade = 22;
        System.out.println(idade);

        double peso = 68.5;
        System.out.println(peso);

        char sexo = 'M';
        System.out.println(sexo);

        boolean doadorOrgao = false;
        System.out.println(doadorOrgao);

        // Date dataNascimento = new Date();
        // System.out.println(dataNascimento);

        /**
         * ATENÇÃO! O operador de adição (+),
         * quando utilizado em variáveis do tipo texto,
         * realizará a “concatenação de textos”.
         */

        // Aritméticos
        double soma = 10.5 + 15.7;
        System.out.println(soma);

        int subtração = 113 - 25;
        System.out.println(subtração);

        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);

        int divisao = 15 / 3;
        System.out.println(divisao);

        int modulo = 18 % 3;
        System.out.println(modulo);

        double resultado = (10 * 7) + (20 / 4);
        System.out.println(resultado);

        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);


        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);


        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);


        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);


        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);


    }
}
