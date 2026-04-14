package org.example;

import java.util.Objects;

public class Famoso {
    private String nombre;
    private String pais;
    private int edad;

    public Famoso(String nombre, String pais, String profesion, int edad){
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Famoso famoso = (Famoso) o;
        return edad == famoso.edad && Objects.equals(nombre, famoso.nombre) && Objects.equals(pais, famoso.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais, edad);
    }

    @Override
    public String toString() {
        return "Famoso{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", edad=" + edad +
                '}';
    }
}
