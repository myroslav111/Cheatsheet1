package org.example.cowsay;

import java.util.Scanner;

public class Cowsay {

    static void textAusgabe(String text){
        System.out.println("  _____________");
        System.out.println("< " + text + " >");
        System.out.println("  -------------");
        System.out.println("       \\   ^__^");
        System.out.println("        \\  (oo)\\_______");
        System.out.println("           (__)\\       )\\/\\");
        System.out.println("               ||----w |");
        System.out.println("               ||     ||");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sreib einen Text");
        String text = scanner.nextLine();

        textAusgabe(text);
    }
}
