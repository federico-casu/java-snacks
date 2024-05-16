package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secondsIn;
        int hours;
        int minutes;
        int seconds;

        System.out.println("Inserisci i secondi: ");
        secondsIn = Integer.parseInt(scanner.nextLine());

        hours = (secondsIn / 60) / 60;
        minutes = (secondsIn / 60) % 60;
        seconds = secondsIn % 60;

        System.out.printf("I secondi inseriti corrispondono a %02d:%02d:%02d", hours, minutes, seconds);

        scanner.close();
    }
}
