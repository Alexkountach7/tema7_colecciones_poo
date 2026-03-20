package iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class tecladoMaria {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine();
        ArrayList<Character> lista= new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();
        for (Character caracter : palabra.toCharArray()){
            switch (caracter){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious())
                        it.previous();
                        it.remove();
                    break;
                default:
                    it.add(caracter);
            }
        }

        for (Character caracter : lista){
            System.out.print(caracter);
        }


    }
}
