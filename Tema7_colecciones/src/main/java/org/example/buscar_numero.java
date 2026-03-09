package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class buscar_numero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Collection <Integer> listanumero = new ArrayList<>();

        listanumero.add(5);
        listanumero.add(10);
        listanumero.add(15);
        listanumero.add(20);
        listanumero.add(25);

        System.out.println("introduce un numero");
        int numero = sc.nextInt();


        if (listanumero.contains(numero)){
            System.out.println("el numero esta en la coleccion");
        }else {
            System.out.println("el numero no esta en la coleccion");
        }
    }
}
