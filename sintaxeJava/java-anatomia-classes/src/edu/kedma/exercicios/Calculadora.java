package edu.kedma.exercicios;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Kédma Costa
 * @version 1.0
 * @since 24/12/2022
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    // Comentário
    // Olá, eu sou um comentário em uma única linha
    /*
     * Olá,
     * Eu sou um comentario
     * que posso ser mais detalhadod
     * quando necessário
     */

    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */

    /*  Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade somar ou  multiplicar
    * dois números
    */

    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

// Criando a documentação no formato html para disponibilizar via web.
    // No terminal execute o comando abaixo
// javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

}