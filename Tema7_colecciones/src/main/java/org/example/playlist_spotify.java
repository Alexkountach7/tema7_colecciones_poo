package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class playlist_spotify {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Queue<String> playlist = new LinkedList<>();

        while (true) {
            System.out.println("introduce canciones en la playlist");
            String canciones = sc.nextLine();
            playlist.offer(canciones);


        }

    }
}
