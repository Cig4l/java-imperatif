package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int res = array[0];

        for(int i : array) {
            if(i > res) {
                res = i;
            }
        }
        System.out.println("Le plus grand élément du tableau est " + res);
    }
}
