package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Pruebajson {
    public static void main(String[] args) {

        ArrayList<Pais> listapaises = new ArrayList<>(Arrays.asList(new Pais("nueva zelanda", "oceania", 15000, Arrays.asList("neozelandes", "ingles", "español")), new Pais("mongolia", "asia", 1564116, Arrays.asList("mongol"))
        ));

        Pais españa = new Pais("España","europa",55454,Arrays.asList("vasco","catalan","castellano"));
        System.out.print(listapaises);

        Gson json = new GsonBuilder().setPrettyPrinting().create();

        String pais_json = json.toJson(listapaises);
        System.out.println(pais_json);

        try {
            FileWriter escribir = new FileWriter("src/main/resources/paises.json");
            json.toJson(listapaises,escribir);
            escribir.close();

            FileWriter escribir_esp = new FileWriter("src/main/resources/españita.json");
            json.toJson(españa,escribir_esp);
            escribir_esp.close();

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        try {
            FileReader leer = new FileReader("src/main/resources/españita.json");
            Pais pais = json.fromJson(leer, Pais.class);
            leer.close();
            System.out.println(pais.getNombre());

            FileReader leer_lista = new FileReader("src/main/resources/paises.json");
            Pais paises[] = json.fromJson(leer_lista, Pais[].class);
            ArrayList<Pais> lista = new ArrayList<>(Arrays.asList(paises));
            leer_lista.close();

            for (Pais paisito : lista){
                System.out.println(paisito.getNombre());
            }

        } catch (IOException e) {


            throw new RuntimeException(e);
        }
    }
}