package org.example.democracy;

public class DemocracyV2 {

    public static void main(String[] args) {
        String[] names = new String[5];
        int[] ages = new int[5];

        generateNamesAndAges(names, ages);

        System.out.println(whosTheOldest(names, ages));
    }

    private static void generateNamesAndAges(String[] names, int[] ages) {
        names[0] = "Angela";
        ages[0] =  52;

        names[1] = "Kurt";
        ages[1] = 58;

        names[2] = "Lothar";
        ages[2] = 66;

        names[3] = "Doppelspitze Claudia und Reinhard";
        ages[3] = 51 + 54;

        names[4] = "Guido";
        ages[4] = 45;

    }

    private static String whosTheOldest(String[] names, int[] ages) {
        int oldest = 0;
        int indexOfOldest = 0;
        for(int i = 0; i <= 4; i++) {
            if ( oldest < ages[i] ) {
                oldest = ages[i];
                indexOfOldest = i;
            }

        }

        return "Oldest and wisest person is " + names[indexOfOldest] + " with an age of " + ages[indexOfOldest]  + ".";
    }
}
