package org.example;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class prueba_steams {
    public static void main(String[] args) {

        List<String> felinos = Stream.of("gatos","leones","tigre","Guepardos")
                .filter(felino -> felino.endsWith("s"))
                .filter(felino -> felino.contains("e"))
                .map(String::toUpperCase)
                .map(String::toUpperCase)
                .anyMatch(String felinos -> felinos.equals("jirafas"))
                .toList();

        System.out.println(felinos);
    }
}