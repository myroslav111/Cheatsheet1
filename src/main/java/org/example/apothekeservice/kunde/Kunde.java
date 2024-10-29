package org.example.apothekeservice.kunde;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kunde {
    private int kundennummer;
    private String name;
    private String vorname;
    private String adresse;
    private String email;
    private String passwort;

    public Kunde(int kundennummer, String name, String vorname, String adresse, String email, String passwort) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.email = email;
        this.passwort = passwort;
    }


}
