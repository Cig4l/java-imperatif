package fr.algorithmie;

import java.sql.SQLOutput;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int[array.length];

        System.out.println("array");
        for(int i : array) {
            System.out.println(i);
        }

        System.out.println("\narrayCopy : tous les éléments d'array dans l'ordre inverse");
        for(int j = 0; j <array.length; j++) {
            arrayCopy[j] = array[array.length- j -1];
            System.out.println(arrayCopy[j]);
        }
    }
}
