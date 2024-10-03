package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        System.out.println("Entiers supérieurs à 3");
        for(int i : array) {
            if(i > 3) {
                System.out.println(i);
            }
        }
        System.out.println("\nEntiers pairs");
        for(int j : array) {
            if(j%2 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("\nValeurs correspondant aux index pairs");
        for(int k = 0; k<array.length; k++) {
            if(k%2 == 0) {
                System.out.println(array[k]);
            }
        }

        System.out.println("\nEntiers impairs");
        for(int l : array) {
            if(l %2 != 0) {
                System.out.println(l);
            }
        }
    }
}
