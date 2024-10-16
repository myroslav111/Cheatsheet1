package org.example.abstractClass.smartDevice;

public class Smartphone extends SmartDevice {
    private double screenSize;

    public Smartphone(String brand, double screenSize) {
        super(brand);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public void displayInfo() {
        System.out.println(getBrand() + " " + getScreenSize() + "\"");

    }

}
