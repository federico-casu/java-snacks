package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        String  string = scanner.nextLine();

        char[] newString = new char[string.length()];

        for (int i = string.length()-1; i >= 0; i--) {
            newString[newString.length-(i+1)] = string.charAt(i);
        }

        if (string.equals(String.valueOf(newString))) {
            System.out.println("La parola é palindroma");
        } else {
            System.out.println("La parola non é palindroma");
        }

        scanner.close();
    }
}
