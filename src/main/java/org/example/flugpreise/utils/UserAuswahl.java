package org.example.flugpreise.utils;

import java.util.Scanner;

public class UserAuswahl {
    public static boolean userAuswahlJaOderNein(Scanner scanner, String message){
        System.out.println(message);
        boolean fortfahren = (Character.toLowerCase(scanner.next().charAt(0)) == 'y') ? true : false;
        return fortfahren;
    }
}
