package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {

    public static void main(String[] args) {
        /**
         * Dadas as seguintes informações sobre minhas séries favoritas,
         * crie um conjunto e oredene este conjunto exibindo:
         * (nome - genero - tempo de episódio);
         */
    

         System.out.println("---\tOrdem aleatória\t--");         Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("That 70s Show", "comedia", 25));
         }};
         for ( Serie serie: minhasSeries)System.out.println(serie.getNome() 
         + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

         System.out.println("---\tOrdem Inserção\t--");         Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s Show", "comedia", 25));
         }};
         for ( Serie serie: minhasSeries1)System.out.println(serie.getNome() 
         + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

         System.out.println("---\tOrdem Natural(TempoEpisodio\t--");
         Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
         for ( Serie serie: minhasSeries2)System.out.println(serie.getNome() 
         + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

         System.out.println("---\tOrdem Nome/Genero/TempoEpisodio\t--");
         Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
         minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome()
        + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}
