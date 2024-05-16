package org.lessons.java;

import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(11);
            System.out.print(numbers[i] + " ");
        }

        for (int i = 1; i < numbers.length; i = i+2) {
            sum += numbers[i];
        }

        System.out.println();
        System.out.println("Somma numeri in posizione dispari: " + sum);

    }
}
