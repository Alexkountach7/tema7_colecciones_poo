package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercici {
    static void main() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/aprobados.txt"));
            String linea;
            while (( linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
