package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Prueba_conjuntos {
    static void main() {
        String peces[] ={"salmon","sardina","tiburon","merluza","boqueron"};

        HashSet<String> desordenada = new HashSet<>(Arrays.asList(peces));

        LinkedHashSet<String> respeta_orden = new LinkedHashSet<>(Arrays.asList(peces));
        TreeSet<String> ordenado = new TreeSet<>(Arrays.asList(peces));

        System.out.println(desordenada);
        System.out.println(ordenado);
        System.out.println(respeta_orden);


    }
}
