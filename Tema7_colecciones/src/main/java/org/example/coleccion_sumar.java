package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class coleccion_sumar {
    static void main() {
        int numero =0;
        Collection <Integer> listasuma = new ArrayList<>();

        listasuma.add(3);
        listasuma.add(6);
        listasuma.add(9);
        listasuma.add(12);

        for (Integer sumar : listasuma) {
            numero = numero +sumar;
        }

        System.out.print(numero);
    }
}
