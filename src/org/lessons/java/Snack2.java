package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] list = new String[10]; // dichiaro e inizializzo un array di 10 stringhe
        // dichiaro e inizializzo un array di 10 nomi
        String[] names = { "Mario", "Luigi", "Giovanni", "Anna", "Maria", "Francesco", "Giulia", "Alessandro", "Roberta", "Paolo" };
        // dichiaro e inizializzo un array di 10 cognomi
        String[] surnames = { "Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Costa", "Fontana" };
        int randName = new Random().nextInt(0, list.length); // dichiaro e inizializzo un indice randomico per i nomi
        int randSurname = new Random().nextInt(0, list.length); // dichiaro e inizializzo un indice randomico per i cognomi

        System.out.println("Lista degli ospiti:");

        // ciclo la lista degli ospiti
        for (int i = 0; i < list.length; i++) {
            // stampo nome e cognome casuali dell'ospite
            System.out.println(names[randName] + " " + surnames[randSurname]);
            names[randName] = null; // setto a null il nome estratto
            surnames[randSurname] = null; // setto a null il cognome estratto

            // genero nuovi indici casuali per nome e cognome fintanto che non vengono generati indici corrispondenti a elementi non nulli
            do {
                randName = new Random().nextInt(0, list.length);
            } while (names[randName] == null);

            do {
                randSurname = new Random().nextInt(0, list.length);
            } while (surnames[randSurname] == null);

        }
    }
}
