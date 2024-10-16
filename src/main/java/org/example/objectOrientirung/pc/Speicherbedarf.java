package org.example.objectOrientirung.pc;

public enum Speicherbedarf {
    OPERATING_SYSTEM(60),
    OFFICE_SOFTWARE(10),
    ANTIVIRUS_SOFTWAREN(5),
    BROWSER(5),
    EMAIL_CLIENT(5),
    IDE(10);



    private final int gigabyte;

    Speicherbedarf(int gigabyte) {
        this.gigabyte = gigabyte;
    }

    public int getGigabyte() {
        return gigabyte;
    }
}
