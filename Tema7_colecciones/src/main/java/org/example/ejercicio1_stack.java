package org.example;

import javax.swing.text.AttributeSet;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio1_stack {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Character> listacaracteres = new Stack<>();

        for (int i =0; i<5; i++){
            System.out.println("introduce el numero");
            Character letras = sc.next().charAt(0);
            listacaracteres.push(letras);

        }

        System.out.println("=== LISTA DE CARACTERES ===");

        for (Character letras_ : listacaracteres){
            System.out.println(letras_);
        }

        System.out.println("la cantidad de caracteres son: "+listacaracteres.size());

        System.out.println("el ultimo elemento es: " +listacaracteres.peek());

        System.out.println("=== Letras extraidas ====");
        do {
            Character letra_ = listacaracteres.pop();
            System.out.println("el caracter es "+letra_);
        }while (!listacaracteres.isEmpty());
    }
}
