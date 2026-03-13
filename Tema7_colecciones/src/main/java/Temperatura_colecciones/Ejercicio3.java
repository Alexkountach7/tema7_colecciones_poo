package Temperatura_colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    static HashMap<String, Double> mapa = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static void main() {
        System.out.println("**** registro de temperaturas *****");
        while(true) {
            System.out.println("Eligir una opcion [insertar,consultar, ver todas, salir]:");
            String opcion = sc.nextLine();


            switch (opcion) {
                case "insertar":
                    System.out.println("introduce los nuevos datos(ciudad/temperatura");
                    String datos[] = sc.nextLine().split("/");
                    mapa.put(datos[0],Double.valueOf(datos[1]));
                    insertar();
                    break;

                case "actualizar":
                    System.out.println("introduce la ciudad a actualizar");
                    String ciudad = sc.nextLine();
                    if (mapa.containsKey(ciudad)){
                        System.out.println("introduce la nueva temperatura");
                        Double temp= sc.nextDouble();
                        mapa.put(ciudad,temp);
                    }else {
                        System.out.println("la ciudad no existe");
                    }
                    actualizar();
                    break;

                case "consultar":
                    System.out.println("que ciudad queires consultar");
                    String ciudad_ = sc.nextLine();
                    System.out.println(mapa.get(ciudad_));
                    consultar();
                    break;

                case "vertodas":
                    for (Map.Entry<String, Double> mapita : mapa.entrySet()){
                        System.out.println(mapita.getKey());
                    }
                    vertodas();
                    break;

                case "salir":
                    System.out.println("saliendo de la app");
                    break;
                default:
                    System.out.println("la opcion no existe");

            }
            for (Map.Entry<String, Double> mapita : mapa.entrySet()){
                System.out.print(mapita.getKey() + "---->" +mapita.getValue()+ "º");
            }

        }


    }
    public static void insertar(){

    }

    public static void actualizar(){

    }

    public static void vertodas(){

    }

    public static void consultar(){

    }
}
