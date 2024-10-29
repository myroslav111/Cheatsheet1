package org.example.apothekeservice.apotheke;



import org.example.apothekeservice.logistikzentrum.Warenbestand;

import java.util.List;

public interface BestellService {
    void addWarenkorb(String produkt, int anzahl);
    void removeWarenkorb(String produkt, int anzahl);
    double berechneGesamtpreis();
    void berechneStrecke();
    void bestellungAbschicken();
    double berechnePreisProdukte(List<String> produkte, Warenbestand warenbestand);

}
