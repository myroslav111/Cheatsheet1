package org.example.flugpreise.logistikzentrum;

import org.example.flugpreise.ProduktList;

import java.util.HashMap;
import java.util.Map;


public class Warenbestand {
    private Map<String, Integer> produkte;

    //konstruktor mithilfe mapInterface
    public Warenbestand() {
        produkte = new HashMap<>();
        produkte.put(ProduktList.IBU.getMedikamenteName(), 3);
        produkte.put(ProduktList.ASPIRIN.getMedikamenteName(), 5);
        produkte.put(ProduktList.PARACETAMOL.getMedikamenteName(), 2);
        produkte.put(ProduktList.VITAMIN_C.getMedikamenteName(), 8);
        produkte.put(ProduktList.VITAMIN_D.getMedikamenteName(), 7);
    }

    // Ausgabe des gesamten Warenbestands
    public  void showWarenBestand(){
        for(Map.Entry<String, Integer> produkt: produkte.entrySet()){
            System.out.println(produkt.getKey() + ": " + produkt.getValue() + " Stück");
        }
    }
    // Ausgabe konkreten Produkt
    public void getProdukte(String productName) {
        if (produkte.containsKey(productName)){
            System.out.println("Momentan im Lager sind " + productName + ": " + produkte.get(productName) + " Stück");
        }
    }

    // set Werte des Produkts
    public void setProdukte(String name, int menge) {
        produkte.put(name, menge);
    }
}
