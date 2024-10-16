package org.example.Enums;
/*
**Übungsaufgabe: Enums in Java**

        **Aufgabenstellung:**
Du arbeitest für ein Unternehmen, das ein Bestellsystem für ein Café entwickeln möchte.
* Ein Teil dieses Systems soll die verschiedenen Kaffeetypen und deren Größen verwalten.
* Du sollst dafür ein Enum erstellen, das die Kaffeetypen und Größen repräsentiert und zusätzliche Informationen wie Preis und Füllmenge enthält.

**Aufgabe:**

1. Erstelle ein Enum `KaffeeTyp`, das folgende Kaffeetypen enthält:
    - ESPRESSO
    - LATTE
    - CAPPUCCINO
    - AMERICANO

2. Jeder Kaffeetyp soll einen Standardpreis und eine Standardfüllmenge (in Millilitern) haben.
*  Diese Informationen sollen über den Konstruktor des Enums gesetzt werden.

3. Erstelle ein Enum `Groesse`, das folgende Größen für den Kaffee enthält:
    - KLEIN
    - MITTEL
    - GROSS


*/
public enum Kaffeetypen {
    ESPRESSO(1.05, 100),
    LATTE(2.0, 100),
    CAPPUCCINO(1.6, 100),
    AMERICANO(1.8, 100);

    final double preis;
    final int menge;

    Kaffeetypen(double preis, int menge) {
        this.preis = preis;
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public int getMenge() {
        return menge;
    }
}
