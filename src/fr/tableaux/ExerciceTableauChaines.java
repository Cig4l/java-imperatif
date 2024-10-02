package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] cities = {"Osaka", "Kobe", "Kyoto", "Hiroshima", "Tokyo"};

        for(int i=0; i<cities.length; i++) {
            System.out.println(cities[i]);
        }

        System.out.println(cities.length);

        cities[3] = "Reims";
        System.out.println(cities[3]);

        for(int i=0; i<cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
