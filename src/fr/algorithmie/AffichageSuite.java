package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        int index = 0;

        for(int i=0; i<10; i++) {
            System.out.println(i+1);
        }

        for(int j = 0; j <=10; j++) {
            if(j %2 == 0){
                System.out.println(j);
            }
        }

        for(int k = 0; k <10; k++) {
            if(k % 2 != 0){
                System.out.println(k);
            }
        }

        while(index < 10) {
            index++;
            System.out.println(index);
        }
        index = 0;

        while(index <= 10) {
            if(index % 2 == 0) {
                System.out.println(index);
            }
            index++;
        }
        index = 0;

        while(index < 10) {
            if(index % 2 != 0) {
                System.out.println(index);
            }
            index++;
        }
    }
}
