package org.example.apothekeservice.apotheke;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    public List<String> produkte = new ArrayList<>();

    //  Fügt ein Produkt mit einer bestimmten Menge zum Warenkorb hinzu.
    public void addProduct(String produkt) {
        produkte.add(produkt);
    }

    // Löscht alle Produkte aus dem Warenkorb.
    public void clearProducts() {
        produkte.clear();
    }

    // Gibt eine Übersicht über die Produkte im Warenkorb aus.
    // System.out::println ist eine Method-Referenz, die für jedes Element
    // in der Liste aufgerufen wird und das jeweilige Produkt auf der Konsole ausgibt.
    public void showWarenkorb() {
        produkte.forEach(System.out::println);
    }


}
