package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for(int i : array) {
            if(i > 3) {
                System.out.println(i);
            }
        }

        for(int j : array) {
            if(j%2 == 0) {
                System.out.println(j);
            }
        }

        for(int k = 0; k<array.length; k++) {
            if(k%2 == 0) {
                System.out.println(array[k]);
            }
        }

        for(int l : array) {
            if(l %2 != 0) {
                System.out.println(l);
            }
        }
    }
}
