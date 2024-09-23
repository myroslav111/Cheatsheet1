package org.example.glücksspiel;


import java.util.Scanner;

public class Main {
    static int randomNum = (int)(Math.random() * 101);

    static void resultDesSpiels(int spieler1, int spieler2){
        int abstandtErstenSpieler = Math.abs(spieler1 - randomNum);
        int abstandtZweitenSpieler = Math.abs(spieler2 - randomNum);

        if (abstandtZweitenSpieler > abstandtErstenSpieler) {
            System.out.println("Die Nummer war: " + randomNum + " Spieler1 hat gewonnen!");
        }else if (abstandtZweitenSpieler < abstandtErstenSpieler){
            System.out.println("Die Nummer war: " + randomNum + " Spieler2 hat gewonnen!");
        }else {
            System.out.println( "Die Nummer war: " + randomNum + " gibt es ein Unentschieden!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person(20, "Viki", 'w');
        Person person2 = new Person(16, "Vlada", 'w');
        Person person3 = new Person(43, "Andre", 'm');

//        person1.begrüßungPerson();
//        person2.begrüßungPerson();
//        person3.begrüßungPerson();

        int spielerNum1;
        int spielerNum2;


        System.out.println("Das Glücksspirl");

        do {
            System.out.println("Hi Spieler 1, gib eine Zahle von 1 bis 100 an.");
            spielerNum1 = scanner.nextInt();
        } while (spielerNum1 > 100 || spielerNum1 < 1);


        do {
            System.out.println("Hi Spieler 2, gib eine Zahle von 1 bis 100 an.");
            spielerNum2 = scanner.nextInt();
        } while (spielerNum2 > 100 || spielerNum2 < 1);



        resultDesSpiels(spielerNum1, spielerNum2);











    }
}
