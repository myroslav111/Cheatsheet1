package org.example.apothekeBestellungService;

import org.example.apothekeBestellungService.apotheke.Apotheke;
import org.example.apothekeBestellungService.logistikzentrum.Logistikzentrum;
import org.example.apothekeBestellungService.logistikzentrum.Warenbestand;
import org.example.apothekeBestellungService.utils.AnzeigenBeleg;
import org.example.apothekeBestellungService.apotheke.Warenkorb;
import org.example.apothekeBestellungService.kunde.Kunde;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Apotheke apotheke = new Apotheke();
        Logistikzentrum logistikzentrum = new Logistikzentrum();
        Warenkorb warenkorb = new Warenkorb();
        Warenbestand warenbestand = new Warenbestand();

        Kunde kunde = new Kunde(1, "Doe", "John", "Street 123", "john.com", "password123");


        if (apotheke.login(kunde, "john.com", "password123")) {
            apotheke.bestellungAufgeben(warenbestand, warenkorb);

        } else {
            System.out.println("Login fehlgeschlagen.");
        }

    }

}
