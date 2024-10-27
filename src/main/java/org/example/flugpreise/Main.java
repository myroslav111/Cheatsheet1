package org.example.flugpreise;

import org.example.flugpreise.apotheke.Apotheke;
import org.example.flugpreise.logistikzentrum.Logistikzentrum;
import org.example.flugpreise.utils.UserAuswahl;

import java.util.Scanner;


public class Main {

    public static void produktAnzeiger(Logistikzentrum lager){
        lager.warenbestand.showWarenBestand();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Apotheke apotheke = new Apotheke();
        Logistikzentrum logistikzentrum = new Logistikzentrum();
        UserAuswahl userAuswahl = new UserAuswahl();


//        if(userAuswahl.userAuswahlJaOderNein(scanner, "Wollen sie die Medikamente gucken y/n")){
//            logistikzentrum.warenbestand.showWarenBestand();
//        }

        //System.out.println("Wollen Sie etwas bestehlen y/n");
        apotheke.bestellungAufgeben(logistikzentrum.warenbestand, apotheke.warenkorb);






















    }

}
