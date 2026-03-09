package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Coleccion_mayores {
    static void main() {
        Collection <Integer> listanumero = new ArrayList<>();
        listanumero.add(2);
        listanumero.add(8);
        listanumero.add(15);
        listanumero.add(4);
        listanumero.add(20);

        for (Integer numero : listanumero){
            if (numero>10){
                System.out.println(numero);
            }

        }
    }
}
