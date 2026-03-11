package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejercicio1_hashset {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Set<String> pilapalabras = new HashSet<>();
        System.out.println("introduce un frase");
        String frase = sc.nextLine().toLowerCase();

        String frase_ [] = frase.split(" ");

        for (String palabraguardar : frase_){
            pilapalabras.add(palabraguardar);
        }

        System.out.println(pilapalabras);

    }
}
