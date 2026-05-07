import java.io.*;

public class NasaApp {

    public static void main(String[] args) {

        Nave artemis = new Nave("Artemis", 2000, 10000);

        try {

            // ESCRIBIR OBJETO
            ObjectOutputStream nave = new ObjectOutputStream(new FileOutputStream("artemis.ser"));

            nave.writeObject(artemis);

            nave.close();

            // LEER OBJETO
            ObjectInputStream deserealizado = new ObjectInputStream(new FileInputStream("artemis.ser"));

            Nave nave_sorpresa = (Nave) deserealizado.readObject();

            deserealizado.close();

            System.out.println(nave_sorpresa.getNomnbre()+" "+nave_sorpresa.getPeso()+" "+nave_sorpresa.getVelocidad());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}