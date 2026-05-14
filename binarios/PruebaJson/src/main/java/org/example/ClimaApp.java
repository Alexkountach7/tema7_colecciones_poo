package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClimaApp {

    public static void main(String[] args) {

        try {

            String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=38.41921088667074&longitude=-0.4464988854601825&current_weather=true";

            URL url = new URL(apiUrl);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conexion.getInputStream())
            );

            StringBuilder json = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                json.append(line);
            }

            in.close();

            Gson gson = new Gson();

            Clima clima_mutxamel = gson.fromJson(json.toString(), Clima.class);

            System.out.println("Clima en Mutxamel:");
            System.out.println("Latitud: " + clima_mutxamel.latitude);
            System.out.println("Longitud: " + clima_mutxamel.longitude);
            System.out.println("Zona horaria: " + clima_mutxamel.timezone);
            System.out.println("UTC Offset: " + clima_mutxamel.utc_offset_seconds);

        } catch (Exception e) {

            System.out.println("Algo ha ido mal.");
            e.printStackTrace();

        }

    }

}