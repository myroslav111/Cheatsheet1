package org.example.wetterstation;

public class WetterStatisticBearbeiten {

    public static void durchschnittstemperatur(int[][] arrTagUndTemperatur){
        int sum = 0;
        for (int i = 0; i < arrTagUndTemperatur[1].length; i++) {
            sum += arrTagUndTemperatur[1][i];
        }
        System.out.println("Die Durchschnittstemperatur für die zwei Wochen ist " + sum / arrTagUndTemperatur[1].length + " Grad");
    }

    public static int maxTemperatur(int[][] arrTagUndTemperatur){
        int maxTemperatur = 0;
        for (int i = 0; i < arrTagUndTemperatur[1].length; i++) {
            if (arrTagUndTemperatur[1][i] > maxTemperatur) {
                maxTemperatur = arrTagUndTemperatur[1][i];
            }
        }

        System.out.println("Die maximale Temperatur war: " + maxTemperatur + " Grad");
        return maxTemperatur;
    }

    public static int minTemperatur(int[][] arrTagUndTemperatur){
        int minTemperatur = arrTagUndTemperatur[1][0];
        for (int i = 0; i < arrTagUndTemperatur[1].length; i++) {
            if (arrTagUndTemperatur[1][i] < minTemperatur && i > 0) {
                minTemperatur = arrTagUndTemperatur[1][i];
            }
        }

        System.out.println("Die minimale Temperatur war: " + minTemperatur + " Grad");
        return minTemperatur;
    }

    public static void großtenTemperaturumschwung(int minTemp, int maxTemp, int[][] arrTagUndTemperatur){
        int indnexVonTagMinTemp = 0;
        int indexVonTagMaxTemp = 0;
        for (int i = 0; i < arrTagUndTemperatur[1].length; i++) {
            if (minTemp == arrTagUndTemperatur[1][i]) {
                indnexVonTagMinTemp = i;
            }
            if (maxTemp == arrTagUndTemperatur[1][i]) {
                indexVonTagMaxTemp = i;
            }
        }

        System.out.println("Der " + arrTagUndTemperatur[0][indnexVonTagMinTemp] + "e Tag war der kälteste mit " + minTemp + "Grad");
        System.out.println("Der " + arrTagUndTemperatur[0][indexVonTagMaxTemp] + "e Tag war der wärmste mit " + maxTemp + "Grad");
    }

    public static void tabelleTempertaturenErzeugen(int[][] arrTagUndTemperatur){
        String ausziehtTabeleLinks1 = "            |";
        String ausziehtTabeleLinks2 = "             |";
        System.out.println("_____________________________________");
        System.out.println("Die Tabelle der Temperaturstatistiken");
        System.out.println("_____________________________________");

        for (int i = 0; i < arrTagUndTemperatur[0].length; i++) {
            if (i > 8) {
                System.out.println("|         " + arrTagUndTemperatur[0][i] + "    |     " + arrTagUndTemperatur[1][i] + (arrTagUndTemperatur[1][i] > 9 ? ausziehtTabeleLinks1 : ausziehtTabeleLinks2));

            }else {
                System.out.println("|         " + arrTagUndTemperatur[0][i] + "     |     " + arrTagUndTemperatur[1][i] + (arrTagUndTemperatur[1][i] > 9 ? ausziehtTabeleLinks1 : ausziehtTabeleLinks2));
            }


        }
        System.out.println("_____________________________________");
    }
}
