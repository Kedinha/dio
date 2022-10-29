package collections;

import java.util.HashSet;
import java.util.Set;

public class OrdenacaoSet {

    public static void main(String[] args) {
        /**
         * Dadas as seguintes informações sobre minhas séries favoritas,
         * crie um conjunto e oredene este conjunto exibindo:
         * (nome - genero - tempo de episódio);
         */
    

         System.out.println("---\tOrdem aleatória\t--");
         Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s Show", "comedia", 25));
         }};
         for ( Serie serie: minhasSeries)System.out.println(serie.getNome() 
         + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}
