package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;;
        int arraysSumLength;

        if(array1.length >= array2.length) {
            arraysSumLength = array1.length;
        } else {
            arraysSumLength = array2.length;
        }

        int[] arraysSum = new int[arraysSumLength];

        for(int i=0; i<arraysSumLength; i++) {
            if(array1.length > i && array2.length > i){
                arraysSum[i] = array1[i] + array2[i];
            } else if(array1.length > i ) {
                arraysSum[i] = array1[i];
            } else {
                arraysSum[i] = array2[i];
            }
        }
    }
}
