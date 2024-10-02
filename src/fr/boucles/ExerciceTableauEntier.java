package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] integerArray = new int[10];

        for(int i = 0; i<10; i++){
            integerArray[i] = i+1;
        }

        System.out.println(integerArray[0]);
        System.out.println(integerArray.length);
        System.out.println(integerArray[integerArray.length-1]);

        integerArray[4] = 8;
    }
}
