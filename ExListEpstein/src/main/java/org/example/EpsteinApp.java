package org.example;

import java.util.*;

public class EpsteinApp {
   static List<Famoso> listaEpstein = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static void main() {
        EntradaDatos.generarDatos();
    }

    public void procesardatos(){

    }

    public void nuevofamoso(){
        System.out.println("nombre");
        String nombre = sc.nextLine();
        System.out.println("pais");
        String pais = sc.nextLine();
        System.out.println("profesion");
        String profesion = sc.nextLine();
        System.out.println("edad");
        int edad = sc.nextInt();

        listaEpstein.add(new Famoso(nombre,pais,profesion,edad));
        System.out.println("Famoso insertado correctamente");


    }

    public void buscarfamoso(){
        System.out.println("nombre");
        String nombre = sc.nextLine();
        System.out.println("pais");
        String pais = sc.nextLine();
        System.out.println("profesion");
        String profesion = sc.nextLine();
        System.out.println("edad");
        int edad = sc.nextInt();

        if(listaEpstein.contains(new Famoso(nombre,pais,profesion,edad))){
            System.out.println("el famoso ha ido a la fiesta");
        }else {
            System.out.println("no ha ido a ninguna fiesta");
        }
    }

    public void eliminarMenores() {
        Iterator<Famoso> it = listaEpstein.iterator();

        while (it.hasNext()){
            Famoso it_ = it.next();
            it.remove();

            System.out.println(it_.getNombre()+ " fulminado");
        }
    }

    public Estadistica generarEstadistica(){
return null;
    }


}
