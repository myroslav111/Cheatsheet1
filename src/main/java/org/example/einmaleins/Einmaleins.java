package org.example.einmaleins;

public class Einmaleins {
    public static void main(String[] args) {

        int[] zahl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 1; i < zahl.length + 1; i++) {
            for (int j = 0; j < zahl.length; j++) {
                System.out.println(i + " * " + zahl[j] + " = " + (i * zahl[j]));
            }
        }

    }
}
