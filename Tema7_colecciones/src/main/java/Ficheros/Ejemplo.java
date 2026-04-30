package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/main/resources/aprobados.txt"));

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            System.out.println(linea);
        }

        sc.close();
    }
}