package org.example.Enums;
/*
Jede Größe soll einen Aufpreis gegenüber dem Basispreis des Kaffees haben:
    - KLEIN: kein Aufpreis
    - MITTEL: 0.50€
    - GROSS: 1.00€
*/
public enum Groesse {
    KLEIN(0.00,100 ),
    MITTEL(0.50, 200),
    GROSS(1.0, 300);

    final double aufpreis;
    final int menge;

    Groesse(double aufpreis,int menge) {
        this.aufpreis = aufpreis;
        this.menge = menge;
    }

    public double getAufpreis() {
        return aufpreis;
    }

    public int getMenge() {
        return menge;
    }
}
