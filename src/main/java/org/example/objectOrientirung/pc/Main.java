package org.example.objectOrientirung.pc;

//mainboard = "Asus X1", processor = "Intel i7", ram = 16, hardDrive = "SSD", hardDriveSize = 500, graphicsCard = "Nvidia RTX 2080"
//Operating System: 60GB, Office Software: 10GB, Antivirus Software: 5GB, Browser: 5GB, Email Client: 5GB, IDE: 10GB
public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Asus X1", "Intel i7", 16, "SSD",
                 500, "Nvidia RTX 2080",null, null,
                 null, null, null, null );

        pc.softwareInfo();
        System.out.println();
        pc.installBrowser("FireFox");
        pc.installAntivirusSoftware("Carbon Black");
        pc.installIDE("Intellij");
        pc.installEmailClient("Outlook");
        pc.installOperatingSystem("Ubuntu");
        pc.installOfficeSoftware("Word");
        System.out.println();
        pc.softwareInfo();
        System.out.println();

        pc.uninstallIDE(pc.getIde());
        pc.uninstallAntivirusSoftware(pc.getAntivirusSoftware());
        pc.softwareInfo();

        System.out.println();
        System.out.println(pc.getProzessor());



    }
}
