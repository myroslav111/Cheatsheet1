package org.example.arreyList;

/*
 * Aufgabe: "Zahlen zur Liste hinzufügen und sortieren"
 * Schreibe ein Java-Programm, das:
 * Eine ArrayList von Integer erstellt mit den Zahlen: { 25, 89, 12, 45, 78, 34, 56, 90, 23, 67 }
 * Die Liste aufsteigend sortiert und in der Konsole ausgibt.
 *
 * Zusatz-1: Der Benutzer soll Zahlen vor der Sortierung hinzufügen können.
 * Zusatz-2: Der Benutzer soll entscheiden können, ob die Liste aufsteigend oder absteigend sortiert werden soll.
 * Zusatz-3: Der Benutzer soll nach Ausgabe der Liste Zahlen entfernen können.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message0 = "Fügen Sie Zahlen hinzu";
        String message1 = "Möchten Sie eine weitere Zahlen hinzufügen?";
        String message2 = "Wollen Sie Ihre Liste sortieren?";
        String message3 = "Aufsteigend (y) oder absteigend (n)?";
        String message4 = "Wollen Sie aus der Liste Zahlen entfernen?";
        String message5 = "Geben Sie Zahl, die Sie enfernen wollen?";
        String message6 = "Möchten Sei fortfahren?";
        int[] arr = {25, 89, 12, 45, 78, 34, 56, 90, 23, 67};
        ArrayVerarbeitung arrayVerarbeitung = new ArrayVerarbeitung();
        Benutzerumfrage benutzerumfrage = new Benutzerumfrage();

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        arrayVerarbeitung.addElementsIntoArrayList(arrayInt, arr);


        do {
            System.out.println(arrayInt);
            System.out.println("Wählen Sie, was Sie tun möchten");
            System.out.println("Zahlen hinzufügen (1)");
            System.out.println("Liste sortieren (2)");
            System.out.println("Zahlen entfernen (3)");
            int auswahlMenu = scanner.nextInt();
            switch (auswahlMenu){
                case 1:
                    do {
                        System.out.println(message0);
                        arrayVerarbeitung.zahlHinzufugen(arrayInt, scanner);

                    } while (benutzerumfrage.ausgabeJaOderNein(scanner, message1));
                    break;

                case 2:
                    if (benutzerumfrage.ausgabeJaOderNein(scanner, message2)) {
                        if (benutzerumfrage.ausgabeJaOderNein(scanner, message3)) {
                            arrayVerarbeitung.sortiruhngNachOben(arrayInt);
                        }else {
                            arrayVerarbeitung.sortiruhngNachUnten(arrayInt);
                        }

                    }
                    break;

                case 3:

                    if (benutzerumfrage.ausgabeJaOderNein(scanner, message4)) {

                        do {
                            System.out.println(message5);
                            arrayVerarbeitung.removeElementsFromArrayList(arrayInt, scanner);
                        }while (benutzerumfrage.ausgabeJaOderNein(scanner, message4));

                    }
                    break;

                default:
                    System.out.println("Sie haben nichts gewählt");
            }

        }while (benutzerumfrage.ausgabeJaOderNein(scanner, message6));

        System.out.println("Tschüss!");

    }

}
