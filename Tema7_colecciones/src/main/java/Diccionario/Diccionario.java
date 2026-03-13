package Diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        diccionario = PalabrasDicc.cargarDiccionario();

    }

    public void nuevopar(String español, String ingles) {
        diccionario.put(español,ingles);
    }

    public String traduce(String español){
        return diccionario.get(español);
    }

    public String palabraaleatoria(){
        ArrayList<String> lista = new ArrayList<>(diccionario.keySet()); //he realizado una lista para indexar las claves del mapa
        // las claves ahora aparecen numeradas
        Random aleatorio = new Random();

        return lista.get(aleatorio.nextInt()); // devuelve una palabra de la lista del diccionario


    }
    public char primeraLetratraduccion(String español){

        String traduccion = diccionario.get(español); // creo una variable y devuelve la primera letra.

        return traduccion.charAt(0);

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        Diccionario diccionario_ = new Diccionario();

        while (true){
            System.out.println();
        }
    }

}
