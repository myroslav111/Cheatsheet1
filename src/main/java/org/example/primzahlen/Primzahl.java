package org.example.primzahlen;

import java.util.ArrayList;
import java.util.Scanner;


 //ein Program, das die ersten n Primzahlen bestimmt und ausgibt.
 //Als Primzahlen bezeichnet man alle natürlichen Zahlen, die nur durch sich selbst und die Zahl Eins teilbar sind.
// Also zum Beispiel 2, 3, 5, 7, 11, 13, usw. Die 1 ist per Definition keine Primzahl.
//        25 / 2 = 12 Rest 1
//        25 / 3 = 8 Rest 1
//        25 / 4 = 6 Rest 1
//        25 / 5 = 5 Rest 0 -> 25 ist keine Primzahl



public class Primzahl {
    static int eingabeNum;

    public static void main(String[] args) {
        ArrayList<Integer> primzahlen = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl. Ich gebe dir Primazahlen");
        eingabeNum = scanner.nextInt();

        for (int i = 2; i < eingabeNum; i++) {
            if (eingabeNum % i == 0) {
                System.out.println(eingabeNum % i + "" + i);
                primzahlen.add(i);
            }


        }
        System.out.println(primzahlen);
    }

}
