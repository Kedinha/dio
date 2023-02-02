
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map
 */
public class InterfaceMap {

    private static Map<String, Double> carrosPopulares;

    public static void main(String[] args) {    
        /**
         * Dado os modelos dos carros e seus respectivos consumos na estrada
         */
    System.out.println("Crie um dicionário que relacione os modelos respectivos");

    carrosPopulares = new HashMap<>(){{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares.toString());

    System.out.println("Substitua o valor do gol por 15,2 km/l");
    carrosPopulares.put("gol",15.2);
    System.out.println(carrosPopulares);

    System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

    System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

    System.out.println("Exiba os modelos: " + carrosPopulares.keySet());
    Set<String> modelos = carrosPopulares.keySet(); //mostra o mesmo acima
    System.out.println(modelos);

    System.out.println("Exiba o comsumo dos carros: " + carrosPopulares.values());
    Collection<Double> consumos = carrosPopulares.values(); //mesma representação que acima
    System.out.println(consumos);

    System.out.println("Exiba o modelo mais economico e seu consumo");
    Double consumoMaisEficiente =  Collections.max(carrosPopulares.values());
    String modeloMaisEficiente = "";
    // Set<Map.Entry<String,Double>>entries = carrosPopulares.entrySet();
for (Map.Entry<String,Double> entry:carrosPopulares.entrySet()){
    if (entry.getValue().equals(consumoMaisEficiente)){
        modeloMaisEficiente = entry.getKey();    
    System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
}
};

System.out.println("Exiba o modelo menos economico e seu consumo");
Double consumoMenosEficiente =  Collections.min(carrosPopulares.values());
String modeloMenosEficiente = "";
for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
    if (entry.getValue().equals(consumoMenosEficiente)) {
        modeloMenosEficiente = entry.getKey();    
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
    }
};


//Exiba a soma dos consumos: " + soma);
Iterator<Double> iterator = carrosPopulares.values().iterator();
Double soma = 0d;
while (iterator.hasNext()) {
    soma += iterator.next();
}
System.out.println("Exiba a soma dos consumos: " + soma);

















    }
}