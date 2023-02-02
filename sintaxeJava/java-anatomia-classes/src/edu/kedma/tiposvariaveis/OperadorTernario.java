package edu.kedma.tiposvariaveis;

public class OperadorTernario {
    public static void main(String[] args) {
        /*
         * Operador de Condição Ternária
         * O operador ternário é representado pelos símbolos ?: utilizados na seguinte
         * estrutura de sintaxe:
         * <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição
         * seja false>
         */
        int a, b;

        a = 5;
        b = 6;

        
         //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        //  if(a==b)
        //   resultado = "verdadeiro";
        //   else
        //   resultado = "falso";
        

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}
