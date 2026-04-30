package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    static void main() {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/resources/nombre1.txt"));
            escritor.write("holaaaa");
            escritor.newLine();
            escritor.write("ciento y pico de venas en alc***");

            escritor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
