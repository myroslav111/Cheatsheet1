package org.example.fibonacci;

/*
1) Es soll eine Methode mit dem Namen fibonacci geschrieben werden.
 Diese Methode soll genau eine Variable vom Typ int und dem Namen n übergeben bekommen.
  Als Rückgabewert soll die Methode den zu n gehörigen Wert der Fibonacci-Folge liefern.

2) Nachdem nun die Methode mit der passenden Signatur geschrieben wurde,
 muss sie noch die nötige Berechnung tätigen. In diesem Beispiel soll eine rekursive Lösung verwendet werden.
  Die obige Definition der Fibonacci-Zahlen muss lediglich in Java Code übersetzt werden.

3) Testet die fibonacci-Methode, ob sie korrekt funktioniert, indem ein paar Werte berechnet werden.

4) Der Datentyp int beinhaltet auch negative ganze Zahlen.
 Was passiert, wenn die fibonacci-Methode einen negativen Eingabewert erhält? Bitte denke erst darüber nach und probiere danach aus.
  Korrigiere die fibonacci-Methode, so dass sie bei Eingabe von negativen Zahlen eine Fehlermeldung ausgibt und einen Fehler-Code zurückgibt.
   Hier wäre etwa -1 als Ergebnis vorstellbar.
*/

import java.util.Scanner;

public class Main {
    public static int fibonacci(int n){
        if (n == 0) {

            return 0;
        } else if (n == 1) {

            return 1;
        }else {
            System.out.println("");

            return fibonacci(n -1) + fibonacci(n -2);
        }
    }

    /* z.B 5
    ^f(5) = f(4) + f(3); 5
    ^f(4) = f(3) + f(2); 3
    ^f(3) = f(2) + f(1); 2
    ^f(2) = f(1) + f(0); 1
    ^f(1) = 1;
    ^f(0) = 0;
    */

    public static void main(String[] args) {
        int eingabe;

        Scanner scanner = new Scanner(System.in);

        //eingabe = scanner.nextInt();
        System.out.println("hallo");
        System.out.println(fibonacci(5));






    }
}
