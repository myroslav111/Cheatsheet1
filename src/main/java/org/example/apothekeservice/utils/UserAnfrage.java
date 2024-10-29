package org.example.apothekeservice.utils;

import java.util.Scanner;

public class UserAnfrage {
    public static boolean userAuswahlJaOderNein(Scanner scanner, String message){
        System.out.println(message);
        boolean fortfahren = (Character.toLowerCase(scanner.next().charAt(0)) == 'y') ? true : false;
        return fortfahren;
    }

    public static void userAnfrageMailPsw(){
        System.out.println("Geben Sie Email und Passwort");
    }

}
