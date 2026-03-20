package iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class Ejemplo_listait {
    static void main() {
        ArrayList<String> alumno = new ArrayList<>(Arrays.asList("juan","ismael","paula","rajoy"));
        ListIterator<String> it = alumno.listIterator();

        while (it.hasNext()){

            String nombre = it.next();
            System.out.println(nombre);
            if (nombre.equals("ismael")){
                it.add("patri");
            }
        }

        while (it.hasPrevious()){
            System.out.println(it.previousIndex());
            String nombre_ = it.previous();
            System.out.println(it.previousIndex());
            System.out.println(nombre_);


        }
    }
}
