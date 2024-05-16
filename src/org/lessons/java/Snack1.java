package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Inserisci un numero: ");
        n = Integer.parseInt(scanner.nextLine());

        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(n+1);
        }

        scanner.close();
    }
}
