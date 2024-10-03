package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for (int i : array) {
            System.out.println(i);
        }

        for(int j = 0; j<array.length; j++) {
            System.out.println(array[array.length-j-1]);
        }

        int[] arrayCopy = new int [array.length];
        for(int k=0; k<arrayCopy.length; k++) {
            arrayCopy[k] = array[k];
        }
    }
}
