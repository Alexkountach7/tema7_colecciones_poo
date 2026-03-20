package Portatil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prueba {

    private static List<String> listaindesc;

    public Prueba(List<String> lista) {
        // Creamos lista inmodificable a partir de otra
        listaindesc = Collections.unmodifiableList(lista);
    }

    public static List<String> getListaindesc() {
        return listaindesc;
    }

    public static void main(String[] args) {

        Prueba prueba = new Prueba(Arrays.asList("adios", "paco"));

        System.out.println(getListaindesc());

        // Esto rompería (UnsupportedOperationException)
        // listaindesc.add("Hola");
    }
}