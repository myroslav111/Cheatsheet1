package org.example.flugpreise;

public interface BestellService {
    public void addWarenkorb(String produkt, int anzahl);
    public void removeWarenkorb(String produkt, int anzahl);
    public void berechneGesamtpreis();
    public void berechneStrecke();
    public void bestellungAbschicken();

}
