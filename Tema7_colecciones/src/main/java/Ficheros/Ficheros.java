package Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros {
    static Scanner sc = new Scanner(System.in);

    public  void generararchivos(){

            System.out.println("introducir numero de archivos");
            int numero = sc.nextInt();
            System.out.println("lugar");
            String lugar = sc.nextLine();
        for (int i =0; i<numero; i++){
            File archivo = new File(lugar +"/nombre"+i+".txt"); 
            try {
                if (archivo.createNewFile()){
                    System.out.println("perfecto archivo"+archivo.getName());
                }else {
                    System.out.println("archivo no creado");
                }
            }catch (IOException e){
                e.printStackTrace();
            }


        }
    }
    static void main() {
        File archivo = new File("src/main/resources/aprobados.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("archivo creado");
            }else {
                System.out.println("no se ha creado el archivo");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println(archivo.getName());

        System.out.println(archivo.length());
        System.out.println(archivo.getAbsolutePath());

//        if (archivo.exists()){
//            archivo.delete();
//        }

        File carpeta = new File("src/main/resources/archivos");

        carpeta.mkdir();
        if (carpeta.mkdir()){
            System.out.println("carpeta creado");

        }else {
            System.out.println("la carpeta no se ha creado");
        }




    }
}
