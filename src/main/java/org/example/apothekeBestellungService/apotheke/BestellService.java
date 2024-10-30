package org.example.apothekeBestellungService.apotheke;

import org.example.apothekeBestellungService.logistikzentrum.Warenbestand;
import org.example.apothekeBestellungService.utils.AnzeigenBeleg;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface BestellService {
    public void addWarenkorb(String produkt, int anzahl);
    public void removeWarenkorb(String produkt, int anzahl);
    public void berechneGesamtpreis(Map<String, Integer> produktList, Warenbestand warenbestand);
    public void berechneStrecke();
    public void bestellungAbschicken();

}
