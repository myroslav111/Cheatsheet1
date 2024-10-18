package org.example.flugpreise;

public interface DroneOS {
    public void berechneStrecke(String start, String ziel);
    public  void beladen(Object paket);
    public  void fliege();
    public void entladen(Object paket);

}
