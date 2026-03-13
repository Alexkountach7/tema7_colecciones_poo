package iteradores;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejemplo_it {
    static void main() {
        Scanner sc = new Scanner(System.in);

        TreeSet<String> peliculas = new TreeSet<>();

        peliculas.add("Scream");
        peliculas.add("cars");
        peliculas.add("toy story");
        peliculas.add("bolt");


        Iterator<String> it = peliculas.iterator();

        while (it.hasNext()){
            String pelicula = it.next();

            if (pelicula.equals("bolt")){
                it.remove();
            }
        }

        System.out.println(peliculas);
    }

}
