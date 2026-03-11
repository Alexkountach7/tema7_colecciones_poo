package ejercicios_practicar_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1_Map {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> mapapalabras = new HashMap<>();
        System.out.println("introduce una frase");
        String frase = sc.nextLine();

        String palabra_ [] = frase.split(" ");

        for (String palabra : palabra_){
            if (mapapalabras.containsKey(palabra)) { //
                mapapalabras.put(palabra,mapapalabras.get(palabra)+1);
            }else {
                mapapalabras.put(palabra,1);
            }
        }
    }
}
