package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4_linkedlist {
    static void main() {
        LinkedList<String> listaproducto = new LinkedList<>();
        char opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto ");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("x. Salir");
do {
        System.out.print("Selecciona una opcion: ");
         opcion = sc.nextLine().charAt(0);

        System.out.println("------------------------------");

            switch (opcion) {
                case '1':
                    System.out.println("introduzca el producto");
                    String producto = sc.nextLine();
                    listaproducto.offerLast(producto);
                    System.out.println("añadiendo producto al final...");
                    break;
                case '2':
                    listaproducto.pollFirst();
                    System.out.println("eliminando el primer elemento...");
                    break;
                case '3':
                    String producto_ = sc.nextLine();
                    if (!listaproducto.contains(producto_)) {
                        System.out.println("el producto no se encuntra en la lista");

                    } else {
                        listaproducto.remove(producto_);
                    }
                    break;
                case '4':
                    System.out.println("el primer producto es " + listaproducto.peekFirst());

                case '5':
                    String producto_busqueda = sc.nextLine();
                    if (listaproducto.contains(producto_busqueda)) {
                        System.out.println("el producto se encuentra en la lista");
                        System.out.println(listaproducto.indexOf("posicion: "+producto_busqueda)+1);
                    } else {
                        System.out.println("el producto no se encuetra en la lista");
                    }
                    break;
                case '6':
                    System.out.println(" ---- la lista actual -----");
                    for (String mostrar : listaproducto) {
                        System.out.println(mostrar);
                    }

                    break;

                case 'x':
                    System.out.println("saliendo de la app");
                    break;
                default:
                    System.out.println("opcion incorrecta");

            }
        } while (opcion != 'x');
    }
}
