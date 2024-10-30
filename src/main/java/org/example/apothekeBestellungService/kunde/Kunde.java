package org.example.apothekeBestellungService.kunde;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kunde {
    public int kundennummer;
    public String name;
    public String vorname;
    public String adresse;
    public String email;
    public String passwort;

    public Kunde(int kundennummer, String name, String vorname, String adresse, String email, String passwort) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.email = email;
        this.passwort = passwort;
    }
}
