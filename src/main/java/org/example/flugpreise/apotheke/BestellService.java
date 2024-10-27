package org.example.flugpreise.apotheke;

import org.example.flugpreise.logistikzentrum.Warenbestand;

import java.util.List;

public interface BestellService {
    public void addWarenkorb(String produkt, int anzahl);
    public void removeWarenkorb(String produkt, int anzahl);
    public void berechneGesamtpreis(List<String> produkte, Warenbestand warenbestand);
    public void berechneStrecke();
    public void bestellungAbschicken();

}
