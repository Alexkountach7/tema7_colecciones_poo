package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

    static Scanner sc = new Scanner(System.in);

    public static void buscarPalabra(String palabra) {
        int contador = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/aprobados.txt")
            );

            String linea = lector.readLine();

            while (linea != null) {

                String[] palabras = linea.split(" ");

                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }

                linea = lector.readLine();
            }

            lector.close();

            System.out.println("La palabra aparece " + contador );

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce una palabra a buscar:");
        String palabra = sc.nextLine();

        buscarPalabra(palabra);
    }
}