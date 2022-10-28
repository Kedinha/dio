package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * set
 */
public class set {

    public static void main(String[] args) {
        System.out.println("Crie e adione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está no conjunto " + notas.contains(5d));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

    }
}