package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        double res = 0.0;

        for(int i : array) {
            res+=i;
        }
        res /= array.length;
        System.out.println("La moyenne des éléments du tableau est de " + String.format("%.1f", res));
    }
}
