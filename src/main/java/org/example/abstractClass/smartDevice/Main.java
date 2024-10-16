package org.example.abstractClass.smartDevice;

/*
Erstelle ein Java-Programm, das eine abstrakte Klasse SmartDevice und innere Klassen für
zwei verschiedene Gerätetypen (Smartphone und Smartwatch) verwendet.
1.Definiere die abstrakte Klasse SmartDevice mit den folgenden Eigenschaften und Methoden:
•Eine Instanzvariable brand vom Typ String.
•Eine abstrakte Methode displayInfo() zum Anzeigen von Informationen über das Gerät.
•Eine Methode getBrand() zum Abrufen des Wertes der Instanzvariablen brand.
2.Definiere zwei innere Klassen innerhalb der SmartDevice-Klasse: Smartphone und Smartwatch. Beide Klassen sollten die abstrakte Klasse
SmartDevice erweitern.
•Die Klasse Smartphone sollte eine zusätzliche Instanzvariable screenSize vom Typ double haben.
•Die Klasse Smartwatch sollte eine zusätzliche Instanzvariable hasGPS vom Typ booleanhaben.
•Implementiere die Methode displayInfo() in beiden inneren Klassen, um Informationen über das jeweilige Gerät auszugeben.
3.Verwendung:
•Erstelle eine Instanz der Klasse Smartphone und weise ihr Werte für brand und screenSize zu.
•Erstelle eine Instanz der Klasse Smartwatch und weise ihr Werte für brand und hasGPSzu.
•Rufe die Methode displayInfo() für beide Instanzen auf, um ihre Informationen auszugeben
*/

public class Main {
    public static void main(String[] args) {
        Smartphone smartphoneSony = new Smartphone("Sony", 9);
        Smartwatch smartwatch = new Smartwatch("google", true);

        smartphoneSony.displayInfo();
        smartwatch.displayInfo();



    }
}
