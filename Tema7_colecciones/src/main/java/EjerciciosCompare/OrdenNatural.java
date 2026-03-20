package EjerciciosCompare;

import java.util.*;

public class OrdenNatural {
    static void main() {
        // La coleccion set no permiten duplicados, no hay elementos repetidos, no siempre mantiene el orden
        //
        List<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(5);

        System.out.println("antes de ordenar: "+lista);

        Collections.sort(lista);

        System.out.println("despues de ordenar: "+lista);

    }
}
