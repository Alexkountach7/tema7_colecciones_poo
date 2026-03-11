package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ejercicio_3_historial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Set<String> listanavegacion = new LinkedHashSet<>();
        String url;
        int contador=1;
        do {

            System.out.print("Escribe una URL visitada(o 'salir' para terminar):");
            url = sc.nextLine();
            if (!url.equals("salir")){
                listanavegacion.add(url);
        }

        }while (!url.equals("salir")); //equals para strings y contains para listas

        System.out.println("----- Historial de navegacion ------");
        for (String url_ : listanavegacion){
            System.out.println(contador+ ". "+url_); //se debe de poner url que es la variable de cada elemento
            contador++;
        }
    }
}
