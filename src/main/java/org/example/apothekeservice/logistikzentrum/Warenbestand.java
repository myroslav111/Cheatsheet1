package org.example.apothekeservice.logistikzentrum;


import lombok.Getter;
import lombok.Setter;
import org.example.apothekeservice.paket.Paket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
@Setter
public class Warenbestand  {
    public Map<String, Integer> produktMengen = new HashMap<>(Map.of(
            "Ibu", 3,
            "Aspirin", 5,
            "Paracetamol", 2,
            "Vitamin C", 8,
            "Vitamin D", 7
    ));
    public double ibuPreis = 5.99;
    public double aspirinPreis = 6.99;
    public double paracetamolPries = 7.99;
    public double vitCPreis = 4.99;
    public double vitDPreis = 3.99;
    public double ibuGewicht = 0.07;
    public double aspirinGewicht = 0.05;
    public double paracetamolGewicht = 0.15;
    public double vitCGewicht = 0.2;
    public double vitDGewicht = 0.1;



    public void showWarenbestand() {
        produktMengen.forEach((produkt, menge) -> System.out.println(produkt + ": " + menge));
    }


}
