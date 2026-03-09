package org.example;

import java.util.Stack;
import java.util.stream.Gatherer;

public class ejercicio2_colecciones {
    static void main() {
        Stack<Integer> pila = new Stack<>();

        pila.push(5);
        pila.push(8);
        pila.push(10);

        while (!pila.isEmpty()){   // pilas y colas mejor utilizar un while por que lo rompemos
            System.out.println(pila.pop());
        }

    }
}
