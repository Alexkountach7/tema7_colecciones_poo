package Mapas_colecciones;

import java.util.HashMap;
import java.util.Map;

public class Paises {
    static void main() {


        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "España");
        mapa.put(2, "Senegal");
        mapa.put(100,"EEUU");

        System.out.println(mapa.keySet());

        System.out.println(mapa.values());

        mapa.put(100,"Israel");

        System.out.println(mapa.values());

        for (Map.Entry<Integer, String> mapita: mapa.entrySet()){
            System.out.println(mapita.getKey() + ": "+mapita.getValue());
        }
    }
}