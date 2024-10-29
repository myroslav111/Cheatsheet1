package org.example.apothekeservice.paket;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Paket {
    private final String paketnummer;
    private final double gewicht;
    private final String zielAdresse;
    private boolean zugestellt = false;
    private final List<String> paketinhalt = new ArrayList<>();



    public Paket(String paketnummer, double gewicht, String zielAdresse) {
        this.paketnummer = paketnummer;
        this.gewicht = gewicht;
        this.zielAdresse = zielAdresse;
    }

    public void addWaren(String ware) {
        paketinhalt.add(ware);
    }

    public void clearWaren() {
        paketinhalt.clear();
    }

}
