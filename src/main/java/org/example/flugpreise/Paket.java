package org.example.flugpreise;

import lombok.Getter;

import java.util.List;

@Getter
public class Paket {
    private int paketnummere;
    private double gewicht;
    private String zielAdresse;
    private boolean zugestellt;
    List<String> paketinhalt;

    public Paket(int paketnummere, double gewicht, String zielAdresse, boolean zugestellt, List<String> paketinhalt) {
        this.paketnummere = paketnummere;
        this.gewicht = gewicht;
        this.zielAdresse = zielAdresse;
        this.zugestellt = false;
        this.paketinhalt = paketinhalt;
    }

    public void addWaren(){

    }

    public void clearWaren(){

    }
}
