package org.example.wetterstation;
/*
    Speichere die folgende Tabelle mit einem geeigneten Datentyp.
    Schreibe ein Programm, welches die Durchschnittstemperatur für die zwei Wochen bestimmt.
    Schreibe ein Programm, welches die maximale und minimale Temperatur ausgibt.
    Schreibe ein Programm, welches die beiden aufeinanderfolgenden Tage angeben kann, an denen es den größten Temperaturumschwung gab.
    Schreibe ein Programm, welches die Tabelle schön tabellarisch auf der Konsole ausgibt.
*/

public class Wetterstation {
    public static void main(String[] args) {
        int[] arrTemperatur = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};
        int[] arrDate = {1, 2, 3, 4, 5,  6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[][] arrTagUndTemperatur = new int[2][];

        WetterStatisticBearbeiten wetterStatisticBearbeiten = new WetterStatisticBearbeiten();

        arrTagUndTemperatur[0] = arrDate;
        arrTagUndTemperatur[1] = arrTemperatur;

        wetterStatisticBearbeiten.durchschnittstemperatur(arrTagUndTemperatur);
        wetterStatisticBearbeiten.maxTemperatur(arrTagUndTemperatur);
        wetterStatisticBearbeiten.minTemperatur(arrTagUndTemperatur);
        wetterStatisticBearbeiten.großtenTemperaturumschwung(wetterStatisticBearbeiten.minTemperatur(arrTagUndTemperatur),
                wetterStatisticBearbeiten.maxTemperatur(arrTagUndTemperatur),
                arrTagUndTemperatur);
        wetterStatisticBearbeiten.tabelleTempertaturenErzeugen(arrTagUndTemperatur);


        }


    }








