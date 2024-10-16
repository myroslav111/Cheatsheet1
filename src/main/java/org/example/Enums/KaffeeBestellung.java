package org.example.Enums;

/*
5. Schreibe eine Klasse `KaffeeBestellung`, die eine Bestellung eines Kaffees mit Typ und Größe repräsentiert.
 Diese Klasse soll:
    - Den Kaffeetyp und die Größe speichern.
    - Eine Methode `berechnePreis()` enthalten, die den Gesamtpreis auf Basis des Kaffeetyps und der Größe berechnet.
    - Eine Methode `zeigeDetails()`, die die Details der Bestellung (Kaffeetyp, Größe, Preis und Füllmenge)
     auf der Konsole ausgibt.

**Beispielausgabe:**

```plaintext
Bestellung: LATTE (MITTEL)
Preis: 3.50€
Füllmenge: 300ml
*/

public class KaffeeBestellung {
    private String kaffee;
    private int menge;
    private double preis;
    private double aufpreis;
    private String mengeTyp;
    private double gesamtPrise;

    public KaffeeBestellung(Kaffeetypen kaffee, Groesse groesse ) {
        this.kaffee = String.valueOf(kaffee);
        this.menge = groesse.getMenge();
        this.preis = kaffee.getPreis();
        this.aufpreis = groesse.getAufpreis();
        this.mengeTyp = String.valueOf(groesse);
    }

    public void setGesamtPrise() {
        this.gesamtPrise = preis + aufpreis;
    }

    public void berechnePreis(){
        setGesamtPrise();
        System.out.println("Das Prise wurde berechnet.");
    }

    public void zeigeDetails(){
        System.out.println("Bestellung: " + kaffee + " " + "(" + mengeTyp + ")");
        System.out.println("Preis: " + gesamtPrise + "Euro");
        System.out.println("Füllmenge: " + menge + "ml");
    }


}
