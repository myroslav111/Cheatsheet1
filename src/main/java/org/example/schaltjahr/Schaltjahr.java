package org.example.schaltjahr;


import org.example.util.Terminal;

public class Schaltjahr {

    public static boolean istSchaltjahr(int jahr){
        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

        int jahr = Terminal.askInt("Please enter a number: ");
        System.out.println(istSchaltjahr(jahr));


    }
}
