package org.example.abstractClass.smartDevice;

public class Smartwatch extends SmartDevice{
    private boolean hasGPS;

    public Smartwatch(String brand, boolean hasGPS) {
        super(brand);
        this.hasGPS = hasGPS;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    @Override
    public void displayInfo() {
        System.out.println(getBrand() + " " + "GPS: " + isHasGPS());

    }
}
