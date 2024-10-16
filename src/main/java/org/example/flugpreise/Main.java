package org.example.flugpreise;

import java.util.Scanner;

/** Eine Online-Apotheke kauft zahlreiche Drohnen von TÜCOPTER, die sie für
 Expressauslieferungen von Pharmazeutika an Kunden der näheren Umgebung einsetzen möchte.
 Die Apothele arbeitet mit einem zweistufigen Preismodell; ein Teil des Preises
 hängt von der Nutzlast ab, die der Kunde zum Zielort transposrtieren möchte, der andere
 Teil von der Entfernung des Zielortes zum Logistikzentrum:


 - Eine Nutzlast von bis zu 6kg kostet 3€.
 - Höhere Nutzlasten schlagen mit 7€ zu buche.
 - Jeder Kilometer Entfernung des Zielorts vom Logistikzentrum kostet pauschal 0,40€.
 - Die Drohne kann nur eine Entfernung von maximal 25km anfliegen.
 - Der eingesetzte Drohnentyp kann nur eine Nutzlast von maximal 12kg transportieren.

 Der Ablauf des gewünschten Programms ist bereits in einem Struktogramm dargestellt.
 Die vom Kunden gewünschte Entfernung und Nutzlast werden der Funktion/Methode als
 Parameter übergeben.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryCalculator deliveryCalculator = new DeliveryCalculator();

        System.out.println("Bite geben Sie die Enfernung das pakets ein");
        double distance = scanner.nextDouble();

        System.out.println("Bite geben Sie das Gewicht das pakets ein");
        double nutzlast = scanner.nextDouble();

        System.out.println();
        deliveryCalculator.calculatePreisDelivery(distance, nutzlast);


    }

}
