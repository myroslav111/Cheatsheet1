package org.example.apothekeservice.drohne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Drohne {
    private double maxNutzlast;
    private double maxEntfernung;

    public Drohne(double maxNutzlast, double maxEntfernung) {
        this.maxNutzlast = maxNutzlast;
        this.maxEntfernung = maxEntfernung;
    }

//    public double getMaxNutzlast() { return maxNutzlast; }
//    public void setMaxNutzlast(double maxNutzlast) { this.maxNutzlast = maxNutzlast; }
//
//    public double getMaxEntfernung() { return maxEntfernung; }
//    public void setMaxEntfernung(double maxEntfernung) { this.maxEntfernung = maxEntfernung; }
}



