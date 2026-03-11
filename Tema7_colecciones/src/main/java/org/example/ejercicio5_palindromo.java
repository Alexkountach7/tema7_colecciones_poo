package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class ejercicio5_palindromo {
    static void main() {
        Deque<Character> pilapalindromo = new LinkedList<>();
        String expresion = "radar";

        for (int i =0; i<expresion.length(); i++){
            pilapalindromo.offer(expresion.charAt(i)); // insertar elementos en estructura deque (cola doble) o queque (cola)


        }while (!pilapalindromo.isEmpty()){
            if (pilapalindromo.peekFirst() == pilapalindromo.peekLast()){ // devuelve el primer elemento de la lista sin eliminarlo
                pilapalindromo.pollFirst(); // elimina y devuelve el primer elemento de la lista
                pilapalindromo.pollLast(); // elimina y devuelve el ultimo elemento de la lista
            }else {
                System.out.println("la palabra no es palindromo");
            }
        }
        System.out.println("es palindromo ");
    }
}
