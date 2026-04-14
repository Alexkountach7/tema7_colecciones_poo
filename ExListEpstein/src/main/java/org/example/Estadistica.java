package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Estadistica implements Informes{
    private TreeMap<Famoso, Integer> estadisticas;

    public Estadistica(ArrayList<Famoso> listamas){
        this.estadisticas = new TreeMap<>();
    }


    public void calcular(ArrayList<Famoso> listaesptein){
        for (Famoso famoso : listaesptein){
            estadisticas.put(famoso,estadisticas.getOrDefault(famoso,0)+1);

        }
    }





    @Override
    public void verpoliticos() {

    }

    @Override
    public void informejuzgado() {

    }

    @Override
    public void ranking() {

    }
}
