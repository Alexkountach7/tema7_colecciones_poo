package Portatil;

import java.util.*;

public class CompraIvanApp {

    static void main() {
        List<Portatil> portatiles = new LinkedList<>();

        portatiles.add(new Portatil("macbook air",16,12.6));
        portatiles.add(new Portatil("macboo pro",128,1.55));
        portatiles.add(new Portatil("hp pavilon",64,1.89));

        Collections.sort(portatiles, Collections.reverseOrder());

        System.out.println(portatiles);

        TreeMap<Portatil, String> mapa = new TreeMap<>(Comparator.reverseOrder());
        List<Map.Entry<Portatil,String>> listaMap = new ArrayList<>(mapa.entrySet());

        listaMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    }
}
