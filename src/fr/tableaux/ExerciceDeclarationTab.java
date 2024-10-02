package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] integerArray = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(integerArray[0]);
        System.out.println(integerArray.length);
        System.out.println(integerArray[integerArray.length-1]);
        // System.out.println(integerArray[10]); // ne marche pas car la length de l'index est de 8
    }
}
