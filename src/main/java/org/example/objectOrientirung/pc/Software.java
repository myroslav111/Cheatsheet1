package org.example.objectOrientirung.pc;
/*
1. Erstelle ein Interface 'Software' mit den Methoden:
installOperatingSystem(String operatingSystem), installOfficeSoftware(...), installAntivirusSoftware(...), installBrowser(...), installEmailClient(...), installIDE(...) und jeweils einer Methode zum Deinstallieren.
2. Erstellen eine Methode 'softwareInfo()', die alle installierten Softwarepakete ausgeben soll.
 */

public interface Software {
    //die Methoden für istallation Software
    public void installOperatingSystem(String operatingSystem);
    public void installOfficeSoftware(String officeSoftware);
    public void installAntivirusSoftware(String antivirusSoftware);
    public void installBrowser(String browser);
    public void installEmailClient(String emailClient);
    public void installIDE(String ide);

    //die methoden für deinstalation Software
    public void uninstallOperatingSystem(String operatingSystem);
    public void uninstallOfficeSoftware(String officeSoftware);
    public void uninstallAntivirusSoftware(String antivirusSoftware);
    public void uninstallBrowser(String browser);
    public void uninstallEmailClient(String emailClient);
    public void uninstallIDE(String ide);

    //die Methode, die alle istallierten Software ausgibt
    public void softwareInfo();

}
