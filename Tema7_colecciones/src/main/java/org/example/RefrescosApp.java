package org.example;

public class RefrescosApp {
    static void main() {
        Refrescos_colecciones fanta = new Refrescos_colecciones("fana", 0.50);
        Refrescos_colecciones cola = new Refrescos_colecciones("fana",0.50);
        System.out.println(fanta.hashCode());
        System.out.println(cola.hashCode());

        if (cola.equals(fanta)){
            System.out.println("son iguales");
        }
    }
}