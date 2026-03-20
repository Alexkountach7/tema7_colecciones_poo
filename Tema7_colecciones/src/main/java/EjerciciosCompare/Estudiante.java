package EjerciciosCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estudiante implements Comparable<Estudiante>{
    private String nia;
    private String nombre;

    public Estudiante(String nia, String nombre) {
        this.nia = nia;
        this.nombre = nombre;


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNia() {
        return nia;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Estudiante otro) {
        return this.nia.compareTo(otro.nia);
    }

    static void main() {
        List<Estudiante> lista = new ArrayList<>();
         lista.add(new Estudiante("3","ana"));
         lista.add(new Estudiante("4","luis"));
         lista.add(new Estudiante("8","pedro"));

        Collections.sort(lista);

        System.out.println(lista);
    }

}
