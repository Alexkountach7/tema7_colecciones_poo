package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIchistes {

        public static void main(String[] args) {

            try {

                String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd,eur";

                URL url = new URL(apiUrl);
                HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
                conexion.setRequestMethod("GET");

                BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
                StringBuilder json = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    json.append(line);
                }
                in.close();

                Gson gson = new Gson();
                Chistes chiste = gson.fromJson(json.toString(), Chistes.class);

                System.out.println("Bitcoin:");
                System.out.println(chiste.bitcoin);

            } catch (Exception e) {
                System.out.println("Algo ha ido mal.");
                e.printStackTrace();
            }

        }
    }

