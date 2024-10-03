package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {0, 12, 6};
        boolean isFirstLast6 = (array.length > 0 && array[0] == 6 || array[array.length-1] == 6) ? true : false;
    }
}
