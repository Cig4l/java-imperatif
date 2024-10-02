package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for(int i : array) {
            System.out.println(i);
        }

        for(int j=1; j<array.length+1; j++) {
            System.out.println(array[array.length-j]);
        }

        for(int k : array) {
            if(k > 3){
                System.out.println(k);
            }
        }

        for(int l : array) {
            if(l%2 == 0) {
                System.out.println(l);
            }
        }

        for(int m=0; m<array.length; m++) {
            if(m%2 == 0){
                System.out.println(array[m]);
            }
        }

        for(int n : array) {
            if(n%2 != 0){
                System.out.println(n);
            }
        }
    }
}
