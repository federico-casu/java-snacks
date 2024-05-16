package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberString;
        int number = 0;

        System.out.println("Inserisci un numero: ");
        numberString = scanner.nextLine();

        for (int i = numberString.length()-1; i >= 0 ; i--) {
            int multiplier = (int)Math.pow(10, (numberString.length()-i-1));
            switch (numberString.charAt(i)) {
                case '0':
                    number += (0);
                    break;
                case '1':
                    number += multiplier;
                    break;
                case '2':
                    number += (2 * multiplier);
                    break;
                case '3':
                    number += (3 * multiplier);
                    break;
                case '4':
                    number += (4 * multiplier);
                    break;
                case '5':
                    number += (5 * multiplier);
                    break;
                case '6':
                    number += (6 * multiplier);
                    break;
                case '7':
                    number += (7 * multiplier);
                    break;
                case '8':
                    number += (8 * multiplier);
                    break;
                case '9':
                    number += (9 * multiplier);
                    break;
            }
        }

        System.out.println("Il numero inserito come stringa é: " + number);

        scanner.close();
    }
}
