package org.example.apothekeservice;

import org.example.apothekeservice.apotheke.Apotheke;
import org.example.apothekeservice.apotheke.Warenkorb;
import org.example.apothekeservice.kunde.Kunde;
import org.example.apothekeservice.logistikzentrum.Logistikzentrum;
import org.example.apothekeservice.logistikzentrum.Warenbestand;
import org.example.apothekeservice.utils.UserAnfrage;

public class Main {
    public static void main(String[] args) {

        Apotheke apotheke = new Apotheke();
        Logistikzentrum logistikzentrum = new Logistikzentrum();
        Warenkorb warenkorb = new Warenkorb();
        Warenbestand warenbestand = new Warenbestand();
        UserAnfrage userAnfrage = new UserAnfrage();

        Kunde kunde = new Kunde(1, "Doe", "John", "Street 123", "john.com", "password123");


        UserAnfrage.userAnfrageMailPsw();
        // Anmeldeversuch
        if (apotheke.login(kunde, "john.com", "password123")) {
            apotheke.bestellungAufgeben(warenbestand, warenkorb);


            double gesamtpreis = apotheke.berechnePreisProdukte( warenkorb.produkte, warenbestand);
            System.out.println("Gesamtpreis der Bestellung: " + Math.round(gesamtpreis * 100.0) / 100.0);
            //warenbestand.showWarenbestand();
        } else {
            System.out.println("Login fehlgeschlagen.");
        }

    }
}
