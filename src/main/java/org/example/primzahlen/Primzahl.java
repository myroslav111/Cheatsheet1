package org.example.primzahlen;

import java.util.ArrayList;
import java.util.Scanner;


 //ein Program, das die ersten n Primzahlen bestimmt und ausgibt.


public class Primzahl {
    static int eingabeNum;

    public static void main(String[] args) {
        ArrayList<Integer> primazhlen = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl. Ich gebe dir Primazahlen");
        eingabeNum = scanner.nextInt();

        for (int i = 2; i < eingabeNum; i++) {
            if (eingabeNum % i != 0) {
                primazhlen.add(i);
            }


        }
        System.out.println(primazhlen);
    }

}
