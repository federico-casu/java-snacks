package org.lessons.java;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int choice;
        int letters = 0;
        int digits = 0;
        int symbols = 0;

        do {
            System.out.println("Menu");
            System.out.println("1 - Analizza stringa");
            System.out.println("0 - Esci");
            System.out.print("Inserisci il numero corrispondente alla tua scelta: ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Inserisci una stringa: ");
                string = scanner.nextLine();

                for (int i = 0; i < string.length(); i++) {
                    if (isLetter(string.charAt(i))){
                        letters++;
                    } else if (isDigit(string.charAt(i))) {
                        digits++;
                    } else {
                        symbols++;
                    }
                }

                System.out.printf("La stringa inserita contiene %d lettere, %d numeri e %d simboli%n", letters, digits, symbols);

                letters = 0;
                digits = 0;
                symbols = 0;
            }
        } while (choice != 0);

        scanner.close();
    }
}
