package org.example.abstractClass.smartDevice;

public abstract class SmartDevice {
    private String brand;

    public SmartDevice(String brand) {
        this.brand = brand;
    }

    public  abstract void displayInfo();

    public String getBrand() {
        return brand;
    }
}
