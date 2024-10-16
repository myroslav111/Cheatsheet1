package org.example.Enums;

/*
4. Jede Größe soll einen Aufpreis gegenüber dem Basispreis des Kaffees haben:
    - KLEIN: kein Aufpreis
    - MITTEL: 0.50€
    - GROSS: 1.00€
*/

import java.util.Timer;

public class Main {
    Timer timer = new Timer();
    public static void main(String[] args) {
        Kaffeetypen kaffee = Kaffeetypen.ESPRESSO;
        Groesse groesse = Groesse.GROSS;
        KaffeeBestellung kaffeeBestellung = new KaffeeBestellung(kaffee, groesse);

        kaffeeBestellung.berechnePreis();
        kaffeeBestellung.zeigeDetails();







    }
}
