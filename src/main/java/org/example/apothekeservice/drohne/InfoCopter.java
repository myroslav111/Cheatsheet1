package org.example.apothekeservice.drohne;


import org.example.apothekeservice.paket.Paket;

public class InfoCopter extends Drohne implements DroneOS {
    public Paket paket;

    public InfoCopter(double maxNutzlast, double maxEntfernung) {
        super(maxNutzlast, maxEntfernung);
    }


    @Override
    public void berechneStrecke(String start, String ziel) {

    }

    @Override
    public void beladen(Paket paket) {

    }

    @Override
    public void fliege() {

    }

    @Override
    public void entladen(Paket paket) {

    }
}
