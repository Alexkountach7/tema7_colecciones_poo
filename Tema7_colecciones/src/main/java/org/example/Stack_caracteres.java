package org.example;

import java.util.Stack;

public class Stack_caracteres {
    public static int evaluar(String expresion) { //este metodo recibe una expresion matetica como texto
        Stack<Integer> pila = new Stack<>();
        for (String token : expresion.split(" ")) {
            if (token.matches("\\d+")){
                pila.push(Integer.parseInt(token));
            }else {
                int b = pila.pop();
                int a = pila.pop();
                switch (token) {
                    case "+": pila.push(a+b); break;
                    case "-": pila.push(a-b); break;
                    case "*": pila.push(a*b); break;
                    case "/": pila.push(a/b); break;
                }
            }
        }
        return pila.pop();
    }
    public static void main (String[] args){
        String expresion = "3 4 + 2";
        System.out.println(evaluar(expresion));
    }
}

