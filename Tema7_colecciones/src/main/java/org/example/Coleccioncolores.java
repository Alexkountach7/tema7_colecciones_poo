package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Coleccioncolores {
    static void main() {
        Collection <String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");

        for (String color : colores) {
            System.out.println(color);
        }

        colores.clear();

        if (colores.isEmpty()){
        System.out.println("la lista esta vacia");
        for (String color_ : colores){
            System.out.println(color_);
        }
        }else {
            System.out.println("la lista tiene elementos");
        }

    }
}
