package org.example.zweierprotenzen;

import java.util.Arrays;

public class Zweierprotenzen {

    static void zweierpotenzen(int basis, int exponent){
        int[] ergebnis = new int[exponent];

        for (int i = 0; i < exponent; i++) {
            ergebnis[i] = basis * i;
        }
        System.out.println(Arrays.toString(ergebnis));
    }
    public static void main(String[] args) {

        zweierpotenzen(2, 20);
    }
}
