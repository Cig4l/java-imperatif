package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {6, 12, 6};
        boolean isFirstLastEqual = (array.length > 0 && array[0] == array[array.length-1]) ? true : false;
    }
}
