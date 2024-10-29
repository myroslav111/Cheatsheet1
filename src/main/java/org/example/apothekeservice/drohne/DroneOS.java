package org.example.apothekeservice.drohne;

import org.example.apothekeservice.paket.Paket;

public interface DroneOS {
    public void berechneStrecke(String start, String ziel);
    public  void beladen(Paket paket);
    public  void fliege();
    public void entladen(Paket paket);

}
