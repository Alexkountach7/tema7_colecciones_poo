package Evaluacion_expresiones;

import java.util.Scanner;
import java.util.Stack;

public class InventorNombres {
    static void main() {
        //pilas- stack - lifo
        Scanner sc = new Scanner(System.in);

        Stack<Character> lista = new Stack<>();

        System.out.println("introduce el nombre");
        String nombre = sc.nextLine();

        for (int i =0; i<nombre.length(); i++){
            char nombre_ = nombre.charAt(i);
            lista.push(nombre_);

        }
        System.out.print(lista);

        while (!lista.isEmpty()){
            System.out.print(lista.pop());

        }





    }

}
