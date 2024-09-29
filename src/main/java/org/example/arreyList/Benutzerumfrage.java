package org.example.arreyList;

import java.util.Scanner;

public class Benutzerumfrage {

    public void Benutzerumfrage(){}

    public static boolean ausgabeJaOderNein(Scanner scanner, String message){
        System.out.println(message + "   y/n");
        return scanner.next().charAt(0) == Character.toLowerCase('y');
    }

}
