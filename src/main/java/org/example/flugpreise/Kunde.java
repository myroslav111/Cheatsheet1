package org.example.flugpreise;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kunde {
    private int kundennummer;
    private String name;
    private String vorname;
    public String adresse;
    public String email;
    public String passwort;

}
