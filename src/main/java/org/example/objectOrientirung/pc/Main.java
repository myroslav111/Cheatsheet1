package org.example.objectOrientirung.pc;

//mainboard = "Asus X1", processor = "Intel i7", ram = 16, hardDrive = "SSD", hardDriveSize = 500, graphicsCard = "Nvidia RTX 2080"
//Operating System: 60GB, Office Software: 10GB, Antivirus Software: 5GB, Browser: 5GB, Email Client: 5GB, IDE: 10GB
/*
 Enum: Speicherbedarf

1. Erstelle ein Enum, welches für die installierbare Software den benötigten Speicherbedarf repräsentiert und
implementiere die Werte im Projekt über das Enum.
*/
public class Main {
    public static void main(String[] args) {


        PC pc = new PC();






        pc.softwareInfo();
        System.out.println();
        pc.installBrowser("FireFox");
        pc.installAntivirusSoftware("Carbon Black");
        pc.installIDE("Intellij");
        pc.installEmailClient("Outlook");
        pc.installOperatingSystem("Ubuntu");
        System.out.println(pc.getHardDriveSize());
        pc.installOfficeSoftware("Word");
        System.out.println();


        pc.softwareInfo();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        pc.uninstallIDE(pc.getIde());
        pc.uninstallAntivirusSoftware(pc.getAntivirusSoftware());

        pc.softwareInfo();

        System.out.println();
        System.out.println(pc.getProzessor());



    }
}
