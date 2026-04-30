package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class procesardatos {

    public static void main(String[] args) {

        try {
            Scanner lector = new Scanner(new File("src/main/resources/aprobados.txt"));

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                String[] datos = linea.split(";");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String profesion = datos[2];

                System.out.println("Persona con nombre: " + nombre+ "Edad: " + edad+" Profesión: " + profesion);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}