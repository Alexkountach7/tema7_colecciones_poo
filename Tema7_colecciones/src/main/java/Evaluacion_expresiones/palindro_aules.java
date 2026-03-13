package Evaluacion_expresiones;

import java.util.Deque;
import java.util.LinkedList;

public class palindro_aules {
    public boolean espalindromo (Deque<Character> palabra){
        while (palabra.size()>1){
            if (!palabra.pollFirst().equals(palabra.pollLast())){
                System.out.println("no es palindromo");
                return false;
            }else{
                System.out.println("es palindromo");

            }
        }
        return true;
    }

    static void main() {
        Deque<Character> colapalin = new LinkedList<>();
        String texto = "radar";

        for (int i =0; i<texto.length(); i++) {
            colapalin.add(texto.charAt(i)); // meto en la cola de texto cada caracter de la palabra
        }

        palindro_aules palin = new palindro_aules();

        System.out.println(palin.espalindromo(colapalin));
    }
}
