package org.example.apothekeservice.apotheke;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    public List<String> produkte = new ArrayList<>();

    public void addProduct(String produkt) {
        produkte.add(produkt);
    }

    public void clearProducts() {
        produkte.clear();
    }

    public void showWarenkorb() {
        produkte.forEach(System.out::println);
    }


}
