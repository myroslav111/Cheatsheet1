package org.example.flugpreise.apotheke;

import org.example.flugpreise.ProduktList;
import org.example.flugpreise.logistikzentrum.Warenbestand;
import org.example.flugpreise.utils.UserAuswahl;

import java.util.List;
import java.util.Scanner;

public class Apotheke implements BestellService {
    public Warenkorb warenkorb = new Warenkorb();


    @Override
    public void addWarenkorb(String produkt, int anzahl) {

    }

    @Override
    public void removeWarenkorb(String produkt, int anzahl) {

    }

    @Override
    public void berechneGesamtpreis(List<String> produkte, Warenbestand warenbestand) {
        System.out.println("Gesamtpreis");

    }

    @Override
    public void berechneStrecke() {

    }

    @Override
    public void bestellungAbschicken() {

    }

    public void bestellungAufgeben(Warenbestand warenbestand, Warenkorb warenkorb) {
        //warenbestand.showWarenBestand();
        Scanner scanner = new Scanner(System.in);
        if (UserAuswahl.userAuswahlJaOderNein(scanner, "Wollen Sie etwas bestehlen y/n")) {

            for(ProduktList produkt: ProduktList.values()){
                System.out.println(produkt.getMedikamenteName());
            }

            do{
                System.out.println("Was wollen Sie bestellen");
                String nameMedikament = scanner.nextLine();
                scanner.nextLine();
                System.out.println(nameMedikament);
                System.out.println("Wie viele Stück");
                int menge = scanner.nextInt();
            }
            while (UserAuswahl.userAuswahlJaOderNein(scanner, "Wollen Sie noch etwas bestellen?"));

        }

    }
}
