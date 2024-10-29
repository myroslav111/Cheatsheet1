package org.example.apothekeservice.apotheke;

import org.example.apothekeservice.kunde.Kunde;
import org.example.apothekeservice.logistikzentrum.Warenbestand;
import org.example.apothekeservice.utils.UserAnfrage;


import java.util.List;
import java.util.Scanner;


public class Apotheke implements BestellService {
    private Warenkorb warenkorb = new Warenkorb();



    @Override
    public void addWarenkorb(String produkt, int anzahl) {

    }

    @Override
    public void removeWarenkorb(String produkt, int anzahl) {

    }


    @Override
    public void berechneStrecke() {

    }

    @Override
    public double berechneGesamtpreis() {

        return 0;
    }

    @Override
    public void bestellungAbschicken() {

    }

    @Override
    public double berechnePreisProdukte(List<String> produkte, Warenbestand warenbestand) {
        double sum = 0;
        for (int i = 0; i < produkte.size(); i++) {
            switch (produkte.get(i)){
                case "Ibu":
                    sum+= warenbestand.ibuPreis;
                    break;
                case "Aspirin":
                    sum+= warenbestand.aspirinPreis;
                    break;
                case "Paracetamol":
                    sum+= warenbestand.paracetamolPries;
                    break;
                case "Vitamin C":
                    sum+= warenbestand.vitCPreis;
                    break;
                case "Vitamin D":
                    sum+= warenbestand.vitDPreis;
                    break;

                default:
                    sum = sum;

            }
        }

        return sum;
    }

    public void bestellungAufgeben(Warenbestand warenbestand, Warenkorb warenkorb) {

        System.out.println("Das haben wir in Angebot");
        warenbestand.showWarenbestand();
        System.out.println("Machen Sie Ihren Auftrag");
        do {
            warenkorb.addProduct("Aspirin");
            warenkorb.addProduct("Ibu");
            warenkorb.addProduct("Vitamin C");
        }while (UserAnfrage.userAuswahlJaOderNein(new Scanner(System.in),"Wollen Sei noch etw. y/n"));

        System.out.println("Hier ist Ihre Bestellung");
        warenkorb.showWarenkorb();
    }

    public boolean login(Kunde kunde, String email, String psw) {
        // E-Mail und Passwort aus der Benutzereingabe anfordern und mit den Kundendaten vergleichen
        if (kunde.getEmail().equals(email) && kunde.getPasswort().equals(psw)) {
            return true;
        }
         // Gibt true, wenn E-Mail und Passwort übereinstimmen
        return  false;
    }
}
