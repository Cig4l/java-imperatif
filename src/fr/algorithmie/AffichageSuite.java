package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        int index = 0;

        System.out.println("Nombres de 1 à 10 ");
        for(int i=0; i<10; i++) {
            System.out.println(i+1);
        }

        System.out.println("\nNombres pairs de 0 à 10 ");
        for(int j = 0; j <=10; j++) {
            if(j %2 == 0){
                System.out.println(j);
            }
        }

        System.out.println("\nNombres impairs de 0 à 9 ");
        for(int k = 0; k <10; k++) {
            if(k % 2 != 0){
                System.out.println(k);
            }
        }

        System.out.println("\nNombres de 1 à 10 ");
        while(index < 10) {
            index++;
            System.out.println(index);
        }
        index = 0;

        System.out.println("\nNombres pairs de 0 à 10 ");
        while(index <= 10) {
            if(index % 2 == 0) {
                System.out.println(index);
            }
            index++;
        }
        index = 0;

        System.out.println("\nNombres impairs de 0 à 9 ");
        while(index < 10) {
            if(index % 2 != 0) {
                System.out.println(index);
            }
            index++;
        }
    }
}
