package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        int lastElement = array[array.length-1];

        for(int i = 0; i<array.length-1; i++) {
            array[array.length-1-i] = array[array.length-i-2];
        }
        array[0] = 3;

        for(int j : array) {
            System.out.println(j);
        }
    }
}
