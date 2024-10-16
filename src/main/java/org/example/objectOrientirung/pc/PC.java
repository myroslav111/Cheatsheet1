package org.example.objectOrientirung.pc;

/*
1. Erstelle eine Klasse 'PC' die von 'Hardware' erbt und das Interface 'Software' implementiert
2. Implementiere die Methoden des Interfaces 'Software' und gib eine Installations- bzw. Deinstallationsbestätigung aus
(bspw. "Operating System installed"). Schreibe eine Methode, um alle installierten Softwarepakete auszugeben.
3. Die Klasse soll folgende Attribute haben:
operatingSystem: String, officeSoftware: String, antivirusSoftware: String, browser: String, emailClient: String, ide: String
4. Erstelle einen Konstruktor, der den Konstruktor der Basisklasse aufruft und die neuen Attribute verknüpft.

5. Schreibe Getter für alle Eigenschaften
6. Reduziere den verfügbaren HardDrive Speicherplatz um die folgenden Werte bei der Installation von Software:
Operating System: 60GB, Office Software: 10GB, Antivirus Software: 5GB, Browser: 5GB, Email Client: 5GB, IDE: 10GB
7. Gib den Speicherplatz bei der deinstallation der Software wieder frei.
 */


import lombok.Getter;

@Getter
public class PC extends Hardware implements Software {
      private String operatingSystem;
      private String officeSoftware;
      private String antivirusSoftware;
      private String browser;
      private String emailClient;
      private String ide;


      public PC() {
        super();
    }




    @Override
    public void installOperatingSystem(String operatingSystem) {
        if (this.operatingSystem == null) {
               this.operatingSystem = operatingSystem;
            installUndReduzSpeicher(Speicherbedarf.OPERATING_SYSTEM.getGigabyte());
            System.out.println("Operating System ist installiert.");

        }else {
            System.out.println("Operating System ist schon installiert.");
        }
    }

    @Override
    public void installOfficeSoftware(String officeSoftware) {
        if (this.officeSoftware == null) {
            this.officeSoftware = officeSoftware;
            installUndReduzSpeicher(Speicherbedarf.OFFICE_SOFTWARE.getGigabyte());
            System.out.println("Office Software ist installiert.");

        } else {
            System.out.println("Office Software ist schon installiert.");
        }

    }

    @Override
    public void installAntivirusSoftware(String antivirusSoftware) {
        if (this.antivirusSoftware == null) {
            this.antivirusSoftware = antivirusSoftware;
            installUndReduzSpeicher(Speicherbedarf.ANTIVIRUS_SOFTWAREN.getGigabyte());
            System.out.println("Antivirus Software ist installiert.");

        }else {
            System.out.println("Antivirus Software ist schon installiert.");
        }

    }

    @Override
    public void installBrowser(String browser) {
        if (this.browser == null) {
            this.browser = browser;
            installUndReduzSpeicher(Speicherbedarf.BROWSER.getGigabyte());
            System.out.println("Browser ist installiert.");

        }else{
            System.out.println("Browser ist schon installiert.");
        }

    }

    @Override
    public void installEmailClient(String emailClient) {
        if (this.emailClient == null) {
            this.emailClient = emailClient;
            installUndReduzSpeicher(Speicherbedarf.EMAIL_CLIENT.getGigabyte());
            System.out.println("Email Client ist installiert.");

        }else{
            System.out.println("Email Client ist schon installiert.");
        }

    }

    @Override
    public void installIDE(String ide) {
        if (this.ide == null) {
            this.ide = ide;
            installUndReduzSpeicher(Speicherbedarf.IDE.getGigabyte());
            System.out.println("IDE ist installiert.");

        }else{
            System.out.println("IDE ist schon installiert.");
        }

    }

    @Override
    public void uninstallOfficeSoftware(String officeSoftware) {
        if (this.officeSoftware == null) {
            System.out.println("Office Software wurde nicht installiert");
        }else {
            uninstallUndFreiSpeicherMach(Speicherbedarf.OFFICE_SOFTWARE.getGigabyte());
            this.officeSoftware = null;
            System.out.println(officeSoftware + " wurde deinstaliert");
        }


    }

    @Override
    public void uninstallOperatingSystem(String operatingSystem) {
        if (this.operatingSystem == null) {
            System.out.println("Operating System wurde nicht installiert");
        }else {
            uninstallUndFreiSpeicherMach(Speicherbedarf.OPERATING_SYSTEM.getGigabyte());
            this.operatingSystem = null;
            System.out.println(operatingSystem + " wurde deinstaliert");
        }
    }

    @Override
    public void uninstallAntivirusSoftware(String antivirusSoftware) {
        if (this.antivirusSoftware == null) {
            System.out.println("Antivirus Software wurde nicht installiert");
        }else {
            uninstallUndFreiSpeicherMach(Speicherbedarf.ANTIVIRUS_SOFTWAREN.getGigabyte());
            this.antivirusSoftware = null;
            System.out.println(antivirusSoftware + " wurde deinstaliert");
        }

    }

    @Override
    public void uninstallBrowser(String browser) {
        if (this.browser == null) {
            System.out.println("Browser wurde nicht installiert");
        }else {
            uninstallUndFreiSpeicherMach(Speicherbedarf.BROWSER.getGigabyte());
            this.browser = null;
            System.out.println(browser + " wurde deinstaliert");
        }

    }

    @Override
    public void uninstallEmailClient(String emailClient) {
        if (this.emailClient == null) {
            System.out.println("Email Client wurde nicht installiert");
        }else {
            uninstallUndFreiSpeicherMach(Speicherbedarf.EMAIL_CLIENT.getGigabyte());
            this.emailClient = null;
            System.out.println(emailClient + " wurde deinstaliert");
        }

    }

    @Override
    public void uninstallIDE(String ide) {
        if (this.ide == null) {
            System.out.println("IDE wurde nicht installiert");
        }else {
            uninstallUndFreiSpeicherMach(Speicherbedarf.IDE.getGigabyte());
            this.ide = null;
            System.out.println(ide + " wurde deinstaliert");
        }

    }

    @Override
    public void softwareInfo() {
        System.out.println("Die installierten Softwarepakete: ");
        if (operatingSystem != null) {
            System.out.println("Operating System: " + operatingSystem + " " + Speicherbedarf.OPERATING_SYSTEM.getGigabyte() + "GB");
        }else {
            System.out.println("Operating System: Keine");
        }
        if (officeSoftware != null) {
            System.out.println("Office Softwar: " + officeSoftware + " " + Speicherbedarf.OFFICE_SOFTWARE.getGigabyte() + "GB");
        }else {
            System.out.println("Office Software: Keine");
        }
        if (antivirusSoftware != null) {
            System.out.println("Antivirus Software: " + antivirusSoftware + " " + Speicherbedarf.ANTIVIRUS_SOFTWAREN.getGigabyte() + "GB");
        }else {
            System.out.println("Antivirus Software: Keine");
        }
        if (browser != null) {
            System.out.println("Browser: " + browser + " " + Speicherbedarf.BROWSER.getGigabyte() + "GB");
        }else {
            System.out.println("Browser: Keine");
        }
        if (emailClient != null) {
            System.out.println("Email Client: " + emailClient + " " + Speicherbedarf.EMAIL_CLIENT.getGigabyte() + "GB");
        }else {
            System.out.println("Email Client: Keine");
        }
        if ( ide!= null) {
            System.out.println("IDE: " + ide + " " + Speicherbedarf.IDE.getGigabyte() + "GB");
        }else {
            System.out.println("IDE: Keine");
        }
        if (operatingSystem == null
                && officeSoftware == null
                && antivirusSoftware == null
                && browser == null
                && emailClient == null
                && ide == null) {
            System.out.println("Keine Softwarepaketen sind installiert.");

        }

    }
}
